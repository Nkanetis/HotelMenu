import java.util.Scanner;
public class ShadyRestRoom
{
   public static void main (String args[])
   {
      int selection;
      int price;
      String result;
      //initializing variables
      final int QUEEN = 1, KING = 2, SUITE = 3;
      final int QPRICE = 125, KPRICE = 139,
         SPRICE = 165;
      final String QSTRING = "Queen bed", KSTRING = "King bed",
         SSTRING = "Suite with a king bed and pull-out couch",
         INVALIDSTRING = "an invalid option";
      // initializing constants
      Scanner in = new Scanner(System.in);
      System.out.println("\t\n\nMenu\n");
      System.out.println("(" + QUEEN + ") " + QSTRING);
      System.out.println("(" + KING + ") " + KSTRING);
      System.out.println("(" + SUITE + ") " + SSTRING);
      System.out.print("Enter Selection (1, 2, or 3) >> ");
      selection = in.nextInt();
      //setting up main menu with choices and an input
      if(selection == QUEEN) //if users selects 1 for queen display string and price
      {
         result = QSTRING;
         price = QPRICE;
      }
      else
         if(selection == KING) //if users selects 2 for king display string and price
         {
            result = KSTRING;
            price = KPRICE;
         }
         else
            if (selection == SUITE) //if users selects 3 for suite display string and price
            {
                result = SSTRING;
                price = SPRICE;
            }
            else
            {
                result = INVALIDSTRING; // display an error message because no valid choices were selected
                price = 0;
             }
      System.out.println("You selected " + result + "  $" + price); //result
   }
}