import java.util.Vector;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Canvas;

// 
// Decompiled by Procyon v0.5.36
// 

public class j extends Canvas
{
    public String m;
    public String[] dc;
    public boolean j;
    public boolean db;
    public int da;
    public int c9;
    public int c8;
    public int c7;
    
    public j() {
        this.j = false;
        this.db = false;
        this.c9 = 0;
    }
    
    public final void keyPressed(final int da) {
        this.da = da;
    }
    
    public final void keyReleased(final int n) {
        this.da = 0;
    }
    
    public final void q() {
        if (this.db) {
            if (this.da == this.getKeyCode(1) || this.da == 50) {
                this.c9 -= 6;
                if (this.c9 < this.c8) {
                    this.c9 = this.c8;
                }
            }
            else if (this.da == this.getKeyCode(6) || this.da == 56) {
                this.c9 += 6;
            }
            else if (this.db) {
                this.c9 += 2;
            }
            if (this.c9 > this.c7) {
                Main.a2.t();
                return;
            }
        }
        else if (this.da == this.getKeyCode(1) || this.da == 50) {
            this.c9 -= 6;
            if (this.c9 < this.c8) {
                this.c9 = this.c8;
            }
        }
        else if (this.da == this.getKeyCode(6) || this.da == 56) {
            this.c9 += 6;
            if (this.c9 > this.c7) {
                this.c9 = this.c7;
            }
        }
        this.repaint();
    }
    
    public final void paint(final Graphics bk) {
        h.bk = bk;
        h.w(this.m, this.dc, this.c9);
        bk.setColor(0);
        bk.setClip(0, 0, 120, 142);
        if (this.c9 > this.c8) {
            for (int i = 0; i < 4; ++i) {
                bk.drawLine(53 + i, 141 - i, 60 - i, 141 - i);
            }
        }
        if (this.c9 < this.c7) {
            for (int j = 0; j < 4; ++j) {
                bk.drawLine(60 + j, 137 + j, 67 - j, 137 + j);
            }
        }
    }
    
    public final void hideNotify() {
        this.j = false;
    }
    
    public final void showNotify() {
        this.j = true;
        this.da = 0;
    }
    
    private final void i() {
        final int ba = h.ba;
        final int n = 135;
        if (this.db) {
            this.c8 = (n - ba) / 2;
            this.c7 = this.dc.length * h.a6 + n - ba;
        }
        else {
            this.c8 = n - ba;
            this.c7 = this.dc.length * h.a6;
        }
        if (this.c7 < this.c8) {
            this.c7 = this.c8;
        }
        this.c9 = this.c8;
    }
    
    public final void bl(final String m, final String[] dc, final boolean db) {
        Main.a1.bl = true;
        this.m = m;
        this.dc = dc;
        this.db = db;
        this.i();
        Main.az.setCurrent((Displayable)this);
    }
    
    public static final String[] bk(final String s) {
        int i;
        int beginIndex = i = 0;
        final Vector vector = new Vector<String>();
        while (i < s.length()) {
            int endIndex = s.indexOf(10, i);
            if (endIndex < 0) {
                endIndex = s.length();
            }
            while (i < endIndex) {
                int endIndex2 = s.indexOf(32, i);
                if (endIndex2 < 0) {
                    endIndex2 = s.length();
                }
                if (endIndex < endIndex2) {
                    endIndex2 = endIndex;
                }
                if (h.a7.stringWidth(s.substring(beginIndex, endIndex2)) > 112) {
                    vector.addElement(s.substring(beginIndex, i));
                    beginIndex = i;
                }
                i = endIndex2 + 1;
            }
            vector.addElement(s.substring(beginIndex, endIndex));
            beginIndex = (i = endIndex + 1);
        }
        final int size = vector.size();
        final String[] array = new String[size];
        for (int j = 0; j < size; ++j) {
            array[j] = vector.elementAt(j);
        }
        System.gc();
        return array;
    }
}
