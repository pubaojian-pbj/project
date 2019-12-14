package CollectionsTest;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisTest {
	
	public void testJedis() {
		//Jedis jedis = testPool().getResource();
		System.out.println("111");
		 Jedis jedis = new Jedis("localhost", 6379); //连接Redis
		// jedis.auth("password");//如果需要密码
		int i = 0;
		try {
			long start = System.currentTimeMillis();
			while (true) {
				long end = System.currentTimeMillis();
				if (end - start >= 1000) {
					break;
				}
				i++;
				jedis.set("test" + i, i + "");
			}
		} finally {
			jedis.close();
		}
		System.out.println("redis每秒操作" + i + "次");
	}
	public static void main(String[] args)
	{
		System.out.println("111");
		JedisTest test = new JedisTest();
		System.out.println("112");
		test.testJedis();
		System.out.println("113");
	}

//	private JedisPool testPool() {
//		JedisPoolConfig poolCfg = new JedisPoolConfig();
//		poolCfg.setMaxIdle(50);
//		poolCfg.setMaxTotal(100);
//		poolCfg.setMaxWaitMillis(20000);
//		JedisPool pool = new JedisPool(poolCfg, "localhost");
//		Jedis jedis = pool.getResource();
//		// jedis.auth("password");
//		return pool;
//	}
}
