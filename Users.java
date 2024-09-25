public class Users{
	User userList[] = new User[100];
	public static int userCount = 0;
	
	Users(){
		User u1 = new User("Hamim","1211", "Male","12/NOV/2003","Faridpur");
		userList[userCount] = u1;
		userCount++;
		
		User u2 = new User("abc","123", "Male","4/FEB/2001","Kuratoli");
		userList[userCount++] = u2;
	}
	
	public void addUser(User u){
		userList[userCount] = u;
		userCount++;
	}
	
	public int userExists(String name){
		int index = -1;
		for(int i = 0; i<userCount; i++){
			if(userList[i].getName().equals(name)){
				index = i;
				break;
			}
		}
		return index;
	}
	
	public User checkPassword(int index, String pass){
		User u = null;
		if(userList[index].getPassword().equals(pass)){
			u = userList[index];
		}
		return u;
	}
	
	public User getUser(int index){
		return userList[index];
	}
	
	public void deleteUser(User u){
		for(int i = 0; i<userCount; i++){
			if(userList[i] == u){
				for(int j = i; j<userCount-1; j++){
					userList[j] = userList[j+1];
				}
				userCount--;
				userList[userCount]=null;
				break;
			}
		}
	}
	
}