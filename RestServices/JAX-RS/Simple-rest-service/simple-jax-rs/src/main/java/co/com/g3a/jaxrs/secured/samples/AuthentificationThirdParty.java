package co.com.g3a.jaxrs.secured.samples;

import java.util.ArrayList;
import java.util.List;

/*
 * Based on https://simplapi.wordpress.com/
 */
public class AuthentificationThirdParty {
	private static List<User> users;
	
	static {
		users= new ArrayList<>(2);
		User user1= new User();
		user1.setLogin("admin");
		user1.setPassword("admin");
		
		User user2= new User();
		user2.setLogin("otheradmin");
		user2.setPassword("otheradminpassword");
		List<String> roles=new ArrayList<>(1);
		roles.add("ADMIN");
		user2.setRoles(roles);
		
		users.add(user1);
		users.add(user2);
	}
	
	public static User authentification(String username,String password) {
		User principal=null;
		for (User user : users) {
			if(user.getLogin().equals(username) && user.getPassword().equals(password)) {
				principal= user;
			}
		}
		return principal;
	}

}
