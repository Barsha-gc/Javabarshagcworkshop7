package javaweek7;

public class Appointment {

    private int appointmentID;
    private String appointmentDate;
    private String appointmentTime;

    public void rescheduleAppointment() {
        System.out.println("Appointment rescheduled");
    }

    public void cancelAppointment() {
        System.out.println("Appointment cancelled");
    }

    public void viewAppointmentDetails() {
        System.out.println("Appointment details shown");
    }

	public int getAppointmentID() {
		return appointmentID;
	}

	public void setAppointmentID(int appointmentID) {
		this.appointmentID = appointmentID;
	}

	public String getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getAppointmentTime() {
		return appointmentTime;
	}

	public void setAppointmentTime(String appointmentTime) {
		this.appointmentTime = appointmentTime;
	}
}
