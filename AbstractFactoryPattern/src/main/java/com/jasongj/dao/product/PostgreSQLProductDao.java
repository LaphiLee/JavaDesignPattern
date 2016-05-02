package com.jasongj.dao.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jasongj.bean.Product;

public class PostgreSQLProductDao implements IProductDao {

	private static final Logger LOG = LoggerFactory.getLogger(PostgreSQLProductDao.class);

	@Override
	public void addProduct(Product product) {
		LOG.info("PostgreSQL added Product {}", product);
	}

	@Override
	public void removeProduct(Product product) {
		LOG.info("PostgreSQL removed Product {}", product);
	}

	@Override
	public Product getProduct(String productname) {
		Product product = new Product();
		product.setProductname(productname);
		return product;
	}

}
