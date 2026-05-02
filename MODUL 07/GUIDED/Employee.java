public abstract class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    // three-argument constructor
    public Employee(String first, String last, String ssn) {
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
    } // end three-argument Employee constructor

    // set first name
    public void setFirstName(String first) {
        firstName = first;
    } // end Method setFirstName

    // return first name
    public String getFirstName() {
        return firstName;
    } // end Method getFirstName

    // set last name
    public void setLastName(String last) {
        lastName = last;
    } // end Method setLastName

    // return last name
    public String getLastName() {
        return lastName;
    } // end Method getLastName

    // set social security number
    public void setSocialSecurityNumber(String ssn) {
        socialSecurityNumber = ssn; // should validate
    } // end Method setSocialSecurityNumber

    // return social security number
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    } // end Method getSocialSecurityNumber

    // return String representation of Employee Object
    public String toString() {
        return String.format("%s %s\nsocial security number: %s",
            getFirstName(), getLastName(), getSocialSecurityNumber());
    } // end Method toString

    // abstract Method overridden by subclasses
    public abstract double earnings(); // no implementation here
} // end abstract class Employee