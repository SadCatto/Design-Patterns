public class CarFactory {
    public void buildCar(String location) {
        switch (location) {
            case "India":
                IndiaCarFactory.buildCar();
                break;
            case "US":
                USCarFactory.buildCar();
                break;
        }
    }
}