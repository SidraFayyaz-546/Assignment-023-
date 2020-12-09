
package javaapplication40;


public class JavaApplication40 {
 static public void bubblesort(int[] array){
    
    int length= array.length;
    int temp;
    for(int i=0; i < length; i++)
		{  
			for(int j=1; j < (length-i); j++)
			{  
			      
				if(array[j-1] > array[j])
				{   
				    
				
					temp = array[j-1];  
					array[j-1] = array[j];  
					array[j] = temp;
					printArray(array);
    
    
                                }
      
                        }
                }
}
  static   void printArray(int[] array){
	    
	    for(int i=0; i < array.length; i++)
		{  
			System.out.print(array[i] + " ");  
		} 
	    System.out.println();
	    
	}

    
    public static void main(String[] args) {
        
      int array[] ={12,98,34,11};  
 
		System.out.println("---Array BEFORE Bubble Sort---"); 
		
	    printArray(array);
 
		bubblesort(array); 
 
		System.out.println("---Array AFTER Bubble Sort---");  
		
		printArray(array); 
    }
    

}
     


