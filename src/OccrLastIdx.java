import java.util.Scanner;

public class OccrLastIdx {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s=in.nextLine();
		int j=0;
		for(int i=s.length()-1;i!=0;i--){
			char c=s.charAt(i);
			if(c=='o'){
				j=i;
				break;
			}
		}
		System.out.println("Last occurrence of 'o' character is at index "+j);
	}

}
