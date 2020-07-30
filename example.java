package com.project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class example {
	public void SortFileNames() {
			File fileDir = new File("D:\\PhaseOneProject");
			if(fileDir.isDirectory()){
				List<String> listFile = Arrays.asList(fileDir.list());
				System.out.println("Listing files unsorted");
				for(String s:listFile){
					System.out.println(s);
				}
				Collections.sort(listFile);
				System.out.println("---------------------------------------");
				System.out.println("Sorting by filename in ascending order");
				for(String s:listFile){
					System.out.println(s);
				}
				System.out.println("---------------------------------------");
				System.out.println("Sorting by filename in descending order");
				Collections.sort(listFile,Collections.reverseOrder());
				for(String s:listFile){
				System.out.println(s);
				}

			}
			else{
				System.out.println(fileDir.getAbsolutePath() + " is not a directory");
			}

		}

	public void addFile()  
	{      
	File file = new File("D:\\PhaseOneProject\\demo.txt");   
	boolean result;  
	try   
	{  
	result = file.createNewFile();    
	if(result)        
	{  
	System.out.println("file added "+file.getCanonicalPath()); 
	}  
	else  
	{  
	System.out.println("File already exist at location: "+file.getCanonicalPath());  
	}  
	}   
	catch (IOException e)   
	{  
	e.printStackTrace();     
	}         
	}   
	
public void deleteFiles() {
	{ 
        try
        { 
            Files.deleteIfExists(Paths.get("D:\\PhaseOneProject\\ apple.txt")); 
        } 
        catch(NoSuchFileException e) 
        { 
            System.out.println("No such file/directory exists"); 
        } 
        catch(DirectoryNotEmptyException e) 
        { 
            System.out.println("Directory is not empty."); 
        } 
        catch(IOException e) 
        { 
            System.out.println("Invalid permissions."); 
        } 
          
        System.out.println("Deletion successful."); 
    } 
} 
public void SearchFile() { 
	      File dir = new File("D:\\PhaseOneProject");
	      FilenameFilter filter = new FilenameFilter() {
	         public boolean accept (File dir, String name) { 
	            return name.startsWith("b");
	         } 
	      }; 
	      String[] children = dir.list(filter);
	      if (children == null) {
	         System.out.println("Either dir does not exist or is not a directory"); 
	      } else { 
	         for (int i = 0; i< children.length; i++) {
	            String filename = children[i];
	            System.out.println(filename);
	         } 
	      } 
	   } 
	}
    
