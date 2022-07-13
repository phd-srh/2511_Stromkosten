package model;

public class Calculator {

    private double wattage;
    private int operatingHours;
    private int operatingDays;
    private double kWhPrice;
    private double consumption;
    private double pricePerTime;

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

    public double getConsumption(double wattage, int operatingHours, int operatingDays, int mode) {
        double consumptionDay = (wattage * operatingHours)/1000;
        double consumptionWeek = consumptionDay * operatingDays;
        switch (mode) {
            case 1:
                //Verbrauch/Tag
                return consumptionDay;
            case 2:
                //Verbrauch Woche
                return consumptionWeek;
            case 3:
                //Verbrauch/Monat
                return consumptionDay * 4;
            case 4:
                //Verbrauch/Jahr
                return consumptionDay * 52;
            default:
                return 0.0;
        }

    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public double getPricePerTime(double consumption, double kWhPrice) {
        return consumption*kWhPrice;
    }

    public void setPricePerTime(double pricePerTime) {
        this.pricePerTime = pricePerTime;
    }
}
