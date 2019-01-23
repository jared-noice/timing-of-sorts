import java.util.*;

public class Driver2{

   static int[] copyOf(int[] a){
      return a.clone();
   }

   static boolean isInt(String str){
      try{
         Integer.parseInt(str);
      }
      catch(Exception wow){
         return false;
      }
      return true;
   }

   public static void main(String[] args){
   
      //instance variables
      long startTime = -1, endTime = -1, bubbleTime = -1, heapTime = -1, insertionTime = -1, mergeTime  = -1, quickTime = -1, selectionTime = -1, radixTime = -1;
      Scanner input = new Scanner(System.in);
      int dataPointCount = 0;
   
      System.out.println("What sort to use? Type 'all' for all sorts.\n'bubble', 'heap', 'insertion', 'merge', 'quick', 'selection', 'radix', 'default'");
      String sortChosen = input.nextLine();
   
      while(!sortChosen.equals("default") && !sortChosen.equals("all") && !sortChosen.equals("bubble") && !sortChosen.equals("heap") && !sortChosen.equals("insertion") && !sortChosen.equals("merge") && !sortChosen.equals("quick") && !sortChosen.equals("selection") && !sortChosen.equals("radix")){
         System.out.println("That is not a valid entry. Please try again.");
         sortChosen = input.nextLine();
      }                 
   
      System.out.println("How many integers do you want to try to sort?\nType all to run all variants.");
      String ans = input.nextLine();
      while((!isInt(ans) || Integer.parseInt(ans) < 1) && !ans.equalsIgnoreCase("all")){
         System.out.println("The number entered must be greater than 0 and be a valid integer. Please try again.");
         ans = input.nextLine();
      }
      if(!ans.equalsIgnoreCase("all")){
         int numToSort = Integer.parseInt(ans);  
         int rangeToSort = numToSort;    
      }
      System.out.println();
               
      System.out.println("And how many data points would you like?\nThis does not apply for 'all' (just pick any random number)");
      ans = input.nextLine();
      while(!isInt(ans) || Integer.parseInt(ans) < 1){
         System.out.println("The number entered must be greater than 0 and be a valid integer. Please try again.");
         ans = input.nextLine();
      }
      dataPointCount = Integer.parseInt(ans);
      System.out.println();
      
      if(sortChosen == "all"){
         
         int[] descending0 = new int[1000];
         int[] descending1 = new int[5000];
         int[] descending2 = new int[10000];
         int[] descending3 = new int[50000];
         int[] descending4 = new int[100000];
         int[] descending5 = new int[500000];
         
         
         
         
         
      }
      
      
      
      
      
       
   }         
}

