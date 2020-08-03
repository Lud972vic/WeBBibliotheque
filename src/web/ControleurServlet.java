package web;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.catalina.connector.Response;
import dao.ILivreDao;
import dao.LivreDaoImpl;
import metier.entities.Livre;

@WebServlet(name = "cs", urlPatterns = { "/controleur", "*.do" })
public class ControleurServlet extends HttpServlet {
	ILivreDao ilivredao;

	@Override
	public void init() throws ServletException {
		ilivredao = new LivreDaoImpl();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String path = request.getServletPath();
		
		if (path.equals("/index.do")) {
			request.getRequestDispatcher("livres.jsp").forward(request, response);
		} else if (path.equals("/chercher.do")) {
			String motsCles = request.getParameter("motsCles");
			LivreModele model = new LivreModele();
			model.setMotsCles(motsCles);
			List<Livre> livres = ilivredao.livresParMotsCles(motsCles);
			model.setLivres(livres);
			request.setAttribute("model", model);
			request.getRequestDispatcher("livres.jsp").forward(request, response);
		} else if (path.equals("/saisir.do")) {
			request.getRequestDispatcher("ajouterLivre.jsp").forward(request, response);
		} else if (path.equals("/ajouter.do") && request.getMethod().equals("POST")) {
			String titre = request.getParameter("titre");
			String description = request.getParameter("description");
			String isbn = request.getParameter("isbn");
			String code = request.getParameter("code");
			Livre l = ilivredao.save(new Livre(titre, description, isbn, code));
			request.setAttribute("livre", l);
			request.getRequestDispatcher("confirmation.jsp").forward(request, response);
		} else if (path.equals("/supprimer.do")) {
			int idlivres = Integer.parseInt(request.getParameter("idlivres"));
			ilivredao.deleteLivre(idlivres);
			response.sendRedirect("chercher.do?motsCles=");
		} else {
			response.sendError(Response.SC_NOT_FOUND);
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
