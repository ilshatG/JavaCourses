public class Calculate{
	public static void main( String[] args){
			System.out.println("Calculating...");
			int first =Integer.valueOf(args[0]);
			int second =Integer.valueOf(args[1]);
			int result = first+second;
			System.out.println("Result is " + result);
	}
}