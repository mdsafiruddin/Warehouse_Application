package org.app.service.impl;

import java.util.List;

import org.app.dao.IShipmentTypeDao;
import org.app.model.ShipmentType;
import org.app.service.IShipmentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ShipmentTypeServiceImpl implements IShipmentTypeService {
	
@Autowired
private IShipmentTypeDao dao;

@Transactional
@Override
public Integer saveShipmentType(ShipmentType s) {
	
	return dao.saveShipment(s);
}
@Transactional(readOnly= true)
@Override
	public List<ShipmentType> getAllShipments() {
		
	
		return dao.getAllShipments();
	}

@Transactional
@Override
public void deleteShipmentType(Integer id) {
dao.deleteShipmentType(id);
}


@Override
@Transactional(readOnly= true)
public ShipmentType getOneShipment(Integer Id) {

	return dao.getOneShipment(Id);
}
@Override
@Transactional
public void updateShipment(ShipmentType s) {
	dao.updateShipment(s);
	
}

}
