package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.CategoriaDTO;
import Entidades.Categoria;

/**
 * Servlet implementation class CheckBlockCategoria
 */
@WebServlet("/checkBlockCategoria")
public class CheckBlockCategoria extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckBlockCategoria() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		CategoriaDTO categoriaDTO = new CategoriaDTO();
		
		String salida,cod = request.getParameter("cod");
		String user;
		user=  request.getSession().getAttribute("user")+"";
		salida = categoriaDTO.bloquear(cod,user);
		
		out.print(salida);
		
	}

}
