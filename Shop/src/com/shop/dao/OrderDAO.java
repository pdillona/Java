package com.shop.dao;

import java.util.ArrayList;
import java.util.List;

import com.shop.db.DBHelper;
import com.shop.db.SQL;
import com.shop.vo.OrderVO;

public class OrderDAO extends DBHelper{
	
	//싱글톤
	private static OrderDAO instance = new OrderDAO();
	public static OrderDAO getInstance() {
		return instance;
	}
	private OrderDAO() {}
	
	
	
	
	//기본 CRUD 메서드
	public int insertOrder(OrderVO vo) {
		
		int result = 0;
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.insert_order);
			psmt.setString(1, vo.getOrderId());
			psmt.setInt(2, vo.getOrderProduct());
			psmt.setInt(3, vo.getOrderCount());
			
			result = psmt.executeUpdate();
			
			close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
		
	}
	public OrderVO selectOrder(int OrderNo) {
		
		return null;
	}
	public List<OrderVO> selectOrders(String orderId) {
		
		List<OrderVO> orders = new ArrayList<>();
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.select_orders);
			psmt.setString(1, orderId);
			
			rs = psmt.executeQuery();

			while(rs.next()) {
				OrderVO vo = new OrderVO();
				vo.setOrderNo(rs.getInt(1));
				vo.setOrderId(rs.getString(2));
				vo.setOrderProduct(rs.getInt(3));
				vo.setOrderCount(rs.getInt(4));
				vo.setOrderDate(rs.getString(5).substring(0, 15));  //sql은 1부터 자바는 0부터 subString의 순서 차이
				vo.setName(rs.getString(6));
				vo.setProdName(rs.getString(7));
				
				orders.add(vo);
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		return orders;
	}
	public int updatetOrder(OrderVO vo) {
		
		return 0;
	}

	
	public int deleteOrder(int orderNo) {
		
		return 0;
	}
	
	
	
	
	
	
}
