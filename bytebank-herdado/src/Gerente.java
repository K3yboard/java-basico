// Gerente � um funcion�rio, gerente herda a class Funcionario
public class Gerente extends Funcionario {
	
	
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
		
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}
	
//	public double getBonificacao() {
//		return this.salario;
//	}	
	
}
