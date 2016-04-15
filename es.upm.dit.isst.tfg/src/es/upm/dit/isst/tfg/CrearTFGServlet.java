package es.upm.dit.isst.tfg;

import java.io.IOException;

import javax.servlet.http.*;


import es.upm.dit.isst.t4.dao.*;



@SuppressWarnings("serial")
public class CrearTFGServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Añadir TFG");
		
		String titulo = req.getParameter("titulo");
		String resumen = req.getParameter("resumen");
		String autor = req.getParameter("autor");
		String tutor = req.getParameter("tutor");
		
		TFGDAO dao = TFGDAOImpl.getInstance();
	
		dao.create(autor, titulo, resumen, tutor);
		resp.sendRedirect("/login");
		
		
	}
}