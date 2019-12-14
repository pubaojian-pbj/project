/**
 * 
 */
package GC;

/**
 * @author pubaojian 2019年4月3日
 *
 */
public class ReferenceCountingGC {
		public Object instance = null;
		private static final int _1MB = 1024*1024;
		/*
		 * 这个成员变量的唯一意义就是占点内存，以便能在GC日志中看清是否被回收内存
		 */
		private byte[] bigSize = new byte[2*_1MB];
		public static void testGC() {
			ReferenceCountingGC obj1 = new ReferenceCountingGC();
			ReferenceCountingGC obj2 = new ReferenceCountingGC();
			obj1.instance = obj2;
			obj2.instance = obj1;
			
			System.gc();
		}
}
