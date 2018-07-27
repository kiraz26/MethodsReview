package strings;

public class StringsUtil {

	public boolean isUpperCase(String str) {
		boolean result = false;
		if (str.equals(str.toUpperCase())) {
			result = true;
		}
		return result;

	}

	public boolean isLowerCase(String str) {
		boolean result = false;
		if (str.equals(str.toLowerCase())) {
			result = true;
		}
		return result;

	}

	public boolean isFirstCapital(String str) {
		boolean result = false;
		String first = str.substring(0, 1);
		String rest = str.substring(1);
		if (isLowerCase(rest) && isUpperCase(first)) {
			result = true;
		}
		return result;

	}
	
	public boolean getPassword() {
		return false;
	}
	
	
}
