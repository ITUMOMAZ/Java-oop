package lista2ex5;

public class Retangulo {
public double base,altura;

public Retangulo(double base, double altura) {
	this.base = base;
	this.altura = altura;

}

public void CalcularArea() {

	System.out.println("area do retangulo é: "+(base*altura));
}

public void CalcularPerimetro() {
	System.out.println("Perimetro do retangulo é: "+(2*(base*altura)));
}
}
