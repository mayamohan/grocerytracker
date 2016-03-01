package data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "weeklyGrocery")
public class Sooperiority {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String storeName;
	private double amount;
	private int numItems;
	private String description;
	private float total;
	
	public Sooperiority() {}

	public Sooperiority(String storeName, double amount, int numItems, String description, float total) {
		super();
		this.storeName = storeName;
		this.amount = amount;
		this.numItems = numItems;
		this.description = description;
		this.total = total;
	}
	
	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getNumItems() {
		return numItems;
	}

	public void setNumItems(int numItems) {
		this.numItems = numItems;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getId() {
		return id;
	}
}