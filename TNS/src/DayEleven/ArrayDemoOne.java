package DayEleven;

class ArrayOperations
{
	static void printArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+"\t");
			System.out.println();
		}
	}
	public static int getSum(int...n)
	{
		int sum=0;
		for(int no:n)
			sum+=no;
		return sum;
	}
	
	//count no of aodd element
	
	public static int getOddCount(int b[])
	{
		int count=0;
		for(int i=0;i<b.length;i++)
		{
			if(b[i] % 2 !=0)
				count++;
		}
		return count;
	}
	//count no of even element
	public static int getEvenCount(int b[])
	{
		return b.length-getEvenCount(b);
	}
}
public class ArrayDemoOne {
public static void main(String[] args) {
	
	int n=10;
	int a[];     //declaration
	a=new int [n];//inatiation
	
	ArrayOperations.printArray(a);
	
	//assignning the value of array a
	for(int i=0;i<a.length;i++)
		a[i]=5*i;
	ArrayOperations.printArray(a);
	
	int b[]= {10,20,30,40,50};
	ArrayOperations.printArray(b);
	
	//calling of variable argument function
	System.out.println("Sume of array element is:"+ArrayOperations.getSum(b));
	System.out.println("Sume of array element is:"+ArrayOperations.getSum(10,20,30,40,50));
	
	b[2]=999;
	
	ArrayOperations.printArray(b);
	
}
}
