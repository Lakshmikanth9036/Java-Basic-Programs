package twoDimensionalArray;

public class TwoDArrayOperations {
	
	private static TwoDArrayOperations  to = null;
	
	private TwoDArrayOperations(){
		
	}
	
	static{
		to = new TwoDArrayOperations();
	}
	
	public static final TwoDArrayOperations getInstance(){
		return to;
	}

}
