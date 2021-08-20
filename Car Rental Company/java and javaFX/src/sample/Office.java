package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;



public class Office {

    @FXML
    private TextField ooid;

    @FXML
    private TextField ool;

    @FXML
    private TextField oop;

    @FXML
    private TextField ooe;

    @FXML
    private Button oofficeconfirm;

    @FXML
    private Label omessege;





    public void Office_Confirm(ActionEvent actionEvent) throws IOException {


        try {

            Connection conc = AdminDB.getConnection();
            String InsertOfficeSql="insert into office (oID , oLocation , oPhone  , oEmail ) values (?,?,?,?)";
            PreparedStatement statementt = conc.prepareStatement(InsertOfficeSql);
            statementt.setString(1, ooid.getText());
            statementt.setString(2, ool.getText());
            statementt.setString(3, oop.getText());
            statementt.setString(4, ooe.getText());
            statementt.executeUpdate();
            if(statementt.execute()){

                omessege.setText("The Information is updating ");
            }





        } catch (Exception b) {

            b.printStackTrace();
        }


    }

















}
