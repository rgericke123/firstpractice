public class reversed {
	
	  public static void main (String[]args) {
		//Initialize array  
	        String [] arr = new String [] {"1", "2", "3", "4","5" };  
	        System.out.println("Original array: ");  
	        for (int i = 0; i < 5; i++) {  
	            System.out.print(arr[i] + " ");
	        }  
	        System.out.println(); 
	        System.out.println("Array in reverse order: ");  
	        //Loop through the array in reverse order  
	        for (int i = arr.length-1; i >= 0; i--) {  
	            System.out.print(arr[i] + " ");  
	        }  
	    }  
	} 