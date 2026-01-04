package javaweek7;

public class Doctor {
    private int doctorID;
    private String name;
    private String department;  // Single department

    // Setters
    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Getters
    public int getDoctorID() { return doctorID; }
    public String getName() { return name; }
    public String getDepartment() { return department; }

    // Methods
    public void seePatientDetails() {
        System.out.println(name + " is seeing patient details.");
    }

    public void prescribeTreatment() {
        System.out.println(name + " prescribed treatment.");
    }
}
