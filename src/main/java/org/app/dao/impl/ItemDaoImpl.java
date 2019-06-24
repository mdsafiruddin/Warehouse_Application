package org.app.dao.impl;

import java.util.List;

import org.app.dao.IItemDao;
import org.app.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ItemDaoImpl implements IItemDao {
	
	@Autowired
	private HibernateTemplate ht;
	

	@Override
	public Integer ItemSave(Item m) {
		return (Integer) ht.save(m);
	}

	@Override
	public void ItemUpdate(Item m) {
	ht.update(m);

	}

	@Override
	public void deleteItem(Integer Id) {
		Item t=new Item();
		t.setid(Id);
		ht.delete(t);

	}

	@Override
	public List<Item> getAllItem() {
		return ht.loadAll(Item.class);
	}

	@Override
	public Item getOneItem(Integer Id) {
		return ht.get(Item.class, Id);
	}

}
