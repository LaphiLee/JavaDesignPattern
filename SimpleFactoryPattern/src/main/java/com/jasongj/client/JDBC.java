package com.jasongj.client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JDBC {
	
	private static final Logger LOG = LoggerFactory.getLogger(JDBC.class);

	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("org.apache.hive.jdbc.HiveDriver");
			conn = DriverManager.getConnection("jdbc:hive2://127.0.0.1:10000/default");
			PreparedStatement ps = conn.prepareStatement("select count(*) from test.test");
			ps.execute();
		} catch (SQLException ex) {
			LOG.warn("Execute query failed", ex);
		} catch(ClassNotFoundException e) {
			LOG.warn("Load Hive driver failed", e);
		} finally{
			if(conn != null ){
				try {
					conn.close();
				} catch (SQLException e) {
					// NO-OPT
				}
			}
		}
	}
}
