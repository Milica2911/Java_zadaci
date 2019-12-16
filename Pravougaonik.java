package homework;

public class Pravougaonik extends GeometrijskaSlika {
	float a, b;
		
		public Pravougaonik() {
			this(0, 0);
		};
		public Pravougaonik(float a) {
			this(a, a);
		};
		public Pravougaonik(float a, float b) {
			this.a = a;
			this.b = b;
	};
	
	public void print() {
		System.out.println("Obim pravougaonog oblika je " + this.circumference());
		System.out.println("Povrsina pravougaonog oblika je " + this.area());
	}

	@Override
	public float circumference() {
		return 2*(a+b);
	}

	@Override
	public float area() {
		return a*b;
	}
	
}
