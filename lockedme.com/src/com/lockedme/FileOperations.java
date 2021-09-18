package com.lockedme;
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class FileOperations  {
	
	public static void createMainFolder()
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("\nenter the path where u want create directory\n");
		String path=sc.nextLine();
		File f1=new File(path);
		if(f1.exists())
		{
			System.out.println("Directory already exists.....\n");
		}else
		{
			System.out.println("Directory doesnt exists creating new directory");
		boolean success=f1.mkdirs();
		if(success)
		{
			System.out.println("Suuccessfully created new directory:" +path);
		}else {
			System.out.println("falied to create directory"+path);
		}
			
		}
		sc.close();
			
	}
	public static void displayAllFiles()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("\nenter the folder path to display all files in unsorted order");
		String path=s.next();
		File f=new File(path);
		if(f.exists())
		{
			File[] files=f.listFiles();
			System.out.println("all the files including folders\n");
			System.out.println("-----------------------------------");
			if(files.length==0)
			{
				System.out.println("folder empty");
			}
			for(File file:files)
			{
				System.out.println(file.getName());
				
			}
			/*FileFilter fileFilter=new FileFilter()
					{
				public boolean accept(File file)
				{
					return !file.isDirectory();
				}
					};
					files=f.listFiles(fileFilter);*/
					System.out.println("\nAfter sorting by name");
					 
			Arrays.sort(files,new Comparator<Object>()
					{

			
				public int compare(Object f1, Object f2) {
				
					 	return((File)f1).getName().compareTo(((File)f2).getName());
				}
					});
			for(File file:files)
			{
				System.out.println(file.getName());
			}
		}
		else {
			System.out.println("directory doesnot exits");
		}
		s.close();
			
				
			
	
		
	}
	
	public static void createFile()
	{
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the path where u want to create   file:");
		String filename=sc.next();
		System.out.println("enter the file name u want to create");
		String file=filename+"/"+sc.next();
		File f=new File(file);
		if(f.createNewFile())
		{
			System.out.println("file created in the folder\n"+f.getName());
		}
		else
		{
			System.out.println("file already exists infile directory");
		}
		sc.close();
		}
		catch(IOException e)
		{
			System.out.println("file not created"+e);
		}
	
	
	}
	public static void deleteFile()
	{
		try
		{
			Scanner s=new  Scanner(System.in);
			System.out.println("enter the path where u want delete the file");
			String path= s.next();
			System.out.println("enter the file name u want to delete from folder");
			String fil=path+"/"+s.next();
			File f=new File(fil);
		 if(f.delete())
		 {
			 System.out.println(f +"\n file got deleted");
		 }
		 else 
		 {
			 System.out.println("file not deleted");
		 }
		 s.close();
;		}
		catch(Exception e)
		{
			System.out.println("no such file found");
			e.printStackTrace();
		}
		
	}
	public static void searchFile()
	{
		
			System.out.println("Enter the folder path where u wnat to search file");
			Scanner s1=new Scanner(System.in);
			String path=s1.next();
			System.out.println("enter the file name u want search");
			String f=s1.next();
			File file=new File(path);
			String[] list=file.list();
			int flag=0;
			if(list==null) {
				
			
				System.out.println("Empty directory");
			}
			else{
				for(int i=0;i<list.length;i++)
				{
					String filename=list[i];
					if(filename.equalsIgnoreCase(f)) {
						System.out.println(f+"\n found");
						flag=1;
					}
				}
			}
			if(flag==0)
			{
				System.out.println("File not found");
			}
			s1.close();
		}
}

		
		
		
	
	


