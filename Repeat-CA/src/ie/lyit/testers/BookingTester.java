package ie.lyit.testers;

import java.util.ArrayList;

import ie.lyit.flight.Booking;
import ie.lyit.flight.Date;
import ie.lyit.flight.Flight;
import ie.lyit.flight.Name;
import ie.lyit.flight.Passenger;
import ie.lyit.flight.Time;;

public class BookingTester {
	public static void main(String[] args) {
		Booking b1;
		Flight in, out;
		ArrayList<Passenger> passengers;
		Passenger p1;
		
	    //Flight fliteA = new Flight("BR215","Derry", "Stanstead", 25, 12, 2018, 12, 40, 16.99);
		//FLIGHT BR215 ==> Derry to Stanstead 25/12/2018 12:40 hours
		//in = new Flight("F101","Des1","Des2",(new Date(20,12,2021)),(new Time(10,30)),10);
		//out = new Flight("F102","Des2", "Des1",(new Date(30,12,2021)),(new Time(12,30)),10);
		
		out = new Flight("F101", "Des2", "Des2", 30, 12, 2020, 12, 30, 20.99);
		in = new Flight("F102", "Des1", "Des2", 20, 12, 2020, 10, 30, 15.99);
		
		passengers = new ArrayList<Passenger>();
		
		//    Passenger prObj = new Passenger("Mr", "Joe", "Doe", 25, 12, 1985, 2, true);
		//p1 = new Passenger((new Name("Ms", "Teoh", "Anderson")),(new Date(9,2,2000)), 2, false);
		p1 = new Passenger("Ms", "Teoh", "Anderson", 25, 12, 2000, 2, true);
	
		
		passengers.add(p1);
		b1 = new Booking(in, out, passengers);

		System.out.print(b1);
	}
}