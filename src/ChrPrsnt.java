import java.util.Scanner;

public class ChrPrsnt {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s=in.next();
		boolean ans=false;
		for(int i=0; i<s.length();i++){
			char c=s.charAt(i);
			if(c=='e'){
				ans=true;
				break;
			}
		}
			System.out.println(ans);

	}

}
