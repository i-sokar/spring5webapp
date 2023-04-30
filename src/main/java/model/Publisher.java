package model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Publisher {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String address_1;
	private String city;
	private String state;
	private String zip;
	public Publisher( String name, String address_1, String city, String state, String zip) {
		super();
		this.name = name;
		this.address_1 = address_1;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress_1() {
		return address_1;
	}
	public void setAddress_1(String address_1) {
		this.address_1 = address_1;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	@Override
	public int hashCode() {
		return Objects.hash(address_1, city, id, name, state, zip);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Publisher other = (Publisher) obj;
		return Objects.equals(address_1, other.address_1) && Objects.equals(city, other.city) && id == other.id
				&& Objects.equals(name, other.name) && Objects.equals(state, other.state)
				&& Objects.equals(zip, other.zip);
	}
	@Override
	public String toString() {
		return "Publisher [id=" + id + ", name=" + name + ", address_1=" + address_1 + ", city=" + city + ", state="
				+ state + ", zip=" + zip + "]";
	}
	
	
	

}
