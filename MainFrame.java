import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JFrame MainFrame;

    private JPanel ToWrite = new JPanel();
    private JTextField Field = new JTextField();
    private JButton Button = new JButton("Enter");
    private DefaultListModel dlm =new DefaultListModel<String>();
    private JList<String> list = new JList<String>(dlm);

    private BorderLayout brl = new BorderLayout();
   private BoxLayout bxl = new BoxLayout(ToWrite,BoxLayout.X_AXIS);

    public MainFrame() {

        ToWrite.setLayout(bxl);
        ToWrite.add(Field);
        ToWrite.add(Button);

        Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dlm.add(0,Field.getText());
                Field.setText("");
            }
        });

        Field.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dlm.add(0,Field.getText());
                Field.setText("");
            }
        });


        MainFrame= new JFrame("My new chat");
        MainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        MainFrame.setBounds(200,200,400,400);

        MainFrame.setLayout(brl);
        MainFrame.add(list,"Center");
        MainFrame.add(ToWrite,"South");

        MainFrame.setVisible(true);



    }
}
