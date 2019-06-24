package org.app.service;

import java.util.List;

import org.app.model.OrderMethod;



public interface IOrderMethodService {

	public Integer saveOrederMethod(OrderMethod s);
 
	public List<OrderMethod> getAllOrderMethod();
	
	public OrderMethod getOneOrderMethod(Integer id);
	
	public void deleteOrederMethod(Integer id);
	
	public void  updateOrderMethod(OrderMethod s);

	
}
