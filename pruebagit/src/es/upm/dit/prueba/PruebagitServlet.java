package es.upm.dit.prueba;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class PruebagitServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, worlddddd");
	}
}
