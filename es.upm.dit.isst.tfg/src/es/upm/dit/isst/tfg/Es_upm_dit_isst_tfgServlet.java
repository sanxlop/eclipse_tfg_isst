package es.upm.dit.isst.tfg;

import java.io.IOException;
import javax.servlet.http.*;

import es.upm.dit.isst.t4.dao.*;
import es.upm.dit.isst.t4.model.*;


@SuppressWarnings("serial")
public class Es_upm_dit_isst_tfgServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
		
		TFGDAO dao = TFGDAOImpl.getInstance();

		dao.create("Juan", "Sistemas Digitales", "Resumencito", "Dueñas");
		dao.create("Juan2", "Sistemas Digitales2", "Resumencito2", "Dueñas2");
		
		for (TFG tfg : dao.read()) {
			resp.getWriter().println(tfg.getTitulo());
		}
		
		
	}
}
