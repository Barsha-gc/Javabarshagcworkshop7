package javaweek7;

public class Patient {
    private int patientID;
    private String name;
    private int age;
    private String gender;
    private String contactDetails;

    // Setters
    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setContactDetails(String contactDetails) {
        this.contactDetails = contactDetails;
    }

    // Getters (optional but useful)
    public int getPatientID() { return patientID; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    public String getContactDetails() { return contactDetails; }

    // Methods
    public void viewPersonalDetails() {
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Contact: " + contactDetails);
    }

    public void bookAppointment() {
        System.out.println(name + " booked an appointment.");
    }
}
