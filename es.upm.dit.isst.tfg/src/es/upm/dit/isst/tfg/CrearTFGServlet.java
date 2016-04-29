package es.upm.dit.isst.tfg;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import es.upm.dit.isst.t4.dao.*;

@SuppressWarnings("serial")
public class CrearTFGServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {

		RequestDispatcher view = req.getRequestDispatcher("AnadirTFGView.jsp");
		try {
			// Con el view, devolvemos una vez ejecutada la peticion, el contral
			// al servlet que la envio.
			view.forward(req, resp);
		} catch (ServletException e) {

			e.printStackTrace();
		}
	}

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