package practice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import practice.bean.Movie;
import practice.config.JDBCConfig;
import practice.dao.MovieDAO;

public class App {
	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				JDBCConfig.class)) {
			MovieDAO dao = applicationContext.getBean(MovieDAO.class);
//			Movie movie = new Movie(1, "KGF", "Kannada", 8.9);
			Movie movie = new Movie(2, "GOT", "English", 8.9);
			
//			dao.saveMovie(movie);
//			dao.saveMovie(movie1);

//			dao.findAll().forEach(System.out::println);
//			System.out.println(dao.findById(2));
//			System.out.println("------------------------------------");
//			Movie movie = new Movie(2, "GOT", "English", 9.5);
//			dao.updateMovie(movie);
//			System.out.println("-------------Saved------------------");
			dao.findAll().forEach(System.out::println);
			
//			dao.deleteMovie(movie);
			
		}
	}
}
