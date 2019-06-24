package org.app.dao.impl;

import java.util.List;

import org.app.dao.IShipmentTypeDao;
import org.app.model.ShipmentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ShipmentTypeDaoImpl implements IShipmentTypeDao {
	
	@Autowired
	private HibernateTemplate ht;

	@Override
	public Integer saveShipment(ShipmentType s) {
		
		return (Integer)ht.save(s);
	}
	@Override
	public List<ShipmentType> getAllShipments() {
		
		return ht.loadAll(ShipmentType.class);
		
	}
	@Override
	public void deleteShipmentType(Integer id) {
		ShipmentType s=new ShipmentType();
		s.setId(id);
		ht.delete(s);
		
	}
	
	public ShipmentType  getOneShipment(Integer Id) {
	 return ht.get(ShipmentType.class,Id);
	}
	@Override
	public void updateShipment(ShipmentType s) {
		ht.update(s);
		
	}
	

}
