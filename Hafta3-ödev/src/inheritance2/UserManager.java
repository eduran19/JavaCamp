package inheritance2;

public class UserManager {

	public void login(User user) {
		System.out.println(user.getfirstName() + " ba�ar�yla giri� yapt�n�z");
	}
	public void logOut(User user) {
		System.out.println(user.getfirstName() + " ba�ar�yla c�k�� yapt�n�z");
	}
}
