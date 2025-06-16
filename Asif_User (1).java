package uap;

import java.util.Random;

public class User {
	private String name,id;
	private int age;
	private boolean isAdmin;
 
public User(String name, int age, boolean isAdmin) {
	this.name = name;
	this.age = age;
	this.isAdmin = isAdmin;
	Random random = new Random();
	this.id = String.format("%04d", random.nextInt(10000));  //by search in web
}

public String getId() {
	return id;
}

public boolean isAdmin() {
	return isAdmin;
}

public String getName() {
	return name;
}

}
