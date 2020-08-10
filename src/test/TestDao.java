package test;

import java.util.List;
import dao.LivreDaoImpl;
import metier.entities.Livre;

public class TestDao {

	public static void main(String[] args) {
		/* Ajout d'un livre dans la BdD */
		LivreDaoImpl livreDaoImpl = new LivreDaoImpl();
		Livre livre = livreDaoImpl.save(new Livre("Ma formation AFPA", "Centre de formation", "77000", "2020"));
		System.out.println(livre);

		/* Test liste de livres */
		List<Livre> livres = livreDaoImpl.livresParMotsCles("vel");
		for (Livre l : livres)
			System.out.println(l);
	}
}
