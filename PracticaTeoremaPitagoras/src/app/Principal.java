package app;
import clases.TrianguloRectangulo;
public class Principal {

	public static void main(String[] args) {

		TrianguloRectangulo t1=new TrianguloRectangulo(4.5,5.5);
		TrianguloRectangulo t2=new TrianguloRectangulo();
		
		double area1=t1.area();
		double perimetro1=t1.perimetro();
		
		double area2=t2.area();
		double perimetro2=t2.perimetro();
		
	}

}
