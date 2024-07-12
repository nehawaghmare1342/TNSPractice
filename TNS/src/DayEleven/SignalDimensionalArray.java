package DayEleven;

import java.util.Arrays;

public class SignalDimensionalArray {
	public static void main(String[] args) {
		
	
	//get the array
	
	int intArr[]= {69,20,12,40,35};
	
	System.out.println(Arrays.toString(intArr));
	for(int i=0;i<intArr.length;i++)
	{
		System.out.println(intArr[i]+" ");
		
	}
	System.out.println();
	
	
	//Sort
	
	Arrays.sort(intArr);
	System.out.println(Arrays.toString(intArr));
	

	//Binary Search 
	
	System.out.println(Arrays.binarySearch(intArr, 15));
	
	System.out.println(Arrays.binarySearch(intArr,2,4,35));
	
	//Comparison
	System.out.println(Arrays.toString(intArr));
	
	//get the second array
	int intArr1[]= {69,20,12,40,35};
	System.out.println(Arrays.toString(intArr1));
	
	if(Arrays.compare(intArr, intArr)==0)
	{
		System.out.println("both the arrays are same");
	}
	else {
		{
			System.out.println("both the arrays are not same");
		}
	}
	
	//copy array
	
	int intArr2[]=Arrays.copyOf(intArr, 2);
	System.out.println(Arrays.toString(intArr2));
	
	
	int intArr3[]=Arrays.copyOfRange(intArr, 1,4);
	System.out.println(Arrays.toString(intArr3));
	//Full method
	
	Arrays.fill(intArr2, 7);
	System.out.println(Arrays.toString(intArr2));
	
}
	}
