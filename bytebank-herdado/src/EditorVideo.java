// Gerente � um funcion�rio, gerente herda a class Funcionario
public class EditorVideo extends Funcionario {
		
	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonifica��o do Editor de V�deo");
		return super.getBonificacao() + super.getSalario() + 100;
	}	
	
}
