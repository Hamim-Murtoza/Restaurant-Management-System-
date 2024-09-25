public class User{
	private String name;
	private String password;
	private String gender;
	private String dateOfBirth;
	private String address;
	
	public User(String name, String password, String gender, String dateOfBirth, String address){
		this.name = name;
		this.password = password;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setPassword(String password){
		this.password = password;
	}
	public void setGender(String gender){
		this.gender = gender;
	}
	public void setDOB(String dateOfBirth){
		this.dateOfBirth = dateOfBirth;
	}
	public void setAddress(String address){
		this.address = address;
	}
	
	public String getName(){
		return name;
	}
	public String getPassword(){
		return password;
	}
	public String getGender(){
		return gender;
	}
	public String getDOB(){
		return dateOfBirth;
	}
	public String getAddress(){
		return address;
	}
}