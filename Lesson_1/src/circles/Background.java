package circles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Background extends JPanel {

       void updateColor( Component component) {

         ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int red = component.getBackground().getRed();
                int green = component.getBackground().getGreen();
                int blue = component.getBackground().getBlue();

                if (red >= 3 && green >= 2 && blue >= 1) {
                    component.setBackground(new Color(red - 3, green - 2, blue - 1));
                } else  {
                    component.setBackground(new Color(255, 255, 255));
                }
            }
        };
        Timer timer = new Timer(4000, action);
        timer.start();

    }
}
