public class BubbleSorttest {
   private int swaps = 0;
   private int comp = 0;
   private long endTime ;
   public void bubbleSort(int[] arr) {
    //int bSwaps = 0;
    //int comp = 0;
    //long endTime;
      StopWatch clock = new StopWatch();
      clock.start();
      int n = arr.length;
   

      int temp = 0;
      for (int i = 0; i < n-1; i++)  // Looping through the array length
      {
       
         for (int j = 0; j < n-i-1; j++)
         {
            comp++;
            
         
            if (arr[j] > arr[j+1]) 
            {
               // swap elements
               temp = arr[j]; 
               arr[j] = arr[j+1]; 
               arr[j+1] = temp; 
               
               swaps+=1;
              
             
            }
         
         }
      }
      clock.stop();
      endTime =clock.getElapsedTime();
     
   
      System.out.println("\n"+"Timer"+":"+clock.getElapsedTime());
     
   
   	 
   }

   
   public int getBubbleSwaps(){
      return swaps;
   } 
   public int getBubbleComp(){
      return comp;
   } 
   public long getTime(){
      return endTime;
   } 

	 
}