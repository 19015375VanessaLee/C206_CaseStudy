import java.util.*;

public class AppointmentDB extends Appointment{
	
	ArrayList<Appointment> appointmentArrayList = new ArrayList<Appointment>();
	
	public void addAppointment(Appointment appointment) {
		if (appointmentArrayList.contains(appointment) == true){
			System.out.println("Appointment already exists!");
		} else {
			appointmentArrayList.add(appointment);
			System.out.println("Appointment added!");
		}
		
	}
	
	public void delAppointment(Appointment appointment) {
		if (appointmentArrayList.contains(appointment) == true){
			appointmentArrayList.remove(appointment);
			System.out.println("Appointment already exists!");
		} else {
			System.out.println("Appointment deleted!");
		}
	}
	
	public void viewAllAppointment() {
		System.out.println(appointmentArrayList);
	}
	
	public void showAppointmentMenu() {
		System.out.println("1. Add Appointment");
		System.out.println("2. Delete Appointment");
		System.out.println("3. View all Appointments");
				
		
	}
	
	public void processOption() {
		
		
	}
	
	public Appointment inputAppointmentDetails() {
		
		return null;
	}
	
	public int selectAppointment() {
		
		return 0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
