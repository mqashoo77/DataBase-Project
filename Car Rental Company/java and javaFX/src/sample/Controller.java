package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.lang.reflect.Array;
import java.security.PublicKey;
import java.io.IOException;
import java.sql.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javafx.event.ActionEvent;

public class Controller {

    @FXML
    private Label ml1;
    @FXML
    private Button mb1;
    @FXML
    private TextField musername;
    @FXML
    private TextField mpassword;
    @FXML
    private Button mlogin;
    @FXML
    private Label ml2;

    @FXML
    public void CheckDataBase(ActionEvent actionEvent) throws IOException,SQLException {

        if(!AdminDB.getConnection().isClosed()){

            ml1.setText("Connected");

        }
        else{
            ml1.setText("Not Connected");
        }


    }
    @FXML
    public void LoginButton(ActionEvent actionEvent) throws Exception {

        System.out.println("Mohammad Qashoo");
        List<Admin> list = AdminDB.getAdmin();
        Map<String , String> map = new HashMap<String,String>();
        for (Admin a:list){
            map.put(a.getUsername(),a.getPassword());

        }
        if(map.containsKey(musername.getText())){
            String val2 = map.get(musername.getText());
            if(val2.equals(mpassword.getText())){
                ml2.setText("Success");
                Stage stg = new Stage();
                Parent pre = FXMLLoader.load(getClass().getResource("FirstPage.fxml"));
                Scene sne = new Scene(pre,600,450);
                stg.setScene(sne);
                stg.show();



            }
            else
                ml2.setText("Failed");
        }



    }
}

