package practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import practice.entities.Item;
import practice.service.ItemService;

@RestController
@RequestMapping("/items")
public class ItemController {

	@Autowired
	ItemService service;

	@GetMapping
	public ResponseEntity<List<Item>> findAll() {
		return ResponseEntity.ok(service.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Item> findById(@PathVariable Long id) {
		if (id < 0)
			throw new IllegalArgumentException("Id cant be Negative");
		return ResponseEntity.ok(service.findById(id));
	}

	@PostMapping
	public Item save(@Valid @RequestBody Item item) {
		return service.save(item);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Long id) {
		service.delete(id);
		return ResponseEntity.ok("Deleted successfully");
	}

	@PutMapping("/{id}")
	public Item update(@Valid @RequestBody Item item, @PathVariable Long id) {
		return service.update(item, id);
	}
}