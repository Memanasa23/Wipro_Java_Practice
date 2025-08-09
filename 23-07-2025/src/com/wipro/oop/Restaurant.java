package com.wipro.oop;

public class Restaurant {
	String name;
    String location;
    int rating;
    String cuisine;

    public Restaurant() {
    	
    }
    
    

	public Restaurant(String name, String location, int rating, String cuisine) {
		super();
		this.name = name;
		this.location = location;
		this.rating = rating;
		this.cuisine = cuisine;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getCuisine() {
		return cuisine;
	}

	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
	
	@Override
	public String toString() {
		return "Restaurant [name=" + name + ", location=" + location + ", rating=" + rating + ", cuisine=" + cuisine
				+ "]";
	}
    

}
