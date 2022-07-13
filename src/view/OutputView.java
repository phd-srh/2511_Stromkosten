package view;

import model.Calculator;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.text.DecimalFormat;

public class OutputView extends JFrame {

    DecimalFormat df = new DecimalFormat("#,##0.00");


    public OutputView(double[] consumption, double[] cost)  {

        setTitle("Stromkosten");
        setSize(400,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());
        JPanel content = new JPanel();
        JPanel bottom = new JPanel();
        add(content, BorderLayout.CENTER);
        add(bottom, BorderLayout.SOUTH);
        content.setLayout(new GridLayout(1,1));
        content.setBorder(new EmptyBorder(5,5,5,5));

        // Erstellen einer JTable zur Anzeige der Ergebnisse

        String[] columnNames = {"Periode", "Verbrauch (kWh)", "Kosten (€)"};
        Object[][] data = {
                {"Täglich", df.format(consumption[0]), df.format(cost[0])},
                {"Wöchentlich", df.format(consumption[1]), df.format(cost[1])},
                {"Monatlich", df.format(consumption[2]), df.format(cost[2])},
                {"Jährlich", df.format(consumption[3]), df.format(cost[3])}
        };
        JTable table = new JTable(data, columnNames);
        content.add(new JScrollPane(table));

        // Erstellen eines Buttons zum schließen des Fensters
        JButton exitButton = new JButton("Fenster schließen");
        exitButton.addActionListener(e -> dispose());
        bottom.add(exitButton);

        setVisible(true);
        pack();
    }


}
