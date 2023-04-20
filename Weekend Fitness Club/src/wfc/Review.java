package wfc;

public class Review 
{
	private int rating;
	private Booking booking;
	
	public Review() {}
	
	public Review(Booking booking, int rating) 
	{
		this.rating = rating;
		this.booking = booking;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	@Override
	public String toString() {
		return this.getBooking().toString()+", Rating: " + this.getRating();
	}
}
