package com.jasongj.dao.product;

import com.jasongj.bean.Product;

public interface IProductDao {
	
	void addProduct(Product product);
	void removeProduct(Product product);
	Product getProduct(String productname);

}
