import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.Canvas;

// 
// Decompiled by Procyon v0.5.36
// 

public class d extends Canvas
{
    public Image t;
    
    public d(final Main main, final Image t) {
        this.t = t;
    }
    
    public final void paint(final Graphics graphics) {
        graphics.drawImage(this.t, 0, 0, 20);
    }
}
