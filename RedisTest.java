package redisTest;

import redis.clients.jedis.Jedis;

public class RedisTest {

	/**
	 * java连接redis
	 * @param args
	 */
	public static void main(String[] args) {
		//连接本地的 Redis 服务
        Jedis jedis = new Jedis("localhost");
        System.out.println("连接成功");
        //查看服务是否运行
        System.out.println("服务正在运行: "+jedis.ping());
        // 获取存储的数据并输出
        System.out.println("redis 存储的字符串为: "+ jedis.get("testStr"));
	}

}
