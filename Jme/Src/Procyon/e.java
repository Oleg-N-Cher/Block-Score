import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Canvas;

// 
// Decompiled by Procyon v0.5.36
// 

public class e extends Canvas
{
    public boolean j;
    public int v;
    public int u;
    
    public e(final Main main) {
        this.j = false;
        this.v = -1;
    }
    
    public final void i() {
        this.u = 0;
    }
    
    public final void hideNotify() {
        this.j = false;
    }
    
    public final void showNotify() {
        this.j = true;
    }
    
    public final void q() {
        if (this.v < 0) {
            return;
        }
        if (++this.u <= 7) {
            this.repaint();
            this.serviceRepaints();
        }
    }
    
    public final void paint(final Graphics graphics) {
        if (!this.j) {
            return;
        }
        i.h.d(graphics, this.v, this.u);
    }
}
