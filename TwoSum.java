package leetCode;

public class TwoSum {

	/*
	 * ********************* EXPLANATION ***********************
	 * 
	 * Given an array of integers nums and an integer target, return indices of the
	 * two numbers such that they add up to target.
	 * 
	 * You may assume that each input would have exactly one solution, and you may
	 * not use the same element twice.
	 * 
	 * You can return the answer in any order.
	 */

	public static void main(String[] args) {
		int nElementos = (int) (Math.random() * 70);
		int nums[] = new int[nElementos];
		int numBuscado = 13;

		for (int i = 0; i < nums.length; i++) {
			int nRandom = generateNRandom();
			nums[i] = nRandom;
		}
		int x[] = twoSum(nums, numBuscado);

		System.out.println();
		for (int i : nums) {
			System.out.print(i + " ");
		}

		System.out.println();

		if (x != null) {
			for (int j : x) {
				System.out.print(j + " ");
			}
		}

		if (x != null)
			System.out.println("\nNUMEROS GUARDADOS EN LAS POSICIONES: " + x[0] + " y " + x[1] + " = " + nums[x[0]]
					+ " - " + nums[x[1]]);

	}

	public static int generateNRandom() {
		int nRandom = (int) (Math.random() * 18);
		if (nRandom == 0)
			return generateNRandom();

		return nRandom;
	}

	public static int[] twoSum(int[] nums, int target) {
		int vector[] = new int[2];

		for (int i = (nums.length - 1); i >= 0; i--) {
			int aux = i;
			for (int k = 0; k < i; k++) {
				if (nums[aux] + nums[k] == target) {
					vector[0] = aux;
					vector[1] = k;
					return vector;
				}
			}
		}

		return null;
	}
}
