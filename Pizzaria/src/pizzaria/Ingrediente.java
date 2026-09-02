package pizzaria;

public class Ingrediente {
	private String nome;
	private double preço;
	
	
	public Ingrediente(String nome, double preço) {
		this.nome = nome;
		this.preço = preço;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPreço() {
		return preço;
	}


	public void setPreço(double preço) {
		this.preço = preço;
	}
	
	
	@Override
    public String toString() {
        return nome + " (R$" + preço + ")";
    }
	
	
	
	

}
