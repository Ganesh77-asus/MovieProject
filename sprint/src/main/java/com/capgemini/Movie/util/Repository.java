package com.capgemini.Movie.util;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import com.capgemini.Movie.entity.Booking;
import com.capgemini.Movie.entity.Movie;
import com.capgemini.Movie.entity.Screen;
import com.capgemini.Movie.entity.Show;
import com.capgemini.Movie.entity.Theatre;
import com.capgemini.Movie.entity.Ticket;

public class Repository {
	
	public static Map<Integer,Booking> bookingMap = new HashMap<Integer,Booking>();
	public static Map<Integer, Movie> movieMap = new HashMap<>();
	public static Map<Integer, Show> showMap = new HashMap<>();
	public static Map<Integer, Theatre> theatreMap = new HashMap<Integer,Theatre>();
	public static int bookingId=200;
	static {
		Ticket ticket = new Ticket(1245567890, 3);
		
		Theatre theatre1 = new Theatre(1234, "PVR", "Hyderabad", "Gopal", "8521479630");
		
		Movie movie1 = new Movie(3214, "Dangal", "Hindi", "Raj", "comedy");
		Show show1 = new Show(1245678, 20, 3, movie1);
		
		
		movieMap.put(1, movie1);
		showMap.put(1, show1);
		theatreMap.put(1, theatre1);
		
		
	
		
		Theatre theatre2 = new Theatre(1244, "Cinepolis", "Chennai", "Ram", "8521479660");
		
		Movie movie2 = new Movie(3213, "Fan", "Telugu", "Chopra", "Thriller");
		Show show2 = new Show(1245778, 21, 4, movie2);
		
		
		
		movieMap.put(2, movie2);
		showMap.put(2, show2);
		theatreMap.put(2, theatre2);
		
		
		Theatre theatre3 = new Theatre(1245, "IMAX", "Mumbai", "Sam", "8521479670");
		Movie movie3 = new Movie(3212, "TubeLight", "Hindi", "Shetty", "Drama");
		Show show3 = new Show(1245578, 22, 5, movie3);
		
		
		movieMap.put(3, movie3);
		showMap.put(3, show3);
		theatreMap.put(3, theatre3);
		
		Ticket ticket3 = new Ticket(124567667, 3);
		Booking booking1 = new Booking(123,  show1,  LocalDate.of(2020, 02, 19), 5);
		Ticket ticket2 = new Ticket(124567667, 3);
		Booking booking2 = new Booking(124,show2, LocalDate.of(2020, 02, 20),3);
		
		bookingMap.put(1,booking1);
		bookingMap.put(2, booking2);
		
		
			
	}
}
