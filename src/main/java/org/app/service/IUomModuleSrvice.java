package org.app.service;

import java.util.List;

import org.app.model.UomModule;

public interface IUomModuleSrvice {
public Integer saveUom(UomModule mod);
	
	public void  updateUom(UomModule mod);
	
	public void deleteUom(Integer Id);
	
	public UomModule getOneUom(Integer Id);
	public List<UomModule>  getAllUom();
	
	

}
