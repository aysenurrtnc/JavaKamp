
public class UserManager {
	
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "isimli kullanıcı sisteme eklendi.");
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "isimli kullanıcı sistemden silindi.");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "isimli kullanıcı güncellendi.");
	}

}
