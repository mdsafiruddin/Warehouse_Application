package org.app.dao.impl;

import java.util.List;

import org.app.dao.IWarehouseUserTypeDao;
import org.app.model.WhUserType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;



@Repository
public class WarehouseUserTypeDaoImpl implements IWarehouseUserTypeDao {
	
	@Autowired
	private HibernateTemplate ht;

	@Override
	public Integer saveWarehouseUserType(WhUserType w) {
	       
		return (Integer) ht.save(w);
	}

	@Override
	public List<WhUserType> getAllWarehouseUserType() {
		
		return ht.loadAll(WhUserType.class);
	}

	@Override
	public void deleteWarehouseUserType(Integer id) {
		WhUserType u=new WhUserType();
		u.setUserId(id);
		ht.delete(u);
	}

	@Override
	public void updateWarehouseUserType(WhUserType w) {
	ht.update(w);
	}

	@Override
	public WhUserType getOneWarehouseUserType(Integer Id) {
	
		return ht.get(WhUserType.class, Id);
	}

}
