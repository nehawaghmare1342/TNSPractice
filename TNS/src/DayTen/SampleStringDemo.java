package DayTen;

public class SampleStringDemo {
	public static void main(String[] args) {
		
		char c[]= {'I','N','D','I','A'};
		String s1 = new String();
		System.out.println(s1);
		
		String s2 = new String(s1);
		System.out.println(s2);
		
		String longString = "This is to show"+"how long sentence"+"can be printed";
		System.out.println(longString);
		
	}

}
