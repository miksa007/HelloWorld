import java.util.Scanner;

public class Terve {
	public static void main(String[] args) {
		System.out.println("Terve gitHub");
		System.out.println("Mika was here");
		System.out.println("Martti was here");
		System.out.println("Mika was here 2014");
		System.out.println("Moi");
		System.out.println("Moi taas 2-4-2014");
		System.out.println("Update 28.1.2016");
	}

	/**
	 * created by otula12
	 * 
	 * @param viesti
	 */
	public static void terve(String viesti) {
		System.out.println(viesti);
	}
	public static String lueTeksti(){
		Scanner lukija=new Scanner(System.in);
		System.out.println("Anna teksti");
		String teksti=lukija.nextLine();
		return teksti;
	}

	public static int max(int one, int two) {
		if (one > two)
			return one;
		else
			return two;
	}
	public static int min(int one, int two) {
		if (one < two)
			return one;
		else
			return two;
	}
}
