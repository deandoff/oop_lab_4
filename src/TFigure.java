package src;

import javax.swing.*;

abstract class TFigure extends JPanel {
    protected int x1,y1,x2,y2,x3,y3,x4,y4;
    private final Point TPoint = new Point();
    public TFigure(int x, int y) {
        setLayout(null);
        setOpaque(false);
        TPoint.Set(x, y);
    }
    protected void Move(int x, int y) {
        this.x1 = TPoint.GetX() + x;
        this.y1 = TPoint.GetY() + y;
        this.TPoint.Set(x1, y1);
        this.x2 += x;
        this.x3 += x;
        this.x4 += x;
        this.y2 += y;
        this.y3 += y;
        this.y4 += y;
    }
    public void Set(int x, int y) {
        this.TPoint.Set(x,y);
    }
    public int GetX() {return this.TPoint.GetX();}
    public int GetY() {return this.TPoint.GetY();}
}
