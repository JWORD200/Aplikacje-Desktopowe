import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstPanel extends JPanel {
    public FirstPanel(){
        this.setBackground(Color.lightGray);
        this.setBounds(0,0,600,35);
        this.setLayout(new FlowLayout(FlowLayout.LEFT));

        Border border = BorderFactory.createLineBorder(Color.black, 2);

        JLabel label = new JLabel();
        label.setText("Dodaj nową klasę: ");
        label.setVerticalTextPosition(JLabel.TOP);
        label.setHorizontalTextPosition(JLabel.LEFT);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.LEFT);
        label.setVisible(true);

        JTextField textField = new JTextField(10);
        textField.setHorizontalAlignment(JTextField.LEFT);
        textField.setBorder(border);
        textField.setVisible(true);

        JButton button = new JButton("Dodaj");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nazwaKlasy = textField.getText();
                SecondPanel.tableModel.addRow(new Object[]{nazwaKlasy, false, 0, 0, 0});
                textField.setText("");
            }
        });
        button.setVisible(true);

        this.add(label);
        this.add(textField);
        this.add(button);
        this.setVisible(true);
    }
}
