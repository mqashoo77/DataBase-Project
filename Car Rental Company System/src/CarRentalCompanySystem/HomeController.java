package CarRentalCompanySystem;




import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


import java.io.IOException;


public class HomeController {

    @FXML
    private Button fpsearch;

    @FXML
    public void Search(ActionEvent actionEvent) throws Exception {

        showStage("CarPage");


    }
    public void New_Employee(ActionEvent actionEvent) throws Exception {

        showStage("EmployeePage");


    }
    public void New_Office(ActionEvent actionEvent) throws Exception {
        showStage("OfficePage");



    }

    public void New_Department(ActionEvent actionEvent) throws Exception {

        showStage("DepartmentPage");

    }
    public void showStage(String ClassXmlName) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource(ClassXmlName.concat(".fxml")));
        Main.stage.setScene(new Scene(root));
        Main.stage.centerOnScreen();
        Main.stage.show();

    }






}
