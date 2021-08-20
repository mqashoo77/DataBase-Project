package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Department {




    @FXML
    private TextField ddid;

    @FXML
    private TextField doid;

    @FXML
    private TextField ddn;

    @FXML
    private TextField ddp;

    @FXML
    private Button dconfirm;

    @FXML
    private Label dmessege;


    public void Depatment_Confirm(ActionEvent actionEvent) throws IOException {


        try {

            Connection conc = AdminDB.getConnection();
            String InsertDepartmentSql="insert into department (dID , oID , dName  , dPhone ) values (?,?,?,?)";
            PreparedStatement statementtt = conc.prepareStatement(InsertDepartmentSql);
            statementtt.setString(1, ddid.getText());
            statementtt.setString(2, doid.getText());
            statementtt.setString(3, ddn.getText());
            statementtt.setString(4, ddp.getText());
            statementtt.executeUpdate();
            if(statementtt.execute()){

                dmessege.setText("The Information is updating ");
            }





        } catch (Exception b) {

            b.printStackTrace();
        }


    }













}
