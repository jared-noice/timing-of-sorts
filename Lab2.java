import java.util.*;

public class Lab2 {

   private static boolean isInteger(String ans)
   {
      int placeHolder;
      try
      {
         placeHolder = Integer.parseInt(ans);
      }
      catch(Exception e)
      {
         System.out.println("Entered query is not an int. \nEnter an int.");
         return false;
      }
      return true;
   }


   public static void main(String[]args) {
   
      boolean run = true;
      String ans, check;
   
      Scanner input = new Scanner(System.in);      
      
      while(run)
      {                        
      
         System.out.println("Pick a positive number: \nType -1 to exit.");
         
         check = input.nextLine();
         //input.nextLine();
         
         while(!isInteger(check)){            
            check = input.nextLine();
            //input.nextLine();
         }
            
         
         int x = Integer.parseInt(check);
         //input.nextLine();
      
         if(x == -1){      //if input doesn't equal -1
            System.out.println("Goodbye.");
            break;
         }
         
         while(x < 0) {    //while x < 0 (for error checking)
            
            System.out.println("Enter a positive number.");
            
            x = input.nextInt();
            input.nextLine();
            
         }
         
         int y = 0;
         
         for(int i = 1; i <= x;i++) {     //loop repeats x times
            
            y = y+i;    //value y equals the value of y plus i
            
            System.out.print(i);
            
            if(i != x){
               System.out.print(" + ");
            }                      
         }
         
         System.out.print(" = " + y);
         
         
         
         System.out.println("\n\nWould you like to enter another number? Y or N.");
         ans = input.nextLine();
         //input.nextLine();
         
         if(ans.equalsIgnoreCase("N"))
         {
            System.out.println("Goodbye.");
            run = false;;
         }
      }
   }
}
      
      


