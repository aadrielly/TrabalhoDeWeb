package mp3;

import java.io.IOException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private Properties	mapa;

	@Override
	public void init() throws ServletException
	{
		try
		{
			this.mapa = new Properties();
			String caminho = this.getServletContext()
									.getInitParameter( "path_arquivo_senhas" );

			this.mapa.load( this.getServletContext().getResourceAsStream( caminho ) );

		} catch ( IOException e )
		{
			System.out.println( "Erro no preenchimento dos dados Properties!" );
			e.printStackTrace();
		}
	}

	
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		// TODO Auto-generated method stub
		{
			// TODO Auto-generated method stub
			String login = request.getParameter( "edtLogin" );
			String senha = request.getParameter( "edtSenha" );

			if ( this.ValidarSenha( login, senha ) ) response.sendRedirect( "index.html" );
			else
				response.sendRedirect( "Erro.html" );

		}

		private boolean ValidarSenha( String login, String senha )
		{
			if ( this.mapa.getProperty( login ) == null ) return false;
			else
				return this.mapa.getProperty( login ).equals( senha );

		}

	
	}

