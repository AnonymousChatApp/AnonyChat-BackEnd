package starter;
import managers.DataManager;
import models.User;

public class App {

	public static void main(String[] args) {
		User user = new User("Pesho");
		
		DataManager.getInstance().createNewUser(user);
	}

}
