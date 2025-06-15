package primitive_casting;

public class Implicit_Casting {

//	1.	implicit casting:

//      Converting lower data type info into higher data type info is called implicit casting.
			
//		implicit casting is also called "widening casting", where memory size goes on increasing
		
         public static void main(String[] args) {
	
               int a=5;	     // (memory size of int is 4 byte) 		
		  
	      System.out.println(a);  // 5
	        
	          double b = a;	// (memory size of double is 8 byte) 	

	      System.out.println(b);  //5.0
	
               short c = 350;  
               
               float d = c;
               
           System.out.println(d);    
         
}	
}
