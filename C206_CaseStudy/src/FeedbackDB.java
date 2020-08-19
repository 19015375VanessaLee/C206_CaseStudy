import java.util.ArrayList;

public class FeedbackDB {

	ArrayList<Feedback> feedbackArrayList = new ArrayList<Feedback>();
	
	public void addFeedback(Feedback feedback) {
		if (feedbackArrayList.contains(feedback) == true){
			System.out.println("Feedback already exists!");
		} else {
			feedbackArrayList.add(feedback);
			System.out.println("Feedback added!");
		}		
	}
	
	public void viewAllCustomer() {
		System.out.println(feedbackArrayList);
	}
	
	public void delFeedback(String feedback) {
		if(feedbackArrayList.contains(feedback)==true) {
			feedbackArrayList.remove(feedback);
			System.out.println("Feedback deleted!");
		} else {
			System.out.println("Feedback does not exist!");
		}
	}
	
	public void ShowFeedbackMenu() {
		System.out.println("Add New feedback");
		System.out.println("View All feedback");
		System.out.println("Delete feedback");

	}
	
	public void processOption() {				

	}
	
	public Feedback inputFeedbackDetails() {		
		return null;
	}
	
	public int selectFeedback() {		
		return 0;
	}
	
}
