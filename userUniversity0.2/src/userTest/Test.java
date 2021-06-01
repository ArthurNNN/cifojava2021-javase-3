package userTest;

import model.Employee;
import model.Student;
import model.Teacher;
import model.User;
import repostitory.UniversityDB;
import model.Member;

public class Test {

	public static void main(String[] args) {

		UniversityDB upc_Maths_DB = new UniversityDB();

		upc_Maths_DB.setLocation("Barcelona");
		upc_Maths_DB.setSize(10);
		UniversityDB.setNameUniversity("Univesitat Politècnica de Catalunya, Matemátiques");

		// this is Joan, who ask for some information about Maths courses
		User joan = new User();
		joan.setAge(25);
		joan.setEmail("@joan");
		joan.setName("Joan");
		joan.setSurname("Gasol");
		System.out.println(joan);
		// this is Alexa, a mother who visits her daughter in xmas
		Member alexa = new Member();
		alexa.setAge(26);
		alexa.setEmail("@alexa");
		alexa.setName("Alexa");
		alexa.setSurname("Kazan");
		alexa.setId(101);
		System.out.println(alexa);
		// this is Sergii, an empoloyee of the university: he handles all the web
		// and the db and spring java systems
		Employee sergii = new Employee();
		sergii.setAge(24);
		sergii.setEmail("@sergeii");
		sergii.setId(102);
		sergii.setSurname("Karmazov");
		sergii.setName("Sergii");
		sergii.setSalary(2500);

		// this is Pepe, and employee of the university, manages the fiber optics
		// network and systems
		User pepe = new Employee();

		// just a couple of students
		User isa = new Student();
		User borja = new Student();

		// just a couple of teachers
		User artur = new Teacher();
		User kingsley = new Teacher();

		upc_Maths_DB.getUniversityUsersDB().add(joan);
		upc_Maths_DB.getUniversityUsersDB().add(alexa);
		upc_Maths_DB.getUniversityUsersDB().add(sergii);
		upc_Maths_DB.getUniversityUsersDB().add(pepe);
		upc_Maths_DB.getUniversityUsersDB().add(isa);
		upc_Maths_DB.getUniversityUsersDB().add(borja);
		upc_Maths_DB.getUniversityUsersDB().add(artur);
		upc_Maths_DB.getUniversityUsersDB().add(kingsley);

	}

}
