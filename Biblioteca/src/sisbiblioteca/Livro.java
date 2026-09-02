package sisbiblioteca;

public class Livro {
String titulo,autor;
int pagTotais;
public Livro(String titulo, String autor, int pagTotais) {
	this.titulo = titulo;
	this.autor = autor;
	this.pagTotais = pagTotais;
}

public void exibirInfo() {
	System.out.println("titul: "+titulo+"\nautor: "+autor+"\nnumero de paginas: "+pagTotais);
}

}
