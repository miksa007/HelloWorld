public class Terve {
	public static void main(String[] args) {
		System.out.println("Terve gitHub");
		System.out.println("Mika was here");
		System.out.println("Martti was here");
		System.out.println("Varokaa niitä Martin koodeja");
		System.out.println("Mika was here 2014");
		terve("Terve vaan metodista");
	}

	/**
	 * created by otula12
	 * 
	 * @param viesti
	 */
	public static void terve(String viesti) {
		System.out.println(viesti);
	}

	public static int max(int one, int two) {
		if (one > two)
			return one;
		else
			return two;
	}
}
