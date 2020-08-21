import java.util.ArrayList;

public class BikeShop {

	public static void main(String[] args) {

		ArrayList<Appointment> appointmentArrayList = new ArrayList<Appointment>();
		ArrayList<Bike> bikeArrayList = new ArrayList<Bike>();
		ArrayList<Customer> customerListArrayList = new ArrayList<Customer>();
		ArrayList<Feedback> feedbackArrayList = new ArrayList<Feedback>();

		//add bikes/bike items here(?)

		int option = 0;

		while (option != 5) {

			BikeShop.menu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				// ad to View all items


			} else if (option == 2) {
				// Add a new item
				BikeShop.setHeader("ADD");			
				BikeShop.setHeader("TYPES");
				System.out.println("1. Bike");
				System.out.println("2. Bike parts");
				System.out.println("3. Customer");
				System.out.println("4. Appointment");
				System.out.println("5. Feedback");
				
				int itemType = Helper.readInt("Enter option to add item > ");

				if (itemType == 1) {
					// Add a bike


				} else if (itemType == 2) {
					// Add bikeparts

				} else {
					System.out.println("Invalid item");
				}

			} else if (option == 3) {
				// delete item
				BikeShop.setHeader("DELETE");			
				BikeShop.setHeader("TYPES");
				System.out.println("1. Bike");
				System.out.println("2. Bike parts");
				System.out.println("3. Customer");
				System.out.println("4. Appointment");
				System.out.println("5. Feedback");
				
				int itemType = Helper.readInt("Enter option to update item > ");

				if (itemType == 1) {
					// delete bike

				} else if (itemType == 2) {
					// delete bike parts

				//add more else ifs
				} else {
					System.out.println("Invalid type");
				}


			} else if (option == 4) {
				System.out.println("Bye!");
			} else {
				System.out.println("Invalid option");
			}

		}

	}

	public static void menu() {
		BikeShop.setHeader("BIKE SHOP");
		System.out.println("1. View all items");
		System.out.println("2. Add item");
		System.out.println("3. Delete item");
		System.out.println("4. Quit");
		Helper.line(80, "-");

	}
	
	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}
}

	//not sure if we'll need this
/*	public static String showAvailability(boolean isAvailable) {
		String avail;

		if (isAvailable == true) {
			avail = "Yes";
		} else {
			avail = "No";
		}
		return avail;
	} */

	//================================= Option 1 View =================================


	//================================= Option 2 Add =================================

	
	//================================= Option 3 Delete =================================
	
