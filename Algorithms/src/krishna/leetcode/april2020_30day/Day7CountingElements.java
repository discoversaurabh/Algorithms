package krishna.leetcode.april2020_30day;

/**
 * Given an integer array arr, count element x such that x + 1 is also in arr.
 * 
 * If there're duplicates in arr, count them seperately.
 * 
 * Input: arr = [1,2,3] Output: 2 Explanation: 1 and 2 are counted cause 2 and 3
 * are in arr.
 * 
 * Input: arr = [1,1,3,3,5,5,7,7] Output: 0 Explanation: No numbers are counted,
 * cause there's no 2, 4, 6, or 8 in arr.
 * 
 * Input: arr = [1,3,2,3,5,0] Output: 3 Explanation: 0, 1 and 2 are counted
 * cause 1, 2 and 3 are in arr.
 * 
 * Input: arr = [1,1,2,2] Output: 2 Explanation: Two 1s are counted cause 2 is
 * in arr.
 * 
 * Constraints : 1 <= arr.length <= 1000 0 <= arr[i] <= 1000
 * 
 * @author krishna_kumar
 *
 */
public class Day7CountingElements {
	public int countElements(int[] arr) {
		int count = 0;
		boolean[] elementCount = new boolean[1001];
		for (int element : arr) {
			elementCount[element] = true;
		}
		for (int element : arr) {
			if (element < 1000) {
				if (elementCount[element + 1]) {
					count++;
				}
			}
		}
		return count;
	}
}
