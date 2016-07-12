
package note3;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Note3 { 
    public Note3() { 
        JFrame jf = new JFrame("Button Test");

        jf.setLayout(new BorderLayout());

        JButton btn = new JButton("ボタン");

        jf.add(btn,BorderLayout.CENTER);

        btn.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent e) {

        System.out.println("ぽちっとな");

        }

        });

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jf.setSize(160,120);

        jf.setVisible(true);
            }
    public static void main(String[] args) {
        new Note3();
    }
}