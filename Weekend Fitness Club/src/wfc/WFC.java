package wfc;

import java.util.ArrayList;
import java.util.Scanner;

public class WFC {

	public static void main(String[] args) 
	{
		int ch1, ch2, ch3, ch4, wn, bid, review = 0, count = 0, rev=0, avg = 0, price = 0;
		String day, les, name, email, phone, bd, fit, t = null;
		double pr = 0;
		ArrayList<Double> pric = new ArrayList<>();
		FitnessLesson fl = new FitnessLesson();;
		Customer c1 = new Customer("John Taylor", "john@gmail.com", "8741256321");
		Customer c22 = new Customer("Marry Thomas", "marry@gmail.com", "7458965412");
		Customer c3 = new Customer("Henry Taylor", "henry@gmail.com", "2874563921");
		Customer c4 = new Customer("Johny Ray", "johny@gmail.com", "9876541230");
		Customer c = new Customer();
		Customer c2 = new Customer();
		Review r = new Review();
		Booking book = new Booking();
		ArrayList<Customer> customerList = new ArrayList<>();
		ArrayList<Booking> bookingList = new ArrayList<>();
		ArrayList<Review> reviewList = new ArrayList<>();
		customerList.add(c1);
		customerList.add(c22);
		customerList.add(c3);
		customerList.add(c4);
		ArrayList<FitnessLesson> lessonList = new ArrayList<>();
		FitnessLesson fl1 = new FitnessLesson(1, "YOGA" , 250, 4, "Saturday", "9 am"); 
		FitnessLesson fl2 = new FitnessLesson(1, "SPIN" , 300, 3, "Saturday", "6 pm"); 
		FitnessLesson fl3 = new FitnessLesson(1, "ZUMBA" , 200, 3, "Sunday", "9 am"); 
		FitnessLesson fl4 = new FitnessLesson(1, "BODYSCULPT" , 275, 2, "Sunday", "6 pm"); 
		FitnessLesson fl5 = new FitnessLesson(2, "YOGA" , 250, 5, "Saturday", "9 am"); 
		FitnessLesson fl6 = new FitnessLesson(2, "SPIN" , 300, 3, "Saturday", "6 pm"); 
		FitnessLesson fl7 = new FitnessLesson(2, "ZUMBA" , 200, 4, "Sunday", "9 am"); 
		FitnessLesson fl8 = new FitnessLesson(2, "BODYSCULPT" , 275, 3, "Sunday", "6 pm"); 
		FitnessLesson fl9 = new FitnessLesson(3, "YOGA" , 250, 2, "Saturday", "9 am"); 
		FitnessLesson fl10 = new FitnessLesson(3, "SPIN" , 300, 2, "Saturday", "6 pm"); 
		FitnessLesson fl11 = new FitnessLesson(3, "ZUMBA" , 200, 3, "Sunday", "9 am"); 
		FitnessLesson fl12 = new FitnessLesson(3, "BODYSCULPT" , 275, 5, "Sunday", "6 pm"); 
		FitnessLesson fl13 = new FitnessLesson(4, "YOGA" , 250, 4, "Saturday", "9 am"); 
		FitnessLesson fl14 = new FitnessLesson(4, "SPIN" , 300, 3, "Saturday", "6 pm"); 
		FitnessLesson fl15 = new FitnessLesson(4, "ZUMBA" , 200, 2, "Sunday", "9 am"); 
		FitnessLesson fl16 = new FitnessLesson(4, "BODYSCULPT" , 275, 4, "Sunday", "6 pm"); 
		FitnessLesson fl17 = new FitnessLesson(5, "YOGA" , 250, 5, "Saturday", "9 am"); 
		FitnessLesson fl18 = new FitnessLesson(5, "SPIN" , 300, 2, "Saturday", "6 pm"); 
		FitnessLesson fl19 = new FitnessLesson(5, "ZUMBA" , 200, 1, "Sunday", "9 am"); 
		FitnessLesson fl20 = new FitnessLesson(5, "BODYSCULPT" , 275, 3, "Sunday", "6 pm"); 
		FitnessLesson fl21 = new FitnessLesson(6, "YOGA" , 250, 5, "Saturday", "9 am"); 
		FitnessLesson fl22 = new FitnessLesson(6, "SPIN" , 300, 4, "Saturday", "6 pm"); 
		FitnessLesson fl23 = new FitnessLesson(6, "ZUMBA" , 200, 1, "Sunday", "9 am"); 
		FitnessLesson fl24 = new FitnessLesson(6, "BODYSCULPT" , 275, 3, "Sunday", "6 pm"); 
		FitnessLesson fl25 = new FitnessLesson(7, "YOGA" , 250, 5, "Saturday", "9 am"); 
		FitnessLesson fl26 = new FitnessLesson(7, "SPIN" , 300, 5, "Saturday", "6 pm"); 
		FitnessLesson fl27 = new FitnessLesson(7, "ZUMBA" , 200, 2, "Sunday", "9 am"); 
		FitnessLesson fl28 = new FitnessLesson(7, "BODYSCULPT" , 275, 4, "Sunday", "6 pm"); 
		FitnessLesson fl29 = new FitnessLesson(8, "YOGA" , 250, 2, "Saturday", "9 am"); 
		FitnessLesson fl30 = new FitnessLesson(8, "SPIN" , 300, 3, "Saturday", "6 pm"); 
		FitnessLesson fl31 = new FitnessLesson(8, "ZUMBA" , 200, 5, "Sunday", "9 am"); 
		FitnessLesson fl32 = new FitnessLesson(8, "BODYSCULPT" , 275, 3, "Sunday", "6 pm"); 
		lessonList.add(fl1);
		lessonList.add(fl2);
		lessonList.add(fl3);
		lessonList.add(fl4);
		lessonList.add(fl5);
		lessonList.add(fl6);
		lessonList.add(fl7);
		lessonList.add(fl8);
		lessonList.add(fl9);
		lessonList.add(fl10);
		lessonList.add(fl11);
		lessonList.add(fl12);
		lessonList.add(fl13);
		lessonList.add(fl14);
		lessonList.add(fl15);
		lessonList.add(fl16);
		lessonList.add(fl17);
		lessonList.add(fl18);
		lessonList.add(fl19);
		lessonList.add(fl20);
		lessonList.add(fl21);
		lessonList.add(fl22);
		lessonList.add(fl23);
		lessonList.add(fl24);
		lessonList.add(fl25);
		lessonList.add(fl26);
		lessonList.add(fl27);
		lessonList.add(fl28);
		lessonList.add(fl29);
		lessonList.add(fl30);
		lessonList.add(fl31);
		lessonList.add(fl32);
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. Admin");
			System.out.println("2. User");
			System.out.println("3. Exit");
			System.out.println("Enter your choice: ");
			ch1 = sc.nextInt();
			sc.nextLine();
			
			switch(ch1)
			{
			case 1:
				System.out.println("1. Add new customer");
				System.out.println("2. View details of a specific customer");
				System.out.println("3. Generate report containing number of customers per lesson on each day, along with the average rating of each lesson");
				System.out.println("4. Generate report containing the type of fitness lessons which has generated the highest income, counting all the same type of lessons together");
				System.out.println("5. Exit");
				System.out.println("Enter your choice: ");
				ch2 = sc.nextInt();
				sc.nextLine();
				
				switch(ch2)
				{
				case 1:
					c2 = addCustomer();
					customerList.add(c2);
					System.out.println("New customer added successfully.");
					break;
					
				case 2:
					System.out.println("Enter name of the customer which details you want to view: ");
					name = sc.nextLine();
					for(int i=0;i<customerList.size();i++)
					{
						if(customerList.get(i).getName().equals(name))
						{
							System.out.println(customerList.get(i).toString());
						}
					}
					break;
					
				case 3:
					for(int i=0;i<bookingList.size();i++)
					{
						
							count = 5 - bookingList.get(i).getLesson().getAvailableCapacity();
						for(int j=0;j<reviewList.size();j++)
						{
								rev = rev + reviewList.get(j).getRating();
								avg = rev/reviewList.size();
							
						}
					}
					for(int i=0;i<bookingList.size();i++)
					{
						int k = 1;
						
							count = 5 - bookingList.get(i).getLesson().getAvailableCapacity();
						
						for(int j=0;j<reviewList.size();j++)
						{
								rev = rev + reviewList.get(j).getRating();
								avg = rev/reviewList.size();
						}
						k++;
					}
					System.out.println("Report");
					System.out.println("Number of customers per lesson on each day: "+count);
					System.out.println("Average Rating: "+avg);
					
					break;
					
				case 4:
					for(int i=0;i<lessonList.size();i++)
					{
						pr = pr + lessonList.get(i).getPrice();
						t = lessonList.get(i).getType();
					}
					pric.add(pr);
					double maximum = pric.get(0);
			        for (int i = 1; i < pric.size(); i++) {
			            if (maximum < pric.get(i))
			                maximum = pric.get(i);
			        }
			        
			        System.out.println("Highest Income: "+maximum+" in "+t+" Lesson");
					break;
					
				case 5:
					System.out.println("Thank you!!");
					System.exit(0);
					break;
					
				default:
					System.out.println("Invalid input!!");
					
				}
				break;
				
			case 2:
				System.out.println("1. Book a lesson");
				System.out.println("2. Give Review for a lesson");
				System.out.println("3. Change a booked lesson");
				System.out.println("4. Cancel a booked lesson");
				System.out.println("5. Exit");
				System.out.println("Enter your choice: ");
				ch3 = sc.nextInt();
				sc.nextLine();
				
				switch(ch3)
				{
				case 1:
					Scanner sc1 = new Scanner(System.in);
					System.out.println("1. View by day");
					System.out.println("2. View by fitness type");
					System.out.println("3. Exit");
					System.out.println("Enter your choice: ");
					ch4 = sc.nextInt();
					sc.nextLine();
					switch(ch4)
					{
					case 1:
						System.out.println("Enter your preferred day(Saturday/Sunday): ");
						day = sc.nextLine();
						System.out.println("Fitness Lesson Details:\n");
						for(int i=0;i<lessonList.size();i++)
						{
							if(lessonList.get(i).getDay().equals(day))
							{
								System.out.println(lessonList.get(i).toString());
							}
						}
						System.out.println("In which week, you want to book?: ");
						wn = sc.nextInt();
						sc.nextLine();
						System.out.println("In which lesson, you want to book?: ");
						les = sc.nextLine();
						for(int i=0;i<lessonList.size();i++)
						{
							if(lessonList.get(i).getWeekno()==wn && lessonList.get(i).getType().equals(les))
							{
								if(lessonList.get(i).getAvailableCapacity() == 0)
								{
									System.out.println("Sorry!!No space available in this lesson.");
								}
								else
								{
									fl = lessonList.get(i);
									lessonList.get(i).setAvailableCapacity(lessonList.get(i).getAvailableCapacity()-1);
								}
							}
						}
						System.out.println("Name of the user: ");
						name = sc.nextLine();
						for(int i=0;i<customerList.size();i++)
						{
							if(customerList.get(i).getName().equals(name))
							{
								c = customerList.get(i);
							}
						}
						System.out.println("Enter booking date: ");
						bd = sc.nextLine();
						System.out.println("Enter booking ID: ");
						bid = sc.nextInt();
						Booking booking = new Booking(bid, c, fl, bd);
						bookingList.add(booking);
						break;
						
					case 2:
						System.out.println("Enter your preferred fitness type(Yoga/Spin/Zumba/Bodysculpt): ");
						fit = sc.nextLine();
						System.out.println("Fitness Lesson Details:\n");
						for(int i=0;i<lessonList.size();i++)
						{
							if(lessonList.get(i).getType().equals(fit))
							{
								System.out.println(lessonList.get(i).toString());
							}
						}
						System.out.println("In which week, you want to book?: ");
						wn = sc.nextInt();
						sc.nextLine();
						System.out.println("In which lesson, you want to book?: ");
						les = sc.nextLine();
						for(int i=0;i<lessonList.size();i++)
						{
							if(lessonList.get(i).getWeekno()==wn && lessonList.get(i).getType().equals(les))
							{
								fl = lessonList.get(i);
								lessonList.get(i).setAvailableCapacity(lessonList.get(i).getAvailableCapacity()-1);
							}
						}
						System.out.println("Name of the user: ");
						name = sc.nextLine();
						for(int i=0;i<customerList.size();i++)
						{
							if(customerList.get(i).getName().equals(name))
							{
								c = customerList.get(i);
							}
						}
						System.out.println("Enter booking date: ");
						bd = sc.nextLine();
						System.out.println("Enter booking ID: ");
						bid = sc.nextInt();
						Booking booking1 = new Booking(bid, c, fl, bd);
						bookingList.add(booking1);
						break;
						
					case 3:
						System.out.println("Thank you!!");
						System.exit(0);
						break;
						
					default:
						System.out.println("Invalid input!!");
					}
					break;
					
				case 2:
					System.out.println("Name of the user: ");
					name = sc.nextLine();
					System.out.println("Enter week no: ");
					wn = sc.nextInt();
					sc.nextLine();
					System.out.println("Name of the fitness lesson you want to give review: ");
					fit = sc.nextLine();
					for(int i=0;i<bookingList.size();i++)
					{
						if(bookingList.get(i).getCustomer().getName().equals(name))// && 
								//bookingList.get(i).getLesson().getType().equals(fit) &&
								//bookingList.get(i).getLesson().getWeekno()==wn)
						{
							System.out.println("Enter your review ranging from 1 to 5 (1: Very dissatisfied, 2: Dissatisfied, 3: Ok, 4: Satisfied, 5: Very Satisfied): ");
							review = sc.nextInt();
							book = bookingList.get(i);
						}
					}
					r = new Review(book, review);
					reviewList.add(r);
					break;
					
				case 3:
					System.out.println("Name of the user: ");
					name = sc.nextLine();
					System.out.println("Enter week no: ");
					wn = sc.nextInt();
					sc.nextLine();
					System.out.println("Name of the fitness lesson you want to change: ");
					fit = sc.nextLine();
					for(int i=0;i<bookingList.size();i++)
					{
						if(bookingList.get(i).getCustomer().getName().equals(name) && 
								bookingList.get(i).getLesson().getType().equals(fit) &&
								bookingList.get(i).getLesson().getWeekno()==wn)
						{
							System.out.println("Enter your preferred day(Saturday/Sunday): ");
							day = sc.nextLine();
							System.out.println("Fitness Lesson Details:\n");
							for(int j=0;j<lessonList.size();j++)
							{
								if(lessonList.get(j).getDay().equals(day))
								{
									System.out.println(lessonList.get(j).toString());
								}
							}
							System.out.println("In which week, you want to book?: ");
							wn = sc.nextInt();
							sc.nextLine();
							System.out.println("In which lesson, you want to book?: ");
							les = sc.nextLine();
							for(int k=0;k<lessonList.size();k++)
							{
								if(lessonList.get(k).getWeekno()==wn && lessonList.get(k).getType().equals(les))
								{
									if(lessonList.get(k).getAvailableCapacity() == 0)
									{
										System.out.println("Sorry!!No space available in this lesson.");
									}
									else
									{
										fl = lessonList.get(k);
										lessonList.get(k).setAvailableCapacity(lessonList.get(k).getAvailableCapacity()-1);
									}
								}
							}
							System.out.println("Enter booking date: ");
							bd = sc.nextLine();
							bookingList.get(i).setBookingDate(bd);
							bookingList.get(i).setLesson(fl);
						}
					}
					break;
					
				case 4:
					System.out.println("Name of the user: ");
					name = sc.nextLine();
					System.out.println("Enter week no: ");
					wn = sc.nextInt();
					sc.nextLine();
					System.out.println("Name of the fitness lesson you want to change: ");
					fit = sc.nextLine();
					for(int i=0;i<bookingList.size();i++)
					{
						if(bookingList.get(i).getCustomer().getName().equals(name) && 
								bookingList.get(i).getLesson().getType().equals(fit) &&
								bookingList.get(i).getLesson().getWeekno()==wn)
						{
							bookingList.remove(bookingList.get(i));
						}
					}
					break;
					
				case 5:
					System.out.println("Thank you!!");
					System.exit(0);
					break;
					
				default:
					System.out.println("Invalid input!!");
					
				}
				break;
				
			case 3:
				System.out.println("Thank you!!");
				System.exit(0);
				break;
				
			default:
				System.out.println("Invalid input!!");
			}
		}
	}
		public static Customer addCustomer()
		{
			String name, email, phone;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter name of the customer: ");
			name = sc.nextLine();
			System.out.println("Enter email of the customer: ");
			email = sc.nextLine();
			System.out.println("Enter phone number of the customer: ");
			phone = sc.nextLine();
			Customer c2 = new Customer(name, email, phone);
			return c2;
		}
}
