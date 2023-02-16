import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI2 extends JFrame{
    public JButton button1 = new JButton("Подтвердить");
    public JTextField input = new JTextField("", 3);
    public JTextField output = new JTextField("", 3);
    public JLabel inputLabel = new JLabel("Введите имя");
    public JLabel outputLabel = new JLabel("Вывод");

    public GUI2() {
        super("Задача 2");
        this.setBounds(10, 10, 400, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        container.add(button1);
        container.add(inputLabel);
        container.add(input);
        container.add(outputLabel);
        container.add(output);
        button1.addActionListener(new GUI2.ButtonEventListener());
        container.add(button1);
    }

    public class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button1) {

                try {
                    String i = input.getText();
                    output.setText(check(i));
                } catch (Exception ex) {
                    output.setText ("Произошла ошибка.");
                }

            }

        }
    }
    public static String check(String name) {
        String str = "";

        if (name.equalsIgnoreCase("Владислав")){
            str = "Привет, Владислав";
        } else {
            str = "Нет такого имени.";
        }
        return str;
    }

    public static void main (String[] args) {

        GUI2 exe = new GUI2();
        exe.setVisible(true);

    }
}
