import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MainFrame extends JFrame {
    JFrame frame = new JFrame("Jfile choose");
    private JButton loading = new JButton("loading");
    private JButton enter = new JButton("Enter");
    private JTextField jtf = new JTextField();
    private JLabel jlb = new JLabel();
    private Container cp;
    private JPanel jpnn = new JPanel(new GridLayout(1,3,3,3));
    private JPanel jpnc = new JPanel(new GridLayout(1,1,3,3));
    public MainFrame(){
        init();
    }
    public void init(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(0, 0, 400, 300);
        cp = this.getContentPane();


        jpnn.add(jtf);
        jpnn.add(loading);
        jpnn.add(enter);
        jpnc.add(jlb);
        cp.add(jpnn,BorderLayout.NORTH);
        cp.add(jpnc,BorderLayout.CENTER);

        loading.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser choose = new JFileChooser();
                int a = choose.showOpenDialog(null);
                if(a == JFileChooser.APPROVE_OPTION){


                }


            }
        });



    }
}
