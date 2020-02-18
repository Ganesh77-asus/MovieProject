package com.capgemini.Movie.service;

import java.time.LocalDate;

import com.capgemini.Movie.DAO.MovieDAOImpl;
import com.capgemini.Movie.DAO.MovieDAOInterface;
import com.capgemini.Movie.entity.Booking;
import com.capgemini.Movie.entity.Show;
import com.capgemini.Movie.entity.Theatre;
import com.capgemini.Movie.exception.BookingException;
import com.capgemini.Movie.exception.ShowException;
import com.capgemini.Movie.exception.TheatreException;
import com.capgemini.Movie.exception.ValidationException;
import com.capgemini.Movie.util.Repository;


public class MovieServiceImpl implements MovieServiceInterface {
	private MovieDAOInterface dao = new MovieDAOImpl();

	@Override
	public Booking bookTicket(int theatreId, int showId, int tkts)
			throws TheatreException,BookingException,ShowException, ValidationException {
		String theatreid1=Integer.toString(theatreId);
		String showid1=Integer.toString(showId);
		String tkts1=Integer.toString(tkts);
		if(theatreId==0&&showId==0&&tkts==0)
			throw new ValidationException("TheatreId, ShowId or tickets should not  be 0");
		if(theatreid1.equals(null)&& showid1.equals(null)&&tkts1.equals(null))
			throw new ValidationException("TheatreId, ShowId or tickets should not  be null");
		if(theatreid.matches([]))
		
		
			
		Theatre theatre = dao.getTheatre(theatreId);
		Show show = dao.getShow(showId);
		if (show.getSeats() > tkts) {
			show.setSeats(show.getSeats() - 1);
			Booking booking = new Booking(++Repository.bookingId, show, LocalDate.now(), tkts);
			return booking;
		}
		throw new BookingException();
	}
	

	@Override
	public Show getShow(int showId) throws ShowException {
		return dao.getShow(showId);
	}

}
