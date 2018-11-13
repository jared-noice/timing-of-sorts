import java.util.*;

public class Driver{
  

  
   public static void main(String[] args){
      
      //instance variables
      double startTime, endTime, bubbleTime, heapTime, insertionTime, mergeTime, quickTime, selectionTime, radixTime;      
      Scanner input = new Scanner(System.in);
    
      System.out.println("How many integers do you want to try to sort?");
      int numToSort = input.nextInt();
      
      System.out.println("What range of integers do you want to sort?");
      int rangeToSort = input.nextInt();
      
      
      
      int[] arr = new int[numToSort];
      for(int i = 0; i<numToSort;i++){
         arr[i]= (int)(Math.random()*rangeToSort+1);
      }
      
      startTime = System.currentTimeMillis();
      BubbleSort bubblesort = new BubbleSort(arr);
      endTime = System.currentTimeMillis();
      bubbleTime = endTime - startTime;
      System.out.print("BubbleSort: ========== ");
      bubblesort.printArray(arr);
      
      HeapSort heapsort = new HeapSort(arr);
      System.out.print("HeapSort: ============ ");
      heapsort.printArray(arr);
      
      InsertionSort insertionsort = new InsertionSort(arr);
      System.out.print("Insertion Sort: ====== ");
      insertionsort.printArray(arr);
      
      MergeSort mergesort = new MergeSort(arr);
      System.out.print("MergeSort: =========== ");
      mergesort.printArray(arr);
      
      QuickSort quicksort = new QuickSort(arr);
      System.out.print("QuickSort: =========== ");
      quicksort.printArray(arr);
      
      SelectionSort selectionsort = new SelectionSort(arr);   
      System.out.print("SelectionSort: ======= ");         
      selectionsort.printArray(arr);
      
      RadixSort radixsort = new RadixSort(arr);
      System.out.print("RadixSort ============ ");
      selectionsort.printArray(arr);
      
      System.out.println("Bubble sort took " + bubbleTime + " milliseconds to sort!");

      
         
      /*need to create an object for each sort that contains a time reported
         
         Something like BubbleSort bubblesort = new BubbleSort(the number of ints entered, range of ints entered)
         
         --> BubbleSort bubblesort = new BubbleSort()
             (start timer)
             bubblesort.sort(int[])
             (end timer)
             (store time)
             
             long startTime = System.currentTimeMillis();
            // Run some code;
            long stopTime = System.currentTimeMillis();
   
            System.out.println("Elapsed time was " + (stopTime - startTime) + " miliseconds.");
         
         Output the times calculated in each sort class
      */
      
   }
  
}
