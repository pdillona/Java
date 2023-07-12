package sub5;

public class SQL {
	public final static String INSERT_USER = "insert into `User3` values(?,?,?,?)";
	
	// insertSQL 참조하려고 인스턴스화 하긴 애매하니 static으로 띄우고(참조가능) public으로 공개 final로 상수화 하여 수정불가하게 만듬
	
	public final static String SELECT_USERS = "select * from `User3`";
	
	public final static String SELECT_USER = "select * from `User3` where `uid` = ?";
	
	public final static String UPDATE_USER = "update `User3` SET "
											+ "`name` = ?, "
											+ "`hp` = ?,"
											+ "`age` = ? "
											+ "where `uid` = ?";
	public final static String DELETE_USER = "delete from `User3` where `uid` = ?";
												
	
}
