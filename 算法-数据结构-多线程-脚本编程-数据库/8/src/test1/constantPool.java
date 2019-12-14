/**
 * 
 */
package test1;

/**
 * @author pubaojian 2019年7月25日
 *
 */
public class constantPool {
	public static void main(String[] args) {
		String str1 = new StringBuilder("第四").append("范式").toString();
		System.out.println(str1.intern()==str1);
		String str2 = new StringBuilder("ja").append("va").toString();
		System.out.println(str2.intern()==str2);
	}
}
