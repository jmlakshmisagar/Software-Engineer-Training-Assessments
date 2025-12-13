package practice.dao;

import java.util.List;

import practice.entities.Item;

 
public interface ItemDaoInterface {
 
	public List<Item> findAll();
	public Item findById(Long id);
	public Item save(Item item);
	public void delete(Long itemid);
}