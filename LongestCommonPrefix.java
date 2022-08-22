package leetCode;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] palabras = { "Matias", "Mama", "Madera", "Marmol", "Marmota", "Miaaariana" };
		String prefix = longestCommonPrefix(palabras);

		if (prefix == "") {
			System.out.println("VACIO");
		} else {
			System.out.println(prefix);
		}
		
	}

	public static String longestCommonPrefix(String[] strs) {
		String aux = ""; 
		
		aux = strs[0];
		
		if(strs.length == 0 )
			return "";
		
		for(int i = 1; i < strs.length; i++) {
			while(strs[i].indexOf(aux) != 0) {
				aux = aux.substring(0, aux.length() - 1);
			}
		}

		return aux;
	}
}
