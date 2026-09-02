package controleacademic;

public class Aluno {
String nome,matricula;
double notaSemestre;
public Aluno(String nome, String matricula, double notaSemestre) {
	this.nome = nome;
	this.matricula = matricula;
	this.notaSemestre = notaSemestre;
}
public void verificarAprovacao(){
if(notaSemestre<7) {
	System.out.println("aluno: "+nome+" em exame");
}else {
	System.out.println("aluno: "+nome+" aprovado");
}
}


}
