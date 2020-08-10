package dao;

import java.util.List;
import metier.entities.Livre;

public interface ILivreDao {
	/* Ajouter un livre */
	public Livre save(Livre livre);

	/* Liste de livre à partir d'un mots clés */
	public List<Livre> livresParMotsCles(String motsCles);

	/* Chercher un livre par son identifiant */
	public Livre getLivre(int idlivres);

	/* Mettre à jour un produit */
	public Livre updateLivre(Livre livre);

	/* Supprimer un produit */
	public void deleteLivre(int idlivres);
}
