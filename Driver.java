import java.util.*;

public class Driver{

   public static void main(String[] args){
      
      //instance variables
      long startTime = -1, endTime = -1, bubbleTime = -1, heapTime = -1, insertionTime = -1, mergeTime  = -1, quickTime = -1, selectionTime = -1, radixTime = -1;      
      Scanner input = new Scanner(System.in);
      
    
      System.out.println("How many integers do you want to try to sort?");
      int numToSort = input.nextInt();
      
      System.out.println("What range of integers do you want to sort?");
      int rangeToSort = input.nextInt();
      
      int[] arr = new int[numToSort];
      for(int i = 0; i<numToSort;i++){
         arr[i]= (int)(Math.random()*rangeToSort+1);
      }
      
      startTime = System.nanoTime();
      BubbleSort bubblesort = new BubbleSort(arr);
      endTime = System.nanoTime();
      bubbleTime = endTime - startTime;
      System.out.print("BubbleSort: ========== ");
      bubblesort.printArray(arr);
      
      startTime = System.nanoTime();
      HeapSort heapsort = new HeapSort(arr);
      endTime = System.nanoTime();
      heapTime = endTime - startTime;
      System.out.print("HeapSort: ============ ");
      heapsort.printArray(arr);
      
      startTime = System.nanoTime();
      InsertionSort insertionsort = new InsertionSort(arr);
      endTime = System.nanoTime();
      insertionTime = endTime - startTime;
      System.out.print("Insertion Sort: ====== ");
      insertionsort.printArray(arr);
      
      startTime = System.nanoTime();
      MergeSort mergesort = new MergeSort(arr);
      endTime = System.nanoTime();
      mergeTime = endTime - startTime;
      System.out.print("MergeSort: =========== ");
      mergesort.printArray(arr);
      
      startTime = System.nanoTime();
      QuickSort quicksort = new QuickSort(arr);
      endTime = System.nanoTime();
      quickTime = endTime - startTime;
      System.out.print("QuickSort: =========== ");
      quicksort.printArray(arr);
      
      startTime = System.nanoTime();
      SelectionSort selectionsort = new SelectionSort(arr);   
      endTime = System.nanoTime();
      selectionTime = endTime - startTime;
      System.out.print("SelectionSort: ======= ");         
      selectionsort.printArray(arr);
      
      startTime = System.nanoTime();
      RadixSort radixsort = new RadixSort(arr);
      endTime = System.nanoTime();
      radixTime = endTime-startTime;
      System.out.print("RadixSort ============ ");
      selectionsort.printArray(arr);
      
      System.out.println("\nBubble sort:    " + (double)(bubbleTime/1000000.0) + " ms.");
      System.out.println("Heap sort:      " + (double)(heapTime/1000000.0) + " ms.");
      System.out.println("Insertion sort: " + (double)(insertionTime/1000000.0) + " ms.");
      System.out.println("Merge sort:     " + (double)(mergeTime/1000000.0) + " ms.");
      System.out.println("Quick sort:     " + (double)(quickTime/1000000.0) + " ms.");
      System.out.println("Selection sort: " + (double)(selectionTime/1000000.0) + " ms.");
      System.out.println("Radix sort:     " + (double)(radixTime/1000000.0) + " ms.");
/*    
      //playing with formatting
      String format = "%1$17s";
      System.out.printf(format, "Quicksort: ", ((double)(quickTime/1000000.0) + " ms."));
*/
      
      /*need to create an object for each sort that contains a time reported
         
         Something like BubbleSort bubblesort = new BubbleSort(the number of ints entered, range of ints entered)
         
         --> BubbleSort bubblesort = new BubbleSort()
             (start timer)
             bubblesort.sort(int[])
             (end timer)
             (store time)
             
             long startTime = System.currenttimeMillis();
            // Run some code;
            long stopTime = System.currenttimeMillis();
   
            System.out.println("Elapsed time was " + (stopTime - startTime) + " miliseconds.");
         
         Output the times calculated in each sort class
      */
      
   }
  
}
