package practice.config;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import practice.bean.Movie;

public class MovieRowMapper implements RowMapper<Movie> {

	@Override
	public Movie mapRow(ResultSet rs, int rowNum) throws SQLException {
		Movie movie = new Movie();
		movie.setId(rs.getInt("id"));
		movie.setName(rs.getString("name"));
		movie.setLanguage(rs.getString("language"));
		movie.setRating(rs.getDouble("rating"));
		return movie;
	}

}
