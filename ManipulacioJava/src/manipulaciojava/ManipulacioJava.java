package manipulaciojava;

public class ManipulacioJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "Java és genial";
		
		System.out.println(text.length());
		System.out.println(text.charAt(3));
		System.out.println(text.toUpperCase());
		System.out.println(text.toLowerCase()); //Syso+ctrl+space
		System.out.println(text.substring(5,7));
		System.out.println(text.indexOf("genial"));
		System.out.println(text.replace("Java", "TypeScript"));
		
		
	}

}
