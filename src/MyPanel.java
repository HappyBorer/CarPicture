import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;

public class MyPanel extends JPanel {
    @Override
    public void paint(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        RenderingHints rh = new RenderingHints(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON
        );
        g2d.setRenderingHints(rh);

        // Контур кузова

        Path2D body = new Path2D.Double();
        body.moveTo(70, 400);
        body.curveTo(70, 400, 30, 370, 60,330);
        body.curveTo(60, 330, 60, 270, 97, 230);
        body.curveTo(170, 70, 430, 70,  515, 230);
        body.curveTo(600, 230,650, 270,  650, 345);
        body.curveTo(650, 345,670, 380,  640, 400);
        body.lineTo(560, 400);
        body.curveTo(545, 300, 440, 300, 425, 400);
        body.lineTo(260, 400);
        body.curveTo(245, 300, 140, 300, 125, 400);
        body.closePath();
        g2d.setColor(Color.YELLOW);
        g2d.fill(body);
        g2d.setColor(Color.BLACK);
        g2d.draw(body);

        Path2D windowOne = new Path2D.Double();
        windowOne.moveTo(130, 230);
        windowOne.lineTo(275, 230);
        windowOne.lineTo(275, 140);
        windowOne.curveTo(275, 140, 180, 140, 130, 230);
        g2d.setColor(getBackground());
        g2d.fill(windowOne);
        g2d.setColor(Color.BLACK);
        g2d.draw(windowOne);

        Path2D windowTwo = new Path2D.Double();
        windowTwo.moveTo(300, 140);
        windowTwo.lineTo(300, 230);
        windowTwo.lineTo(480, 230);
        windowTwo.curveTo(480, 230, 400, 130, 300, 140);
        g2d.setColor(getBackground());
        g2d.fill(windowTwo);
        g2d.setColor(Color.BLACK);
        g2d.draw(windowTwo);

        g2d.fill3DRect(305,265, 35, 5, true);

        Path2D headlight = new Path2D.Double();
        headlight.moveTo(570, 270);
        headlight.curveTo(570, 270, 620, 250, 630, 305);
        headlight.curveTo(630, 305, 580, 315, 570, 270);
        g2d.setColor(getBackground());
        g2d.fill(headlight);
        g2d.setColor(Color.BLACK);
        g2d.draw(headlight);

        g2d.fillOval(433, 335, 120, 120);
        g2d.setColor(getBackground());
        g2d.fillOval(468, 370, 50, 50);

        g2d.setColor(Color.BLACK);
        g2d.fillOval(133, 335, 120, 120);
        g2d.setColor(getBackground());
        g2d.fillOval(168, 370, 50, 50);
    }
}
