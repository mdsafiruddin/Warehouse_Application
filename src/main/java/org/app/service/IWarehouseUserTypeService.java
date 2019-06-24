package org.app.service;

import java.util.List;

import org.app.model.WhUserType;


    public interface IWarehouseUserTypeService {
	public Integer saveWarehouseUserType(org.app.model.WhUserType w);
	public List<org.app.model.WhUserType> getAllWarehouseUserType();
	public void  deleteWarehouseUserType(Integer id);
	
     public void updateWarehouseUserType(WhUserType w);
	
	public WhUserType getOneWarehouseUserType(Integer Id);
	
}
