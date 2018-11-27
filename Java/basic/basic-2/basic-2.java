public class Main {
	public static void main(String[] args) {
		int num1,num2,num3,num4,num5;
		for (num1 = 0; num1 < 2; num1++) {
			for (num2 = 0; num2 < 2; num2++) {
				for (num3 = 0; num3 < 2; num3++) {
					for (num4 = 0; num4 < 2; num4++) {
						for (num5 = 0; num5 < 2; num5++) {
							System.out.println((String)num1 + (String)num2 + (String)num3 + (String)num4 + (String)num5);
						}
					}
				}
			}
		}
	}
}