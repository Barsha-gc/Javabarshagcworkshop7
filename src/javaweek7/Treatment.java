package javaweek7;

public class Treatment {

    private int treatmentID;
    private String type;
    private String description;

    public void updateDescription() {
        System.out.println("Description updated");
    }

    public void viewTreatmentDetails() {
        System.out.println("Treatment details shown");
    }

	public int getTreatmentID() {
		return treatmentID;
	}

	public void setTreatmentID(int treatmentID) {
		this.treatmentID = treatmentID;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
