package controller;

import model.Calculator;
import view.InputView;
import view.OutputView;

import java.awt.event.ActionEvent;

public class Stromrechner {
    private final InputView inputView;


    public Stromrechner(InputView inputView) {
        this.inputView = inputView;
        inputView.setSubmitButtonListener(this::performCalculation);

    }

    private void performCalculation(ActionEvent event) {
        double wattage = inputView.getWattage();
        int operatingHours = inputView.getOperatingHours();
        int operatingDays = inputView.getOperatingDays();
        double kWhPrice = inputView.getkWhPrice();
        Calculator calculator = new Calculator(wattage, operatingHours, operatingDays, kWhPrice);

        double[] consumption = calculator.getConsumption(wattage, operatingHours, operatingDays);
        double[] pricePerTime = calculator.getPricePerTime(consumption, kWhPrice);
        OutputView outputView = new OutputView(consumption, pricePerTime);
        outputView.setVisible(true);
    }


    public static void main(String[] args) {
        new Stromrechner(new InputView());
    }
}
