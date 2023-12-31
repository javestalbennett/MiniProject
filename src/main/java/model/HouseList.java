package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author torirem - aaustin5
 * CIS175 - Fall 2023
 * Oct 8, 2023
 */

@Entity
@Table(name="houseItems")
public class HouseList {
	@Id
	@GeneratedValue
	@Column(name="ID")
	private int id;
	@Column(name="ADDRESS")
	private String address = "blank";
	@Column(name="CITY")
	private String city = "blank";
	@Column(name="PRICE")
	private double price = 0;
	@Column(name="NUMROOMS")
	private int numRooms = 0;
	@Column(name="NUMBATHS")
	private double numBaths = 0;
	@Column(name="AC")
	private boolean ac = false;
	@Column(name="BASEMENT")
	private boolean basement = false;
	@Column(name="POOL")
	private boolean pool = false;
	@Column(name="STORIES")
	private int stories = 0;
	
	public HouseList() {
		super();

	}
	
	public HouseList(String address, String city, double price, int numRooms, double numBaths) {
		super();
		this.address = address;
		this.city = city;
		this.price = price;
		this.numRooms = numRooms;
		this.numBaths = numBaths;
	}
	
	public HouseList(String address, String city, double price, int numRooms, double numBaths, boolean AC, boolean basement, boolean pool, int stories) {
		super();
		this.address = address;
		this.city = city;
		this.price = price;
		this.numRooms = numRooms;
		this.numBaths = numBaths;
		this.ac = AC;
		this.basement = basement;
		this.pool = pool;
		this.stories = stories;
	}
	
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @return the numRooms
	 */
	public int getNumRooms() {
		return numRooms;
	}
	/**
	 * @param numRooms the numRooms to set
	 */
	public void setNumRooms(int numRooms) {
		this.numRooms = numRooms;
	}
	/**
	 * @return the numBaths
	 */
	public double getNumBaths() {
		return numBaths;
	}
	/**
	 * @param numBaths the numBaths to set
	 */
	public void setNumBaths(double numBaths) {
		this.numBaths = numBaths;
	}
	/**
	 * @return the a_C
	 */
	public boolean getAC() {
		return ac;
	}
	/**
	 * @param a_C the a_C to set
	 */
	public void setAC(boolean ac) {
		this.ac = ac;
	}
	/**
	 * @return the basement
	 */
	public boolean getBasement() {
		return basement;
	}
	/**
	 * @param basement the basement to set
	 */
	public void setBasement(boolean basement) {
		this.basement = basement;
	}
	/**
	 * @return the pool
	 */
	public boolean getPool() {
		return pool;
	}
	/**
	 * @param pool the pool to set
	 */
	public void setPool(boolean pool) {
		this.pool = pool;
	}
	/**
	 * @return the stories
	 */
	public int getStories() {
		return stories;
	}
	/**
	 * @param stories the stories to set
	 */
	public void setStories(int stories) {
		this.stories = stories;
	}

	@Override
	public String toString() {
		return "HouseList [id=" + id + ", address=" + address + ", city=" + city + ", price=" + price + ", numRooms="
				+ numRooms + ", numBaths=" + numBaths + ", ac=" + ac + ", basement=" + basement + ", pool=" + pool
				+ ", stories=" + stories + "]";
	}
	
}
