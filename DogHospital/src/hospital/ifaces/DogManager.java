package hospital.ifaces;

import java.util.List;

import hospital.pojos.Dog;
import hospital.pojos.Owner;

public class DogManager {
	//methods performed on dog
	
	public void addDog(Dog d);
	// Search dogs of owner
	
	public List<Dog> searchDogByOwner(Owner o);
}
