import java.io.Serializable;

public class Phone implements Serializable {

    private String make;
    private String model;
    private int memoryGB;
    private double cameraMP;
    private double screenSizeInches;
    private boolean smart;
    private int priceEUR;

    public Phone(String make, String model, int memoryGB, double cameraMP, double screenSizeInches, boolean smart, int priceEUR) {
        this.make = make;
        this.model = model;
        this.memoryGB = memoryGB;
        this.cameraMP = cameraMP;
        this.screenSizeInches = screenSizeInches;
        this.smart = smart;
        this.priceEUR = priceEUR;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getMemoryGB() {
        return memoryGB;
    }

    public double getCameraMP() {
        return cameraMP;
    }

    public double getScreenSizeInches() {
        return screenSizeInches;
    }

    public boolean isSmart() {
        return smart;
    }

    public int getPriceEUR() {
        return priceEUR;
    }

    @Override
    public String toString() {
        return "Make: " + make +
                ", Model: " + model +
                ", Memory: " + memoryGB + "GB" +
                ", Camera: " + cameraMP + "MP" +
                ", ScreenSizeInches: " + screenSizeInches + "\"" +
                ", Smart: " + smart +
                ", Price: €" + priceEUR + "\n";
    }
}
