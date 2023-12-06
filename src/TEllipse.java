package src;

import java.awt.*;
public class TEllipse extends TCircle {
    protected int r1;
    public TEllipse(int x, int y, int r, int r1, Color color) {
        super(x,y);
        this.r = r;
        this.r1 = r1;
        this.color = color;
    }
    public void Turn() {
        int a = r;
        r=r1;
        r1 = a;
    }

    @Override
    public void Show(boolean vision) {
        this.setVisible(vision);
        this.repaint();
    }
    public void paintComponent(Graphics component){
        component.setColor(color);
        component.drawOval(super.GetX(), super.GetY(), r*3, r1 * 4);
    }
}