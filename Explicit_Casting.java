package primitive_casting;

public class Explicit_Casting {

//	2.	explicit casting:

//	1.	Converting higher data type info into lower data type info is called explicit casting.
//	2.	Explicit casting is also called "narrowing casting", where memory size goes on decreasing.
//	3.	In explicit casting data loss takes place.
		
            public static void main(String[] args) {
	
	          double a = 2.5;      //(memory size of double is 8 byte)
	    		
	     System.out.println(a);    // 2.5
				 
		      short b = (short) a; // (memory size of short is 2 byte)	
	
         System.out.println(b);   //2
            
              int c = 3678 ;        
            
              byte  d = (byte) c;
            
         System.out.println(d);   //94
         
         
 }
            
	
	
	
	
	
	
	
}
