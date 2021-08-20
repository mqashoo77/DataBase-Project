package sample;

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

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ViewCar implements Initializable {


    @FXML
    private TableView<InformationCar> table;

    @FXML
    private TableColumn<InformationCar, Integer> carid;

    @FXML
    private TableColumn<InformationCar, String> carmodel;

    @FXML
    private TableColumn<InformationCar, String> carcolor;

    @FXML
    private TableColumn<InformationCar, String> carbrand;

    @FXML
    private TableColumn<InformationCar, Integer> officeid;

    @FXML
    public TextField vcselectbutton;

    @FXML
    private Button vccbutton;

    public ObservableList<InformationCar> data = FXCollections.observableArrayList();


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        try {
            String sql = "select * from car";
            Connection con = AdminDB.getConnection();
            PreparedStatement preparedStatement = (PreparedStatement) con.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                data.add(new InformationCar(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3
                ), resultSet.getString(4), resultSet.getInt(5)));


            }
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();

        }

        carid.setCellValueFactory(new PropertyValueFactory<InformationCar, Integer>("carID"));
        carmodel.setCellValueFactory(new PropertyValueFactory<InformationCar, String>("carModel"));
        carcolor.setCellValueFactory(new PropertyValueFactory<InformationCar, String>("carColor"));
        carbrand.setCellValueFactory(new PropertyValueFactory<InformationCar, String>("carBrand"));
        officeid.setCellValueFactory(new PropertyValueFactory<InformationCar, Integer>("oId"));
        table.setItems(data);

    }


    public void Continue(ActionEvent actionEvent) throws Exception {

        Stage stg = new Stage();
        Parent pre = FXMLLoader.load(getClass().getResource("NewReservation.fxml"));
        Scene sne = new Scene(pre, 600, 450);
        stg.setScene(sne);
        stg.show();


    }


}