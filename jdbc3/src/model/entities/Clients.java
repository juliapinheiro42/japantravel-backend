package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Clients implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer id;
    private String name;
    private String email;
    private String password;
    
    private Promotions promotions;
    
    public Clients() {
    	
    }

	public Clients(Integer id, String name, String email, String password, Promotions promotions) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.promotions = promotions;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Promotions getPromotions() {
		return promotions;
	}

	public void setPromotions(Promotions promotions) {
		this.promotions = promotions;
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
		Clients other = (Clients) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Clients [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", promotions="
				+ promotions + "]";
	}

	
    
}
