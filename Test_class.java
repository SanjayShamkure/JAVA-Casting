package non_primitive_casting;

public class Test_class {

	
	public static void main(String[] args) {
		 
		
		// 1. Up Casting
		
		SuperClass sp = new SubClass();  // by referring super class we can call only super class members
		
		sp.start();
		sp.stop();
		sp.Refule();

	    // 2. Down casting
	
	    SubClass sb = (SubClass) new SuperClass(); // Down Casting not Allowed in java, it throws 
	                                               // exception "ClassCastException"
	    sb.automatioc();
	    sb.start();
	    sb.stop();
	    sb.Refule();
	
	    SuperClass sp1 = new SuperClass();     
	}
	}
