package Strings;

import java.util.Arrays;

public class StringOperations {
	
	private StringOperations(){

	}

	private static StringOperations so;

	static{
		so = new StringOperations();
	}

	public final static StringOperations getInstance(){
		return so;
	}

	int countVowels(String s){
		int vc = 0;
		String vowels = "AEIOUaeiou";
		for(int i = 0 ; i<s.length(); i++){
			char ch = s.charAt(i);
			if(vowels.indexOf(ch)>=0)
				vc++;
		}
		return vc;
	}
	
	int sumOfDigits(String s){
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch>='0' && ch<='9')
				sum = sum+(ch-48);
		}
		return sum;
	}
	
	int sumOfDigits2(String s){
		int sum = 0;
		String digits = "0123456789";
		for(int i = 0 ; i<s.length(); i++){
			char ch = s.charAt(i);
			int in = digits.indexOf(ch);
			if(in>=0)
				sum = sum+in;
		}
		return sum;
	}
	
	String converter(String s){
		String con = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch>='A' && ch<='Z')
				con = con+(char)(ch+32);
			else if(ch>='a' && ch<='z' )
				con = con+(char)(ch-32);
		}
		return con;
	}
	
	boolean palin(String s){
		int f = 0, l = s.length()-1;
		while(f<l){
			if(s.charAt(f) != s.charAt(l))
				return false;
			f++;
			l--;
		}
		return true;
	}
	
	void occurance(String s){
		char[] ch = s.toCharArray();
		int n = ch.length;
		for(int i=0 ; i<n; i++){
			int count = 1;
			for(int j=i+1; j<n; j++){
				if(ch[i] == ch[j]){
					count++;
					ch[j] = ch[n-1];
					j--;
					n--;
				}
			}
			System.out.println(ch[i]+" occurs "+count+" times");
		}
	}
	
	String removeDup(String s){
		char[] ch = s.toCharArray();
		char[] u = new char[s.length()];
		u[0] = ch[0];
		int k = 1;
		for(int i = 1; i<ch.length; i++){
			int j = i-1;
			while(j>=0 && ch[i]!=ch[j]){
				j--;
			}
			if(j==-1 || ch[i]==' ')
				u[k++] = ch[i];
		}
		String noDup="";
		for(int i=0; i<k; i++){
			noDup = noDup+u[i];
		}
		return noDup;
	}
	
	String repSeqOfChByStr(String s){
		char[] ch = s.toCharArray();
		String res =  "";
		for(int i=0 ; i<ch.length ; i++){
			int count = 1;
			int j = i+1;
			
			while(j<ch.length && ch[i] == ch[j]){
				count++;
				i++;
				j++;
			}
			if(count>1){
				while(count>0){
					res = res+"*";
					count--;
				}
			}
			else
				res = res+ch[i];
		}
		return res;
	}
	
	String capitalizeForm(String s){
		char[] ch = s.toCharArray();
		for(int i = 0; i<ch.length; i++){
			if(i==0 || ch[i-1] == ' '){
				if(ch[i]>='a' && ch[i]<='z')
					ch[i] = (char)(ch[i]-32);
			}
			else if(ch[i]>='A' && ch[i]<='Z')
				ch[i] = (char)(ch[i]+32);
		}
		return new String(ch);//we can convert the character array to string by passing the char[] c to string parameterized constructor i.e; String(c)
	}
	
	String lastLetterCap(String s){
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(i == ch.length-1 && ch[i] != ' '|| ch[i] != ' ' &&ch[i+1] == ' '){
				if(ch[i]>='a' && ch[i]<='z')
					ch[i] = (char)(ch[i]-32);
			}
			else if(ch[i]>='A' && ch[i]<='Z')
				ch[i] = (char)(ch[i]+32);
		}
		return new String(ch);
	}
	
	String revWord(String s){
		char[] ch = s.toCharArray();
		String res = "";
		for (int i = 0; i < ch.length; i++) {
			int k=i;
			while(i<ch.length && ch[i]!=' '){
				i++;
			}
			int j = i-1;
			while(j>=k){
				res = res+ch[j];
				j--;
			}
			if(i<ch.length)
				res = res+" ";
		}
		return res;
	}
	
	String swapFirstAndLastChrOfWord(String s){
		char[] ch = s.toCharArray();
		int f=0;
		for (int i = 0; i < ch.length; i++) {
			
			if(i==0 && ch[i] != ' ' || ch[i] != ' ' && ch[i-1] == ' '){
				f=i;
			}
			else if(i == ch.length-1 && ch[i] != ' '|| ch[i] != ' ' &&ch[i+1] == ' '){
				char temp = ch[f];
				ch[f] = ch[i];
				ch[i] = temp;
			}
		}
		return new String(ch);
	}
	
	String revSentence(String s){
		char[] ch = s.toCharArray();
		String res = "";
		for(int i=ch.length-1; i>=0; i--){
			int k=i;
			while(i>=0 && ch[i]!=' '){
				i--;
			}
			int j = i+1;
			while(j<=k){
				res = res+ch[j];
				j++;
			}
			res = res+" ";
		}
		return res;
	}
	
	int countOfWords(String s){
		char[] ch = s.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			if(i==0 && ch[i] != ' ' || ch[i] != ' ' && ch[i-1] == ' ')
				count++;
		}
		return count;
	}
	
	void frequency(String s){
		int[] count = new int[128];
		
		for(int i=0 ; i<s.length(); i++){
			count[s.charAt(i)]++;
		}
		
		for (int i = 0; i < count.length; i++) {
			if(count[i]!=0)
				System.out.println((char)i+" "+count[i]);
		}	
	}
	
	void noOfVowelsInWords(String s){
		char[] ch = s.toCharArray();
		String vowels = "AEIOUaeiou";
		
		for (int i = 0; i < ch.length; i++) {
			int count=0;
			String w = "";
			while(i<ch.length && ch[i] != ' ' )
			{
				w = w+ch[i];
				if(vowels.indexOf(ch[i])>=0)
					count++;
				i++;
			}
			if(w.length()>0)
				System.out.println(w+" have "+count+" vowels");
		}
	}
	
	boolean isSubstr(String s1, String s2){
		char[] ch = s1.toCharArray();
		char[] ss = s2.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int j = 0 ,count = 0;
			while(i<ch.length && j<ss.length && ch[i] == ss[j] && ch[i] != ' '){
				count++;
				i++;
				j++;
			}
			if(count>0)
				i--;
			if(count == ss.length)
				return true;
		}
		return false;
	}
	
	int countSubStr(String s1, String s2){
		char[] ch = s1.toCharArray();
		char[] ss = s2.toCharArray();
		int ssTimes = 0;
		for (int i = 0; i < ch.length; i++) {
			int j = 0 ,count = 0;
			while(i<ch.length && j<ss.length && ch[i] == ss[j] && ch[i] != ' '){
				count++;
				i++;
				j++;
			}
			if(count>0)
				i--;
			if(count == ss.length)
				ssTimes++;
		}
		return ssTimes;
	}
	
	boolean isWord(String s1, String s2){
		char[] ch = s1.toCharArray();
		char[] ss = s2.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			int j = 0, count = 0;
			if(i==0 && ch[i]!=' ' || ch[i-1] == ' '){
				while(i<ch.length && j<ss.length && ch[i] == ss[j] && ch[i] != ' '){
					count++;
					i++;
					j++;
				}
				if(count>0)
					i--;
				if(i == ch.length-1 && count == ss.length || ch[i+1] == ' ' && count == ss.length  )
					return true;
			}
		}
		return false;
	}
	
	int countWord(String s1, String s2){
		char[] ch = s1.toCharArray();
		char[] ss = s2.toCharArray();
		int c = 0;
		for (int i = 0; i < ch.length; i++) {
			int j = 0, count = 0;
			if(i==0 && ch[i]!=' ' || ch[i-1] == ' '){
				while(i<ch.length && j<ss.length && ch[i] == ss[j] && ch[i] != ' '){
					count++;
					i++;
					j++;
				}
				if(count>0)
					i--;
				if(i == ch.length-1 && count == ss.length || ch[i+1] == ' ' && count == ss.length  )
					c++;
			}
		}
		return c;
	}
	
	int indexOfSubStr(String s1, String s2){
		char[] ch = s1.toCharArray();
		char[] ss = s2.toCharArray();
		int index = -1, flag = 0;
		for (int i = 0; i < ch.length; i++) {
			int j = 0 ,count = 0;
			while(i<ch.length && j<ss.length && ch[i] == ss[j] && ch[i] != ' '){
				count++;
				i++;
				j++;
			}
			if(count>0)
				i--;
			if(count == ss.length){
				index = i-(count-1);
				flag++;
			}
			if(flag == 1)
				break;
		}
		return index;
	}
	
	boolean isPangram(String s){
		if(s.length()<26)
			return false;
		int[] count = new int[26];
		
		for(int i=0; i<s.length(); i++){
			char ch = s.charAt(i);
			if(ch >= 'A' && ch <= 'Z')
				count[ch-65]++;
			else if(ch >= 'a' && ch <= 'z')
				count[ch-97]++;
		}
		
		for (int i = 0; i < count.length; i++) {
			if(count[i] == 0)
				return false;
		}
		return true;
	}
	
	boolean isPangram2(String s){
		if(s.length()<26)
			return false;
		s = s.toLowerCase();
		for(char c = 'a'; c<='z' ; c++){
			if(s.indexOf(c)==-1)
				return false;
		}
		return true;
	}
	
	static int[] frequency2(String s){
		int[] count = new int[26];
		for(int i = 0 ; i<s.length() ; i++){
			char ch = s.charAt(i);
			if(ch >= 'A' && ch <= 'Z')
				count[ch-65]++;
			else if(ch >= 'a' && ch <= 'z')
				count[ch-97]++;
		}
		return count;
	}
	
	boolean isAnagram(String s1, String s2){
		int[] a1 = frequency2(s1);
		int[] a2 = frequency2(s2);
		for(int i = 0; i < 26; i++){
			if(a1[i] != a2[i])
				return false;
		}
		return true;	
	}
	
	
	boolean isAnagram2(String s1, String s2){
		s1 = s1.replaceAll(" ", "");
		s2 = s2.replaceAll(" ", "");
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		return Arrays.equals(c1, c2);
	}
	
	int makeAnagram(String s1, String s2){
		int[] c1 = frequency2(s1);
		int[] c2 = frequency2(s2);
		
		int count = 0;
		
		for (int i = 0; i < 26; i++) {
			int d = c1[i] - c2[i];
			if(d<0)
				d = d*-1;
			count = count+d;
		}
		return count;
	}
}
