package dayeight;

public abstract class Shape {

	protected float area;
	
	//abstract method
	
	public abstract void calArea();
	
	//solid method
	
	public void show()
	{
		System.out.println("area of the shape is"+area);
	}
}
