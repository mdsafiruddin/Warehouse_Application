package org.app.service.impl;

import java.util.List;

import org.app.model.WhUserType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
public class WarehouseUserTypeServiceImpl implements org.app.service.IWarehouseUserTypeService {

	@Autowired
	private org.app.dao.IWarehouseUserTypeDao dao;
	
	
	@Override
	@Transactional
	public Integer saveWarehouseUserType(org.app.model.WhUserType w) {
		return  dao.saveWarehouseUserType(w);
	
	}

	@Override
	public List<org.app.model.WhUserType> getAllWarehouseUserType() {
	
		return dao.getAllWarehouseUserType();
	}

	@Override
	@Transactional
	public void deleteWarehouseUserType(Integer id) {
		
		dao.deleteWarehouseUserType(id);
	}

	@Override
	@Transactional
	public void updateWarehouseUserType(WhUserType w) {
		dao.updateWarehouseUserType(w);
	}

	@Override
	@Transactional(readOnly=true)
	public WhUserType getOneWarehouseUserType(Integer Id) {
		return dao.getOneWarehouseUserType(Id);
	}

}
