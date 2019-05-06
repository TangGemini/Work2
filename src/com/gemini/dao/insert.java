package com.gemini.dao;

import com.gemini.entity.User;

import java.sql.*;

public class insert {
    private final static String DRIVER = "com.mysql.jdbc.Driver";
    private final static String URL = "jdbc:mysql://127.0.0.1:3306/springboot?useUnicode=true&characterEncoding=UTF-8";
    private final static String USENAME = "root";
    private final static String PASSWORD = "root";

    public User selectUser(User user){
        String sql="SELECT username,password FROM user WHERE username='"+user.getName()+"'and password='"+user.getPwd()+"'";
        Connection conn;
        Statement st = null;
        ResultSet rs = null;
        conn = getConnection();
        User tempUser=null;
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            if(rs.next()){
            rs.first();
            tempUser = new User();
            tempUser.setName(rs.getString(1));
            tempUser.setPwd(rs.getString(2));
            }
        }catch (Exception ex){
            tempUser = null;
        }finally {
            try {
                rs.close();
                st.close();
                conn.close();
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
        return tempUser;
    }


    public Connection getConnection(){
        Connection conn = null;
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL,USENAME,PASSWORD);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return conn;
    }
}
