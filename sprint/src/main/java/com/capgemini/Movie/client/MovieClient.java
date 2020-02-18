/**package com.capgemini.Movie.client;

import java.util.Date;
import java.util.Scanner;

import com.capgemini.Movie.entity.Ticket;
import com.capgemini.Movie.service.MovieService;
import com.capgemini.Movie.service.MovieServiceImpl;

public class MovieClient {

	public static void main(String[] args) {
		MovieServiceImpl ser = new MovieServiceImpl();
		int option;
		int movieOption =0;
		int showOption=0;
		int theatreOption=0;
		Ticket ticket = new Ticket();
		int ticketId; 
		System.out.println("Enter 1 for Booking");
		
		Scanner sc = new Scanner(System.in);
		ticketId = ser.getticketID( movieOption, showOption, theatreOption);
		option=sc.nextInt();
		switch(option)
		{
		case 1:
		{
			System.out.println("Enter the no. of seats:");
			int  noOfSeats=sc.nextInt();
			char row1 = 0;
			char row[] = new char[noOfSeats];
			int seats[]=new int[noOfSeats];
			
			for(int i=0;i<noOfSeats;i++)
			{
				System.out.println("Enter row: ");
				row1=sc.next().charAt(0);
				System.out.println("Enter seat number: ");
				seats[i]=sc.nextInt();
			}
			System.out.println("Select Movie");
			movieOption = sc.nextInt();
			switch(movieOption) {
			case 1:
				System.out.println("1. rrr");
				break;
			case 2:
				System.out.println("2. sss");
				break;
			case 3:
				System.out.println("3. aaa");
				break;
			}
			System.out.println("Select Show");
			showOption=sc.nextInt();
			switch(showOption)
			{
			case 1:
				System.out.println("1.Show1 ");
			case 2:
				System.out.println("2.Show2");
			case 3:
				System.out.println("3.Show3");
			}
			System.out.println("Select Theatre");
			theatreOption=sc.nextInt();
			switch(theatreOption)
			{
			case 1:
				System.out.println("1.pvr");
			case 2:
				System.out.println("2.avr");
			case 3:
				System.out.println("3.nvr");
				
				}
			
			System.out.println("Total Cost: "+ser.calculateTotalCost(noOfSeats));
			ticket = ser.showTicket(ticketId);
			System.out.println("Ticket Details: "+ticket);
			
		}
		}
	}

}*/
		

