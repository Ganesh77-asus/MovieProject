package com.capgemini.Movie.DAO;

import com.capgemini.Movie.entity.Booking;
import com.capgemini.Movie.entity.Movie;
import com.capgemini.Movie.entity.Show;
import com.capgemini.Movie.entity.Theatre;
import com.capgemini.Movie.entity.Ticket;
import com.capgemini.Movie.exception.BookingException;
import com.capgemini.Movie.exception.MovieException;
import com.capgemini.Movie.exception.ShowException;
import com.capgemini.Movie.exception.TheatreException;

public interface MovieDAOInterface {
	
	
	public Movie getMovie(int movieid) throws MovieException ;
	
	public Show getShow(int showid) throws ShowException;
	
	public Theatre getTheatre(int theatreid) throws TheatreException ;
	
	public Booking getBooking(int bookingid)throws BookingException;
	
}
