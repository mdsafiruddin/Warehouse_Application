package org.app.service;

import java.util.List;

import org.app.model.Item;

public interface IItemService {

	public  Integer ItemSave(Item m);
	public void ItemUpdate(Item m);
	public void deleteItem(Integer Id);
	public Item getOneItem(Integer Id);
	public List<Item> getAllItem();

	
}
