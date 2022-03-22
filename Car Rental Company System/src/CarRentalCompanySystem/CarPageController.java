package CarRentalCompanySystem;


import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class CarPageController implements Initializable {


    @FXML
    private TableView<Car> table;

    @FXML
    private TableColumn<Car, Integer> carid;

    @FXML
    private TableColumn<Car, String> carmodel;

    @FXML
    private TableColumn<Car, String> carcolor;

    @FXML
    private TableColumn<Car, String> carbrand;

    @FXML
    private TableColumn<Car, Integer> officeid;

    @FXML
    public TextField vcselectbutton;

    @FXML
    private Button vccbutton;

    public ObservableList<Car> data = FXCollections.observableArrayList();


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        try {
            String sql = "select * from car";
            Connection con = DB.getConnection();
            PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                data.add(new Car(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3
                ), resultSet.getString(4), resultSet.getInt(5)));


            }
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();

        }

        carid.setCellValueFactory(new PropertyValueFactory<Car, Integer>("carID"));
        carmodel.setCellValueFactory(new PropertyValueFactory<Car, String>("carModel"));
        carcolor.setCellValueFactory(new PropertyValueFactory<Car, String>("carColor"));
        carbrand.setCellValueFactory(new PropertyValueFactory<Car, String>("carBrand"));
        officeid.setCellValueFactory(new PropertyValueFactory<Car, Integer>("oId"));
        table.setItems(data);

    }


    public void Continue(ActionEvent actionEvent) throws Exception {

       showStage("ReservationPage");


    }
    private void showStage(String ClassXmlName) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource(ClassXmlName.concat(".fxml")));
        Main.stage.setScene(new Scene(root));
        Main.stage.centerOnScreen();
        Main.stage.show();

    }


}