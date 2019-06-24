package org.app.service.impl;

import java.util.List;

import org.app.dao.IOrderMethodDao;
import org.app.model.OrderMethod;
import org.app.service.IOrderMethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderMethodServiceImpl implements IOrderMethodService {
	@Autowired
	private  IOrderMethodDao dao;

	@Override
	@Transactional
	public Integer saveOrederMethod(OrderMethod s) {
	
		return dao.saveOrederMethod(s);
	}

	@Override
	@Transactional(readOnly=true)
	public List<OrderMethod> getAllOrderMethod() {
		// TODO Auto-generated method stub
		return dao.getAllOrderMethod();
	}

	@Override
	@Transactional
	public void deleteOrederMethod(Integer id) {
		dao.deleteOrederMethod(id);
	}

	@Override
	@Transactional(readOnly=true)
	public OrderMethod getOneOrderMethod(Integer id) {
		// TODO Auto-generated method stub
		return dao.getOneOrderMethod(id);
	}

	@Override
	@Transactional
	public void updateOrderMethod(OrderMethod s) {
		dao.updateOrderMethod(s);
		
	}

	

	
	

}
