package org.app.dao;

import java.util.List;

import org.app.model.WhUserType;
public interface IWarehouseUserTypeDao {
	public Integer  saveWarehouseUserType(org.app.model.WhUserType w);
	public List<WhUserType> getAllWarehouseUserType();
	public void  deleteWarehouseUserType(Integer id);
	public void updateWarehouseUserType(WhUserType w);
	
	public WhUserType getOneWarehouseUserType(Integer id);
	

}
