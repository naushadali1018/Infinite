class CarStore {
    public void searchCar(String manufacturer) {
        // finds cars from the desired manufacturer
    }
    public void searchCar(float topSpeed) {
        // finds cars having the desired top speed
    }
    public void searchCar(float topSpeed, String color) {
        // finds cars having the desired top speed and color
    }
}
public class carOverloading {
    public static void main(String[] args) {
        CarStore showroom = new CarStore();

        showroom.searchCar("Nissan");
        showroom.searchCar(180.0F, "Blue");

        // Rest of the code
    }
}
