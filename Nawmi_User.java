package uap;
import java.util.Random;


public class User {
	Random rand = new Random();
	private String id;
	private String name;
	private int age;
	private boolean isAdmin;

	public User(String name, int age, boolean isAdmin) {
		
		this.name = name;
		this.age = age;
		this.isAdmin = isAdmin;
		this.id = generateId(isAdmin);
	}
	public String generateId(boolean isAdmin) {
		String r = "" + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10);
		String pre;
		if (isAdmin==true) {
			pre = "11-";
		} else {
			pre = "22-";
		}
		String id = pre + r;
		return id;
	}
	public String getID() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public boolean getIsAdmin() {
		return this.isAdmin;
	}

}
