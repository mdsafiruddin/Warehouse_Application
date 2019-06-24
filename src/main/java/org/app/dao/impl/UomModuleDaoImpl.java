package org.app.dao.impl;

import java.util.List;

import org.app.dao.IUomModuleDao;
import org.app.model.UomModule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UomModuleDaoImpl implements IUomModuleDao {
	
	@Autowired
	private HibernateTemplate ht;

	@Override
	public Integer saveUom(UomModule mod) {
		return (Integer) ht.save(mod); 	
	}

	@Override
	public void updateUom(UomModule mod) {
		ht.update(mod);

	}

	@Override
	public void deleteUom(Integer Id) {
		UomModule m=new UomModule();
		m.setId(Id);
		ht.delete(m);
		
	}

	@Override
	public UomModule getOneUom(Integer Id) {
		return ht.get(UomModule.class, Id);
	}

	@Override
	public List<UomModule> getAllUom() {
		return ht.loadAll(UomModule.class);
	}

}
