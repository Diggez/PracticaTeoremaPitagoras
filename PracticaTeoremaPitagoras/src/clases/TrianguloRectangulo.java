package clases;

public class TrianguloRectangulo {

	private double a;
	private double b;
	private double c;
	/**
	 * Crea un TrianguloRectangulo con los catetos de 1 metro y su hipotenusa
	 */
	public TrianguloRectangulo() {
		this.a=1;
		this.b=1;
		this.c=hipotenusa();
		
	}
	/**
	 * Crea un TrianguloRectangulo con los catetos e hipotenusa especificados en metros
	 * @param a
	 * @param b
	 */
	public TrianguloRectangulo(double a, double b) {
		
		if(a<=0 || b<=0) {
			throw new IllegalArgumentException("Numero igual o menor que 0");
		}else {
			this.a=a;
			this.b=b;
			this.c=hipotenusa();
		}
		
	}
	/**
	 * Calcula el area de un TrianguloRectangulo
	 * @return el area de un TrianguloRectangulo en metros
	 */
	public double area() {
		double area=(this.a*this.b)/2;
	return area;
	}
	/**
	 * Calcula la hipotenusa de un TrianguloRectangulo
	 * @return la hipotenusa de un TrianguloRectangulo en metros
	 */
	public double hipotenusa() {
		double hipotenusa=Math.round(Math.sqrt((this.a*this.a)+(this.b*this.b))*100)/100;
	return hipotenusa;
	}
	/**
	 * Calcula el perimetro de un TrianguloRectangulo
	 * @return el perimetro de un TrianguloRectangulo en metros
	 */
	public double perimetro() {
		double perimetro=this.a+this.b+this.c;
	return perimetro;
	}
	public double getA() {
		return this.a;
	}
	public double getB() {
		return this.b;
	}
	public double getC() {
		return this.c;
	}
	
	@Override
	
	public String toString() {
		String mensaje="Cateto A: "+this.a+
					"\nCateto B: " + this.b+
					"\nHipotenusa: "+ this.c;
	return mensaje;
	}
}
