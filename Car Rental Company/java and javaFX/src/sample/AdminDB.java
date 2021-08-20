package sample;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;
import java.util.stream.Stream;

public class AdminDB {


    static Connection conn = null ;
    public static Connection getConnection(){

        String url = "jdbc:mysql://localhost:3306/crc?serverTimezone=UTC";
        String username = "root";
        String password = "qashoO0120";

        try {
            conn = DriverManager.getConnection(url, username, password);


        }catch(SQLException e){

            e.printStackTrace();

        }

        return conn;


    }

    public static List<Admin> getAdmin(){

        List<Admin> list = new ArrayList<Admin>();
        try {
            String sql = "select * from admin";
            Connection con = AdminDB.getConnection();
            PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Admin adm = new Admin();
                adm.setId(resultSet.getInt(1));
                adm.setUsername(resultSet.getString(2));
                adm.setPassword(resultSet.getString(3));
                list.add(adm);

            }
            con.close();

        }catch (SQLException e){
            e.printStackTrace();

        }

        return list;
    }

}
