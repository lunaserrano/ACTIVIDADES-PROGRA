package com.luna.control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

import com.luna.DAO.UsuarioDAO;
import com.luna.model.TbUsuariop;

/**
 * Servlet implementation class ServleteUser
 */
public class ServleteUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServleteUser() {
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
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String usu = request.getParameter("usuario");
		String contra = request.getParameter("password");
		
		TbUsuariop usuario = new TbUsuariop();
		
		UsuarioDAO usudao = new UsuarioDAO();
		
		int varificarusuarios = usudao.ingresoUsuario(usuario).size();
		
		if(varificarusuarios > 0) {
			System.out.println("mostrado");
		}else {
			System.out.println("error");
		}
		
		usuario.setUsuario(usu);
		usuario.setContrasenia(contra);
		
		
	}

}
