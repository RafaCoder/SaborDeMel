package io.github.sabordemel.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.Query;

import io.github.sabordemel.model.Order;
import io.github.sabordemel.model.OrderItem;

public class OrderDAO extends DAO<Order> {

	@SuppressWarnings("unchecked")
	@Override
	public List<Order> findAll() {
		return entityManager.createQuery("FROM Order").getResultList();
	}

	@Override
	public Order getById(Long id) {
		return entityManager.find(Order.class, id);
	}

	@Override
	public boolean removeById(final Long id) {

		boolean result = true;

		try {
			Order order = this.getById(id);
			super.remove(order);
		} catch (Exception ex) {
			ex.printStackTrace();
			result = false;
		}

		return result;
	}

	@SuppressWarnings("unchecked")
	public List<Order> findByInterval(Date startIncluded, Date endIncluded) {
		
		Query query = 
			entityManager.createQuery(
				"FROM Order o WHERE o.date BETWEEN :startDate AND :endDate");

		query.setParameter("startDate", startIncluded);
		
		query.setParameter("endDate", endIncluded);
		
		return query.getResultList();
	}
	
	@Override
	public boolean persist(Order order) {
		
		boolean result = true;
    	
        try {
        	
            entityManager.getTransaction().begin();
            
            for (OrderItem oi : order.getOrderItems())
            	entityManager.persist(oi.getProduct());
            
            entityManager.persist(order);
            
            entityManager.getTransaction().commit();
            
        } catch (Exception ex) {
        	ex.printStackTrace();
            entityManager.getTransaction().rollback();
            result = false;
        }
        
        return result;
	}

}
