package homework;

public class NejednakostranicniTrougao extends GeometrijskaSlika {
	float a, b, c;
	
	public NejednakostranicniTrougao() {
		this(0, 0, 0);
	};
	public NejednakostranicniTrougao(float a) {
		this(a, a, a);
	};
	public NejednakostranicniTrougao(float a, float b, float c) {
		this.a = a;
		this.b = b;
		this.c = c;
	};
	
	@Override
	public void print() {
			System.out.println("Obim trouglastog oblika je " + this.circumference());
			System.out.println("Povrsina trouglastog oblika je " + this.area());
	}

	@Override
	public float circumference() {
		return a+b+c;
	}

	@Override
	public float area() {
		float s = (a+b+c)/2;
		return (float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}

}
