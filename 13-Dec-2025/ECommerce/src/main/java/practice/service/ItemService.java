package practice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import practice.dao.ItemDAO;
import practice.entities.Item;

@Service
public class ItemService implements ItemServiceInterface {

    @Autowired
    ItemDAO dao;

    @Override
    public List<Item> findAll() {
        return dao.findAll();
    }

    @Override
    public Item findById(Long id) {
        return dao.findById(id);
    }

    @Override
    @Transactional
    public Item save(Item item) {
        return dao.save(item);
    }

    @Override
    @Transactional
    public Item update(Item item, Long id) {
        Item existing = dao.findById(id);
        if (existing != null) {
            existing.setItemName(item.getItemName());
            existing.setItemCost(item.getItemCost());
            return dao.save(existing);
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        dao.delete(id);
    }
}
