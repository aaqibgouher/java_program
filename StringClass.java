class Main{
	public static void main(String args[]){
		String firstname = new String("Aaqib");
		String lastname = new String("Gouher");

		// concat
		System.out.println(firstname+lastname);

		// lowercase
		System.out.println(firstname.toLowerCase());

		// replace occurance of first para with second para
		String str = firstname.replace('a', 'b');
		System.out.println(str);

		if(firstname.equals(lastname)) System.out.println("equal");
		else System.out.println("not equal");

		// length of string
		System.out.println(firstname.length());

		// char at nth position
		System.out.println(firstname.charAt(2));

		// compare two string
		if(firstname.compareTo(lastname) < 0) System.out.println("firstname came first");
		else System.out.println("lastname came first");

		firstname = "gouher";
		System.out.println(firstname);
	}
}