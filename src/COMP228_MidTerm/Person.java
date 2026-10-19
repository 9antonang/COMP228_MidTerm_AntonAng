package COMP228_MidTerm;

// Base abstract class for all people
public abstract class Person {

    private final String personId;   
    private String name;             
    private String phoneNumber;      

    private static int personCount = 0;

    // Constructor
    public Person(String personId, String name, String phoneNumber) {
        this.personId = personId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        personCount++; // increase count
    }

    // static counter getter
    public static int getPersonCount() {
        return personCount;
    }

    // show basic info
    public void displayBasicDetails() {
        System.out.println("Person ID: " + personId);
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phoneNumber);
    }

    // abstract method
    public abstract String getRoleDescription();

    // getters and setters
    public String getPersonId() { return personId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    @Override
    public String toString() {
        return "Person{" +
                "personId='" + personId + '\'' +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
