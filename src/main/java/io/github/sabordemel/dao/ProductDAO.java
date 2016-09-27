package io.github.sabordemel.dao;

import java.util.List;

import io.github.sabordemel.model.Product;

public class ProductDAO extends DAO<Product> {

	public Product getById(final Long id) {
        return entityManager.find(Product.class, id);
    }
 
    public boolean removeById(final Long id) {
    	
    	boolean result = true;
    	
        try {
            Product product = this.getById(id);
            super.remove(product);
        } catch (Exception ex) {
            ex.printStackTrace();
            result = false;
        }
        
        return result;
    }
 
    @SuppressWarnings("unchecked")
	public List<Product> findAll() {
    	return entityManager
    		.createQuery("FROM Product").getResultList();
    }
}
