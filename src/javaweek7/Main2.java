package javaweek7;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("===== Hospital & Shopping System Test =====");

        // ----- CUSTOMER -----
        Customer customer = new Customer();
        customer.setName("Barsha");
        customer.setEmail("barsha@example.com");
        customer.register();
        customer.login();
        customer.viewProducts();
        customer.addToCart();
        customer.checkout();

        System.out.println();

        // ----- PRODUCT -----
        Product product = new Product();
        product.setProductId(101);
        product.getDetails();
        System.out.println("Available? " + product.checkAvailability());

        System.out.println();

        // ----- SHOPPING CART -----
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(product, 2);
        cart.viewCartItems();
        cart.calculateTotalPrice();

        System.out.println();

        // ----- PATIENT -----
        Patient patient = new Patient();
        patient.setPatientID(1);
        patient.setName("John Doe");
        patient.setAge(30);
        patient.setGender("Male");
        patient.setContactDetails("9876543210");
        patient.viewPersonalDetails();
        patient.bookAppointment();

        System.out.println();

        // ----- DOCTOR -----
        Doctor doctor = new Doctor();
        doctor.setDoctorID(100);
        doctor.setName("Dr. Smith");
        doctor.setDepartment("Cardiology");
        doctor.seePatientDetails();
        doctor.prescribeTreatment();

        System.out.println();

        // ----- APPOINTMENT -----
        Appointment appointment = new Appointment();
        appointment.setAppointmentID(5001);
        appointment.setAppointmentDate("2026-01-10");
        appointment.setAppointmentTime("10:00 AM");
        appointment.viewAppointmentDetails();
        appointment.rescheduleAppointment();
        appointment.cancelAppointment();

        System.out.println();

        // ----- TREATMENT -----
        Treatment treatment = new Treatment();
        treatment.setTreatmentID(200);
        treatment.setType("Regular Checkup");
        treatment.setDescription("Checkup for blood pressure");
        treatment.viewTreatmentDetails();
        treatment.updateDescription();

        System.out.println("===== Test Completed =====");
    }
}
