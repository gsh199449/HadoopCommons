package com.gs.hbase;

import java.io.IOException;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.HConnection;
import org.junit.Test;

import com.gs.hbase.connection.HConnectionPool;
import com.gs.hbase.session.HSession;

import junit.framework.TestCase;

public class TestPool extends TestCase {

	@Test
	public void test() throws IOException, Exception{
		/*Configuration conf = new Configuration();
		conf.set("hbase.zookeeper.property.clientPort", "2181");
		conf.set("hbase.zookeeper.quorum", "gs-pc");
		conf.set("hbase.master", "gs-pc:60000");
		GenericObjectPoolConfig cfg = new GenericObjectPoolConfig();
		cfg.setMaxTotal(3);
		cfg.setMaxWaitMillis(2000);
		cfg.setTestOnBorrow(true);
		HConnectionPool pool = new HConnectionPool(conf, cfg);
		System.out.println(pool.borrowObject().getTable("page").get(new Get("http://3g.163.com/news/10/0104/10/5S66BASN000125LI.html".getBytes())));
		HConnection conn = pool.borrowObject();
		conn.close();
		pool.returnObject(conn);
		try {
			pool.borrowObject();
			pool.borrowObject();
			pool.borrowObject();
			pool.borrowObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(pool.getDestroyedCount());
		HSession s = new HSession(conn);
		//s.save(new PagePOJO("111",1,"aaaaaaa","2222222"));
		//System.out.println(pool.getCreatedCount());
*/	}
}
