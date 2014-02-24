package mp3;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GeneroMusicas
 */
@WebServlet("/GeneroMusicas")
public class GeneroMusicas extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String genero = request.getParameter( "id" );
		switch (genero) {
		case "1":
			
			break;
		case "2":
			{
				try{	
			response.sendRedirect("Forro.html" );
				}
				catch (IOException e){
					e.printStackTrace();
				}
				
			}
			
			break;
			
		case "3":
			
			break;
			
		case "4":
						
			break;
		case "5":
			
			break;
		
		}
	
		
		
	}

}
