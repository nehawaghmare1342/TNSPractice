package DayTen;

public class StringComparison {
	public static void main(String[] args) {
		
		////create a string using litrate//pool memory
		String s1 = "TNSIF";
		String s2 ="TNSIF";
		
		//create a string operator//heap memory
		
		String s3 = new String("TNSIF");
		String s4 = new String("TNSIF");
		
		System.out.println("Case 1:"+(s1==s2));
		System.out.println("Case 2:"+(s1==s3));
		System.out.println("Case 3:"+(s2.equals(s1)));
		System.out.println("Case 4:"+(s3.equals(s4)));
		System.out.println("Case 5:"+(s3==s4));                  //match the reference
		System.out.println("Case 6:"+(s3.equals(s4)));           //data match
		
		
		System.out.println(s1.hashCode());                     //hash code-address
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		
		//compareTo s1 = TNSIF compare TNSIF
		
		System.out.println(s1.compareTo("TNSIF"));  //unicode
		
		System.out.println(s1.compareToIgnoreCase("tnsif"));
		System.out.println(s1.compareTo(s1));
	}

}
