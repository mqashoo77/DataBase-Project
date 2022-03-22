package CarRentalCompanySystem;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarList {


    public static List<Car> getInformationCar(){

        List<Car> list = new ArrayList<Car>();
        try {
            String sql = "select * from car where 1";
            Connection con = DB.getConnection();
            PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Car adm = new Car();
                adm.setCarID(resultSet.getInt(1));
                adm.setCarModel(resultSet.getString(2));
                adm.setCarColor(resultSet.getString(3));
                adm.setCarBrand(resultSet.getString(4));
                adm.setoID(resultSet.getInt(5));
                list.add(adm);

            }
            con.close();

        }catch (SQLException e){
            e.printStackTrace();

        }

        return list;
    }





}
