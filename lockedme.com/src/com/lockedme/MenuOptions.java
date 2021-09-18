package com.lockedme;

public class MenuOptions {
public static void welcomeScreen(String appName,String developerName)
{
	String  name=String.format("**Welcome to %s.com\n"
			+ " **This app was developed by %s\n"+"***********\n",appName,developerName);
	System.out.println(name);
	String functions="You can use this application to :-\n"
			+"Retrieve all the file names in the \"Main\"  Folder\n"
			+"search,add or delete files  in \"Main\"  Folder\n"
			+"\n***********Please be careful to ensure the correct file name"
			+ " is provided for searching or deleting the files";
	System.out.println(functions);	
}
	public static void displayMenu()
	{
		String menu="\n\n*****select any option number from below  and press enter\n\n"
				+"Enter option 1 to load files inside the folder\n"
				+"Enter option 2 for business operation\n"
				+"enter option 3 for exit\n";
		System.out.println(menu);
}

	public static void displayMenuOption() {
		String fileMenu="\"Enter the file handling operations\"\r\n"
				+ "		\"option 1 for creating folder\"\r\n"
				+ "		\"option 2 for  creating files inside folder\"\r\n"
				+ "		\"option 3 for deleting files inside the folder\"\r\n"
				+ "		\"option 4 for searching files inside the folder\""
				+" \"option 5 for return to main funtion\"";
		System.out.println(fileMenu);
	}
	
}

