package com.zee.zee5app.repo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import com.zee.zee5app.dto.Movie;
import com.zee.zee5app.exceptions.UnableToGenerateIdException;
import com.zee.zee5app.utils.DBUtils;

public class MovieRepositoryImpl implements MovieRepository {

	private static MovieRepository movieRepo;
	
	private MovieRepositoryImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public static MovieRepository getInstance() {
		if(movieRepo == null) {
			movieRepo = new MovieRepositoryImpl();
		}
		return movieRepo;
	}
	
	private DBUtils dbUtils = DBUtils.getInstance();
	
	@Override
	public Movie insertMovie(Movie movie) throws UnableToGenerateIdException {
		// TODO Auto-generated method stub
		
		File file = new File(movie.getTrailer());
		BufferedInputStream bufferedInputStream = null;
		BufferedOutputStream bufferedOutputStream = null;
		System.out.println(file.getName());

		try {
			if (movie.getTrailer() == null || movie.getTrailer() == "" || !file.exists()) {
				throw new FileNotFoundException("file does not exist");
			} else {
				bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
				bufferedOutputStream = new BufferedOutputStream(
						new FileOutputStream("D:\\zee5app\\trailer\\" + file.getName()));

				bufferedOutputStream.write(bufferedInputStream.readAllBytes());

				System.out.println("file exists");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bufferedInputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// shift that file to zee5app/trailer folder
		// provide the location to trailer field

		// then take the path and store it in db --> handled by REPO

		return movieRepo.insertMovie(movie);
	}

	@Override
	public Movie updateMovie(String movieId, Movie movie) {
		// TODO Auto-generated method stub
		
		
		
		return null;
	}

	@Override
	public Optional<Movie> getMovieByMovieId(String movieId) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Optional<Movie[]> getAllMovies() {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Movie[] getAllMoviesByGenre(String genre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movie[] getAllMoviesByName(String movieName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> findByOrderByMovieNameDsc() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteMovieByMovieId(String movieId) {
		// TODO Auto-generated method stub
		return null;
	}

}
