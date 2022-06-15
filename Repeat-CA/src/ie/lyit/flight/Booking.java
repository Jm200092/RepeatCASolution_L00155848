package ie.lyit.flight;
import java.util.ArrayList;

public class Booking {

	private Flight outbound;
	private Flight inbound;
	private ArrayList<Passenger> passengers;
	private double totalPrice;
	private static int num = 0;

	public Booking() {
		outbound = new Flight();
		inbound = new Flight();
		passengers = new ArrayList<Passenger>();
		totalPrice = 0;
		++num;
	}

	public Booking(Flight outBoundFlight, Flight inboundFlight, ArrayList<Passenger> p) {
		outbound = outBoundFlight;
		inbound = inboundFlight;
		passengers = p;
		totalPrice = 0;
		++num;
	}

	public void setTotalPrice() {
		getPrice();
	}

	public void setOutBound(Flight outFlight) {
		outbound = outFlight;
	}

	public void setInBound(Flight inFlight) {
		outbound = inFlight;
	}

	public void setPassengers(ArrayList<Passenger> passenger) {
		passengers = passenger;
	}

	public void getPrice() {
		totalPrice = (outbound.getPrice() + inbound.getPrice() ) *passengers.size() ;
	}

	public boolean findPassenger(Passenger passenger) {
		if(passengers.contains(passenger)) {
			return true;	
		}

		else
			return false;
	}

	@Override
	public String toString() {
		   return "Outbound Flight is: " + getOutbound() 
		   					+"Inbound Flight is: " + getInbound() + 
		   					"Passenger is: " + getPassengers() + 
		   					"Total Price is " + getTotalPrice();
		}

	public Flight getOutbound() {
		return outbound;
	}

	public Flight getInbound() {
		return inbound;
	}

	public ArrayList<Passenger> getPassengers() {
		return passengers;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public static int getCount() {
		return num;
	}

	// ==> Called when comparing an object with another object, e.g. - 
	//       if(b1.equals(b2))										
	@Override
	public boolean equals(Object obj){
		Booking bObject = new Booking();

		if (obj instanceof Booking) {
			bObject = (Booking)obj;
		}

		if(bObject.getInbound() == inbound && bObject.getOutbound() == outbound && bObject.getPassengers() == passengers && bObject.getTotalPrice() == totalPrice) {
				return true;
		}

		else
		    return false;
	}

}
