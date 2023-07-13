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
	
	
	
	//product
	
	
	
}
