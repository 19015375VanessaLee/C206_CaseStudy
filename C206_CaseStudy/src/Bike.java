//ELVIS bike class done
public class Bike {
	private String model;
	private String description;
	private boolean isAvailable;
	
	public Bike(String bikeModel, String bikeDesc, Boolean isAvail) {
		this.model = bikeModel;
		this.description = bikeDesc;
		this.isAvailable = isAvail;
	}

	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setIsAvailable (boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	public boolean getIsAvailable() {
		return isAvailable;
	}
	
//	public String toString() {
//		return model;
//	}
}

