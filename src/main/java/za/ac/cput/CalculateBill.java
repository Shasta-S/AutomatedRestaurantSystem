package za.ac.cput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//
public class CalculateBill extends JFrame implements ActionListener {
    private JPanel panelNorth, panelCenter, panelSouth;
    private JLabel lblHeadingConfirm, lblItem, lblQty, lblPrice, lblNachos, lblNachosQty, lblBuffalo, lblBuffaloQty, lblBread, lblBreadQty, lblSteak, lblSteakQty, lblCola, lblColaQty, lblTea, lblTeaQty,lblWaffle, lblWaffleQty,lblOrderNo,lblDate,lbloNo;
    private JTextField txtNachosPrice, txtBuffaloPrice, txtBreadPrice, txtSteakPrice, txtColaPrice, txtTeaPrice,
                        txtWafflePrice;
    private JButton btnCalculate,  btnBack,btnPayment, btnExit;
    private Font ft1, ft2, ft3,ft4;

    public CalculateBill() {
        super("Automated Restaurant System");
        panelNorth = new JPanel();
        panelCenter = new JPanel();
        panelSouth = new JPanel();

        lblHeadingConfirm = new JLabel("Order Confirmation");

        lblDate = new JLabel("Date: 13 May 2022 12:00pm");
        lblOrderNo = new JLabel("Order No");
        lbloNo = new JLabel("1200");

        lblItem = new JLabel("Item:"); //HEADINGS
        lblQty = new JLabel("Quantity:");
        lblPrice = new JLabel("Price:");

        lblNachos = new JLabel("Nachos (Half Portion)"); //Nachos
        lblNachosQty = new JLabel("1");
        txtNachosPrice = new JTextField("R45,00");

        lblBuffalo = new JLabel("Buffalo Wings"); //Buffalo Wings
        lblBuffaloQty = new JLabel("1");
        txtBuffaloPrice = new JTextField("R30,00");

        lblBread = new JLabel("Garlic Bread"); //Garlic Bread
        lblBreadQty = new JLabel("1");
        txtBreadPrice = new JTextField("R20,00");

        lblSteak = new JLabel("Steak"); //Sirloin Steak
        lblSteakQty = new JLabel("2");
        txtSteakPrice = new JTextField("R145,00");

        lblCola = new JLabel("Coca Cola (No sugar)"); //Coca Cola (No sugar)
        lblColaQty = new JLabel("2");
        txtColaPrice = new JTextField("R20,00");

        lblTea = new JLabel("Ice Tea (Lemon)"); // Ice Tea (Lemon)
        lblTeaQty = new JLabel("1");
        txtTeaPrice = new JTextField("R10,00");

        lblWaffle = new JLabel("Waffle + Ice-cream"); //Waffle + Ice-cream
        lblWaffleQty = new JLabel("2");
        txtWafflePrice = new JTextField("R50,00");

        btnCalculate = new JButton("Calculate Bill");
        btnBack = new JButton("Back");
        btnPayment = new JButton("Payment");
        btnExit = new JButton("Exit");

        ft1 = new Font("Arial", Font.BOLD, 29);
        ft2 = new Font("Arial", Font.BOLD, 15);
        ft3 = new Font("Arial", Font.BOLD,20);


    }

