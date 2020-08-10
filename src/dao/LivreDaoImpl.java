package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import metier.SingletonConnection;
import metier.entities.Livre;

public class LivreDaoImpl implements ILivreDao {

	@Override
	public Livre save(Livre livre) {
		Connection connection = SingletonConnection.getConnection();

		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement("INSERT INTO LIVRE (titre, description, isbn, code) VALUES(?,?,?,?)");
			preparedStatement.setString(1, livre.getTitre());
			preparedStatement.setString(2, livre.getDescription());
			preparedStatement.setString(3, livre.getIsbn());
			preparedStatement.setString(4, livre.getCode());
			preparedStatement.executeUpdate();

			PreparedStatement preparedStatementMaxId = connection
					.prepareStatement("SELECT Max(idlivre) As MaxID FROM Livre");

			ResultSet resultSet = preparedStatementMaxId.executeQuery();

			if (resultSet.next()) {
				livre.setIdlivres(resultSet.getInt("Maxid"));
			}

			preparedStatement.close();
			preparedStatementMaxId.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return livre;
	}

	@Override
	public List<Livre> livresParMotsCles(String motsCles) {
		List<Livre> livres = new ArrayList<Livre>();

		Connection connection = SingletonConnection.getConnection();

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(
					"SELECT * FROM LIVRE WHERE titre LIKE ? OR description LIKE ? OR  isbn LIKE ? OR  code LIKE ? Order By titre Asc");

			preparedStatement.setString(1, "%" + motsCles + "%");
			preparedStatement.setString(2, "%" + motsCles + "%");
			preparedStatement.setString(3, "%" + motsCles + "%");
			preparedStatement.setString(4, "%" + motsCles + "%");

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				Livre livre = new Livre();
				livre.setIdlivres(resultSet.getInt("idlivre"));
				livre.setTitre(resultSet.getString("titre"));
				livre.setDescription(resultSet.getString("description"));
				livre.setIsbn(resultSet.getString("isbn"));
				livre.setCode(resultSet.getString("code"));
				
				/* On ajout le livre au tableau des livres */
				livres.add(livre);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return livres;
	}

	@Override
	public Livre getLivre(int idlivres) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Livre updateLivre(Livre livre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteLivre(int idlivres) {
		// TODO Auto-generated method stub

	}

}
