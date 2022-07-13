package view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;

public class InputView extends JFrame {

    private final JButton submitButton;
    private final JTextField wattageInput;
    private final JTextField operatingHoursInput;
    private final JTextField operatingDaysInput;
    private final JTextField kWhPriceInput;
    private final JButton exitButton;

    public InputView()  {
        setTitle("Stromrechner");
        setSize(400,400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());
        JPanel head = new JPanel();
        JPanel content = new JPanel();
        add(head, BorderLayout.NORTH);
        add(content, BorderLayout.CENTER);
        content.setLayout(new GridLayout(7,2));
        content.setBorder(new EmptyBorder(5,5,5,5));

        JLabel wattageLabel = new JLabel("Verbrauch (W)");
        wattageInput = new JTextField();
        JLabel operatingHoursLabel = new JLabel("Betriebsdauer (Stunden");
        operatingHoursInput = new JTextField();
        JLabel operatingDaysLabel = new JLabel("Betriebszeit/Woche");
        operatingDaysInput = new JTextField();
        JLabel kWhPriceLabel = new JLabel();
        kWhPriceInput = new JTextField();
        submitButton = new JButton("Berechnen");
        exitButton = new JButton("Beenden");

        content.add(wattageLabel);
        content.add(wattageInput);
        content.add(operatingHoursLabel);
        content.add(operatingHoursInput);
        content.add(operatingDaysLabel);
        content.add(operatingDaysInput);
        content.add(kWhPriceLabel);
        content.add(kWhPriceInput);
        content.add(new JSeparator(SwingConstants.HORIZONTAL));
        content.add(new JSeparator(SwingConstants.HORIZONTAL));
        content.add(submitButton);
        content.add(exitButton);
        setVisible(true);
        pack();

        exitButton.addActionListener(e -> {
            dispose();
        });

    }

    public void setSubmitButtonListener(ActionListener listener) {
        submitButton.addActionListener(listener);
    }

    public double getWattage() {
        return Double.parseDouble(wattageInput.getText());
    }

    public int getOperatingHours() {
        return Integer.parseInt(operatingHoursInput.getText());
    }

    public int getOperatingDays() {
        return Integer.parseInt(operatingDaysInput.getText());
    }

    public double getKWhPrice() {
        return Double.parseDouble(kWhPriceInput.getText());
    }



    public static void main(String[] args) {
        new InputView();
    }
}
