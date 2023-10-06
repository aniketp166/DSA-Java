class ReverseNumber {

	public static void main1(String[] args) {

		int num = 1234;
		int rem, rev = 0;

		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}

		System.out.println(rev);
	}
	public static void main(String[] args) {
		int rev = 0;

		for (int num = 12345; num != 0; num = num / 10) {
			int rem = num % 10;
			rev = rev * 10 + rem;
		}
		System.out.println(rev);
	}
}