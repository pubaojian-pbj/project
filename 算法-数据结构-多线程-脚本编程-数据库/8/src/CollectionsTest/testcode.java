/**
 * 
 */
package CollectionsTest;

/**
 * @author pubaojian 2019年2月22日
 *
 */
public class testcode {
//		private int m;
//		public int inc(){
//			return m+1;
//		}
		public int inc()
		{
			int x;
			try {
				x=1;
				return x;
			} catch (Exception e) {
				x=2;
				return x;
			}finally {
				x=3;
			}
		}
		public static void main(String[] args)
		{
			
		}
		
		
		
//	public static void main(String[] args)
//    {
//        testcode test = new testcode();
//        System.out.println(test.fun());
//    }

//    public int fun()
//    {
//        int i = 10;
//        try
//        {
//            //doing something
//
//            return i;
//        }catch(Exception e){
//            return i;
//        }finally{
//            i = 20;
//        }
//    }
//    public StringBuilder fun()
//    {
//        StringBuilder s = new StringBuilder("Hello");
//        try
//        {
//            //doing something
//            s.append("Word");
//
//            return s;
//        }catch(Exception e){
//            return s;
//        }finally{
//            s.append("finally");
//        }
//    }
//	到底返回值变不变可以简单的这么记忆：当finally调用的任何可变API，会修改返回值；当finally调用任何的不可变API，对返回值没有影响。
//
//	总结一下：其实return与finally并没有明显的谁强谁弱。在执行时，是return语句先把返回值写入但内存中，然后停下来等待finally语句块执行完，
//	return再执行后面的一段。

}
