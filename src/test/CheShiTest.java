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
		 //���Ƚ���ȫ�ֵ�xml�ļ�
		InputStream input = new FileInputStream("config/SqlMapConfig.xml");
		//����SqlSession��������
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(input);
		//����SqlSession����
		SqlSession session = factory.openSession();
		//ӳ���ļ�����ȡ���ӿڵĶ���
		IOrderDao orderDao = session.getMapper(IOrderDao.class);
		//ͨ������ʹ������ķ���
		List<Order> orderList = orderDao.querryOrder();
		/*
		 * for(Order order : orderList) { System.out.println(order.getUser()); }
		 */
		input.close();
	}

}
