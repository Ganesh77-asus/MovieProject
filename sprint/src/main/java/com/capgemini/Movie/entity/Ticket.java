package com.capgemini.Movie.entity;
 
public class Ticket {
	  public static int currticketID=1;
	private int ticketid;
	private int noofSeats;
	private double totalCost;
	
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public int getNoofSeats() {
		return noofSeats;
	}
	public void setNoofSeats(int noofSeats) {
		this.noofSeats = noofSeats;
	}
	public Ticket(int ticketid, int noofSeats) {
		super();
		this.ticketid = ticketid;
		this.noofSeats = noofSeats;
	}
	public Ticket() {
		
	}
	
}
