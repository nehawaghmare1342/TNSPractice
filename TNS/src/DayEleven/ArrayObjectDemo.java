package DayEleven;

public class ArrayObjectDemo {
	public static void main(String[] args) {
		
		Student[] arr;
		//declare a student for 5 object
		
		arr=new Student[5];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Element at"+i+":"+arr[i].getRollNo()+""+arr[i].getName()+""+arr[i].getClass());
			
			
		}
		
	}

}
