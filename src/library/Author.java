package library;

public class Author {
	
	private String name;
	public Author(String string, String string2) {
		// TODO Auto-generated constructor stub
		this.name=string;
		this.address=string2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	private String address;
	

}
