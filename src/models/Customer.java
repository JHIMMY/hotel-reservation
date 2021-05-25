package models;

import java.util.regex.Pattern;

public class Customer {
    private String firstName;
    private String lastName;
    private String email;
    //regex
    private final String emailRegex = "^(.+)@(.+).com$";
    private final Pattern pattern = Pattern.compile(emailRegex);

    // constructor, simple email validation required
    public Customer(String firstName, String lastName, String email){
        super();
        if(!pattern.matcher(email).matches()){
            throw new IllegalArgumentException("Error, invalid email");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }


    // methods
    public String toString(){
        return "Customer{ Full name: " + firstName + " "+ lastName + ", Email: " + email;
    }
}
