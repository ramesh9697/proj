

package com.lockedme;
import java.util.Scanner;

public class OptionHandling 
{
	public static void handlingOptions ()
	{
		Scanner sc=new Scanner(System.in);
		MenuOptions.displayMenu();
		int selection=sc.nextInt();
		switch(selection)
		{
		case 1:
			FileOperations.displayAllFiles();
			//displayAllFiles();
			break;
		case 2:
			MenuOptions.displayMenuOption();
			int result=sc.nextInt();
			switch(result)
			{
			case 1:
				FileOperations.createMainFolder();
				//createMainFolder();
				break;
			case 2:
				FileOperations.createFile();
				//createFile();
				break;
			case 3:
				FileOperations.deleteFile();
				//deleteFile();
				break;
			case 4:
				FileOperations.searchFile();
				//searchFile();
				break;
			case 5:
	                 handlingOptions();
				break;
			default:
				System.out.println("entered wrong options");
			
			}break;
		case 3:
			System.out.println("Program exited successfully.");
			//sc.close();
			System.exit(0);
			break;
				
			}
		sc.close();
		}
		
		
	}
	



