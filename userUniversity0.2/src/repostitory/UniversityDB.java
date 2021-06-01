package repostitory;

import java.util.ArrayList;
import java.util.List;
import model.User;

public class UniversityDB {

	public static String nameUniversity;
	public static int usersTotal;

	public String location;
	public int size;
	private List<User> universityUsersDB;

	public UniversityDB() {
		super();
		this.universityUsersDB = new ArrayList<User>();
	}

	public static String getNameUniversity() {
		return nameUniversity;
	}

	public static void setNameUniversity(String nameUniversity) {
		UniversityDB.nameUniversity = nameUniversity;
	}

	public static int getUsersTotal() {
		return usersTotal;
	}

	public static void setUsersTotal(int usersTotal) {
		UniversityDB.usersTotal = usersTotal;
	}

	public String getLocation() {
		return location;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public List<User> getUniversityUsersDB() {
		return universityUsersDB;
	}

	public void setUniversityUsersDB(List<User> universityUsersDB) {
		this.universityUsersDB = universityUsersDB;
	}

	public void setLocation(String location) {
		this.location = location;

	}

}
