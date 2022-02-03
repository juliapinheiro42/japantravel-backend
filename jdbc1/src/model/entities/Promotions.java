package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Promotions implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private Integer id;
    private String name;
    private double estoque;
    private double price;

public Promotions() {
	
}

public Promotions(Integer id, String name, double estoque, double price) {
	super();
	this.id = id;
	this.name = name;
	this.estoque = estoque;
	this.price = price;
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getEstoque() {
	return estoque;
}

public void setEstoque(double estoque) {
	this.estoque = estoque;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

@Override
public int hashCode() {
	return Objects.hash(id);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Promotions other = (Promotions) obj;
	return Objects.equals(id, other.id);
}

@Override
public String toString() {
	return "Promotions [id=" + id + ", name=" + name + ", estoque=" + estoque + ", price=" + price + "]";
	
}



  
}
