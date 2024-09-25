import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Popup {

    // Method to create the popup for adjusting quantity
    public static int showQuantityPopup(int initialQuantity) {
        final int[] quantity = {initialQuantity}; // Array to store quantity for modification inside lambda
        JDialog dialog = new JDialog(); // Popup dialog
        dialog.setTitle("Adjust Quantity");
        dialog.setSize(300, 150);
        dialog.setModal(true);
        dialog.setLayout(new FlowLayout());

        JLabel quantityLabel = new JLabel("Quantity: " + quantity[0]);
        JButton plusButton = new JButton("+");
        JButton minusButton = new JButton("-");
        JButton okButton = new JButton("OK");

        // Plus button action to increase quantity
        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                quantity[0]++;
                quantityLabel.setText("Quantity: " + quantity[0]);
            }
        });

        // Minus button action to decrease quantity (not less than 1)
        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (quantity[0] > 1) {
                    quantity[0]--;
                    quantityLabel.setText("Quantity: " + quantity[0]);
                }
            }
        });

        // OK button to confirm the quantity and close the popup
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.dispose();
            }
        });

        // Adding components to the dialog
        dialog.add(quantityLabel);
        dialog.add(plusButton);
        dialog.add(minusButton);
        dialog.add(okButton);

        // Show the dialog
        dialog.setVisible(true);

        return quantity[0]; // Return the adjusted quantity after closing the popup
    }
}