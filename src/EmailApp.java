public class EmailApp {

    public static void main(String[] args) {

        //create and show info for each new user based on first and last name
        Email em1 = new Email("Mario", "Peach");
        System.out.println(em1.showInfo() + "\n");

        Email em2 = new Email("Luigi", "Daisy");
        System.out.println(em2.showInfo() + "\n");

        Email em3 = new Email("Donkey", "Kong");
        System.out.println(em3.showInfo() + "\n");

        //using set methods to customize user profiles
        em1.setAlternateEmail("itsamemario@imaplumber.com");
        System.out.println("Alternate email for user " + em1.getFirstName() + " " + em1.getLastName() + " set to: " + em1.getAlternateEmail() + "\n");

        em2.setMailboxCapacity(5000);
        System.out.println("Mailbox capacity for user " + em2.getFirstName() + " " + em2.getLastName() + " set to: " + em2.getMailboxCapacity() + " mb" + "\n");

        em3.setNewPassword("ILoveBananas1985");
        System.out.println("Password for user " + em3.getFirstName() + " " + em3.getLastName() + " set to: " + em3.getPassword() + "\n");
    }
}
