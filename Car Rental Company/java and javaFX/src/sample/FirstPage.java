package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class FirstPage {

    @FXML
    private Button fpsearch;

    @FXML
    public void Search(ActionEvent actionEvent) throws Exception {

        Stage stg = new Stage();
        Parent pre = FXMLLoader.load(getClass().getResource("ViewCar.fxml"));
        Scene sne = new Scene(pre,600,450);
        stg.setScene(sne);
        stg.show();


    }
    public void New_Employee(ActionEvent actionEvent) throws Exception {

        Stage stg = new Stage();
        Parent pre = FXMLLoader.load(getClass().getResource("Employee.fxml"));
        Scene sne = new Scene(pre,600,450);
        stg.setScene(sne);
        stg.show();


    }
    public void New_Office(ActionEvent actionEvent) throws Exception {

        Stage stg = new Stage();
        Parent pre = FXMLLoader.load(getClass().getResource("Office.fxml"));
        Scene sne = new Scene(pre,600,450);
        stg.setScene(sne);
        stg.show();


    }

    public void New_Department(ActionEvent actionEvent) throws Exception {

        Stage stg = new Stage();
        Parent pre = FXMLLoader.load(getClass().getResource("Department.fxml"));
        Scene sne = new Scene(pre,600,450);
        stg.setScene(sne);
        stg.show();


    }






}
