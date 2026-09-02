package simuladorbanc;

public class ContaBancaria {
String titular;
double saldo;
public ContaBancaria(String titular, double saldo) {
	this.titular = titular;
	this.saldo = saldo;
}
public void depositar(double quantidade) {
 saldo+=quantidade;
 System.out.println("titular: "+titular+"\ndeposito de: "+quantidade+"feito com sucesso");
}
public void sacar(double quantidade) {
	if(quantidade>saldo) {
		System.out.println("erro saldo insuficiente");
	}else {
	saldo-=quantidade;
	System.out.println("titular: "+titular+"\nsaque de: "+quantidade+"feito com sucesso");
	}
	}
public void mostrarSaldo() {
	System.out.println("titular: "+titular+"\nsaldo: "+saldo+"R$");
}
}
