package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class NewReservation {


    @FXML
    private TextField nrcid;

    @FXML
    private TextField nrcn;

    @FXML
    private TextField nrcp;

    @FXML
    private TextField nrce;

    @FXML
    private TextField nrca;

    @FXML
    private TextField nrcd ;

    @FXML
    private TextField nrrid;

    @FXML
    private TextField nrrcarid;

    @FXML
    private TextField nrrpd;

    @FXML
    private TextField nrrrd;

    @FXML
    private TextField nrram;

    @FXML
    private Button nrrn;

    @FXML
    private Label nrtl;


    public void Rental_Now(ActionEvent actionEvent) throws IOException {


        try {

            Connection con = AdminDB.getConnection();
            String sql="insert into customer (cID , cName , cPhone  , cEmail , cAddress , cDOB) values (?,?,?,?,?,?)";
            PreparedStatement statment = con.prepareStatement(sql);
            statment.setString(1, nrcid.getText());
            statment.setString(2, nrcn.getText());
            statment.setString(3, nrcp.getText());
            statment.setString(4, nrce.getText());
            statment.setString(5, nrca.getText());
            statment.setString(6, nrcd.getText());
            statment.executeUpdate() ;

            String sql1="INSERT INTO reservation (rID, cID, carID, rAmount, rPickupDate, rReturnDate) VALUES (?,?,?,?, ?, ?)";
            PreparedStatement stat = con.prepareStatement(sql1);
            stat.setString(1, nrrid.getText());
            stat.setString(2, nrcid.getText());
            stat.setString(3, nrrcarid.getText());
            stat.setString(4, nrram.getText());
            stat.setString(5, nrrpd.getText());
            stat.setString(6, nrrrd.getText());
            stat.executeUpdate() ;
            nrtl.setText("Completed Successfully ... Thank you ");



            statment.close();
            con.close();


        } catch (Exception b) {
            b.printStackTrace();
        }


    }

}
