/**
 * 
 */
package mp3;

/**
 * @author AMM
 *
 */
public class Funcionario extends Pessoa {
	String Nome;

	 int CPF;
	
	 String senha;
	 

	
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getCPF() {
		return CPF;
	}

	public void setCPF(int cPF) {
		CPF = cPF;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
