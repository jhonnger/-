package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.BienDTO;
import modelo.CategoriaDTO;

/**
 * Servlet implementation class addCategoria
 */
@WebServlet("/addBien")
public class addBien extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addBien() {
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

		String desc = request.getParameter("descripcion");
		String cantidad=request.getParameter("cantidad");
		String precio=request.getParameter("precio");
		String categoria=request.getParameter("cat");
		
		BienDTO bienDTO = new BienDTO();
		success = bienDTO.insertar(desc,cantidad,precio,categoria);
		
		
		out.print(success);
	}

}
