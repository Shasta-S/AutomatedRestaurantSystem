package za.ac.cput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculateBill extends JFrame implements ActionListener {
    private JPanel panelCenter, panelNorth, panelSouth;
    private JLabel lblReceipt,lblorderNo, lblitemName, lblItemPrice, lblTotalprice;
    private JTextField txtoNo, txtitem,txtitemPrice,txttotalPrice;
    private JButton btnNext,  btnBack, btnExit;
    private Font ft1, ft2;
    int size;

    public CalculateBill() {

        super("Receipt");
        panelNorth = new JPanel();
        panelCenter = new JPanel();
        panelSouth = new JPanel();
        lblReceipt = new JLabel("Receipt");


        lblorderNo = new JLabel("Order No");
        txtoNo = new JTextField("1200");

        lblitemName = new JLabel("Item Name");
        txtitem = new JTextField("Toasted Steak sandwich");


        lblItemPrice = new JLabel("Item Price");
        txtitemPrice = new JTextField("R80");

        lblTotalprice = new JLabel("Total Price");
        txttotalPrice= new JTextField("R80");

        btnNext = new JButton("Next");
        btnBack = new JButton("Back");
        btnExit = new JButton("Exit");



        ft1 = new Font("Arial", Font.BOLD, 29);
        ft2 = new Font("Arial", Font.BOLD, 15);
    }

    public void setCalculateGUI() {
        panelNorth.setLayout(new FlowLayout());
        panelCenter.setLayout(new GridLayout(5, 2));
        panelSouth.setLayout(new GridLayout(1, 3));


        panelNorth.add(lblReceipt);
        lblReceipt.setFont(ft1);
        lblReceipt.setForeground(new Color(105, 105, 105));

        panelNorth.setBackground(new Color(119, 136, 153));
        panelCenter.setBackground(new Color(211, 211, 211));
        panelSouth.setBackground(new Color(0, 0, 0));

        lblorderNo .setFont(ft2);
        lblorderNo .setHorizontalAlignment(JLabel.LEFT);
        txtoNo.setFont(ft2);
        panelCenter.add( lblorderNo);
        panelCenter.add(txtoNo);
        txtoNo.setBackground(new Color(211, 211, 211));


        lblitemName .setFont(ft2);
        lblitemName .setHorizontalAlignment(JLabel.LEFT);
        txtitem.setFont(ft2);
        panelCenter.add(lblitemName);
        panelCenter.add(txtitem);
        txtitem.setBackground(new Color(211, 211, 211));



        lblItemPrice .setFont(ft2);
        lblItemPrice .setHorizontalAlignment(JLabel.LEFT);
        txtitemPrice.setFont(ft2);
        panelCenter.add(lblItemPrice);
        panelCenter.add(txtitemPrice);
        txtitemPrice.setBackground(new Color(211, 211, 211));




        lblTotalprice .setFont(ft2);
        lblTotalprice .setHorizontalAlignment(JLabel.LEFT);
        txttotalPrice.setFont(ft2);
        panelCenter.add(lblTotalprice);
        panelCenter.add(txttotalPrice);
        txttotalPrice.setBackground(new Color(211, 211, 211));



        btnNext.setFont(ft2);
        panelSouth.add(btnNext);
        btnBack.setFont(ft2);
        panelSouth.add(btnBack);
        btnExit.setFont(ft2);
        panelSouth.add(btnExit);


        this.add(panelNorth, BorderLayout.NORTH);
        this.add(panelCenter, BorderLayout.CENTER);
        this.add(panelSouth, BorderLayout.SOUTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnNext.addActionListener(this);
        btnExit.addActionListener(this);
        btnBack.addActionListener(this);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setSize(500, 500);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Back")) {

        } else if (e.getActionCommand().equals("Next")) {


        } else if (e.getActionCommand().equals("Exit")) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new CalculateBill().setCalculateGUI();

    }


}


