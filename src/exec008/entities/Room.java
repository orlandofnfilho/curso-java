package exec008.entities;

public class Room {

	private int number;
	private String name;
	private String email;

	
	
	public Room() {
		super();
	}

	public Room(int number, String occupant, String email) {
		super();
		this.number = number;
		this.name = occupant;
		this.email = email;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getOccupant() {
		return name;
	}

	public void setOccupant(String occupant) {
		this.name = occupant;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String toString() {
		return + getNumber()
			   + ": "
			   + getOccupant()
			   + ", "
			   + getEmail();
	}

}
