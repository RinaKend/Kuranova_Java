import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI3  extends JFrame {
    public JButton button1 = new JButton("Подтвердить");
    public JTextField input = new JTextField("", 3);
    public JTextField output = new JTextField("", 3);
    public JLabel inputLabel = new JLabel("Введите массив чисел");
    public JLabel outputLabel = new JLabel("Вывод");

    public GUI3() {
        super("Задача 3");
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
                    String str="";
                    String[] strArr = input.getText().split(" ");

                    for (int i = 0; i < strArr.length; i++) {
                        if (Integer.parseInt(strArr[i]) % 3 == 0)
                            str=str+Integer.parseInt(strArr[i])+" ";
                    }

                    output.setText(str);
                } catch (Exception ex) {
                    output.setText ("Произошла ошибка.");
                }

            }

        }
    }

    public static void main (String[] args) {

        GUI3 exe = new GUI3();
        exe.setVisible(true);

    }
}

