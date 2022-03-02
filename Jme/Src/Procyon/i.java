import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.TextField;
import java.util.Random;
import javax.microedition.lcdui.Form;

// 
// Decompiled by Procyon v0.5.36
// 

public class i implements Runnable
{
    public static final int[] c6;
    public static final int[] c5;
    public static final int[] c4;
    public static final int[] c3;
    public static final int[] c2;
    public long c1;
    public long c0;
    public int c_;
    public boolean cz;
    public boolean cy;
    public boolean cx;
    public boolean cw;
    public boolean cv;
    public boolean cu;
    public boolean ct;
    public boolean cs;
    public int cr;
    public static a h;
    public Form cq;
    public Random cp;
    public TextField co;
    public String cn;
    public int cm;
    public int[] bj;
    public int[] cl;
    public int[] ck;
    public int[] cj;
    public int[] ci;
    public int ch;
    public static final String[] cg;
    public int cf;
    public int ce;
    public int cd;
    public int cc;
    public int cb;
    public int ca;
    public int b9;
    public int b8;
    public int b7;
    public int b6;
    public int b5;
    public int b4;
    public int b3;
    public int b2;
    public int b1;
    public int b0;
    public int b_;
    public int bz;
    public int by;
    public int bx;
    public int bw;
    public int bv;
    public int bu;
    public int bt;
    public int bs;
    public int br;
    public int bq;
    public int bp;
    public int bo;
    public int bn;
    public int bm;
    public boolean s;
    public boolean bl;
    
    public i() {
        this.cm = -1;
        this.ch = 0;
        this.bn = 100;
        this.s = true;
        this.bl = true;
        this.cn = new String("Player");
        i.h = new a();
        this.cp = new Random();
        this.co = new TextField((String)null, "Player", 6, 0);
        ((Displayable)(this.cq = new Form((String)null))).addCommand(Main.ag);
        ((Displayable)this.cq).setCommandListener(Main.a2.x);
    }
    
    public final boolean bj() {
        if (!i.h.b()) {
            return false;
        }
        this.bj = new int[192];
        this.cl = new int[192];
        this.ck = new int[192];
        this.cj = new int[256];
        this.ci = new int[256];
        return true;
    }
    
    public final void bi() {
        final String trim = this.co.getString().replace('\n', ' ').trim();
        if (trim.length() != 0) {
            this.cn = trim;
        }
        i.h.j(this.cn);
        i.h.e(this.cm, this.cn);
    }
    
    public final void bh(final int n) {
        Main.a2.ap = true;
        this.i(n);
        Main.az.setCurrent((Displayable)Main.a0);
    }
    
    public final void i(final int c_) {
        i.h.i();
        this.a0(5);
        this.bm = 0;
        this.bt = 1;
        this.c_ = c_;
        this.bs = 0;
        this.br = 1 - this.bs;
        this.cd = 3;
        this.cf = 8;
        this.ce = 11;
        final int n = 0;
        this.bp = n;
        this.bq = n;
        for (int i = 0; i < 192; ++i) {
            this.bj[i] = 0;
        }
        for (int j = 0; j < 14; ++j) {
            int n2;
            int n3;
            while (true) {
                n2 = this.as(14) + 1;
                n3 = this.as(4) + 1;
                if (this.bb(n2, n3) > 0) {
                    continue;
                }
                if (this.bb(n2 - 1, n3) > 0 && this.bb(n2 + 1, n3) > 0) {
                    continue;
                }
                if (this.bb(n2, n3 - 1) > 0 && this.bb(n2, n3 + 1) > 0) {
                    continue;
                }
                int n4 = 0;
                if (this.bb(n2 - 1, n3 - 1) > 0) {
                    ++n4;
                }
                if (this.bb(n2, n3 - 1) > 0) {
                    ++n4;
                }
                if (this.bb(n2 + 1, n3 - 1) > 0) {
                    ++n4;
                }
                if (this.bb(n2 - 1, n3) > 0) {
                    ++n4;
                }
                if (this.bb(n2 + 1, n3) > 0) {
                    ++n4;
                }
                if (this.bb(n2 - 1, n3 + 1) > 0) {
                    ++n4;
                }
                if (this.bb(n2, n3 + 1) > 0) {
                    ++n4;
                }
                if (this.bb(n2 + 1, n3 + 1) > 0) {
                    ++n4;
                }
                if (n4 < 3) {
                    break;
                }
            }
            this.bj[n3 * 16 + n2] = 2;
            this.bj[(12 - n3 - 1) * 16 + n2] = 1;
        }
        if (this.c_ == 3) {
            this.ch = 0;
            this.a0(53);
        }
        this.c1 = System.currentTimeMillis();
        this.c0 = 0L;
        this.ax();
    }
    
