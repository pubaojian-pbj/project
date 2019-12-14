/**
 * 
 */
package test1;

import java.util.Arrays;

/**
 * @author pubaojian 2019年4月18日
 *
 */
public class finalTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final int[] arr = {5,6,12,9};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		arr[2]=8;
		System.out.println(Arrays.toString(arr));
		
	}

}
