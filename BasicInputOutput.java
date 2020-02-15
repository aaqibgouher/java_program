import java.io.DataInputStream;
class Main {
 	public static void main(String args[]){
 		try{
			int n;
			DataInputStream input = new DataInputStream(System.in);

	    	System.out.println("Enter a integer");
	    	n = Integer.parseInt(input.readLine());
	    	System.out.println("You have entered "+n);
 		}catch(Exception e){
 			System.out.println("something is wrong");
 		}
 	}
}