import java.util.*;

public class Driver{

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

      System.out.println("How many integers do you want to try to sort?");
      String ans = input.nextLine();
      while(!isInt(ans) || Integer.parseInt(ans) < 1){
         System.out.println("The number entered must be greater than 0 and be a valid integer. Please try again.");
         ans = input.nextLine();
      }
      int numToSort = Integer.parseInt(ans);      
      System.out.println();

      System.out.println("What range of integers do you want to sort?");
      ans = input.nextLine();
      while(!isInt(ans) || Integer.parseInt(ans) < 1){
         System.out.println("The number entered must be greater than 0 and be a valid integer. Please try again.");
         ans = input.nextLine();
      }
      int rangeToSort = Integer.parseInt(ans);
      System.out.println();

      if(!sortChosen.equals("all")){
         System.out.println("And how many data points would you like?\nThis does not apply for 'all' (just pick any random number)");
         ans = input.nextLine();
         while(!isInt(ans) || Integer.parseInt(ans) < 1){
            System.out.println("The number entered must be greater than 0 and be a valid integer. Please try again.");
            ans = input.nextLine();
         }
         dataPointCount = Integer.parseInt(ans);
         System.out.println();
      }            

      if(sortChosen.equals("all")){
         int[] arr = new int[numToSort];

         for(int i = 0; i<numToSort;i++){
            arr[i]= (int)(Math.random()*rangeToSort+1);
         }

         int[] arr1 = arr.clone();     //makes new arrays that are a copy of the base array to maintain accuracy
         int[] arr2 = arr.clone();
         int[] arr3 = arr.clone();
         int[] arr4 = arr.clone();
         int[] arr5 = arr.clone();
         int[] arr6 = arr.clone();
         int[] arr7 = arr.clone();

         System.out.println("arr copies completed.");
         System.out.println();

         startTime = System.nanoTime();
         //BubbleSort bubblesort = new BubbleSort(arr1);
         endTime = System.nanoTime();
         bubbleTime = endTime - startTime;
         System.out.println("Bubble sort completed.");
      //System.out.print("BubbleSort: ========== ");
      //bubblesort.printArray(arr);

         startTime = System.nanoTime();
         HeapSort heapsort = new HeapSort(arr2);
         endTime = System.nanoTime();
         heapTime = endTime - startTime;
         System.out.println("Heap Sort completed.");
      //System.out.print("HeapSort: ============ ");
      //heapsort.printArray(arr);

         startTime = System.nanoTime();
         InsertionSort insertionsort = new InsertionSort(arr3);
         endTime = System.nanoTime();
         insertionTime = endTime - startTime;
         System.out.println("Insertion Sort completed.");
      //System.out.print("Insertion Sort: ====== ");
      //insertionsort.printArray(arr);

         startTime = System.nanoTime();
         MergeSort mergesort = new MergeSort(arr4);
         endTime = System.nanoTime();
         mergeTime = endTime - startTime;
         System.out.println("Merge Sort completed.");
      //System.out.print("MergeSort: =========== ");
      //mergesort.printArray(arr);

         startTime = System.nanoTime();
         QuickSort quicksort = new QuickSort(arr5);
         endTime = System.nanoTime();
         quickTime = endTime - startTime;
         System.out.println("Quick Sort completed.");
      //System.out.print("QuickSort: =========== ");
      //quicksort.printArray(arr);

         startTime = System.nanoTime();
         SelectionSort selectionsort = new SelectionSort(arr6);
         endTime = System.nanoTime();
         selectionTime = endTime - startTime;
         System.out.println("Selection Sort completed.");
      //System.out.print("SelectionSort: ======= ");
      //selectionsort.printArray(arr);

         startTime = System.nanoTime();
         RadixSort radixsort = new RadixSort(arr7);
         endTime = System.nanoTime();
         radixTime = endTime-startTime;
         System.out.println("Radix Sort completed.");
      //System.out.print("RadixSort ============ ");
      //radixsort.printArray(arr);

      //for(int i = 0; i < dataPointCount; i++){
      //   bubblesort.sort();
      //}

         System.out.println("\nBubble sort:    " + (double)(bubbleTime/1000000.0) + " ms.");
         System.out.println("Heap sort:      " + (double)(heapTime/1000000.0) + " ms.");
         System.out.println("Insertion sort: " + (double)(insertionTime/1000000.0) + " ms.");
         System.out.println("Merge sort:     " + (double)(mergeTime/1000000.0) + " ms.");
         System.out.println("Quick sort:     " + (double)(quickTime/1000000.0) + " ms.");
         System.out.println("Selection sort: " + (double)(selectionTime/1000000.0) + " ms.");
         System.out.println("Radix sort:     " + (double)(radixTime/1000000.0) + " ms.");
      }

      else if(sortChosen.equals("bubble")){     //these are all the same for each sort, just commenting precisely here
         int[] arr = new int[numToSort];           //the array to be sorted
         long[] times = new long[dataPointCount];     //the array to store the times

         for(int i = 0; i<numToSort;i++){       //this for loop is to randomize the values of the array based on inputted values
            arr[i]= (int)(Math.random()*rangeToSort+1);     //sets the element at [i] to a randomized value from 1 to rangeToSort
         }

         for(int i = 0; i < dataPointCount; i++){     //this is the amount of times the array is sorted
            int[] arr1 = arr.clone();     //makes new array that is a copy of the base array to maintain accuracy (basically use same array to sort
            startTime = System.nanoTime();      //begins the timer
            BubbleSort bubblesort = new BubbleSort(arr1);      //in creating this object, it inherently sorts the given array
            endTime = System.nanoTime();     //ends the timer
            bubbleTime = endTime - startTime;      //calculates the time and stores it into bubbleTime
            times[i] = bubbleTime;     //stores the time for that trial into the times array
            System.out.println((double)(times[i]/1000000.0));      //prints the time and puts it at the required decimal location
         }
         System.out.println("****In milliseconds****");
      }

