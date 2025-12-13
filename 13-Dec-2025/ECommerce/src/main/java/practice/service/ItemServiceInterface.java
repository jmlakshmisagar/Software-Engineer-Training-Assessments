package practice.service;

import java.util.List;

import practice.entities.Item;

public interface ItemServiceInterface {
	public List<Item> findAll();

	public Item findById(Long Id);

	public Item save(Item item);

	public Item update(Item item, Long Id);

	public void delete(Long Id);
}