    private final void bg() {
        for (int i = 0; i < 192; ++i) {
            this.cl[i] = 0;
        }
        this.cl[this.ce * 16 + this.cf] = 1;
        int n = 1;
        boolean b;
        do {
            ++n;
            b = false;
            for (int j = 0; j < 192; ++j) {
                this.ck[j] = this.cl[j];
            }
            for (int k = 0; k < 12; ++k) {
                for (int l = 0; l < 16; ++l) {
                    if (this.ck[k * 16 + l] == 0 && this.bb(l, k) == 0 && (this.a8(l - 1, k) > 0 || this.a8(l + 1, k) > 0 || this.a8(l, k - 1) > 0 || this.a8(l, k + 1) > 0)) {
                        this.cl[k * 16 + l] = n;
                        b = true;
                    }
                }
            }
        } while (b);
    }
    
    private final boolean bf(final int n) {
        this.cf = 8;
        this.ce = ((n == 0) ? 0 : 11);
        this.bg();
        for (int i = 1; i < 11; ++i) {
            for (int j = 1; j < 15; ++j) {
                if (this.bb(j, i) == n + 1) {
                    if (this.ba(j - 1, i) > 0 && this.bb(j + 1, i) == 0) {
                        return true;
                    }
                    if (this.ba(j + 1, i) > 0 && this.bb(j - 1, i) == 0) {
                        return true;
                    }
                    if (n == 0) {
                        if (this.ba(j, i + 1) > 0 && this.bb(j, i - 1) == 0) {
                            return true;
                        }
                    }
                    else if (this.ba(j, i - 1) > 0 && this.bb(j, i + 1) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    private final int be(int n, int n2, final int n3, final int n4) {
        int n5 = -1;
        do {
            ++n5;
            n += n3;
            n2 += n4;
        } while (this.a9(n, n2) == 0);
        if (n2 <= 0 || n2 >= 11) {
            n5 += 5;
        }
        return n5;
    }
    
    private final void bd() {
        this.bg();
        final int n = (this.bt == 0) ? 2 : 1;
        final int n2 = (this.bt > 0) ? 1 : -1;
        int n3 = 0;
        for (int i = 1; i < 11; ++i) {
            for (int j = 1; j < 15; ++j) {
                if (this.bb(j, i) == this.bt + 1) {
                    if (this.ba(j, i - n2) > 0) {
                        final int be = this.be(j, i, 0, n2);
                        if (be > 0) {
                            int n4;
                            if (this.c_ >= 2 && this.a9(j, i + n2 * (be + 1)) == n && ((this.a9(j - 1, i + n2 * be) == n && this.a9(j - 1, i + n2 * (be + 1)) == n) || (this.a9(j + 1, i + n2 * be) == n && this.a9(j + 1, i + n2 * (be + 1)) == n))) {
                                n4 = be * 10 + 5000;
                            }
                            else if (this.c_ > 0) {
                                n4 = be * 10 + 1000;
                            }
                            else {
                                n4 = this.as(500) + 500;
                            }
                            if (n3 < n4) {
                                this.cj[0] = j;
                                this.ci[0] = i;
                                this.cj[1] = j;
                                this.ci[1] = i - n2;
                                n3 = n4;
                            }
                        }
                    }
                    if (this.ba(j - 1, i) > 0) {
                        final int be2 = this.be(j, i, 1, 0);
                        if (be2 > 0) {
                            int n5;
                            if (this.c_ == 0) {
                                n5 = this.as(1000) + 1;
                            }
                            else if (j + be2 >= 15 || this.ba(j + be2, i - n2) == 0 || this.bb(j + be2, i + n2) > 0) {
                                n5 = 1;
                            }
                            else {
                                final int be3 = this.be(j, i, 0, n2);
                                final int be4 = this.be(j + be2, i, 0, n2);
                                int n6;
                                if (this.a9(j, i + n2 * (be3 + 1)) == n) {
                                    if (this.c_ >= 2 && ((this.a9(j + be2 - 1, i + n2 * be3) == n && this.a9(j + be2 - 1, i + n2 * (be3 + 1)) == n) || (this.a9(j + be2 + 1, i + n2 * be3) == n && this.a9(j + be2 + 1, i + n2 * (be3 + 1)) == n))) {
                                        n6 = 2000;
                                    }
                                    else if (this.c_ > 0 && this.a9(j, i + n2 * (be3 + 2)) == n) {
                                        n6 = 500;
                                    }
                                    else {
                                        n6 = 5;
                                    }
                                }
                                else {
                                    n6 = 1000;
                                }
                                n5 = n6 + be4 * 10;
                            }
                            if (n3 < n5) {
                                this.cj[0] = j;
                                this.ci[0] = i;
                                this.cj[1] = j - 1;
                                this.ci[1] = i;
                                n3 = n5;
                            }
                        }
                    }
                    if (this.ba(j + 1, i) > 0) {
                        final int be5 = this.be(j, i, -1, 0);
                        if (be5 > 0) {
                            int n7;
                            if (this.c_ == 0) {
                                n7 = this.as(1000) + 1;
                            }
                            else if (j - be5 <= 0 || this.ba(j - be5, i - n2) == 0 || this.bb(j - be5, i + n2) > 0) {
                                n7 = 1;
                            }
                            else {
                                final int be6 = this.be(j, i, 0, n2);
                                final int be7 = this.be(j - be5, i, 0, n2);
                                int n8;
                                if (this.a9(j, i + n2 * (be6 + 1)) == n) {
                                    if (this.c_ >= 2 && ((this.a9(j - be5 - 1, i + n2 * be6) == n && this.a9(j - be5 - 1, i + n2 * (be6 + 1)) == n) || (this.a9(j - be5 + 1, i + n2 * be6) == n && this.a9(j - be5 + 1, i + n2 * (be6 + 1)) == n))) {
                                        n8 = 2000;
                                    }
                                    else if (this.c_ > 0 && this.a9(j, i + n2 * (be6 + 2)) == n) {
                                        n8 = 500;
                                    }
                                    else {
                                        n8 = 5;
                                    }
                                }
                                else {
                                    n8 = 1000;
                                }
                                n7 = n8 + be7 * 10;
                            }
                            if (n3 < n7) {
                                this.cj[0] = j;
                                this.ci[0] = i;
                                this.cj[1] = j + 1;
                                this.ci[1] = i;
                                n3 = n7;
                            }
                        }
                    }
                }
            }
        }
        for (int k = 0; k < 192; ++k) {
            this.ck[k] = this.cl[k];
        }
        int n9 = this.cj[1];
        int n10 = this.ci[1];
        this.cc = 2;
        do {
            final int ba = this.ba(n9, n10);
            this.cj[this.cc] = n9;
            this.ci[this.cc] = n10;
            ++this.cc;
            if (this.a7(n9 - 1, n10) < ba) {
                --n9;
            }
            else if (this.a7(n9 + 1, n10) < ba) {
                ++n9;
            }
            else if (this.a7(n9, n10 - 1) < ba) {
                --n10;
            }
            else {
                if (this.a7(n9, n10 + 1) >= ba) {
                    continue;
                }
                ++n10;
            }
        } while (this.ba(n9, n10) != 1);
    }
    
    private final void bc() {
        this.bt = ((this.bt == 0) ? 1 : 0);
        if (!this.bf(this.bt)) {
            if (!this.bf((this.bt == 0) ? 1 : 0)) {
                if (this.bq == this.bp) {
                    this.bm = 1;
                }
                else {
                    this.bm = ((this.bq > this.bp) ? 2 : 3);
                }
                this.a0(7);
            }
            else {
                this.a0(6);
            }
            return;
        }
        this.a0(2);
        this.cr = 0;
        this.cd = ((this.bt > 0) ? 4 : 3);
        this.cf = 8;
        this.ce = ((this.bt > 0) ? 0 : 11);
        if (this.bt == this.br || this.c_ == 3) {
            this.bd();
        }
    }
    
    public final void p() {
        new Thread(this).start();
    }
    
    public final void o() {
        this.s = true;
    }
    
    public final void run() {
        this.s = false;
        while (!this.s) {
            Main.a2.s();
            if (this.bl) {
                try {
                    Thread.currentThread();
                    Thread.sleep(100L);
                }
                catch (Exception ex) {}
            }
            else {
                this.av();
                if (this.bl) {
                    continue;
                }
                ((Canvas)Main.a0).repaint();
                int n = 0;
                switch (this.bn) {
                    case 3: {
                        n = 150;
                        break;
                    }
                    case 2:
                    case 4:
                    case 101: {
                        n = 75;
                        break;
                    }
                    case 102: {
                        n = 500;
                        break;
                    }
                    default: {
                        n = 250;
                        break;
                    }
                }
                try {
                    Thread.currentThread();
                    Thread.sleep(n);
                }
                catch (Exception ex2) {}
                ((Canvas)Main.a0).serviceRepaints();
            }
        }
    }
    
    private final int bb(final int n, final int n2) {
        return this.bj[n2 * 16 + n];
    }
    
    private final int ba(final int n, final int n2) {
        return this.cl[n2 * 16 + n];
    }
    
    private final int a9(final int n, final int n2) {
        if (n < 0 || n >= 16 || n2 < 0 || n2 >= 12) {
            return 3;
        }
        return this.bj[n2 * 16 + n];
    }
    
    private final int a8(final int n, final int n2) {
        if (n < 0 || n >= 16 || n2 < 0 || n2 >= 12) {
            return 0;
        }
        return this.ck[n2 * 16 + n];
    }
    
    private final int a7(final int n, final int n2) {
        if (n < 0 || n >= 16 || n2 < 0 || n2 >= 12 || this.cl[n2 * 16 + n] == 0) {
            return 10000;
        }
        return this.cl[n2 * 16 + n];
    }
    
    private final int a6(final int n, final int n2) {
        if (n == 2) {
            return n2;
        }
        if (n == 1) {
            return -n2;
        }
        return 0;
    }
    
    private final int a5(final int n, final int n2) {
        if (n == 4) {
            return n2;
        }
        if (n == 3) {
            return -n2;
        }
        return 0;
    }
    
    private final void a4(final int cd) {
        this.cd = cd;
        final int a6 = this.a6(cd, 1);
        final int a7 = this.a5(cd, 1);
        int n = this.cf + a6;
        int n2 = this.ce + a7;
        if (n < 0 || n >= 16 || n2 < 0 || n2 >= 12) {
            return;
        }
        final int a8 = this.a9(n, n2);
        if (a8 == 0) {
            this.cf = n;
            this.ce = n2;
        }
        else if (a8 == this.bt + 1) {
            if ((this.bt == 0 && a7 == 1) || (this.bt == 1 && a7 == -1)) {
                this.a0(52);
                return;
            }
            if (this.a9(n + a6, n2 + a7) > 0) {
                this.a0(51);
                return;
            }
            this.cb = n;
            this.ca = n2;
            int n3 = 0;
            int a9;
            do {
                ++n3;
                n += a6;
                n2 += a7;
                if (n < -1 || n > 16 || n2 < 0) {
                    break;
                }
                if (n2 >= 12) {
                    break;
                }
                a9 = this.a9(n, n2);
            } while (a9 == 0 || a9 == 3);
            if (n3 > 1) {
                this.a0(4);
                this.b7 = a8;
                this.b5 = n3 - 1;
                this.b6 = this.b5 * 3;
                this.b9 = this.cb + (n3 - 1) * a6;
                this.b8 = this.ca + (n3 - 1) * a7;
                this.bj[this.ca * 16 + this.cb] = 0;
            }
        }
        else {
            this.a0(50);
        }
    }
    
    public final void a3(final int n) {
        if (n == 53) {
            switch (this.bn) {
                case 6: {
                    this.a0(5);
                    return;
                }
                case 7: {
                    this.a_();
                    return;
                }
                case 50:
                case 51:
                case 52: {
                    this.a0(1);
                    this.cr = 0;
                    return;
                }
                case 53: {
                    ++this.ch;
                    if (this.ch < 13) {
                        this.a0(53);
                    }
                    else {
                        this.a0(5);
                    }
                    return;
                }
                case 101: {
                    this.b0 = 23;
                    this.b_ = 23;
                    this.a0(102);
                    return;
                }
                case 102: {
                    this.az(false);
                    return;
                }
            }
        }
        if (this.c_ == 3 && this.bn != 53 && this.bn != 6 && this.bn != 7 && this.bn != 50 && this.bn != 51 && this.bn != 52 && (n == 48 || n == 49 || n == 50 || n == 51 || n == 52 || n == 53 || n == 54 || n == 55 || n == 56 || n == 57 || n == 42 || n == 35 || n == ((Canvas)Main.a0).getKeyCode(2) || n == ((Canvas)Main.a0).getKeyCode(5) || n == ((Canvas)Main.a0).getKeyCode(1) || n == ((Canvas)Main.a0).getKeyCode(6) || n == ((Canvas)Main.a0).getKeyCode(8))) {
            Main.a2.ap = false;
            this.bn = 100;
            Main.a_.m(3);
            Main.a_.k();
            return;
        }
        if (this.bn == 2 && this.bo < 8) {
            this.bo = 8;
        }
        if (n == ((Canvas)Main.a0).getKeyCode(2)) {
            this.cy = true;
        }
        else if (n == ((Canvas)Main.a0).getKeyCode(5)) {
            this.cz = true;
        }
        else if (n == ((Canvas)Main.a0).getKeyCode(1)) {
            this.cx = true;
        }
        else if (n == ((Canvas)Main.a0).getKeyCode(6)) {
            this.cw = true;
        }
        else if (n == 50) {
            this.cv = true;
        }
        else if (n == 52) {
            this.cu = true;
        }
        else if (n == 54) {
            this.ct = true;
        }
        else if (n == 56) {
            this.cs = true;
        }
        if (this.bn == 1) {
            if (this.bt == this.br && this.c_ != 3) {
                return;
            }
            if (this.cy || this.cu) {
                this.cr = ((this.bt == 0) ? 1 : 2);
            }
            else if (this.cz || this.ct) {
                this.cr = ((this.bt == 0) ? 2 : 1);
            }
            else if (this.cx || this.cv) {
                this.cr = ((this.bt == 0) ? 3 : 4);
            }
            else if (this.cw || this.cs) {
                this.cr = ((this.bt == 0) ? 4 : 3);
            }
        }
    }
    
    public final void a2(final int n) {
        if (n == ((Canvas)Main.a0).getKeyCode(2)) {
            this.cy = false;
        }
        else if (n == ((Canvas)Main.a0).getKeyCode(5)) {
            this.cz = false;
        }
        else if (n == ((Canvas)Main.a0).getKeyCode(1)) {
            this.cx = false;
        }
        else if (n == ((Canvas)Main.a0).getKeyCode(6)) {
            this.cw = false;
        }
        else if (n == 50) {
            this.cv = false;
        }
        else if (n == 52) {
            this.cu = false;
        }
        else if (n == 54) {
            this.ct = false;
        }
        else if (n == 56) {
            this.cs = false;
        }
    }
    
    private final void a1(final int n) {
        if (this.b0 >= 22 && this.b_ >= 22) {
            this.b0 = 23;
            this.b_ = 23;
            this.a0(102);
            return;
        }
        if (n == 0) {
            ++this.b0;
            if (this.b0 >= 23) {
                return;
            }
            this.bz = i.c6[this.b0];
            this.bx = -1;
            this.b4 = i.c5[this.b0] + 1;
            this.bv = 4;
            this.b2 = 0;
        }
        else {
            ++this.b_;
            if (this.b_ >= 23) {
                return;
            }
            this.by = i.c4[this.b_];
            this.bw = 12;
            this.b3 = 12 - i.c3[this.b_];
            this.bu = 3;
            this.b1 = 0;
        }
        this.a0(101);
    }
    
    public final void a0(final int bn) {
        Main.a0.a5 = true;
        this.bo = 0;
        this.bn = bn;
    }
    
    private final void a_() {
        if (this.c_ < 3 && ((this.bm == 2 && this.bs == 0) || (this.bm == 3 && this.bs == 1))) {
            for (int i = 0; i < 192; ++i) {
                this.bj[i] = 0;
            }
            final int n = -1;
            this.b_ = n;
            this.b0 = n;
            this.a1(0);
            this.a1(1);
        }
        else {
            this.az(false);
        }
    }
    
    public final void az(final boolean b) {
        this.bl = true;
        Main.a2.ap = false;
        this.bn = 100;
        if (this.c_ == 3) {
            Main.a_.m(3);
            Main.az.setCurrent((Displayable)Main.a_);
            return;
        }
        this.cm = i.h.g();
        String s;
        if (b) {
            s = "Score: " + i.h.c() + "\n" + "This is #" + (this.cm + 1) + "\nEnter your name:";
        }
        else {
            String s2 = null;
            switch (this.bm) {
                case 2: {
                    s2 = ((this.bs == 0) ? "You WIN!" : "Team CPU wins.");
                    break;
                }
                case 3: {
                    s2 = ((this.bs == 1) ? "You WIN!" : "Team CPU wins.");
                    break;
                }
                default: {
                    s2 = "Draw.";
                    break;
                }
            }
            String s3;
            if (this.bs == 0) {
                s3 = s2 + "\nYour score: " + this.bq + "\nOpponent: " + this.bp + "\n";
            }
            else {
                s3 = s2 + "\nYour score: " + this.bp + "\nOpponent: " + this.bq + "\n";
            }
            if (this.cm >= 0 && this.cm < 5) {
                s3 = s3 + "Your score is the #" + (this.cm + 1);
            }
            s = s3 + ((this.cm >= 0) ? "\nEnter your name:" : "You didn't place in the Top 5 this time.\nTry again!");
        }
        while (this.cq.size() > 0) {
            this.cq.delete(0);
        }
        final String[] bk = j.bk(s);
        final Image image = Image.createImage(120, h.ba + h.a6 * bk.length);
        final Graphics graphics = image.getGraphics();
        h.y(graphics, "Block and Score(TM)");
        graphics.setColor(65280);
        graphics.fillRect(0, h.ba, 120, h.a6 * bk.length);
        graphics.setFont(h.a7);
        graphics.setClip(0, h.ba, 120, h.a6 * bk.length);
        for (int ba = h.ba, i = 0; i < bk.length; ++i, ba += h.a6) {
            if (!b) {
                if (i == 1) {
                    graphics.setColor(16777215);
                }
                else if (i == 2) {
                    graphics.setColor(16776960);
                }
                else {
                    graphics.setColor(0);
                }
            }
            else {
                graphics.setColor(0);
            }
            graphics.drawString(bk[i], 60, ba, 17);
        }
        this.cq.append(Image.createImage(image));
        System.gc();
        ((Displayable)this.cq).removeCommand(Main.af);
        if (this.cm >= 0) {
            this.co = new TextField((String)null, this.cn, 6, 0);
            this.cq.append((Item)this.co);
            ((Displayable)this.cq).addCommand(Main.af);
        }
        Main.az.setCurrent((Displayable)this.cq);
    }
    
    public final void ay() {
        i.h.f();
        this.o();
    }
    
    public final void ax() {
        if (this.c0 == 0L) {
            this.c0 = System.currentTimeMillis();
        }
    }
    
    public final void aw() {
        if (this.c0 > 0L) {
            final long n = System.currentTimeMillis() - this.c0;
            if (n > 0L) {
                this.c1 += n;
            }
            this.c0 = 0L;
        }
    }
    
    private final void av() {
        final long n = System.currentTimeMillis() - this.c1;
        this.c1 = System.currentTimeMillis();
        switch (this.bn) {
            case 1: {
                if (this.bt == this.br || this.c_ == 3) {
                    if (this.cc-- <= 0) {
                        break;
                    }
                    if (this.cj[this.cc] < this.cf) {
                        this.a4(1);
                        break;
                    }
                    if (this.cj[this.cc] > this.cf) {
                        this.a4(2);
                        break;
                    }
                    if (this.ci[this.cc] < this.ce) {
                        this.a4(3);
                        break;
                    }
                    if (this.ci[this.cc] > this.ce) {
                        this.a4(4);
                        break;
                    }
                    break;
                }
                else {
                    if (this.cy || this.cu) {
                        this.cr = ((this.bt == 0) ? 1 : 2);
                    }
                    else if (this.cz || this.ct) {
                        this.cr = ((this.bt == 0) ? 2 : 1);
                    }
                    else if (this.cx || this.cv) {
                        this.cr = ((this.bt == 0) ? 3 : 4);
                    }
                    else if (this.cw || this.cs) {
                        this.cr = ((this.bt == 0) ? 4 : 3);
                    }
                    if (this.cr != 0) {
                        this.a4(this.cr);
                        this.cr = 0;
                        break;
                    }
                    break;
                }
                break;
            }
            case 2: {
                if (this.bo >= 12) {
                    this.a0(1);
                    break;
                }
                break;
            }
            case 4: {
                if (this.bo <= this.b6) {
                    break;
                }
                if (this.bt == 1) {
                    this.bp += i.c2[this.b8] - i.c2[this.ca];
                    if (this.bs == 1 && this.c_ < 3) {
                        i.h.h(i.c2[this.b8] - i.c2[this.ca]);
                    }
                }
                else {
                    this.bq += i.c2[11 - this.b8] - i.c2[11 - this.ca];
                    if (this.bs == 0 && this.c_ < 3) {
                        i.h.h(i.c2[11 - this.b8] - i.c2[11 - this.ca]);
                    }
                }
                if (this.b8 < 11 && this.b8 > 0) {
                    if (this.b9 > 0 && this.b9 < 15) {
                        this.bj[this.b8 * 16 + this.b9] = this.b7;
                    }
                    this.a0(5);
                    break;
                }
                this.a0(3);
            }
            case 101: {
                if (this.b2 > this.b4) {
                    this.a1(0);
                }
                if (this.b1 > this.b3) {
                    this.a1(1);
                    break;
                }
                break;
            }
            case 3: {
                if (this.bo >= 8) {
                    this.a0(5);
                    break;
                }
                break;
            }
            case 102: {
                if (this.bo >= 10) {
                    this.az(false);
                    break;
                }
                break;
            }
            case 6: {
                if (this.bo >= 10) {
                    this.a0(5);
                    break;
                }
                break;
            }
            case 5: {
                if (this.bo >= 1) {
                    this.bc();
                    break;
                }
                break;
            }
            case 7: {
                if (this.bo >= 20) {
                    this.a_();
                    break;
                }
                break;
            }
            case 50:
            case 51:
            case 52: {
                if (this.bo >= 10) {
                    this.a0(1);
                    this.cr = 0;
                    break;
                }
                break;
            }
            case 53: {
                if (this.bo < 10) {
                    break;
                }
                ++this.ch;
                if (this.ch < 13) {
                    this.a0(53);
                    break;
                }
                this.a0(5);
                break;
            }
        }
    }
    
    public final String au(final int n) {
        if (this.c_ == 3) {
            return "Player" + (n + 1);
        }
        if (n == this.bs) {
            return "You";
        }
        return "Team CPU";
    }
    
    public final void at(final Graphics graphics) {
        if (this.bl) {
            return;
        }
        graphics.clipRect(0, 0, 120, 142);
        Main.a0.ah();
        Main.a0.ai();
        if (this.bn == 3) {
            if (this.bo > 7) {
                this.bo = 7;
            }
            graphics.drawImage(Main.a0.be[this.bo], 12, 35, 20);
        }
        else {
            if (this.bn == 102 || this.bn == 101) {
                if (this.bn == 101 || Main.a0.a5) {
                    for (int i = 0; i < this.b0; ++i) {
                        Main.a0.ae(i.c6[i], i.c5[i], this.bs);
                    }
                    for (int j = 0; j < this.b_; ++j) {
                        Main.a0.ae(i.c4[j], i.c3[j], this.bs);
                    }
                }
                if (this.b0 < 23) {
                    Main.a0.ad(this.bz * 6 + this.a6(this.bv, this.b2 * 6), this.bx * 6 + this.a5(this.bv, this.b2 * 6), this.bs, (this.b2 < this.b4 / 2) ? (8 * this.b2 / this.b4) : (8 * (this.b4 - this.b2) / this.b4));
                }
                if (this.b_ < 23) {
                    Main.a0.ad(this.by * 6 + this.a6(this.bu, this.b1 * 6), this.bw * 6 + this.a5(this.bu, this.b1 * 6), this.bs, (this.b1 < this.b3 / 2) ? (8 * this.b1 / this.b3) : (8 * (this.b3 - this.b1) / this.b3));
                }
                ++this.b2;
                ++this.b1;
                ++this.bo;
                return;
            }
            int k;
            for (int n = k = 0; k < 12; ++k) {
                for (int l = 0; l < 16; ++l, ++n) {
                    if (this.bj[n] > 0) {
                        Main.a0.ae(l, k, this.bj[n] - 1);
                    }
                }
            }
            if (this.bn == 4) {
                int n2 = this.cb * 6 + this.a6(this.cd, this.bo * 2);
                int n3 = this.ca * 6 + this.a5(this.cd, this.bo * 2);
                int n4;
                if (this.bo < this.b6 / 2) {
                    n4 = 8 * this.bo / this.b6;
                }
                else {
                    n4 = 8 * (this.b6 - this.bo) / this.b6;
                }
                if (this.bs == 1) {
                    n2 = 96 - n2 - 6;
                    n3 = 72 - n3 - 6;
                }
                Main.a0.ad(n2, n3, this.b7 - 1, n4);
            }
            if (this.bn != 100 && this.bn != 5 && this.bn != 7 && this.bn != 101 && this.bn != 102) {
                if (this.bn == 2) {
                    if (this.bo < 4) {
                        if ((this.bo / 2 & 0x1) == 0x0) {
                            Main.a0.ab(0);
                        }
                    }
                    else if (this.bo < 8) {
                        Main.a0.ab(0);
                    }
                    else {
                        Main.a0.ab(this.bo - 8);
                    }
                }
                else {
                    Main.a0.ac(this.cf, this.ce, this.cd - 1);
                }
            }
            switch (this.bn) {
                case 6: {
                    if (this.bt == this.bs && this.c_ < 3) {
                        h.aj(this.au(this.bt) + " don't have a move. Turn forfeited.");
                        break;
                    }
                    h.aj(this.au(this.bt) + " doesn't have a move. Turn forfeited.");
                    break;
                }
                case 7: {
                    h.aj("No more moves can be made. Let's check the scores!");
                    break;
                }
                case 50: {
                    h.aj("You can't kick the opponent's ball.");
                    break;
                }
                case 51: {
                    h.aj("You can't kick over another ball.");
                    break;
                }
                case 52: {
                    h.aj("Kick the ball towards the opponent's goal.");
                    break;
                }
                case 53: {
                    h.aj(i.cg[this.ch]);
                    break;
                }
                case 5: {
                    graphics.setColor(41120);
                    graphics.setFont(h.bd);
                    graphics.fillRect(12, 113, 96, 23);
                    graphics.setColor(16777215);
                    graphics.drawString("Please wait...", 60, (249 - h.bc) / 2, 0x10 | 0x1);
                    break;
                }
            }
        }
        ++this.bo;
    }
    
    private final int as(final int n) {
        int n2 = this.cp.nextInt() % n;
        if (n2 < 0) {
            n2 += n;
        }
        return n2;
    }
    
    static {
        c6 = new int[] { 2, 2, 3, 3, 4, 4, 6, 6, 7, 8, 7, 8, 9, 9, 11, 11, 11, 11, 12, 13, 13, 13, 13 };
        c5 = new int[] { 2, 1, 4, 3, 2, 1, 3, 2, 4, 4, 1, 1, 3, 2, 4, 3, 2, 1, 4, 4, 3, 2, 1 };
        c4 = new int[] { 2, 2, 2, 3, 4, 5, 6, 6, 6, 8, 8, 8, 8, 10, 10, 10, 10, 11, 12, 13, 13, 13, 13 };
        c3 = new int[] { 7, 8, 9, 10, 9, 10, 7, 8, 9, 7, 8, 9, 10, 7, 8, 9, 10, 8, 9, 7, 8, 9, 10 };
        c2 = new int[] { 0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 105 };
        cg = new String[] { "Block and Score(TM) Soccer Demo Mode.", "Read these hints and then watch the demonstration game", "to learn about the game and improve your skill.", "Kick your ball into your opponent's goal to score big points.", "You can't kick over another ball, you must go around it.", "You may need to set your ball up for your next turn to score.", "You may block your opponent by positioning your ball in the way of the goal.", "Balls kicked off the side of the field are lost.", "You can strategically use 1 ball to tie up 3 of your opponent's balls.", "Push into the ball going Up to kick upwards.", "Push into the ball going Left to kick to the left.", "Push into the ball going Right to kick to the right.", "Press any key to exit." };
    }
}
