package TestNGSessions;

import org.testng.annotations.Test;

public class CRUDTest {

	public int addUser() {
		return 124;
	}
	
	public String getUser(int uid) {
		return "User info for"+uid;
	}

	public String updateUser(int uid) {
		return "Updated user info for"+uid;

	}

	public void deleteUser(int uid) {
		System.out.println("user is deleted");
	}
	
	///AAA - Arrange , Act , Assert
	
	@Test
	public void addUserTest() {
		int uid = addUser();
	}
	
	@Test
	public void getUserTest() {
		int uid = addUser();
		String userInfo = getUser(uid);
		System.out.println(userInfo);
	}
	
	@Test
	public void updateUserTest() {
		int uid = addUser();
		updateUser(uid);
		System.out.println(getUser(uid));
	}
	
	@Test
	public void deleteUserTest() {
		int uid = addUser();
		deleteUser(uid);
		System.out.println(getUser(uid));
	}
	
	
	
}
