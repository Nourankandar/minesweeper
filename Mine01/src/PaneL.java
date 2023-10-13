import javax.swing.*;
import java.awt.*;

public class PaneL extends JPanel {
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

