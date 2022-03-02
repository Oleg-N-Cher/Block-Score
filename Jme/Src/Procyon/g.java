import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import java.io.IOException;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.Canvas;

// 
// Decompiled by Procyon v0.5.36
// 

public class g extends Canvas
{
    public int a4;
    public Image a3;
    
    public final void v(final int a4) {
        this.a4 = a4;
        this.repaint();
        try {
            Thread.currentThread();
            Thread.sleep(100L);
        }
        catch (Exception ex) {}
        this.serviceRepaints();
    }
    
    public final void showNotify() {
        this.repaint();
        this.serviceRepaints();
    }
    
    public g() {
        this.a4 = 0;
        this.a3 = null;
        for (int i = 0; i < 10; ++i) {
            try {
                this.a3 = Image.createImage("/load.png");
            }
            catch (IOException ex) {}
            if (this.a3 != null) {
                break;
            }
        }
    }
    
    public final void paint(final Graphics graphics) {
        final int n = 116 * this.a4 / 10;
        final Font font = Font.getFont(0, 1, 0);
        final int n2 = font.getHeight() + 4;
        final String string = this.a4 * 100L / 10L + " %";
        graphics.setColor(16777215);
        graphics.fillRect(0, 0, 120, 142);
        int height;
        if (this.a3 != null) {
            graphics.drawImage(this.a3, 60, 0, 17);
            height = this.a3.getHeight();
        }
        else {
            height = 0;
        }
        graphics.setColor(0);
        graphics.drawRect(0, height, 119, n2 - 1);
        graphics.fillRect(2, height + 2, n, n2 - 4);
        graphics.setFont(font);
        for (int i = 0; i < 2; ++i) {
            graphics.drawString(string, 60, height + 3, 17);
            if (i == 0) {
                graphics.setGrayScale(255);
                graphics.setClip(2, height, n, n2 - 1);
            }
        }
    }
}
