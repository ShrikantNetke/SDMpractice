
public class Main {
         static int [] arr;
         static int topIndex=-1;
        
         public static void main (String [] args) {
          
        	 
        	 arr =new int [5];
        	   // push(20);
        	    //push(39);
        	    //push(45);
        	    push(60);
        	    pop();
        	    pop();
        	    push(75);
        	    pop();
             	
        	    print();
        	 

}

		private static void print() {
			
			if(topIndex == -1)
				System.out.println("Stack is Empty");
			else
			{
		       for(int i=0; i<=topIndex; i++)
				System.out.print(arr[i] + ", ");
			}
		}

		private static int pop() {
			
			if(topIndex != -1)
			{
			    int value = arr[topIndex];
			    topIndex--;
			   return value;
			}
			else
				System.out.println("Underflow...");
			return 0;
		}

		private static void push(int value) {
		   
			//overflow condition
			if(topIndex < arr.length-1)
		    {
			    topIndex++;
			    arr[topIndex] = value;
		    }
		    else
		    	System.out.println("Overflow...");
		}
}		
