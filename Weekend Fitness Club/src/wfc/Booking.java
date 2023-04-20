package wfc;

public class Booking 
{
	private int bookingID;
	private Customer customer;
	private FitnessLesson lesson;
	private String bookingDate;

	Booking(){}
	public Booking(int bookingID, Customer customer, FitnessLesson lesson, String bookingDate) 
	{
		this.bookingID = bookingID;
		this.customer = customer;
		this.lesson = lesson;
		this.bookingDate = bookingDate;
	}
	
	public Booking(Customer customer, FitnessLesson lesson, String bookingDate) 
	{
		this.customer = customer;
		this.lesson = lesson;
		this.bookingDate = bookingDate;
	}

	public int getBookingID() {
		return bookingID;
	}

	public void setBookingID(int bookingID) {
		this.bookingID = bookingID;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public FitnessLesson getLesson() {
		return lesson;
	}

	public void setLesson(FitnessLesson lesson) {
		this.lesson = lesson;
	}

	public String getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}

	@Override
	public String toString() {
		return "Booking Details\nBooking ID: " + this.getBookingID() + "\n"+ this.customer.toString() 
				+"\n"+ this.lesson.toString() + ", Date: " + this.getBookingDate();
	}
	
	
}
