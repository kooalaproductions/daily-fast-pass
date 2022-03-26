package src;

import java.util.Scanner;

public class GetDestination {
    static void getDestination(){
       Scanner in = new Scanner(System.in);
       
       System.out.println("Enter Destination");

       String s = in.nextLine();
       System.out.println("Destination: " + s);
       CheckDestination.getCheckDestination(s);

    }
}
