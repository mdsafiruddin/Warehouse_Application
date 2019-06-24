package org.app.service.impl;

import java.util.List;

import org.app.dao.IUomModuleDao;
import org.app.model.UomModule;
import org.app.service.IUomModuleSrvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UomModuleServiceImpl implements IUomModuleSrvice {
	
	@Autowired
	IUomModuleDao dao;

	@Override
	@Transactional
	public Integer saveUom(UomModule mod) {
		
		return dao.saveUom(mod);
	}

	@Override
	@Transactional
	public void updateUom(UomModule mod) {
	dao.updateUom(mod);

	}

	@Override
	@Transactional
	public void deleteUom(Integer Id) {
		// TODO Auto-generated method stub
		dao.deleteUom(Id);
	}

	@Override
	@Transactional(readOnly=true)
	public UomModule getOneUom(Integer Id) {
		
		return dao.getOneUom(Id);
	}

	@Override
	@Transactional(readOnly=true)
	public List<UomModule> getAllUom() {
	
		return dao.getAllUom();
	}


}
