package practice.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import practice.bean.Movie;
import practice.config.MovieRowMapper;

@Repository
public class MovieDAO implements MovieDAOInterface {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	NamedParameterJdbcTemplate jdbcParameterJdbcTemplate;

	@Override
	public List<Movie> findAll() {
		return jdbcTemplate.query("select * from movie", new MovieRowMapper());
	}

	@Override
	public void saveMovie(Movie movie) {
		jdbcTemplate.update("insert into movie(id,name,language,rating) values(?,?,?,?)", movie.getId(),
				movie.getName(), movie.getLanguage(), movie.getRating());
	}

	@Override
	public Movie findById(int id) {
		return jdbcTemplate.queryForObject("select * from movie where id=?", new MovieRowMapper(), id);
	}

	@Override
	public Movie updateMovie(Movie movie) {
		String sql = "update movie set rating = :rating, name = :name, language = :language where id = :id";

		jdbcParameterJdbcTemplate.update(sql, Map.of("id", movie.getId(), "name", movie.getName(), "language",
				movie.getLanguage(), "rating", movie.getRating()));
		return findById(movie.getId());
	}

	@Override
	public void deleteMovie(Movie movie) {
		jdbcParameterJdbcTemplate.update("delete from movie where id=:id", Map.of("id", movie.getId()));
		System.out.println("-----deleted-------");
	}

}
