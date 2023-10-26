package String;

public class EqulesAndEquleToOpreter {

	String st1 = new String("ABC");
	String st2 = "ABC";
	String st3 = "ABC";
	String st4 = new String("ABC");
	
	
	
	System.out.println(st1==st2);
	System.out.println(st1.equals(st2));
	
	System.out.println(st2==st3);
	System.out.println(st2.equals(st3));
	
	System.out.println(st1==st4);
	System.out.println(st1.equals(st4));
	
	System.out.println(st4==st3);
	System.out.println(st4.equals(st3));
	
	//System.out.println(a.hashCode());
}
