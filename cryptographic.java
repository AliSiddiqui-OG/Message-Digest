import java.security.MessageDigest;
import java.util.*;

public class cryptographic {

    public static void main (String[] args)
   throws Exception /* this needed for no errors */ {
        Scanner object = new Scanner(System.in);

        System.out.println("hello, enter a message");
        String message = object.nextLine();  // the message that is gonna be use for the fookery

        MessageDigest md = MessageDigest.getInstance("SHA-256"); // computer mentally prepares for fookery

        md.update(message.getBytes()); // middle man that get pass with the message; aka the wide receiver

        byte[] digest = md.digest(); //the computer is gonna do the hard part and do the actual fookery
        System.out.println(digest); //showing the results of the digest

        StringBuffer hexString = new StringBuffer(); //  this how they gonna format the message

        for (int i = 0; i<digest.length; i++)
        {
            hexString.append(Integer.toHexString(0xFF & digest [i]));  //the fookery begins
        }
        System.out.println(" Hex Format : " + hexString.toString()); //the fookey has been shown


    }




}
