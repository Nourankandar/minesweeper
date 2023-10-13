import javax.swing.*;
import java.awt.*;

public class PaneL extends JPanel {
    public void panel1(JPanel p1){
        p1.setLayout(null);
        p1.setBounds(2,2,600,40);
        p1.setBackground(new Color(0x7C8882));

        JMenuBar bar =new JMenuBar();

        JMenu Game =new JMenu("Game");
        JMenuItem New =new JMenuItem("new");
        JMenuItem Save =new JMenuItem("save");
        JMenuItem Load =new JMenuItem("load");

        Game.add(New);Game.add(Save);Game.add(Load);

        JMenu Settings =new JMenu("Settings");
        JMenuItem Time =new JMenuItem("time");
        JMenuItem Player =new JMenuItem("player mode");

        Settings.add(Time); Settings.add(Player);

        bar.add(Game); bar.add(Settings);

        p1.add(bar);



    }

    public void panel2(JPanel p2){
        p2.setLayout(null);
        p2.setBounds(2,42,600,98);
        p2.setBackground(new Color(0xB27EFF));
    }
    Button button[][]= new Button[20][20];

    public void panel3() {
        setLayout(new GridLayout(12,12));
        for(int i =0 ; i<12 ; i++){
            for(int j=0;j<12;j++) {
              button[i][j] = new Button();
              add(button[i][j]);
              setBackground(new Color(176, 211, 232));


            }
        }
    }
}

