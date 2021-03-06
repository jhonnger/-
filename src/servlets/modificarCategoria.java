package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.CategoriaDTO;

/**
 * Servlet implementation class modificarCategoria
 */
@WebServlet("/modificarCategoria")
public class modificarCategoria extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public modificarCategoria() {
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
boolean success;
		
		PrintWriter out= response.getWriter();
		
		String cod = request.getParameter("codigo_edit");
		String desc = request.getParameter("descripcion_edit");
		
		CategoriaDTO categoriaDTO = new CategoriaDTO();
		success = categoriaDTO.modificar(cod, desc);
		
		out.print(success);
	}

}
