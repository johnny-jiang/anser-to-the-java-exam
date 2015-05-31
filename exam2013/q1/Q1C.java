package exam2013.q1;

public class Q1C {
	public int sumRange(int paramenter1, int paramenter2) {
		if (paramenter2 < paramenter1) {
			System.out.println("error");
			return 0;
		} else {
			int sum = 0;
			for (int i = paramenter1; i < paramenter2; i++)
				sum += i;
			return sum;
		}
	}

	public int sumRange(int paramenter1, int paramenter2, boolean paramenter3) {
		if (paramenter3 == true)
			return sumRange(paramenter1, paramenter2);
		else
			return sumRange(paramenter1 + 1, paramenter2 - 1);
	}

}
