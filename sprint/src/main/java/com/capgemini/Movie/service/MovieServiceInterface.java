package com.capgemini.Movie.service;

import com.capgemini.Movie.entity.Booking;
import com.capgemini.Movie.entity.Show;
import com.capgemini.Movie.exception.BookingException;
import com.capgemini.Movie.exception.ShowException;
import com.capgemini.Movie.exception.TheatreException;
import com.capgemini.Movie.exception.ValidationException;

public interface MovieServiceInterface {

	public Booking bookTicket(int theatreId, int showId, int tkts)throws TheatreException, ShowException, BookingException, ValidationException;
	public Show getShow(int showId)throws ShowException;
	
	
}
