package dayeight;

public class Rectangular extends Square{

	float height;
	float width;
	
	public public Rectangular() {
		

	
	public Rectangular(float width,float height) {
		this.width=width;
		this.height=height;
	}

	@Override
	public void calArea() {
		// TODO Auto-generated method stub
		this.area=side*side;
	}
	
}
