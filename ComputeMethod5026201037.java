import java.util.*;

public class ComputeMethod5026201037{
	public double fToC(double degreesF) {
		return 5.0/9*(degreesF-32);
	}
	public double hypotenuse(int a, int b) {
		return (Math.sqrt((a*a)+(b*b)));
	}
	public int roll() {
		Random bebas = new Random();
			return((bebas.nextInt(6)+1) + (bebas.nextInt(6)+1));
	}
}