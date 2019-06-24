package org.app.dao;

import java.util.List;

import org.app.model.ShipmentType;

public interface IShipmentTypeDao {
	public Integer saveShipment(ShipmentType s);
 
	public List<ShipmentType> getAllShipments();
	
	public ShipmentType  getOneShipment(Integer Id);
	public void deleteShipmentType(Integer id);
	
	public void updateShipment(ShipmentType s);
}
