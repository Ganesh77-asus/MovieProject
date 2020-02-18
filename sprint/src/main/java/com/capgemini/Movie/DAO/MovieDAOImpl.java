package com.capgemini.Movie.DAO;

import com.capgemini.Movie.entity.Booking;
import com.capgemini.Movie.entity.Movie;
import com.capgemini.Movie.entity.Show;
import com.capgemini.Movie.entity.Theatre;
import com.capgemini.Movie.exception.BookingException;
import com.capgemini.Movie.exception.MovieException;
import com.capgemini.Movie.exception.ShowException;
import com.capgemini.Movie.exception.TheatreException;
import com.capgemini.Movie.util.Repository;

public class MovieDAOImpl implements MovieDAOInterface{

	@Override
	public Movie getMovie(int movieid) throws MovieException {
		if(Repository.movieMap.containsKey(movieid))
			throw new MovieException();
		return Repository.movieMap.get(movieid);
	}

	@Override
	public Show getShow(int showid) throws ShowException {
		if(Repository.showMap.containsKey(showid))
			throw new ShowException();
		return Repository.showMap.get(showid);
	}

	@Override
	public Theatre getTheatre(int theatreid) throws TheatreException {
		if(Repository.theatreMap.containsKey(theatreid))
			throw new TheatreException();
		return Repository.theatreMap.get(theatreid);
	}

	@Override
	public Booking getBooking(int bookingid) throws BookingException {
		if(Repository.bookingMap.containsKey(bookingid))
			throw new BookingException();
		
		return Repository.bookingMap.get(bookingid);
	}
	
	
	
}




	
