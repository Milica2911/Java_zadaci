package homework;

public class Elipsa extends GeometrijskaSlika {
	float a, b;
	
	public Elipsa() {
		this(0, 0);
	};
	public Elipsa(float a) {
		this(a, a);
	};
	public Elipsa(float a, float b) {
		this.a = a;
		this.b = b;
	};
	
	public void print() {
		System.out.println("Obim elipsoidnog oblika je " + this.circumference());
		System.out.println("Povrsina elipsoidnog oblika je " + this.area());
	}
	// radicu po formuli pi*[3*(a+b)-sqrt[(3a+b)*(a+3b)]] da bi bilo i stranice b
	@Override
	public float circumference() {
		return (float)(Math.PI*(3*(a+b)-Math.sqrt((3*a+b)*(a+3*b))));
	}
	
	@Override
	public float area() {
		return (float)Math.PI*a*b;
	}
	
}
