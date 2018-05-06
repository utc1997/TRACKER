/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expenses.dao;

import expenses.dbutil.DBConnExp;
import expenses.pojo.UserInfo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Maraxys
 */
public class UserInfoDAO {
    
    /**
     *
     */
    public static Connection conn;

    /**
     *
     * @param uname
     * @return
     * @throws SQLException
     */
    public static boolean userNameExists(String uname) throws SQLException {
        conn=DBConnExp.getConnection();
        PreparedStatement ps=conn.prepareStatement("select * from user_info where name=?");
            ps.setString(1,uname);
        ResultSet rs=ps.executeQuery();
        if(rs.next()){
            return true;
        }
        else {
            return false;
        }
    }
    
    /**
     *
     * @param ui
     * @return
     * @throws SQLException
     */
    public static boolean addUserInfo(UserInfo ui) throws SQLException{
        conn=DBConnExp.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into user_info values(?,?,?,?,?)");
            ps.setString(1,ui.getUserId());
            ps.setString(2,ui.getName());
            ps.setString(3,ui.getGender());
            ps.setInt(4,ui.getAge());
            ps.setInt(5,ui.getBudget());
        int a=ps.executeUpdate();
        if(a==0){
            return false;
        }
        else {
            return true;
        }
    }
    
     /**
     *
     * @param uname
     * @throws SQLException
     */
    public static UserInfo getUserInfo(String uid) throws SQLException {
        conn=DBConnExp.getConnection();
        PreparedStatement ps=conn.prepareStatement("select * from user_info where user_id=?");
            ps.setString(1,uid);
        ResultSet rs=ps.executeQuery();
        UserInfo uinfo=null;
        if(rs.next()){
            
            
            String uname = rs.getString("NAME");
            String gender = rs.getString("GENDER");
            int age = rs.getInt("AGE");
            int budget = rs.getInt("BUDGET");
            System.out.println(uname+gender+age);
           uinfo =new UserInfo(uid,uname,gender,age,budget);
            //return uinfo;
        }
    return uinfo;
    }
    
    
    
}
