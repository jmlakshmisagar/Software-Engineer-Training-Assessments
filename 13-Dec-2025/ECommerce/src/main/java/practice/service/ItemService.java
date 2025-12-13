package practice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import practice.dao.ItemDAO;
import practice.entities.Item;
import practice.exceptions.ItemNotFoundException;

@Service
@Transactional
public class ItemService implements ItemServiceInterface {

	@Autowired
	ItemDAO dao;

	@Override
	public List<Item> findAll() {
		return dao.findAll();
	}

	@Override
	public Item findById(Long id) {
	    Optional<Item> optional = dao.findById(id);
	    if (optional.isPresent()) {
	        return optional.get();
	    }
	    throw new ItemNotFoundException("no item present with this " + id);
	}


	@Override
	public Item save(Item item) {
		return dao.save(item);
	}

	@Override
	public Item update(Item item, Long id) {
	    Optional<Item> optional = dao.findById(id);

	    if (optional.isPresent()) {
	        Item existing = optional.get();
	        existing.setItemName(item.getItemName());
	        existing.setItemCost(item.getItemCost());
	        return dao.save(existing);
	    }

	    throw new ItemNotFoundException("no item present with this " + id);
	}



	@Override
	public void delete(Long id) {
		dao.delete(id);
	}

}
