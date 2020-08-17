package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Usuario;
import modelo.UsuarioDAO;

/**
 * Servlet implementation class registrarusuario
 */
@WebServlet("/registrar")
public class registrarusuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    UsuarioDAO udao = new UsuarioDAO();
    Usuario us = new Usuario();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
    	String accion = request.getParameter("accion");
        if(accion.equalsIgnoreCase("Registrar")){
            String nom = request.getParameter("txtnombre");
            String apell = request.getParameter("txtapellido");
            int fono = Integer.parseInt(request.getParameter("txtfono"));
            String correo = request.getParameter("txtcorreo");
            String user = request.getParameter("txtuser");
            String pass = request.getParameter("txtpass");
            us.setNombre(nom);
            us.setApellido(apell);
            us.setTelefono(fono);
            us.setEmail(correo);
            us.setUser(user);
            us.setPass(pass);
            udao.agregar(us);
            request.getRequestDispatcher("Home.jsp").forward(request, response);          
        }else {
    		request.getRequestDispatcher("Registrar.jsp").forward(request, response);
        }
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

}
