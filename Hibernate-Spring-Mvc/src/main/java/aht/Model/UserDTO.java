package aht.Model;

public class UserDTO {
	private int id;
	private String name;
	private String Address;
	
	public UserDTO() {
		// TODO Auto-generated constructor stub
	}

	public UserDTO(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		Address = address;
	}
	public UserDTO(String name, String address) {
		this.name = name;
		Address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", Address=" + Address + "]";
	}
	
}
