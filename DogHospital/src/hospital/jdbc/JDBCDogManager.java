package hospital.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import hospital.ifaces.DogManager;
import hospital.pojos.Dog;
import hospital.pojos.Owner;

public class JDBCDogManager implements DogManager {

	private JDBCManager manager;
	
	public JDBCDogManager(JDBCManager m) {
		this.manager = m;
	}
	
	@Override
	public void addDog(Dog d) {
		try {
			String sql = "INSERT INTO dogs (name, breed, coat, dob) VALUES (?,?,?,?)";
			PreparedStatement prep = manager.getConnection().prepareStatement(sql);
			prep.setString(1, d.getName());
			prep.setString(2, d.getBreed());
			prep.setString(3, d.getCoat());
			prep.setDate(4, d.getDob());
			prep.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Dog> searchDogByOwner(Owner o) {
		// TODO Auto-generated method stub
		return null;
	}

}