    public void setCalculateGUI() {
        panelNorth.setLayout(new FlowLayout());
        panelCenter.setLayout(new GridLayout(12,3));
        panelSouth.setLayout(new GridLayout(1, 3));

        panelNorth.add(lblHeadingConfirm);
        lblHeadingConfirm.setFont(ft1);
        lblHeadingConfirm.setForeground(new Color(105, 105, 105));

        panelNorth.setBackground(new Color(119, 136, 153));
        panelCenter.setBackground(new Color(211, 211, 211));



        lblDate .setFont(ft2);
        lblDate .setHorizontalAlignment(JLabel.LEFT);
        panelCenter.add( lblDate);
        lblDate.setForeground(new Color(112,128,144));
        lblOrderNo .setFont(ft3);
        lblOrderNo .setHorizontalAlignment(JLabel.CENTER);
        lblOrderNo.setForeground(new Color(112,128,144));
        lbloNo.setFont(ft3);
        lbloNo.setHorizontalAlignment(JLabel.CENTER);
        lbloNo.setForeground(new Color(112,128,144));
        panelCenter.add( lblOrderNo);
        panelCenter.add( lbloNo);

        lblItem.setFont(ft3); // HEADINGS
        panelCenter.add(lblItem);
        lblQty.setFont(ft3);
        lblQty.setHorizontalAlignment(JLabel.CENTER);
        panelCenter.add(lblQty);
        lblPrice.setFont(ft3);
        lblPrice.setHorizontalAlignment(JLabel.CENTER);
        panelCenter.add(lblPrice);

        lblNachos.setFont(ft2); //Nachos
        panelCenter.add(lblNachos);
        lblNachosQty.setFont(ft2);
        lblNachosQty.setHorizontalAlignment(JLabel.CENTER);
        panelCenter.add(lblNachosQty);
        txtNachosPrice.setFont(ft2);
        txtNachosPrice.setHorizontalAlignment(JLabel.CENTER);
        panelCenter.add(txtNachosPrice);

        lblBuffalo.setFont(ft2); //Buffalo Wings
        panelCenter.add(lblBuffalo);
        lblBuffaloQty.setFont(ft2);
        lblBuffaloQty.setHorizontalAlignment(JLabel.CENTER);
        panelCenter.add(lblBuffaloQty);
        txtBuffaloPrice.setFont(ft2);
        txtBuffaloPrice.setHorizontalAlignment(JLabel.CENTER);
        panelCenter.add(txtBuffaloPrice);

        lblBread.setFont(ft2); // Garlic Bread
        panelCenter.add(lblBread);
        lblBreadQty.setFont(ft2);
        lblBreadQty.setHorizontalAlignment(JLabel.CENTER);
        panelCenter.add(lblBreadQty);
        txtBreadPrice.setFont(ft2);
        txtBreadPrice.setHorizontalAlignment(JLabel.CENTER);
        panelCenter.add(txtBreadPrice);

        lblSteak.setFont(ft2); // Sirloin Steak
        panelCenter.add(lblSteak);
        lblSteakQty.setFont(ft2);
        lblSteakQty.setHorizontalAlignment(JLabel.CENTER);
        panelCenter.add(lblSteakQty);
        txtSteakPrice.setFont(ft2);
        txtSteakPrice.setHorizontalAlignment(JLabel.CENTER);
        panelCenter.add(txtSteakPrice);

        lblCola.setFont(ft2); // Coca Cola (No sugar)
        panelCenter.add(lblCola);
        lblColaQty.setFont(ft2);
        lblColaQty.setHorizontalAlignment(JLabel.CENTER);
        panelCenter.add(lblColaQty);
        txtColaPrice.setFont(ft2);
        txtColaPrice.setHorizontalAlignment(JLabel.CENTER);
        panelCenter.add(txtColaPrice);

        lblTea.setFont(ft2); // Ice Tea (Lemon)
        panelCenter.add(lblTea);
        lblTeaQty.setFont(ft2);
        lblTeaQty.setHorizontalAlignment(JLabel.CENTER);
        panelCenter.add(lblTeaQty);
        txtTeaPrice.setFont(ft2);
        txtTeaPrice.setHorizontalAlignment(JLabel.CENTER);
        panelCenter.add(txtTeaPrice);

        lblWaffle.setFont(ft2); // Waffle + Ice-cream
        panelCenter.add(lblWaffle);
        lblWaffleQty.setFont(ft2);
        lblWaffleQty.setHorizontalAlignment(JLabel.CENTER);
        panelCenter.add(lblWaffleQty);
        txtWafflePrice.setFont(ft2);
        txtWafflePrice.setHorizontalAlignment(JLabel.CENTER);
        panelCenter.add(txtWafflePrice);

        btnCalculate.setFont(ft2);
        panelSouth.add(btnCalculate);
        btnPayment.setFont(ft2);
        panelSouth.add(btnPayment);
        btnBack.setFont(ft2);
        panelSouth.add(btnBack);
        btnExit.setFont(ft2);
        panelSouth.add(btnExit);


        this.add(panelNorth, BorderLayout.NORTH);
        this.add(panelCenter, BorderLayout.CENTER);
        this.add(panelSouth, BorderLayout.SOUTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnCalculate.addActionListener(this);
        btnPayment.addActionListener(this);
        btnExit.addActionListener(this);
        btnBack.addActionListener(this);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setSize(500, 500);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Calculate Bill")) {

        } else if (e.getActionCommand().equals("Payment")) {

        } else if (e.getActionCommand().equals("Back")) {

        } else if (e.getActionCommand().equals("Exit")) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new CalculateBill().setCalculateGUI();
    }


}


