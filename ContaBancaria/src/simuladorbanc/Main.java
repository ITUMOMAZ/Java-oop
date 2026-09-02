package simuladorbanc;

public class Main {

	public static void main(String[] args) {
		ContaBancaria ian = new ContaBancaria("ian",200);
		ContaBancaria tupac = new ContaBancaria("tupac",100);
		
		
	tupac.depositar(300);
	tupac.mostrarSaldo();
		ian.sacar(100);
		ian.mostrarSaldo();
		ian.sacar(1000);
		ian.mostrarSaldo();
		
	}

}
