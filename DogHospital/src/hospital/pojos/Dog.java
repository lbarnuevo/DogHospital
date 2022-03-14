package hospital.pojos;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.io.Serializable;

// A POJO always...
//Implements Serializable

public class Dog implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5387774195736442932L;
	
	// Has atributes of the POJO 
	private Integer id;
	private String name;
	private String breed;
	private String coat;
	private Date dob;
	
	//Many to one relationship
	private Owner owner;
	
	//Many to many relationship
	private List<Vet> vets;
	
	// An empty constructor
	
	public Dog() {
		super();
		vets = new ArrayList<Vet>();
	}
	
	// An equals method: in a POJO only for the ID
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		return Objects.equals(id, other.id);
	}

	// Getters and setters for the attributes 
	
	public Integer getId() {
		return id;
	}

	public List<Vet> getVets() {
		return vets;
	}

	public void setVets(List<Vet> vets) {
		this.vets = vets;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getCoat() {
		return coat;
	}

	public void setCoat(String coat) {
		this.coat = coat;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	//It is useful to have toString method
	@Override
	public String toString() {
		return "Dog [id=" + id + ", name=" + name + ", breed=" + breed + ", coat=" + coat + ", dob=" + dob + "]";
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}
}
