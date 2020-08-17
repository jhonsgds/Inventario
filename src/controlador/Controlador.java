package controlador;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Bien;
import modelo.BienDAO;
import modelo.Categoria;
import modelo.CategoriaDAO;
import modelo.Usuario;
import modelo.UsuarioDAO;

/**
 * Servlet implementation class Controlador
 */
@WebServlet("/Mycontrolador")
public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    UsuarioDAO udao = new UsuarioDAO();
    Usuario us = new Usuario();
    CategoriaDAO catdao = new CategoriaDAO();
    Categoria cat = new Categoria();
    BienDAO bndao = new BienDAO();
    Bien bn = new Bien();
    int idus;
    int idcat;
    int idbn;
    
    public Controlador() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    		String menu = request.getParameter("menu");
        	String accion = request.getParameter("accion");
        	if(menu.equals("Home")) {
        		request.getRequestDispatcher("Home.jsp").forward(request, response);
        	}
        	if(menu.equals("Bien")) {
        		switch (accion) {
				case "mostrar":
					List lista = bndao.mostrar();
					request.setAttribute("bienes", lista);
					break;
				case "Agregar":
					int idtip = Integer.parseInt(request.getParameter("txtCategoria"));
					String tip = request.getParameter("txtCategoria");
    	            String cod = request.getParameter("txtCodigo");
    	            String nom = request.getParameter("txtNombre");
    	            String est = request.getParameter("txtEstado");
    	            String ub = request.getParameter("txtUbicacion");
    	            bn.setIdc(idtip);
    	            bn.setTipo(tip);
    	            bn.setCodigo(cod);
    	            bn.setNombre(nom);
    	            bn.setEstado(est);
    	            bn.setUbicacion(ub);
    	            bndao.agregar(bn);
					request.getRequestDispatcher("Mycontrolador?menu=Bien&accion=mostrar").forward(request, response);
					break;
				case "Editar":
					idbn = Integer.parseInt(request.getParameter("id"));
					Bien b = bndao.listarId(idbn);
					request.setAttribute("bien", b);
					request.getRequestDispatcher("Mycontrolador?menu=Bien&accion=mostrar").forward(request, response);
					break;
				case "Actualizar":
					int idtip1 = Integer.parseInt(request.getParameter("txtCategoria"));
    	            String tip1 = request.getParameter("txtCategoria");
					String cod1 = request.getParameter("txtCodigo");
    	            String nom1 = request.getParameter("txtNombre");
    	            String est1 = request.getParameter("txtEstado");
    	            String ub1 = request.getParameter("txtUbicacion");
    	            bn.setIdc(idtip1);
    	            bn.setTipo(tip1);
    	            bn.setCodigo(cod1);
    	            bn.setNombre(nom1);
    	            bn.setEstado(est1);
    	            bn.setUbicacion(ub1);
    	            bn.setId(idbn);
    	            bndao.actualizar(bn);
					request.getRequestDispatcher("Mycontrolador?menu=Bien&accion=mostrar").forward(request, response);
					break;
				default:
					throw new AssertionError();
				}
        		request.getRequestDispatcher("Bien.jsp").forward(request, response);
        	}
        	if(menu.equals("Categoria")) {
        		switch (accion) {
					case "mostrar":
						List lista = catdao.mostrar();
						request.setAttribute("categorias", lista);
						break;
					case "Agregar":
						String tip = request.getParameter("txtCategoria");
						cat.setTipo(tip);
						catdao.agregar(cat);
						request.getRequestDispatcher("Mycontrolador?menu=Categoria&accion=mostrar").forward(request, response);
						break;
					case "Editar":
						idcat = Integer.parseInt(request.getParameter("id"));
						Categoria c = catdao.listarId(idcat);
						request.setAttribute("categoria", c);
						request.getRequestDispatcher("Mycontrolador?menu=Categoria&accion=mostrar").forward(request, response);
						break;
					case "Actualizar":
						String tip1 = request.getParameter("txtCategoria");
						cat.setTipo(tip1);
						cat.setId(idcat);
						catdao.actualizar(cat);
						request.getRequestDispatcher("Mycontrolador?menu=Categoria&accion=mostrar").forward(request, response);
						break;
					default:
						throw new AssertionError();
					}
        		request.getRequestDispatcher("Categoria.jsp").forward(request, response);
        	}
        	if(menu.equals("Usuarios")) {
        		switch (accion) {
        			case "mostrar":
        				List lista = udao.mostrar();
        				request.setAttribute("usuario", lista);
        				break;   
        			case "Editar":
        				idus = Integer.parseInt(request.getParameter("id"));
        				Usuario u = udao.listarId(idus);
        				request.setAttribute("usuario", u);
        				request.getRequestDispatcher("Modificar.jsp").forward(request,response);
        			case "Actualizar":
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
        	            us.setId(idus);
        	            udao.actualizar(us);
        	            request.getRequestDispatcher("validar?accion=Ingresar").forward(request, response);
        	            break;
                    default:
                        throw new AssertionError();
        			}
        		request.getRequestDispatcher("Usuarios.jsp").forward(request, response);
        	}
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
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
