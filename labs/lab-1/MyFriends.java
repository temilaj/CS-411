/**
 * Class that represents a starting point of the social network app
 * @author CS411
 */

public class MyFriends {
  public static void main(String args[]) {

    SocialNetwork contacts = new SocialNetwork();

    contacts.add("Snoopy","Dog","snoopy@bu.edu");
    contacts.add("Felix","Cat","felix@bu.edu");
    contacts.add("Mickey","Mouse","mickey@bu.edu");

    System.out.println(contacts.toString());
    System.out.println("I have " + contacts.getNumFriends() + " friends in my list.");
  }
}