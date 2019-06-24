package org.app.dao;

import java.util.List;

import org.app.model.OrderMethod;


public interface IOrderMethodDao {
	
	public Integer saveOrederMethod(OrderMethod s);
 
	public OrderMethod getOneOrderMethod(Integer id);
	
	public void deleteOrederMethod(Integer id);

	public List<OrderMethod> getAllOrderMethod();
	
	public void updateOrderMethod(OrderMethod s);

}
