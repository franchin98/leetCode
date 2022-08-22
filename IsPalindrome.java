package leetCode;

public class IsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2342432;

		if(isPalindrome(x)) {
			System.out.println("EL NÚMERO: " + x  + " ES CAPICÚA.");
		} else {
			System.out.println("EL NÚMERO: " + x + " NO ES CAPICÚA");
		}
	}
	
	public static boolean isPalindrome(int x) {
		Integer n = x;
		int j = (n.toString().length() - 1 ) ;
		
		for(int i = 0; i < n.toString().length() ; i++) {
			if(n.toString().charAt(i) != n.toString().charAt(j)) {
				return false;
			}
			j--;
		}

		return true;
	}
}
