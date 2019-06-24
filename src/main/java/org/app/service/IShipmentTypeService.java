package org.app.service;

import java.util.List;

import org.app.model.ShipmentType;

public interface IShipmentTypeService {
	
	public Integer saveShipmentType(ShipmentType s);
	public List<ShipmentType> getAllShipments();
	
	public void deleteShipmentType(Integer id);
	public ShipmentType  getOneShipment(Integer Id);
	
	public void updateShipment(ShipmentType s);
}
