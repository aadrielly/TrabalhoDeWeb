/**
 * 
 */
package mp3;

import java.io.BufferedWriter;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author AMM
 *
 */
public class Loja {
	public Loja() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */

	 public boolean CadastrarCliente (String login, String pass) {
			try{
		
				
				
				FileWriter fw = new FileWriter("C:\\Users\\AMM\\workspaceWeb\\LojaMP3\\WebContent\\WEB-INF\\Clientes",true);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.newLine();
				bw.write(login);
				bw.write("=");
				bw.write(pass);	
				bw.newLine();
				bw.flush();
				bw.close();
				return true;
			} catch (IOException e){
				e.printStackTrace();
				return false;
			}
			
	}
	 void CadastrarFuncionario() {
			
		 
		}
	 
	 void RemoverCliente() {
			
		}
	 
	 void Login() {
			
		}
	 
	 void AddMusica() {
			
		}
	 void RemoverMusica() {
			
		}
	 void PesquisarMusica() {
		
		}
}
