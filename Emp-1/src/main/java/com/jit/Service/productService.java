package com.jit.Service;

import java.util.Collection;

import com.jit.model.product;

public interface productService {
	public abstract void createProduct(product product);
	 public abstract void updateProduct(String id, product product);
	   public abstract void deleteProduct(String id);
	   public abstract Collection<product> getProducts();

}
