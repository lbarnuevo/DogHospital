package hospital.pojos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Owner implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4623993775264155982L;
	
	private Integer id;
	private Integer phone;
	private String email;
	private Integer cardNumber;
	
	//One to many relationship
	private List<Dog> dogs;
	
	public Owner() {
		super();
		dogs = new ArrayList<Dog>();
	}
	
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
		Owner other = (Owner) obj;
		return Objects.equals(id, other.id);
	}

	public List<Dog> getDogs() {
		return dogs;
	}

	public void setDogs(List<Dog> dogs) {
		this.dogs = dogs;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(Integer cardNumber) {
		this.cardNumber = cardNumber;
	}

	@Override
	public String toString() {
		return "Owner [id=" + id + ", phone=" + phone + ", email=" + email + ", cardNumber=" + cardNumber + ", dogs="
				+ dogs + "]";
	}
}
