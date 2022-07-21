package view;

import javax.swing.*;
import java.awt.*;

public class MainViewSwing extends JFrame {

        public MainViewSwing(){
            setTitle("Stromkostenberechner");
            setSize(400,600);
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            addEingabe();
            setVisible(true);
        }

        private void addEingabe(){
            setLayout(new BorderLayout());
            JPanel topPanel = new JPanel();
            JPanel centerPanel = new JPanel();
            JPanel buttonPanel = new JPanel();

            add(topPanel, BorderLayout.NORTH);
            add(centerPanel,BorderLayout.CENTER);
            add(buttonPanel, BorderLayout.SOUTH);


        // centerPanel
        JLabel verbrauchWattLabel = new JLabel("Verbrauch in Watt: ");
        JTextField verbrauchWattField = new JTextField("50");
        JLabel betriebsStundenLabel = new JLabel("Betriebsstunden/ Tag: ");
        JTextField betriebsStundenField= new JTextField("24");
        JLabel betriebsTageWocheLabel = new JLabel("betriebstage/ Woche: ");


        JPanel radioButtonPanel = new JPanel( new GridLayout(7,1) );
        ButtonGroup bg = new ButtonGroup();
            for (int i = 1; i <= 7; i++) {
                JRadioButton rb = new JRadioButton(i+ " Tag/e");
                bg.add(rb);
                radioButtonPanel.add(rb);
            }

        /*JRadioButtonMenuItem einTagButton = new JRadioButtonMenuItem("1 Tag");
        JRadioButtonMenuItem zweiTageButton = new JRadioButtonMenuItem("2 Tage");
        JRadioButtonMenuItem dreiTageButton = new JRadioButtonMenuItem("3 Tage");
        JRadioButtonMenuItem vierTageButton = new JRadioButtonMenuItem("4 Tage");
        JRadioButtonMenuItem fünftageButton = new JRadioButtonMenuItem("5 Tage");
        JRadioButtonMenuItem sechsTageButton = new JRadioButtonMenuItem("")*/

        centerPanel.setLayout(new FlowLayout());
        centerPanel.add(verbrauchWattLabel);
        centerPanel.add(verbrauchWattField);
        centerPanel.add(betriebsStundenLabel);
        centerPanel.add(betriebsStundenField);
        centerPanel.add(betriebsStundenField);
        centerPanel.add(radioButtonPanel);

        }

}
