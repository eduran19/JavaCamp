package googleAuth;

import entities.concretes.User;

public class GoogleManager {
	public void logInWithGoogleAccount(String message) {
		System.out.println("Google ile giris yapt�n: " + message);
	}
	public void register(User user){ 
        System.out.println("Kullan�c� Google yard�m�yla eklendi: " + user.getFirstName() + " " + user.getLastName().toUpperCase());
    } 
}
