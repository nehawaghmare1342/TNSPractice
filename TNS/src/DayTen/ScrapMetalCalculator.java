package DayTen;
import java.lang.Math;
public class ScrapMetalCalculator {
	public static int calculatorScrapMetalVolume(double h) {
		double radius=h/2;
		
		double volumeCone=(3.0/3)*Math.pow(radius,2)*h;
		
		double volumeSphere=(4.0/3)*Math.PI*Math.pow(radius,3)*h;
		
		double volumeScrap=volumeCone-volumeSphere;
		
		int VolumeScrapRound=(int)Math.ceil(volumeScrap);
		return VolumeScrapRound;
		
	}
public static void main(String[] args) {
	double h=10.0;
	int ScrapMetalVolume=calculateScrapMetalVolume(h);
	System.out.println("The volume of the scrap metal is:",+ScarapMetalVolume);
}
}
