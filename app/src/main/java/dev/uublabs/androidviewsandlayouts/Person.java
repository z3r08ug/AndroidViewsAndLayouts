package dev.uublabs.androidviewsandlayouts;

/**
 * Created by Admin on 11/8/2017.
 */

public class Person
{
    String firstName;
    String lastName;

    public Person(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" + getFirstName() + " " + getLastName() + "}";
    }
}
