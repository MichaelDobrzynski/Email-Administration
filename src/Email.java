import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private String alternateEmail;
    private int defaultPasswordLength;
    private String companySuffix = "nintendo.com";

    //set the default mailbox capacity
    private int mailboxCapacity = 1000;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("User created: " + this.firstName + " " + this.lastName);

        //call a method asking for the department - return the department
        this.department = setDepartment();
        System.out.println("Department assigned: " + this.department);

        //generate random password
        defaultPasswordLength = 16;
        this.password = setDefaultPassword(defaultPasswordLength);
        System.out.println("Default password: " + this.password);

        //combine elements to generate email address
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        System.out.println("Email for user " + firstName + " " + lastName + " " +  "is: " + email + "\n");

    }

    //Setters

    //ask for the department
    public String setDepartment() {
        System.out.println("DEPARTMENT CODES: \n 1. Sales \n 2. Technology \n 3. Accounting \n 4. Other \n Enter department code:   ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();

        if(depChoice == 1) {
            return "sales";
        }
        else if (depChoice == 2) {
            return "technology";
        }
        else if (depChoice == 3) {
            return "accounting";
        }
        else {
            return "other";
        }
    }

    public String setDefaultPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*()";
        char[] password = new char[length];
        for(int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    //set new mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    //set the alternate email
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    //change the password
    public void setNewPassword(String password) {
        this.password = password;
    }

    //Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    //method to display information regarding a particular user
    public String showInfo() {
        return "Name: " + firstName + " " + lastName + "\n" +
                "Department: " + department + "\n" +
                "Company email: " + email + "\n" +
                "Mailbox capacity: " + mailboxCapacity + " mb";
    }
}
