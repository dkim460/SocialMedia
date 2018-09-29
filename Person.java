/**
* This class represents a Person object
* @author David Kim
* @version 13.31
*/
public class Person {
    private String firstName;
    private String lastName;

    /**
    * This method takes in two Strings and instantiates them
    * it does not return anything
    * @param firstName the first name of the person
    * @param lastName the last name of the person
    */
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
    * This method does not take in any parameters and returns the first
    * name of the person
    * @return firstName which is the first name of the person
    */
    public String getFirstName() {
        return firstName;
    }

    /**
    * This method does not take in any parameters and returns the last
    * name of the person
    * @return lastName which is the last name of the person
    */
    public String getLastName() {
        return lastName;
    }

    /**
    * This method takes in no parameters and returns a string consisting of
    * both the first an last name togeter with a space in between
    * @return name which is the name of the person
    */
    public String toString() {
        String name = firstName + " " + lastName;
        return name;
    }
}