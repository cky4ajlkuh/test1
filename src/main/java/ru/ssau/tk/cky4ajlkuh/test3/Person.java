package ru.ssau.tk.cky4ajlkuh.test3;

public class Person {
    private String firstName;
    private String lastname;
    private int passportId;

    public Person() {

    }

    public Person(String firstName, String lastname) {
        this.firstName = firstName;
        this.lastname = lastname;
    }

    public Person(int passportId) {
        this.passportId = passportId;
    }

    public Person(String firstName, String lastname, int passportId) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.passportId = passportId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public int getPassportId() {
        return passportId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPassportId(int passportId) {
        this.passportId = passportId;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
