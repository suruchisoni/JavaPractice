package work;

public class SubstringOfString {

	public static void main(String[] args) {
		// print all substrings of Fun
		{
			String st = "fun", sub = null;

			for (int c = 0; c < st.length(); c++) {
				for (int i = 1; i <= st.length() - c ; i++) {
					sub = st.substring(c, c + i);
					System.out.println(sub);
				}

			}
		}
		// print ruc in suruchi
		{
			String st = "Suruchi", sub = null;

			sub = st.substring(2, 5);
			System.out.println(sub);

		}
	}
}
