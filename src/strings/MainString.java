package strings;

public class MainString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// how to check if is it all upper case
		String str = "WASHINGTON";
		if (str.equals(str.toUpperCase())) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		StringsUtil strUtil = new StringsUtil();
		boolean check = strUtil.isUpperCase("YAprak");
		System.out.println(check);
		
		// how to check first character is upper case the others are lower case
		String str2 = "Computer";
		String first= str2.substring(0, 1);
		String afterFirst = str2.substring(1);
		if(first.equals(first.toUpperCase()) && afterFirst.equals(afterFirst.toLowerCase())) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		strUtil.isFirstCapital("Noruyon?");
		check = strUtil.isFirstCapital("Noruyon?");
		System.out.println(check);
		

	}

}
