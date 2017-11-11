package main;

import java.io.BufferedReader;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class main {
	public static void main(String[] args) 
	{
		try 
		{
			//---------------------------
			FileInputStream fis = new FileInputStream("wordlist.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		 	String line;
		 	List<String> wordlist = new ArrayList<String>();
			
		 	while ((line = br.readLine()) != null) 
		 		{
		 			wordlist.add(line);
		 		}
		 br.close(); 
		 
		 //-----------------------
		 List<String> AnagramList = new ArrayList<String>(); 
		 List<String> ToDeleteList = new ArrayList<String>();
		 String holdit = "";								
		 int longestAnagram = 0;
		 int longestAnagramIndex = 0;
		 IsAnagram t = new IsAnagram();						
		 
		 while(wordlist.size()>0) 							
		 {	
			 int lenght=0;
			 for(String word: wordlist) 		
			 {
				 if(t.test(wordlist.get(0), word)) 
				 {	
					 lenght++;
					 holdit += word + ", "; 	
					 ToDeleteList.add(word);
				 }
			 }
			 wordlist.removeAll(ToDeleteList);
			 ToDeleteList.clear();
			 AnagramList.add(holdit); 						
			 System.out.println(holdit);
			 holdit = "";									
			 
			 if(lenght>longestAnagram)				
			 {
				 longestAnagram = lenght;				
				 longestAnagramIndex = AnagramList.size()-1;
			 }
		 }
		 System.out.println("------------------");
		 System.out.println(AnagramList.size());
		 System.out.println(AnagramList.get(longestAnagramIndex));
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
