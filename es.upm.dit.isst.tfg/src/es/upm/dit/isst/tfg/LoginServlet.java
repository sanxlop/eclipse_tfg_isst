package es.upm.dit.isst.tfg;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.*;

import com.google.appengine.api.users.*;
import com.google.apphosting.api.*;

import es.upm.dit.isst.t4.dao.*;
import es.upm.dit.isst.t4.model.*;


@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Login");
		
		TFGDAO dao = TFGDAOImpl.getInstance();

		dao.create("Juan", "Sistemas Digitales", "Resumencito", "Dueñas");
		dao.create("Juan2", "Sistemas Digitales2", "Resumencito2", "Dueñas2");
	
		List<TFG> tfgs = dao.read();
		
		
		//codigo sin session y sin JSP
		/*UserService userService = UserServiceFactory.getUserService();
		String url = userService.createLoginURL( req.getRequestURI());
		String urlLinktext = "Login" ;
		resp.setContentType( "text/html" );
		if ( req.getUserPrincipal() != null ){
		url = userService.createLogoutURL( req .getRequestURI());
		urlLinktext = "Logout" ;
		resp.getWriter().println("<p>Hola" + req.getUserPrincipal().getName() + "</p>");
		}
		resp.getWriter().println("<p>Pulsa <a href=" + url + ">" + urlLinktext + "</a></p>");
		*/
		
		UserService userService = UserServiceFactory.getUserService();
		String url = userService.createLoginURL( req.getRequestURI());
		String urlLinktext = "Login" ;
		String user = "" ;
		if ( req.getUserPrincipal() != null ){
			user = req.getUserPrincipal().getName();
			url = userService.createLogoutURL( req.getRequestURI());
			urlLinktext = "Logout" ;
		}
		req.getSession().setAttribute( "user" , user );
		req.getSession().setAttribute( "url" , url );
		req.getSession().setAttribute( "urlLinktext" , urlLinktext );
		req .getSession().setAttribute( "tfgs" , new ArrayList<TFG>( tfgs ));
		
		
		resp.sendRedirect("/MostrarTFGVIew.jsp" );
		
		
		
		
	}
}
