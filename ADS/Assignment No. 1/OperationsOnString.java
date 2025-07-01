import java.util.*;

class OperationsOnString
{
public static void main(String args[])
{
String s1 = "listen";
String s2 = "silent";	
	
	if(s1.length() == s2.length())
	{
	char[] c1 = s1.toCharArray();
	char[] c2 = s2.toCharArray();
	
	Arrays.sort(c1);
	Arrays.sort(c2);
	
	boolean isEqual = Arrays.equals(c1 , c2);
	
	if(isEqual)
	{
		System.out.println(s1 + " " + "and" + " " + s2 + " "+"are anagrams");
	}
	else
	{
		System.out.println(s1 + " " + "and" + " " + s2 + " " + "are not anagrams");
	}
	
	}
	else
	{
		System.out.println("Strings are not an Anagram");
	
	}
	
int vowels = 0 , consonants = 0;

String large = "Practice makes a man perfect";

String longest = Arrays.stream(large.split(" "))
                .max(Comparator.comparingInt(String::length))
                .orElse(null);
        System.out.println(longest);

for(int i = 0 ; i < large.length() ; i++)
{
	char ch = large.charAt(i);
	
 if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
 {
 vowels++;
 }
 else
 {
 consonants++;
 }
}
System.out.println("Vowels : " + vowels + " " + "Consonants: " + consonants);
}
}