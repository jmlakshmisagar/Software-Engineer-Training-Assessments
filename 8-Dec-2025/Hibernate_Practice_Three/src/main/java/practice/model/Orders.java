package practice.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name = "table")
@NamedQueries({ @NamedQuery(name = "Orders.findAll", query = "From Orders"),
		@NamedQuery(name = "Orders.findById", query = "From Orders where id=:o") })
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private LocalDate date;
	private double cost;
	private String items;

	public Orders() {
		super();
	}

	public Orders(int id, LocalDate date, double cost, String items) {
		super();
		this.id = id;
		this.date = date;
		this.cost = cost;
		this.items = items;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Orders [id=" + id + ", date=" + date + ", cost=" + cost + ", items=" + items + "]";
	}
}
