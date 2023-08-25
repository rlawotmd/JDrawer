import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyMouseListener implements MouseListener {
    DrawerFrame frame;
    MyMouseListener(DrawerFrame frame) {
        this.frame = frame;
    }
    public void mouseClicked(MouseEvent e) {
        System.out.println("mouseClicked");
    }

    public void mousePressed(MouseEvent e) {
        System.out.println("mousePressed");
        int x = e.getX();
        int y = e.getY();
        Graphics g = frame.getGraphics();
        g.drawLine(x - 10, y - 10, x + 10, y + 10);
        g.drawLine(x + 10, y - 10, x - 10, y + 10);

    }

    public void mouseReleased(MouseEvent e) {
        System.out.println("mouseReleased");
    }

    public void mouseEntered(MouseEvent e) {
        System.out.println("mouseEntered");
    }

    public void mouseExited(MouseEvent e) {
        System.out.println("mouseExited");
    }
}

class DrawerFrame extends JFrame {
    DrawerFrame() {
        setTitle("Drawer");
        setSize(700, 500);
        setLocation(100, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addMouseListener(new MyMouseListener(this));
    }
}


public class Drawer {
    public static void main(String[] args)
    {
        JFrame drawerFrame = new DrawerFrame();
        drawerFrame.setVisible(true);
    }
}
