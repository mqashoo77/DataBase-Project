package CarRentalCompanySystem;


public class Car {

    private int carID;
    private String carModel;
    private String carColor;
    private String carBrand;
    private int oID;

    public Car() {
        super();
    }



    public Car(int carID, String carModel, String carColor, String carBrand, int oID) {
        this.carID = carID;
        this.carModel = carModel;
        this.carColor = carColor;
        this.carBrand = carBrand;
        this.oID = oID;
    }

    public int getCarID() {
        return carID;
    }

    public void setCarID(int carID) {
        this.carID = carID;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public int getoID() {
        return oID;
    }

    public void setoID(int oID) {
        this.oID = oID;
    }
}