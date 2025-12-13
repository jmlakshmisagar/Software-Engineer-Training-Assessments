package practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import practice.entities.Item;
import practice.service.ItemService;

@RestController
@RequestMapping("/items")
public class ItemController {

    @Autowired
    ItemService service;

    @GetMapping
    public List<Item> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Item findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public Item save(@RequestBody Item item) {
        return service.save(item);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "Deleted successfully";
    }

    @PutMapping("/{id}")
    public Item update(@RequestBody Item item, @PathVariable Long id) {
        return service.update(item, id);
    }
}
