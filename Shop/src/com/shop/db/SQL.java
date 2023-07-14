package com.shop.db;

public class SQL {

	//Customer
	public static final String select_customer = "select * from `customer` where `cutId`= ?";
	public static final String insert_customer = "insert into `customer` set `cutid` = ?, "
												+ "`name`= ? ,"
												+ "`hp`= ?,"
												+ "`shopaddr`= ?,"
												+ "`rdate` = now()";
	
	
	

	
	//order
	public static final String select_orders = "select "
												+ "a.*,"
												+ " b.`name`, "
												+ "c.`prodName` "
												+ "FROM `Order` AS a "
												+ "JOIN `Customer` AS b ON a.orderId = b.cutid "
												+ "JOIN `product` AS c ON  a.orderProduct = c.prodNo "
												+ "WHERE `orderId` = ?"
												+ "";
	
	
	public static final String insert_order = "insert into `order` set "
											+ "`orderid` = ?,"
											+ "`orderproduct`= ?,"
											+ "`ordercount`= ?,"
											+ "`orderdate`= now()";
	
	
	
	
	//product
	public static final String select_products = "select * from `product` where `stock` > 0 ";
	public static final String select_product = "select * from `product` where `prodNo` = ? ";
	
	public static final String update_product_stock_count = "update `product` set `stock` = `stock` - ? "
														  + "where `prodNo` = ?";
	
}
