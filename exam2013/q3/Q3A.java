package exam2013.q3;


public class Q3A {

	public String moveCharToEnd(String inText, char c) {
		if (inText.isEmpty())
			return "";
		else {
			if (inText.charAt(0) == c)
				return moveCharToEnd(inText.substring(1, inText.length()), c)
						+ c;
			else
				return c
						+ moveCharToEnd(inText.substring(1, inText.length()), c);
		}
	}


	public static void main(String[] args) {

	}
}
