package org.app.service.impl;

import java.util.List;

import org.app.dao.IItemDao;
import org.app.model.Item;
import org.app.service.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ItemServiceImpl implements IItemService {
	
	@Autowired
	private IItemDao dao;

	@Override
	@Transactional
	public Integer ItemSave(Item m) {
		return dao.ItemSave(m);
	}

	@Override
	@Transactional
	public void ItemUpdate(Item m) {
		dao.ItemUpdate(m);
		
	}

	@Override
	@Transactional
	public void deleteItem(Integer Id) {
		dao.deleteItem(Id);
	}

	
	

	@Override
	@Transactional(readOnly=true)
	public List<Item> getAllItem() {
		
		return dao.getAllItem();
	}

	@Override
	@Transactional(readOnly=true)
	public Item getOneItem(Integer Id) {
		return dao.getOneItem(Id);
	}

}
