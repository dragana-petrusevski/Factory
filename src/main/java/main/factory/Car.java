
package main.factory;

public class Car {
    
    private String model;
    private int buildYear;
    private String color;
    private int maxSpeed;
    private int ccm;
    private int consumption;
    
    
    public String getModel() {
        return this.model;
    }
    public void setModel(String customModel) {
            this.model = customModel;
                    }
    
    public int getBuildYear() {
        return this.buildYear;
    }
    public void setBuildYear(int customBuildYear) {
        this.buildYear = customBuildYear;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getCcm() {
        return ccm;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setCcm(int ccm) {
        this.ccm = ccm;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    public void printAttributes() {
        System.out.println("Model: " + this.getModel());
        System.out.println("Godina proizvodnje: " + this.getBuildYear());
        System.out.println("Ccm: " + this.getCcm());
        System.out.println("Boja: " + this.getColor());
        System.out.println("Potrosnja: " + this.getConsumption());
        System.out.println();
    }
    
}
