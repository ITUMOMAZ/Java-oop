package pizzaria;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Pizza {
	private String nome;
	private String tamanho;
	private double preçoPizza;
	private List<Sabores> sabores;
	
	
	public Pizza(String nome, String tamanho, Sabores ...sabores) {
	
		
		this.nome = nome;
		this.tamanho = tamanho;
		if(sabores.length > 3) {
			throw new IllegalArgumentException("Uma pizza pode ter no máximo 3 sabores!");//throw new illegalargument é simplesmente um 
																			      // uma instruçao que para o metodo e imprimi uma mensagem
		}
		
		this.sabores = new ArrayList<>(Arrays.asList(sabores));
        this.preçoPizza = calcularPreçoPizza();
	}
	
	private double calcularPreçoPizza() {
		double preçoMaisCaro = 0;
		
		for(Sabores sabor : sabores) {
			double preçoAtual = sabor.getPreçoAtual();
			if(preçoAtual > preçoMaisCaro) {
				preçoMaisCaro = preçoAtual;
			}
		}
		
		double multiplicadorTamanho = getMultiplicadorTamanho();
		return preçoMaisCaro * multiplicadorTamanho;
	}
	
	
		
		
	
		public List<Sabores> getSabores() {
		return sabores;
	}

	public void setSabores(List<Sabores> sabores) {
		this.sabores = sabores;
	}

		private double getMultiplicadorTamanho() {
	        switch(tamanho.toUpperCase()) {
	            case "P": return 1.0;  // 
	            case "M": return 1.3;  // 
	            case "G": return 1.5;  // 
	            case "F": return 1.8;  // 
	            default: return 1.0;
	        }
	    }
		
		 public void atualizarPreço() {
		        this.preçoPizza = calcularPreçoPizza();
		        System.out.println("Preço da pizza '" + nome + "' atualizado para: R$" + 
		                         String.format("%.2f", preçoPizza));
		    }
		 
		 public void exibirInfo() {
			 System.out.println("pizza: " + nome);
			 System.out.println("tamanho: " + tamanho);
			 System.out.println("sabores: ");
			 for(int i = 0 ; i<sabores.size(); i++) {
				 System.out.println(" " + (i+1)+ ": " + sabores.get(i).getNome());
			 }
			    System.out.println("Preço: R$" + String.format("%.2f", preçoPizza));
			 
		 }

}
