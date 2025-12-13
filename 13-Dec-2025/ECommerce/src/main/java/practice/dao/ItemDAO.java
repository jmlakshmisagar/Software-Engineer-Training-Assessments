package practice.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import practice.entities.Item;
import practice.repository.ItemRepository;

@Repository
public class ItemDAO implements ItemDaoInterface {

	@Autowired
	ItemRepository repository;

	public List<Item> findAll() {
		return repository.findAll();
	}

	public Item findById(Long id) {
		return repository.findById(id).orElse(null);
	}

	public Item save(Item item) {
		return repository.save(item);
	}

	public void delete(Long id) {
		repository.deleteById(id);
	}
}
