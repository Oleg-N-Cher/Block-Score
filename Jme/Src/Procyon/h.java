import java.util.Vector;
import java.io.IOException;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Canvas;

// 
// Decompiled by Procyon v0.5.36
// 

public class h extends Canvas
{
    public static Graphics bk;
    public Image bj;
    public Image[] bi;
    public Image bh;
    public Image bg;
    public Image[] bf;
    public Image[] be;
    public static final Font bd;
    public static final int bc;
    public static final Font bb;
    public static final int ba;
    public static final Font a9;
    public static final int a8;
    public static final Font a7;
    public static final int a6;
    public boolean a5;
    
    public h() {
        this.a5 = true;
    }
    
    public final boolean ar() {
        this.bi = new Image[4];
        this.be = new Image[8];
        this.bf = new Image[4];
        return true;
    }
    
    public final boolean aq() {
        try {
            if (this.bj == null) {
                this.bj = Image.createImage("/board.png");
            }
        }
        catch (IOException ex) {
            return false;
        }
        return true;
    }
    
    public final boolean ap() {
        try {
            for (int i = 0; i < 4; ++i) {
                if (this.bi[i] == null) {
                    this.bi[i] = Image.createImage("/ball" + i + ".png");
                }
            }
        }
        catch (IOException ex) {
            return false;
        }
        return true;
    }
    
    public final boolean ao() {
        try {
            if (this.bh == null) {
                this.bh = Image.createImage("/a_player.png");
            }
            if (this.bg == null) {
                this.bg = Image.createImage("/b_player.png");
            }
        }
        catch (IOException ex) {
            return false;
        }
        return true;
    }
    
    public final boolean an() {
        try {
            for (int i = 0; i < 4; ++i) {
                if (this.be[i] == null) {
                    this.be[i] = Image.createImage("/goal" + i + ".png");
                }
            }
        }
        catch (IOException ex) {
            return false;
        }
        return true;
    }
    
    public final boolean am() {
        try {
            for (int i = 4; i < 8; ++i) {
                if (this.be[i] == null) {
                    this.be[i] = Image.createImage("/goal" + i + ".png");
                }
            }
        }
        catch (IOException ex) {
            return false;
        }
        return true;
    }
    
    public final boolean al() {
        try {
            for (int i = 0; i < 2; ++i) {
                if (this.bf[i] == null) {
                    this.bf[i] = Image.createImage("/bigplayer" + i + ".png");
                }
            }
        }
        catch (IOException ex) {
            return false;
        }
        return true;
    }
    
    public final boolean ak() {
        try {
            for (int i = 2; i < 4; ++i) {
                if (this.bf[i] == null) {
                    this.bf[i] = Image.createImage("/bigplayer" + i + ".png");
                }
            }
        }
        catch (IOException ex) {
            return false;
        }
        return true;
    }
    
    public final void keyPressed(final int n) {
        if (Main.a1 != null) {
            Main.a1.a3(n);
        }
    }
    
    public final void keyReleased(final int n) {
        if (n == this.getKeyCode(8)) {
            return;
        }
        if (Main.a1 != null) {
            Main.a1.a2(n);
        }
    }
    
    public final void hideNotify() {
        if (Main.a1 != null) {
            Main.a1.ax();
            Main.a1.bl = true;
        }
    }
    
    public final void showNotify() {
        if (Main.a1 != null) {
            Main.a1.aw();
            Main.a1.bl = false;
            final i a1 = Main.a1;
            final i a2 = Main.a1;
            final i a3 = Main.a1;
            final i a4 = Main.a1;
            final boolean b = false;
            a4.cw = b;
            a3.cx = b;
            a2.cy = b;
            a1.cz = b;
            final i a5 = Main.a1;
            final i a6 = Main.a1;
            final i a7 = Main.a1;
            final i a8 = Main.a1;
            final boolean b2 = false;
            a8.cs = b2;
            a7.ct = b2;
            a6.cu = b2;
            a5.cv = b2;
        }
    }
    
    public final void paint(final Graphics bk) {
        if (Main.a1 != null) {
            this.a5 = !this.a5;
            h.bk = bk;
            Main.a1.at(bk);
        }
    }
    
