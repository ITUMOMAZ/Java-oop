package pizzaria;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class Sabores {
	private String nome;
	private List<Ingrediente> ingredientes;
	private static double margem= 1.5; //STATIC significa que ela nao pertence a um objeto apenas, e sim a TODA a classe, pode ser alterada no setmargem
	
	
	// o "..." no constructor é o varargs ele permite inserir mais de 1 ingrediente por vez
	public Sabores(String nome, Ingrediente ...ingredientes ) {
		this.nome = nome;
		this.ingredientes = new ArrayList<>(Arrays.asList(ingredientes));//aqui o new arraylist serve como a lista que vai ser inserida 
		                                                                // no varargs, nesse caso é puxado como umaa lista de ingredientes.
	}
	
	public double getPreçoAtual() {
		double total = 0;
		for(Ingrediente ing : ingredientes) {
			total+=ing.getPreço();
		
			
		}
		
		return total*margem;
	
	}
	
	public void mostrarInfo() {
		System.out.println("nome: " + nome);
		System.out.println("preço: " + getPreçoAtual());
		 for(int i = 0 ; i<ingredientes.size(); i++) {
			 System.out.println(" " + (i+1)+ ": " + ingredientes.get(i));
		 }
		 System.out.println("com a margem de lucro de:" + margem);
	}
	

	public static double getMargem() {
		System.out.println("margem atual: " + margem);
		return margem;
	}

	public static void setMargem(double novaMargem) {
		margem = novaMargem;
		System.out.println("\nnova margem é: " + margem);
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(List<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}
	

	
	
}
