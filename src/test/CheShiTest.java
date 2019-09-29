package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import dao.IOrderDao;
import entry.Order;

public class CheShiTest {
	
	
	@Test
	public void testQuerryOrder() throws IOException {
		 //首先解析全局的xml文件
		InputStream input = new FileInputStream("config/SqlMapConfig.xml");
		//创建SqlSession工厂对象
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(input);
		//创建SqlSession对象
		SqlSession session = factory.openSession();
		//映射文件，获取到接口的对象
		IOrderDao orderDao = session.getMapper(IOrderDao.class);
		//通过对象使用里面的方法
		List<Order> orderList = orderDao.querryOrder();
		/*
		 * for(Order order : orderList) { System.out.println(order.getUser()); }
		 */
		input.close();
	}

}
