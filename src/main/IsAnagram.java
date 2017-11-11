package main;

import java.util.*;

public class  IsAnagram
{
	public boolean test(String s1, String s2)
	{
	
    s1=s1.toLowerCase();
    s2=s2.toLowerCase();
    char[] c1 = s1.toCharArray();
    char[] c2 = s2.toCharArray();
    Arrays.sort(c1);
    Arrays.sort(c2);
    String sc1 = new String(c1);
    String sc2 = new String(c2);

    String CopyofSc1 = sc1.replaceAll("'", "");
    String CopyofSc2 = CopyofSc1.replaceAll(" ", "");
    String CopyofSc3 = sc2.replaceAll("'", "");
    String CopyofSc4 = CopyofSc3.replaceAll(" ", "");
     
    return CopyofSc3.equals(CopyofSc4);
	}
}