package com.jasongj.context;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.XMLConfiguration;
import org.reflections.Reflections;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jasongj.strategy.Strategy;

public class SimpleFactoryContext {

  private static final Logger LOG = LoggerFactory.getLogger(SimpleFactoryContext.class);
  private static Map<String, Class> allStrategies;

  static {
    Reflections reflections = new Reflections("com.jasongj.strategy");
    Set<Class<?>> annotatedClasses =
        reflections.getTypesAnnotatedWith(com.jasongj.annotation.Strategy.class);
    allStrategies = new ConcurrentHashMap<String, Class>();
    for (Class<?> classObject : annotatedClasses) {
      com.jasongj.annotation.Strategy strategy = (com.jasongj.annotation.Strategy) classObject
          .getAnnotation(com.jasongj.annotation.Strategy.class);
      allStrategies.put(strategy.name(), classObject);
    }
    allStrategies = Collections.unmodifiableMap(allStrategies);
  }

  private Strategy strategy;

  public SimpleFactoryContext() {
    String name = null;
    try {
      XMLConfiguration config = new XMLConfiguration("strategy.xml");
      name = config.getString("strategy.name");
      LOG.info("strategy name is {}", name);
    } catch (ConfigurationException ex) {
      LOG.error("Parsing xml configuration file failed", ex);
    }

    if (allStrategies.containsKey(name)) {
      LOG.info("Created strategy name is {}", name);
      try {
        strategy = (Strategy) allStrategies.get(name).newInstance();
      } catch (InstantiationException | IllegalAccessException ex) {
        LOG.error("Instantiate Strategy failed", ex);
      }
    } else {
      LOG.error("Specified Strategy name {} does not exist", name);
    }

  }

  public void action(String input) {
    strategy.strategy(input);
  }

}
