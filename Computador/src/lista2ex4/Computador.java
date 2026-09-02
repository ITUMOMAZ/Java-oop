package lista2ex4;

public class Computador {
public String marca,processador;
public boolean estaLigado;
public Computador(String marca, String processador) {
	this.marca = marca;
	this.processador = processador;
	this.estaLigado = false;
}

public void ligar() {
	if(estaLigado==true) {
		System.out.println("equipamento ja esta ligado");
		
	}
	else {
		estaLigado=true;
		System.out.println("Computador foi ligado");
	}
	
}

public void desligar()
{
	if(estaLigado==false) {
		System.out.println("equipamento ja esta desligado");
		
	}
	else {
		estaLigado=true;
		System.out.println("Computador foi desligado");
	}
}
public void verificarStatus() {
	String estado= estaLigado? "ligado":"deligado";
	
	System.out.println("Computado: "+processador+"\nMarca: "+marca+"\nEstado: "+estado);
}

}
