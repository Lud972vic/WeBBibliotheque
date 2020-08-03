package metier.entities;

import java.io.Serializable;

public class Livre implements Serializable {
	private int idlivres;
	private String titre;
	private String description;
	private String isbn;
	private String code;

	public Livre() {
		super();
	}

	public Livre(String titre, String description, String isbn, String code) {
		super();
		this.titre = titre;
		this.description = description;
		this.isbn = isbn;
		this.code = code;
	}

	public int getIdlivres() {
		return idlivres;
	}

	public void setIdlivres(int idlivres) {
		this.idlivres = idlivres;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Livre [idlivres=" + idlivres + ", titre=" + titre + ", description=" + description + ", isbn=" + isbn
				+ ", code=" + code + "]";
	}
}
