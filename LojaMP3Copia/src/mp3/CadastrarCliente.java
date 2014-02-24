package mp3;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CadastrarCliente
 */
@WebServlet("/CadastrarCliente")
public class CadastrarCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{	
			Loja l = new Loja();
		//	Cliente cli = new Cliente();
			String nome = request.getParameter("edtNome");
			String senha = request.getParameter("edtSenha");
			
			if(nome!=null && senha!=null){
				 if (l.CadastrarCliente(nome,senha))
				response.sendRedirect("index.html");
						else
				response.sendRedirect("Erro.html"); 
			}
		}
		catch (IOException e){
			e.printStackTrace();
		}
	}
	

	
}