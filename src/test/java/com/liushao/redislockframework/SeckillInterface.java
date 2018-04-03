package com.liushao.redislockframework;


public interface SeckillInterface {
	
	/**
	 * 秒杀方法. <br/>
	 *
	 * @param arg1
	 * @param arg2
	 */
	@CacheLock(lockedPrefix="TEST_PREFIX")//cacheLock注解可能产生并发的方法
	public void secKill(String arg1,@LockedObject Long arg2);//最简单的秒杀方法，参数是用户ID和商品ID。可能有多个线程争抢一个商品，所以商品ID加上LockedObject注解
}
