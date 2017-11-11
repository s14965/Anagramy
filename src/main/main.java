package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class main {
	public static void main(String[] args) 
	{
		
		try 
		{
//			File file = new File("wordlist.txt");
//			FileReader fileReader = new FileReader(file);
//			BufferedReader bufferedReader = new BufferedReader(fileReader);
//			StringBuffer stringBuffer = new StringBuffer();
//			String line;
//			while ((line = bufferedReader.readLine()) != null) 
//			{
//				stringBuffer.append(line);
//				stringBuffer.append("\n");
//			}
//			fileReader.close();
			FileInputStream fis = new FileInputStream("wordlist.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		 	String line;
		 	List<String> wordlist = new ArrayList<String>();
			
		 	while ((line = br.readLine()) != null) 
		 		{
		 			wordlist.add(line);
		 		}
		 br.close();
			System.out.println(wordlist.toString());
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
