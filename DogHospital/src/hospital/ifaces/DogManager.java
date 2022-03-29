package hospital.ifaces;

import java.util.List;

import hospital.pojos.Dog;
import hospital.pojos.Owner;

public interface DogManager {
	
	// Adding a new dog
	public void addDog(Dog d);
	
	// Search dog of owner
	public List<Dog> searchDogByOwner(Owner o);
	

}