      else if(sortChosen.equals("heap")){
         int[] arr = new int[numToSort];
         long[] times = new long[dataPointCount];

         for(int i = 0; i<numToSort;i++){
            arr[i]= (int)(Math.random()*rangeToSort+1);
         }

         for(int i = 0; i < dataPointCount; i++){
            int[] arr1 = arr.clone();     //makes new array that is a copy of the base array to maintain accuracy
            startTime = System.nanoTime();
            HeapSort heapsort = new HeapSort(arr1);
            endTime = System.nanoTime();
            heapTime = endTime - startTime;
            times[i] = heapTime;
            System.out.println((double)(times[i]/1000000.0));
         }
         System.out.println("****In milliseconds****");
      }

      else if(sortChosen.equals("insertion")){
         int[] arr = new int[numToSort];
         long[] times = new long[dataPointCount];

         for(int i = 0; i<numToSort;i++){
            arr[i]= (int)(Math.random()*rangeToSort+1);
         }

         for(int i = 0; i < dataPointCount; i++){
            int[] arr1 = arr.clone();     //makes new array that is a copy of the base array to maintain accuracy
            startTime = System.nanoTime();
            InsertionSort insertionsort = new InsertionSort(arr1);
            endTime = System.nanoTime();
            insertionTime = endTime - startTime;
            times[i] = insertionTime;
            System.out.println((double)(times[i]/1000000.0));
         }
         System.out.println("****In milliseconds****");
      }

      else if(sortChosen.equals("merge")){
         int[] arr = new int[numToSort];
         long[] times = new long[dataPointCount];

         for(int i = 0; i<numToSort;i++){
            arr[i]= (int)(Math.random()*rangeToSort+1);
         }

         for(int i = 0; i < dataPointCount; i++){
            int[] arr1 = arr.clone();     //makes new array that is a copy of the base array to maintain accuracy
            startTime = System.nanoTime();
            MergeSort mergesort = new MergeSort(arr1);
            endTime = System.nanoTime();
            mergeTime = endTime - startTime;
            times[i] = mergeTime;
            System.out.println((double)(times[i]/1000000.0));
         }
         System.out.println("****In milliseconds****");
      }

      else if(sortChosen.equals("quick")){
         int[] arr = new int[numToSort];
         long[] times = new long[dataPointCount];

         for(int i = 0; i<numToSort;i++){
            arr[i]= (int)(Math.random()*rangeToSort+1);
         }

         for(int i = 0; i < dataPointCount; i++){
            int[] arr1 = arr.clone();     //makes new array that is a copy of the base array to maintain accuracy
            startTime = System.nanoTime();
            QuickSort quicksort = new QuickSort(arr1);
            endTime = System.nanoTime();
            quickTime = endTime - startTime;
            times[i] = quickTime;
            System.out.println((double)(times[i]/1000000.0));
         }
         System.out.println("****In milliseconds****");
      }

      else if(sortChosen.equals("selection")){
         int[] arr = new int[numToSort];
         long[] times = new long[dataPointCount];

         for(int i = 0; i<numToSort;i++){
            arr[i]= (int)(Math.random()*rangeToSort+1);
         }

         for(int i = 0; i < dataPointCount; i++){
            int[] arr1 = arr.clone();     //makes new array that is a copy of the base array to maintain accuracy
            startTime = System.nanoTime();
            SelectionSort selectionsort = new SelectionSort(arr1);
            endTime = System.nanoTime();
            selectionTime = endTime - startTime;
            times[i] = selectionTime;
            System.out.println((double)(times[i]/1000000.0));
         }
         System.out.println("****In milliseconds****");
      }

      else if(sortChosen.equals("radix")){
         int[] arr = new int[numToSort];
         long[] times = new long[dataPointCount];

         for(int i = 0; i<numToSort;i++){
            arr[i]= (int)(Math.random()*rangeToSort+1);
         }

         for(int i = 0; i < dataPointCount; i++){
            int[] arr1 = arr.clone();     //makes new array that is a copy of the base array to maintain accuracy
            startTime = System.nanoTime();
            RadixSort radixsort = new RadixSort(arr1);
            endTime = System.nanoTime();
            radixTime = endTime - startTime;
            times[i] = radixTime;
            System.out.println((double)(times[i]/1000000.0));
         }
         System.out.println("****In milliseconds****");
      }
      
      else if(sortChosen.equals("default")){
         int[] arr = new int[numToSort];
         long[] times = new long[dataPointCount];

         for(int i = 0; i<numToSort;i++){
            arr[i]= (int)(Math.random()*rangeToSort+1);
         }

         for(int i = 0; i < dataPointCount; i++){
            int[] arr1 = arr.clone();     //makes new array that is a copy of the base array to maintain accuracy
            startTime = System.nanoTime();
            Arrays.sort(arr1);
            endTime = System.nanoTime();
            radixTime = endTime - startTime;
            times[i] = radixTime;
            System.out.println((double)(times[i]/1000000.0));
         }
         System.out.println("****In milliseconds****");
      }
      
      

   /*
      A good idea for making a faster sort would to move (in particular, a merge sort) into multiple "cores" on a PC.
      By cores, it is not literally the cores of a PC, but something that likens itself to multiple threads.
      This would make the merge sort infinitely faster and result in a faster sort in the end.

   */

   /*
      //playing with formatting
      String format = "%1$17s";
      System.out.printf(format, "Quicksort: ", ((double)(quickTime/1000000.0) + " ms."));
   */

   }

}