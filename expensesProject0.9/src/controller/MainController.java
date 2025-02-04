package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import model.Language;
import model.User;
import utils.UsersUtils;

public class MainController {

	public static void AppStarting() {

		// just to store some users we create along the program executes
		ArrayList<User> users = new ArrayList<User>();
		
		//fake user to test expenses without the need of creating a new user
		users.add(new User ("1", "1"));

		// declare languages object - type HashMap- and assign the result of
		// calling at method initLanguages of class LanguageController
		// initLanguages() is a method we use to initialize languages objects,
		// so, that is, we are going to create language objects like German, Spanish,
		// etc ..
		// and we will store in a hashMap
		HashMap<String, Language> languagesAvailable = LanguagesController.initLanguages();

		// we could user ArrayList .. so ....
		// ArrayList<Language> languages = LanguagesController.initLanguages();

		// we set english as default language of the app
		Language languageSelectedApp = languagesAvailable.get("english");
		Scanner reader = new Scanner(System.in);
		String command;

		while (true) {

			MenuController.mainMenu(languageSelectedApp.getTag());
			command = reader.next();

			if (command.equals(languageSelectedApp.getMessage().get("quit"))) {
				reader.close();
				break;

			} else if (command.equals(languageSelectedApp.getMessage().get("create"))) {
				UserController.runUsers(reader, users, languageSelectedApp);
				

			} else if (command.equals(languageSelectedApp.getMessage().get("login"))) {

				users = LoginController.validateUser(reader, users);

				if (UsersUtils.getValidatedUser(users) != null) {
					User userValidated = new User();
					userValidated = UsersUtils.getValidatedUser(users);

					ExpensesController.runExpenses(reader, userValidated);
					//System.out.println("expenses finshing...");
				}

			} else if (command.equals(languageSelectedApp.getMessage().get("language"))) {

				languageSelectedApp = LanguagesController.languageSelection(reader, languageSelectedApp,
						languagesAvailable);

			} else {
				System.out.println(
						"\nPlease, you have to write \"create\", \"login\" or \"quit\". ");
				System.out.println("Try another time ...\n");

			}

		}

	}

}
