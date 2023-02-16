import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI  extends JFrame {
    public JButton button1 = new JButton("Подтвердить");
    public JTextField input = new JTextField("", 3);
    public JTextField output = new JTextField("", 3);
    public JLabel inputLabel = new JLabel("Введите число");
    public JLabel outputLabel = new JLabel("Вывод");

    public GUI() {
        super("Задача 1");
        this.setBounds(10, 10, 400, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        container.add(button1);
        container.add(inputLabel);
        container.add(input);
        container.add(outputLabel);
        container.add(output);
        button1.addActionListener(new ButtonEventListener());
        container.add(button1);
    }

    public class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button1) {

                try {
                    output.setText(check(Integer.parseInt(input.getText())));
                } catch (Exception ex) {
                    output.setText ("Произошла ошибка.");
                }

                input.setText(null);

            }

        }
    }
    public static String check(int number) {
        String str = "";
        if (number > 7) {
            str = "Привет";
        } else   {
            str = "Попробуйте еще раз";
        }
        return str;
    }

        public static void main (String[] args) {

            GUI exe = new GUI();
            exe.setVisible(true);

        }
    }
