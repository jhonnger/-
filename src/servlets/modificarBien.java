package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import modelo.BienDTO;

/**
 * Servlet implementation class modificarCategoria
 */
@WebServlet("/modificarBien")
public class modificarBien extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public modificarBien() {
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
		try{
			String cod = request.getParameter("codigo_edit");
			String desc = request.getParameter("descripcion_edit");
			String unidades = request.getParameter("unidades_edit");
			double precio =Double.parseDouble(request.getParameter("precio_edit"));
		
			BienDTO bienDTO = new BienDTO();
			success = bienDTO.modificar(cod, desc,unidades,precio);
			
			out.print(success);
		}catch (NumberFormatException e) {
			// TODO: handle exception
		}
		
	}

}
