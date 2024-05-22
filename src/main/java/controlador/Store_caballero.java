package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Caballero;
import modelo.Conector;
import modelo.ModeloArma;
import modelo.ModeloCaballero;
import modelo.ModeloEscudo;
import modelo.Validador;

/**
 * Servlet implementation class Store_caballero
 */
@WebServlet("/Store_caballero")
public class Store_caballero extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Store_caballero() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("nombre");
		if (Validador.stringVacio(request.getParameter("fuerza")) ==true || Validador.stringVacio(request.getParameter("experiencia"))==true) {
			response.sendRedirect("Index_caballero");
		}else {
			int fuerza = Integer.parseInt(request.getParameter("fuerza"));
			int experiencia = Integer.parseInt(request.getParameter("experiencia"));
			String foto = request.getParameter("foto");
			int arma_id = Integer.parseInt(request.getParameter("arma_id"));
			int escudo_id = Integer.parseInt(request.getParameter("escudo_id"));
			
			ModeloArma ma = new ModeloArma();
			ma.setConector(new Conector());
			
			ModeloEscudo me = new ModeloEscudo();
			me.setConector(new Conector());
			
			Caballero caballero = new Caballero(nombre,fuerza,experiencia,foto,ma.getArma(arma_id),me.getEscudo(escudo_id));
			
			if(Validador.algunFallo(nombre, fuerza, experiencia, nombre, arma_id, escudo_id)==false) {
				ModeloCaballero mc = new ModeloCaballero();
				mc.setConector(new Conector());
				mc.insert(caballero);
			}
			
			response.sendRedirect("Index_caballero");
		}
		
	}

}
