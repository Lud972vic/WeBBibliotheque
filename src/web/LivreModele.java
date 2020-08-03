package web;

import java.util.ArrayList;
import java.util.List;
import metier.entities.Livre;

public class LivreModele {
	/* La couche Modele vers la JSP */

	private String motsCles;

	List<Livre> livres = new ArrayList<Livre>();

	public String getMotsCles() {
		return motsCles;
	}

	public void setMotsCles(String motsCles) {
		this.motsCles = motsCles;
	}

	public List<Livre> getLivres() {
		return livres;
	}

	public void setLivres(List<Livre> livres) {
		this.livres = livres;
	}
}
