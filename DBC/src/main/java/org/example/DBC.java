package org.example;
import java.sql.*;
public class DBC {

        public static void main(String[] args) {
            try{
                Class.forName("com.jdbc.MySql.Driver");
                String url = "jdbc:MySql://localhost/database?" + "user = name & password = xyz";
                Connection con = DriverManager.getConnection(url);
                Statement st = con.createStatement();
                st.executeQuery("Select * from table");
                ResultSet rs = st.getResultSet();
                //if(rs!=null);
                while(rs.next()){
                    int serial = rs.getInt("SN");
                    String name = rs.getString(3);
                    System.out.println(serial+" "+name);
                }
                st.close();
                con.close();
            }catch(Exception e){
                System.out.println("An Error Occured.");
            }
        }
    }

