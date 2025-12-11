package practice.dao;

import java.util.List;

import practice.bean.Movie;

public interface MovieDAOInterface {
	public List<Movie> findAll();

	public void saveMovie(Movie movie);

	public Movie findById(int id);

	public Movie updateMovie(Movie movie);

	public void deleteMovie(Movie movie);
}
