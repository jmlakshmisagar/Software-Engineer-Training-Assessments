package practice.dao;

import java.util.List;
import java.util.Optional;

import practice.entities.Item;

public interface ItemDaoInterface {

	public List<Item> findAll();

	public Optional<Item> findById(Long id);

	public Item save(Item item);

	public void delete(Long itemid);
}