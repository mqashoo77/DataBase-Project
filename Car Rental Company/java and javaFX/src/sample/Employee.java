package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.ChoiceBoxListCell;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import static java.lang.Integer.parseInt;


public class Employee implements Initializable {

    @FXML
    private TextField eeid;

    @FXML
    private TextField een;

    @FXML
    private TextField eep;

    @FXML
    private TextField eee;

    @FXML
    private DatePicker eedob;

    @FXML
    private ChoiceBox eeg;

    @FXML
    private TextField edid;

    @FXML
    private TextField eoid;

    @FXML
    private Button econfirm;
    @FXML
    private Label emeesage;




    public void initialize(URL url, ResourceBundle resourceBundle) {


        eeg.getItems().add("Male");
        eeg.getItems().add("Female");
        eeg.getSelectionModel().selectFirst();
    }

    public void Employee_Confirm(ActionEvent actionEvent) throws IOException {


        try {

            Connection con = AdminDB.getConnection();
            String InsertEmployeeSql="insert into employee (eID , eName , ePhone  , eEmail , eDOB ,eGender , oID , dID) values (?,?,?,?,?,?,?,?)";
            PreparedStatement statement = con.prepareStatement(InsertEmployeeSql);
            statement.setString(1, eeid.getText());
            statement.setString(2, een.getText());
            statement.setString(3, eep.getText());
            statement.setString(4, eee.getText());
            statement.setString(5, eedob.getValue().toString());
            statement.setString(6, eeg.getSelectionModel().getSelectedItem().toString());
            statement.setString(7, edid.getText());
            statement.setString(8, eoid.getText());
            statement.executeUpdate() ;
            if(statement.execute()){

                emeesage.setText("The Information is updating ");
            }





        } catch (Exception b) {

            b.printStackTrace();
        }


    }





}
