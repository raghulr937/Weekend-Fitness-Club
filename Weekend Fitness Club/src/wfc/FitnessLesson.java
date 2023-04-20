package wfc;

public class FitnessLesson 
{
	private int weekno;
	private String type;
	private double price; 
	private int availableCapacity;
	private String day;
	private String time;
	
	public FitnessLesson() {}
	public FitnessLesson(int weekno, String type, double price, int availableCapacity, String day, String time) 
	{
		this.weekno = weekno;
		this.type = type;
		this.price = price;
		this.availableCapacity = availableCapacity;
		this.day = day;
		this.time = time;
	}

	public int getWeekno() {
		return weekno;
	}

	public void setWeekno(int weekno) {
		this.weekno = weekno;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getAvailableCapacity() {
		return availableCapacity;
	}

	public void setAvailableCapacity(int availableCapacity) {
		this.availableCapacity = availableCapacity;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "\nWeek No.: "+this.getWeekno()+", Type: " + this.getType() + 
				", Price: " + this.getPrice() + ", Available Capacity: " + 
				this.getAvailableCapacity() + ", Day: "+this.getDay()+
				", Time: " + this.getTime();
	}
	
	
}
