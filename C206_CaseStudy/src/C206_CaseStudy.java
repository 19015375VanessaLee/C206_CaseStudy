//this is suppose to be the bike shop class from the class diagram
import java.util.ArrayList;
public class C206_CaseStudy {

	public static void main(String[] args) {
		//Elvis
		ArrayList<Bike> bikeList = new ArrayList<Bike>();
		
	}
		 public static void showMainMenu() {
			 return;

	}
		 
	private static Bike inputBikeInfo() {
		 // ELVIS 
		String bikeModel = Helper.readString("Enter bike model: ");
		String bikeDesc = Helper.readString("Enter bike description: ");
		Boolean isAvail = Helper.readBoolean("Is available? ");
		Bike bp = new Bike(bikeModel, bikeDesc, isAvail);

		return bp;
	}
		 
		 
	 private static void AddBikeInfo(ArrayList<Bike> bikeList, Bike bp) {
		    //Elvis create
		    bikeList.add(bp);
		    System.out.println("Bike info has been added successfully!");
		  }
	
	private static String retrieveBikeInfo(ArrayList<Bike> bikeList) {
		String output = "";
		//ELVIS view
		for(int i =0; i<bikeList.size();i++) {
			output += String.format("%-20s %-20s %-20s", bikeList.get(i).getModel(), bikeList.get(i).getDescription(), bikeList.get(i).getIsAvailable());
		}
		return output;
	}
		 //ELVIS view
	private static void viewBikeInfo(ArrayList<Bike> bikeList) {
		String output = "";
		output = String.format("%-20s %-20s %-20", "MODEL", "DESCRIPTIONS", "IS AVAILABLE");
		output += retrieveBikeInfo(bikeList);
		
		System.out.println(output);
	}
	
	private static void deleteBikeInfo(ArrayList<Bike> bikeList) {
		//ELVIS delete
		
		String bikeP = Helper.readString("Enter Bike info> ");
		for(Bike i : bikeList) {
			if(i.getDescription().equalsIgnoreCase(bikeP)) {
				bikeList.remove(i);
				System.out.println("Bike info has been deleted.");
				
				break;
			}
			else {
				System.out.println("Bike info is not found.");
			}
		}
	}
}
