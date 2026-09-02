package pizzaria;

public class Sistema {
public static void main(String[] args) {
	
	//Como usar:
	//Usando o Constructor de ingrediente para criar ingredientes "nome",preco
	//usando o construtor de sabores "nome do sabor",nomes dos ingredientes ja inicializados divididos por virgula
	//Usando o constructor de pizza "nome","tamanho (P, M, G,F)",sabores,...
	//a pizza pode ter no maximo 3 sabores
	
	
	//funcoes
	//Ingredientes: 
	//*criar ingredientes com constructor 
	
	//Sabores:
	//*'sabor'.getPreçoAtual (retorna o preço do sabor com base nos ingredientes usados e a especifica margem)
	//*'sabor'.mostrarInfo (retorna informaçoes sobre o sabor)
	//*'sabor'.Setmargem(novo valor) (muda a margem de lucro do especifico sabor)
	
	//Pizza:
	//*'pizza'.calcularPreçoPizza (calcula e retorna o preço da pizza)
	//*'Pizza'.mostrarInfo (retorna informaçoes sobre a pizza)
	
	
	
Ingrediente p1 = new Ingrediente("peperoni",3.0);
Ingrediente m1= new Ingrediente("molho", 3.0);
Ingrediente m2= new Ingrediente("mangericao",2.0);
Ingrediente q1= new Ingrediente("queijo",2.0);
Ingrediente t1= new Ingrediente("tomate",3.0);

Sabores marguerita = new Sabores("marguerita",m1,m2,q1,t1);
marguerita.mostrarInfo();


Sabores.setMargem(2.0);

marguerita.mostrarInfo();

 
}






}
