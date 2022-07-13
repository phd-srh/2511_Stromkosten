package model;

import java.text.DecimalFormat;

public class Calculator {

    private double wattage;
    private int operatingHours;
    private int operatingDays;
    private double kWhPrice;

    public Calculator(double wattage, int operatingHours, int operatingDays, double kWhPrice) {
        this.wattage = wattage;
        this.operatingHours = operatingHours;
        this.operatingDays = operatingDays;
        this.kWhPrice = kWhPrice;
    }

    public double getWattage() {
        return wattage;
    }

    public void setWattage(double wattage) {
        this.wattage = wattage;
    }

    public int getOperatingHours() {
        return operatingHours;
    }

    public void setOperatingHours(int operatingHours) {
        this.operatingHours = operatingHours;
    }

    public int getOperatingDays() {
        return operatingDays;
    }

    public void setOperatingDays(int operatingDays) {
        this.operatingDays = operatingDays;
    }

    public double getkWhPrice() {
        return kWhPrice;
    }

    public void setkWhPrice(double kWhPrice) {
        this.kWhPrice = kWhPrice;
    }

    public double[] getConsumption(double wattage, int operatingHours, int operatingDays) {
        double[] consumption = new double[4];
        consumption[0] = (wattage * operatingHours) / 1000;
        consumption[1] = consumption[0] * operatingDays;
        consumption[2] = consumption[1] * 4;
        consumption[3] =  consumption[1] * 52;
        return consumption;
    }

    public void setConsumption(double consumption) {
    }

    public double[] getPricePerTime(double[] consumption, double kWhPrice) {
        double[] pricePerTime = new double[4];
        for (int i = 0; i < 4; i++) {
            pricePerTime[i] = consumption[i] * kWhPrice;
        }
        return pricePerTime;
    }

    public void setPricePerTime(double pricePerTime) {
    }
}
