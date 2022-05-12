package za.ac.cput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//
public class CalculateBill extends JFrame implements ActionListener {
    private JPanel panelNorth, panelCenter, panelSouth;
    private JLabel lblTotalPrice, lblHeadingConfirm, lblItem, lblQty, lblPrice, lblNachos, lblNachosQty, lblBuffalo, lblBuffaloQty, lblBread, lblBreadQty, lblSteak, lblSteakQty, lblCola, lblColaQty, lblTea, lblTeaQty,lblWaffle, lblWaffleQty,lblOrderNo,lblDate,lbloNo, lblBlank;
    private JTextField txtTotalPrice, txtNachosPrice, txtBuffaloPrice, txtBreadPrice, txtSteakPrice, txtColaPrice, txtTeaPrice,
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
        txtNachosPrice = new JTextField("45");

        lblBuffalo = new JLabel("Buffalo Wings"); //Buffalo Wings
        lblBuffaloQty = new JLabel("1");
        txtBuffaloPrice = new JTextField("34");

        lblBread = new JLabel("Garlic Bread"); //Garlic Bread
        lblBreadQty = new JLabel("1");
        txtBreadPrice = new JTextField("56");

        lblSteak = new JLabel("Steak"); //Sirloin Steak
        lblSteakQty = new JLabel("2");
        txtSteakPrice = new JTextField("45");

        lblCola = new JLabel("Coca Cola (No sugar)"); //Coca Cola (No sugar)
        lblColaQty = new JLabel("2");
        txtColaPrice = new JTextField("12");

        lblTea = new JLabel("Ice Tea (Lemon)"); // Ice Tea (Lemon)
        lblTeaQty = new JLabel("1");
        txtTeaPrice = new JTextField("34");

        lblWaffle = new JLabel("Waffle + Ice-cream"); //Waffle + Ice-cream
        lblWaffleQty = new JLabel("2");
        txtWafflePrice = new JTextField("89");

        lblBlank = new JLabel("");
        lblTotalPrice = new JLabel("Total Price: ");
        txtTotalPrice = new JTextField();

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

        panelCenter.add(lblBlank); // Blank Space
        lblTotalPrice.setFont(ft2); // Total Price
        lblTotalPrice.setHorizontalAlignment(JLabel.CENTER);
        panelCenter.add(lblTotalPrice);
        txtTotalPrice.setFont(ft2);
        panelCenter.add(txtTotalPrice);
        txtTotalPrice.setHorizontalAlignment(JLabel.CENTER);



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

        if (e.getSource() == btnCalculate ){
            try {
                String st1 = String.valueOf(txtNachosPrice.getText());
                String st2 = String.valueOf(txtBuffaloPrice.getText());
                String st3 = String.valueOf(txtColaPrice.getText());
                String st4 = String.valueOf(txtWafflePrice.getText());
                String st5 = String.valueOf(txtBreadPrice.getText());
                String st6 = String.valueOf(txtTeaPrice.getText());

                int number1 = Integer.parseInt(st1);
                int number2 = Integer.parseInt(st2);
                int number3 = Integer.parseInt(st3);
                int number4 = Integer.parseInt(st4);
                int number5 = Integer.parseInt(st5);
                int number6 = Integer.parseInt(st6);

                String totalPrice2 = String.valueOf((number1 + number2 + number3 + number4 + number5 + number6));
                txtTotalPrice.setText(String.valueOf(totalPrice2));

            }catch (NumberFormatException ex){
                ex.printStackTrace();
            }
        }

        if (e.getActionCommand().equals("Calculate Bill")) {
            JOptionPane.showMessageDialog(this, "RECEIPT: " + "\n" +
                    "___________________________________" + "\n" +
                    "Date: 13 May 2022 12:00pm" + "\n" +
                    "Order Number: " + " 2100" + "\n" +
                    "------------------------------------------" + "\n" +
                    "Item:" + "        " + "Price:" + "\n" +
                    "Nachos (Half Portion): " + "R45,00" + "\n" +
                    "Buffalo Wings: " + "R34,00" + "\n" +
                    "Garlic Bread: " + "R56,00" + "\n" +
                    "Steak: " + "R45,00" + "\n" +
                    "Coca Cola (No sugar): " + "R12,00" + "\n" +
                    "Ice Tea (Lemon): " + "R34,00" + "\n" +
                    "Waffle + Ice Cream: " + "R89,00" + "\n" +
                    "TOTAL PRICE: " + "R270,00" + "\n" +
                    "PROCEED TO PAYMENT");

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


