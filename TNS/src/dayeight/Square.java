package dayeight;

public class Square extends Shape{

	float side;
	//constructor 
	
	public Square() {
		side = 2.0f;
	}
	
	public Square(float side) {
		this.side=side;
	}

	@Override
	public void calArea() {
		// TODO Auto-generated method stub
		this.area=side*side;
	}
}
