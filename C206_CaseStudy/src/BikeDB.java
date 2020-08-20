import java.util.ArrayList;
//ELVIS BikeDB class done
public class BikeDB {

ArrayList<Bike> bikeArrayList = new ArrayList<Bike>();
	
	public void addBike(Bike bike) {
		if (bikeArrayList.contains(bike)==true) {
			System.out.println("Bike Information already exist.");
		}else {
			System.out.println("Bike information added successfully!");
		}
	}
	public void viewAllCustomer() {
		System.out.println(bikeArrayList);
	}
	public void delBike(Bike bike) {
		if(bikeArrayList.contains(bike)==true) {
			bikeArrayList.remove(bike);
			System.out.println("Bike information has been deleted.");
		}else {
			System.out.println("Bike information does not exist.");
		}
	}
	public void showBikeMenu() {
		System.out.println("1. Add Bike Information");
		System.out.println("View Bike Information");
		System.out.println("Delete Bike Information");

	}
	public void processOption() {
		
	}
	public Bike inputBikeDetails() {
		return null;
		
	}
	public int selectBike() {
		return 0;
		
	}
}
