package destan_Library;

import java.sql.*;

public class BookDB {
	public static int save(String callno,String name,String author,String field,int quantity){
		int status=0;
		try{
			Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into books(callno,name,author,field,quantity) values(?,?,?,?,?)");
			ps.setString(1,callno);
			ps.setString(2,name);
			ps.setString(3,author);
			ps.setString(4,field);
			ps.setInt(5,quantity);
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}

}
