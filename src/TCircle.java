package src;

import java.awt.*;
public class TCircle extends TFigure {
    protected int r;
    protected Color color;
    public TCircle(int x, int y, int r, Color color) {
        super(x,y);
        this.r = r;
        this.color = color;
    }
    public TCircle(int x, int y) { super(x,y); }
    @Override
    public void Show(boolean vision) {
        setVisible(vision);
        this.repaint();
    }

    public void ChangeRadius(int r) {
        this.r = r;
        this.repaint();
    }
    @Override
    public void paintComponent(Graphics component){
        super.paintComponent(component);
        component.setColor(this.color);
        component.drawOval(super.GetX(),super.GetY(),this.r*2,this.r*2);
    }
}
