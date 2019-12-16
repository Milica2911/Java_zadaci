package homework;

public abstract class GeometrijskaSlika {
	// ne moze toString da radi ispis, jer nasledjuje iz Object klase
	// koja vraca tip String
	public abstract void print();
	public abstract float circumference();
	public abstract float area(); 
}
