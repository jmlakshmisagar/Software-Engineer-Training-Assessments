package practice.bean;

public class Movie {
	private int id;
	private String name;
	private String language;
	private double rating;

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

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", language=" + language + ", rating=" + rating + "]";
	}

	public Movie(int id, String name, String language, double rating) {
		super();
		this.id = id;
		this.name = name;
		this.language = language;
		this.rating = rating;
	}

	public Movie() {
		super();
	}

}