    public static void aj(final String s) {
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
                if (h.a7.stringWidth(s.substring(beginIndex, endIndex2)) > 90) {
                    vector.addElement(s.substring(beginIndex, i));
                    beginIndex = i;
                }
                i = endIndex2 + 1;
            }
            vector.addElement(s.substring(beginIndex, endIndex));
            beginIndex = (i = endIndex + 1);
        }
        final int size = vector.size();
        int n;
        for (int j = n = 0; j < size; ++j) {
            final int stringWidth = h.a7.stringWidth((String)vector.elementAt(j));
            if (n < stringWidth) {
                n = stringWidth;
            }
        }
        h.bk.setFont(h.a7);
        final int height = h.a7.getHeight();
        n += 16;
        final int n2 = height * size + 16;
        int n3 = (120 - n) / 2;
        int n4 = 35 + (72 - n2) / 2;
        h.bk.setColor(0);
        h.bk.fillRect(n3, n4, n, n2);
        n3 += 2;
        n4 += 2;
        h.bk.setColor(10526880);
        h.bk.drawRect(n3, n4, n - 5, n2 - 5);
        h.bk.setColor(16777215);
        final int n5 = 60;
        int n6 = 71 - size * height / 2;
        for (int k = 0; k < size; ++k) {
            h.bk.drawString((String)vector.elementAt(k), n5, n6, 0x10 | 0x1);
            n6 += height;
        }
    }
    
    public final void ai() {
        h.bk.setFont(h.bd);
        h.bk.setColor(16777215);
        final int n = 8 - h.bc / 2;
        h.bk.drawString(Main.a1.au(0), 30, n, 0x10 | 0x1);
        h.bk.drawString(Main.a1.au(1), 90, n, 0x10 | 0x1);
        final int n2 = 26 - h.bc / 2;
        h.bk.drawString("" + Main.a1.bq, 30, n2, 0x10 | 0x1);
        h.bk.drawString("" + Main.a1.bp, 90, n2, 0x10 | 0x1);
        String s = "";
        String s2 = "";
        if (Main.a1.bn != 100 && Main.a1.bn != 101 && Main.a1.bn != 102) {
            s = ((Main.a1.bt == 0) ? "Move" : "Wait");
            s2 = ((Main.a1.bt == 1) ? "Move" : "Wait");
        }
        else if (Main.a1.bm == 2) {
            s = "Win";
            s2 = "Lose";
        }
        else if (Main.a1.bm == 3) {
            s = "Lose";
            s2 = "Win";
        }
        else if (Main.a1.bm == 1) {
            s = "Draw";
            s2 = "Draw";
        }
        final int n3 = (249 - h.bc) / 2;
        h.bk.drawString(s, 30, n3, 0x10 | 0x1);
        h.bk.drawString(s2, 90, n3, 0x10 | 0x1);
    }
    
    public final void ah() {
        h.bk.drawImage(this.bj, 0, 0, 20);
    }
    
    private final int ag(final int n) {
        if (Main.a1.bs == 0) {
            return 6 * n + 12;
        }
        return 6 * (16 - n - 1) + 12;
    }
    
    private final int af(final int n) {
        if (Main.a1.bs == 0) {
            return 6 * n + 35;
        }
        return 6 * (12 - n - 1) + 35;
    }
    
    public final void ae(int ag, int af, final int n) {
        final int height = this.bi[0].getHeight();
        ag = this.ag(ag);
        af = this.af(af);
        h.bk.setClip(ag, af, height, height);
        h.bk.drawImage(this.bi[0], (n == 0) ? ag : (ag - height), af, 20);
        h.bk.setClip(0, 0, 120, 142);
    }
    
    public final void ad(int n, int n2, final int n3, int n4) {
        if (n4 < 0) {
            n4 = 0;
        }
        else if (n4 >= this.bi.length) {
            n4 = this.bi.length - 1;
        }
        int height;
        int n5 = height = this.bi[n4].getHeight();
        n += 3 - height / 2;
        n2 += 3 - n5 / 2;
        final int n6 = (n3 == 0) ? n : (n - height);
        final int n7 = n2;
        if (n < 0) {
            height += n;
            n = 0;
        }
        if (n2 < 0) {
            n5 += n2;
            n2 = 0;
        }
        if (n + height > 96) {
            height = 96 - n;
        }
        if (n2 + n5 > 72) {
            n5 = 72 - n2;
        }
        h.bk.setClip(12 + n, 35 + n2, (height > 0) ? height : 0, (n5 > 0) ? n5 : false);
        h.bk.drawImage(this.bi[n4], n6 + 12, n7 + 35, 20);
        h.bk.setClip(0, 0, 120, 142);
    }
    
    public final void ac(int ag, int af, int n) {
        ag = this.ag(ag);
        af = this.af(af);
        if (Main.a1.bs != 0) {
            switch (n) {
                case 0: {
                    n = 1;
                    break;
                }
                case 2: {
                    n = 3;
                    break;
                }
                case 3: {
                    n = 2;
                    break;
                }
            }
        }
        h.bk.setClip(ag, af, 6, 6);
        if (Main.a1.bt == 0) {
            h.bk.drawImage(this.bh, ag - n * 6, af, 20);
        }
        else {
            h.bk.drawImage(this.bg, ag - n * 6, af, 20);
        }
        h.bk.setClip(0, 0, 120, 142);
    }
    
    public final void ab(int n) {
        if (n >= this.bf.length) {
            n = this.bf.length - 1;
        }
        final int height = this.bf[n].getHeight();
        int n2;
        int n3;
        int n4;
        if (Main.a1.bt == 0) {
            if (Main.a1.bs == 0) {
                n2 = 1;
                n3 = 63 - height / 2;
                n4 = 107 - height;
            }
            else {
                n2 = 0;
                n3 = 57 - height / 2;
                n4 = 35;
            }
        }
        else if (Main.a1.bs == 0) {
            n2 = 2;
            n3 = 63 - height / 2;
            n4 = 35;
        }
        else {
            n2 = 3;
            n3 = 57 - height / 2;
            n4 = 107 - height;
        }
        h.bk.setClip(n3, n4, height, height);
        h.bk.drawImage(this.bf[n], n3 - n2 * height, n4, 20);
        h.bk.setClip(0, 0, 120, 142);
    }
    
    public static void aa(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        final int n7 = n5 >> 16 & 0xFF;
        final int n8 = n5 >> 8 & 0xFF;
        final int n9 = n5 & 0xFF;
        final int n10 = (n6 >> 16 & 0xFF) - n7;
        final int n11 = (n6 >> 8 & 0xFF) - n8;
        final int n12 = (n6 & 0xFF) - n9;
        for (int i = 0; i < n4; ++i) {
            h.bk.setColor(n7 + n10 * i / n4, n8 + n11 * i / n4, n9 + n12 * i / n4);
            h.bk.fillRect(n, n2 + i, n3, 1);
        }
    }
    
    public static void aa(final Graphics graphics, final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        final int n7 = n5 >> 16 & 0xFF;
        final int n8 = n5 >> 8 & 0xFF;
        final int n9 = n5 & 0xFF;
        final int n10 = (n6 >> 16 & 0xFF) - n7;
        final int n11 = (n6 >> 8 & 0xFF) - n8;
        final int n12 = (n6 & 0xFF) - n9;
        for (int i = 0; i < n4; ++i) {
            graphics.setColor(n7 + n10 * i / n4, n8 + n11 * i / n4, n9 + n12 * i / n4);
            graphics.fillRect(n, n2 + i, n3, 1);
        }
    }
    
    public static void z(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        final int n8 = n5 >> 16 & 0xFF;
        final int n9 = n5 >> 8 & 0xFF;
        final int n10 = n5 & 0xFF;
        final int n11 = (n6 >> 16 & 0xFF) - n8;
        final int n12 = (n6 >> 8 & 0xFF) - n9;
        final int n13 = (n6 & 0xFF) - n10;
        for (int i = 0; i < n3; ++i) {
            h.bk.setColor(n8 + n11 * i / n3, n9 + n12 * i / n3, n10 + n13 * i / n3);
            h.bk.fillRect(n + i, n2, 1, n4);
        }
        h.bk.setColor(n7 >> 16 & 0xFF, n7 >> 8 & 0xFF, n7 & 0xFF);
        for (int j = 1; j < n4; j += 3) {
            h.bk.fillRect(n, n2 + j, n3, 1);
        }
    }
    
    public static void y(final Graphics graphics, final String s) {
        aa(graphics, 0, 0, 120, h.ba, 128, 1082576);
        graphics.setColor(16777215);
        graphics.setFont(h.bb);
        graphics.drawString(s, 60, 0, 0x1 | 0x10);
    }
    
    public static void y(final String s) {
        aa(0, 0, 120, h.ba, 128, 1082576);
        h.bk.setColor(16777215);
        h.bk.setFont(h.bb);
        h.bk.drawString(s, 60, 0, 0x1 | 0x10);
    }
    
    public static void x() {
        h.bk.setColor(16777215);
        h.bk.fillRect(0, 0, 120, 142);
    }
    
    public static void w(final String s, final String[] array, final int n) {
        final int ba = h.ba;
        x();
        y(s);
        h.bk.setColor(0);
        h.bk.fillRect(0, 135, 120, 1);
        h.bk.setFont(h.a7);
        h.bk.setClip(0, ba, 120, 135 - ba);
        int n2;
        int n3;
        for (n2 = 135 - n, n3 = 0; n2 + h.a6 < ba; n2 += h.a6, ++n3) {}
        if (n3 < array.length) {
            for (int n4 = n3; n4 < array.length && n2 < 135; n2 += h.a6, ++n4) {
                h.bk.drawString(array[n4], 60, n2, 17);
            }
        }
    }
    
    static {
        Font.getFont(0, 0, 8);
        bd = Font.getFont(0, 0, 0);
        bc = h.bd.getHeight();
        bb = Font.getFont(0, 1, 16);
        ba = h.bb.getHeight();
        a9 = Font.getFont(0, 0, 0);
        a8 = h.a9.getHeight();
        a7 = Font.getFont(0, 0, 8);
        a6 = h.a7.getHeight();
    }
}
