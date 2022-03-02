import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Canvas;

// 
// Decompiled by Procyon v0.5.36
// 

public class b extends Canvas
{
    public static final int r;
    public int q;
    public int p;
    public int[] o;
    public String[] n;
    public String m;
    public int l;
    public int k;
    public boolean j;
    
    public b() {
        this.q = 0;
        this.p = 0;
        this.l = 0;
        this.j = false;
        this.m = "";
        this.n = new String[10];
        this.o = new int[10];
    }
    
    public final int n() {
        return this.o[this.l];
    }
    
    public final void m(final int q) {
        if (this.q == q) {
            return;
        }
        ((Displayable)this).removeCommand(Main.ak);
        ((Displayable)this).removeCommand(Main.al);
        ((Displayable)this).removeCommand(Main.aa);
        this.q = q;
        this.k = 0;
        this.p = 0;
        this.l = 0;
        switch (this.q) {
            case 2: {
                this.l(1, "Continue");
            }
            case 1: {
                this.l(2, "New Game");
                this.l(3, "High Scores");
                this.l(4, "Credits");
                this.l(5, "About");
                this.l(6, "Exit");
                this.m = "Block and Score(TM)";
                ((Displayable)this).addCommand((this.q == 2) ? Main.ak : Main.aa);
                break;
            }
            case 3: {
                this.m = "Select Game";
                this.l(7, "Beginner");
                this.l(8, "Intermediate");
                this.l(9, "Expert");
                this.l(10, "Demo");
                ((Displayable)this).addCommand(Main.al);
                break;
            }
        }
    }
    
    public final void paint(final Graphics bk) {
        if (!this.j) {
            return;
        }
        int n = (this.p < b.r) ? this.p : b.r;
        final int n2 = h.ba + (142 - h.ba - h.a8 * n) / 2;
        h.bk = bk;
        h.x();
        h.y(this.m);
        h.z(0, n2, 120, h.a8 * n, 16777215, 11582660, 16777215);
        bk.setFont(h.a9);
        while (n-- > 0) {
            if (this.k + n == this.l) {
                bk.setColor(128);
                bk.fillRect(0, n2 + n * h.a8, 120, h.a8);
                bk.setColor(16777215);
            }
            else {
                bk.setColor(0);
            }
            bk.drawString(this.n[this.k + n], 30, n2 + n * h.a8, 0x4 | 0x10);
        }
    }
    
    private final void l(final int n, final String s) {
        if (this.p >= 10) {
            return;
        }
        this.o[this.p] = n;
        this.n[this.p] = s;
        ++this.p;
    }
    
    public final void keyPressed(final int n) {
        int gameAction = 0;
        try {
            gameAction = ((Canvas)Main.a0).getGameAction(n);
        }
        catch (Exception ex) {}
        if ((gameAction == 1 || n == 50) && this.l > 0) {
            --this.l;
            if (this.l < this.k) {
                this.k = this.l;
            }
        }
        if ((gameAction == 6 || n == 56) && this.l < this.p - 1) {
            ++this.l;
            if (this.l >= this.k + b.r) {
                ++this.k;
            }
        }
        this.repaint();
    }
    
    public final void hideNotify() {
        this.j = false;
    }
    
    public final void showNotify() {
        this.j = true;
    }
    
    public final void k() {
        Main.a1.bl = true;
        Main.ax.j = false;
        Main.az.setCurrent((Displayable)this);
        this.repaint();
    }
    
    static {
        r = (142 - h.ba) / h.a8;
    }
}
