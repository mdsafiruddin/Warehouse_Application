package org.app.dao.impl;

import java.util.List;

import org.app.dao.IOrderMethodDao;
import org.app.model.OrderMethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class OrderMethodDaoImpl implements IOrderMethodDao {
	
	@Autowired
	private HibernateTemplate ht;

	@Override
	public Integer saveOrederMethod(OrderMethod s) {
		
		return (Integer) ht.save(s);
	}


	@Override
	public void deleteOrederMethod(Integer id) {
	   OrderMethod m=	new  OrderMethod();
	   m.setId(id);
	   ht.delete(m);
	}

	@Override
	public List<OrderMethod> getAllOrderMethod() {
		// TODO Auto-generated method stub
		 return ht.loadAll(OrderMethod.class);
	}


	
 @Override
	public void updateOrderMethod(OrderMethod s) {
		ht.update(s);
		
	}


	@Override
	public OrderMethod getOneOrderMethod(Integer id) {
		// TODO Auto-generated method stub
		return ht.get(OrderMethod.class, id);
	}


	



















	


}
