// Gerente � um funcion�rio, gerente herda a class FuncionarioAutenticavel 
public class Gerente extends Funcionario implements Autenticavel{

	private int senha;
	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}


	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonifica��o do GERENTE");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;

	}

	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}

	}
}
