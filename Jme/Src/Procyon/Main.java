import java.io.IOException;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

// 
// Decompiled by Procyon v0.5.36
// 

public class Main extends MIDlet implements Runnable
{
    public static Main a2;
    public static i a1;
    public static h a0;
    public static b a_;
    public static Display az;
    public static j ay;
    public static e ax;
    public Form aw;
    public c av;
    public static final String[] au;
    public g at;
    public boolean as;
    public boolean ar;
    public boolean aq;
    public boolean ap;
    public boolean ao;
    public static Command an;
    public static Command am;
    public static Command al;
    public static Command ak;
    public static Command aj;
    public static Command ai;
    public static Command ah;
    public static Command ag;
    public static Command af;
    public static Command ae;
    public static Command ad;
    public static Command ac;
    public static Command ab;
    public static Command aa;
    public static Command z;
    public static Command y;
    public CommandListener x;
    
    public final void u() {
        this.destroyApp(true);
        this.notifyDestroyed();
    }
    
    public final void t() {
        Main.a_.m(this.ap ? 2 : 1);
        Main.a_.k();
    }
    
    public final void s() {
        if (Main.y == null) {
            return;
        }
        Command command = Main.y;
        Main.y = null;
        if (command == Main.ac) {
            switch (Main.a_.n()) {
                case 1: {
                    Main.az.setCurrent((Displayable)Main.a0);
                    return;
                }
                case 2: {
                    this.ap = false;
                    Main.a1.cm = i.h.g();
                    if (Main.a1.cm >= 0) {
                        this.aq = true;
                        Main.a1.az(true);
                    }
                    else {
                        Main.a_.m(3);
                        Main.a_.k();
                    }
                    return;
                }
                case 3: {
                    Main.ax.v = -1;
                    Main.ax.i();
                    Main.az.setCurrent((Displayable)Main.ax);
                    return;
                }
                case 4: {
                    Main.ay.bl("Credits", Main.au, true);
                    return;
                }
                case 5: {
                    Main.ay.bl("About", j.bk("Block and Score(TM) Soccer\nVersion 05.03.12\n©2002 Exclusively licensed to and published by THQ Inc. THQ, THQ Wireless and the respective logos are trademarks and/or registered trademarks of THQ Inc. All Rights Reserved.\n\n7-19575-70075-7"), false);
                    return;
                }
                case 6: {
                    command = Main.ab;
                    break;
                }
                case 7: {
                    Main.a1.bh(0);
                    return;
                }
                case 8: {
                    Main.a1.bh(1);
                    return;
                }
                case 9: {
                    Main.a1.bh(2);
                    return;
                }
                case 10: {
                    Main.a1.bh(3);
                    return;
                }
            }
        }
        if (command == Main.an) {
            Main.a_.l = 0;
            this.t();
        }
        else if (command == Main.ak) {
            Main.az.setCurrent((Displayable)Main.a0);
        }
        else if (command == Main.ag) {
            if (Main.a1.cm >= 0) {
                if (Main.a1.co.getString().replace('\n', ' ').trim().length() == 0) {
                    return;
                }
                i.h.f();
                Main.a1.bi();
                Main.ax.v = Main.a1.cm;
                Main.ax.i();
                Main.az.setCurrent((Displayable)Main.ax);
            }
            else {
                this.t();
            }
        }
        else if (command == Main.ah) {
            if (Main.a1.co.getString().replace('\n', ' ').trim().length() == 0) {
                return;
            }
            i.h.f();
            Main.a1.bi();
            Main.ax.v = Main.a1.cm;
            Main.ax.i();
            Main.az.setCurrent((Displayable)Main.ax);
        }
        else if (command == Main.ad || command == Main.af) {
            if (command == Main.af) {
                i.h.i();
            }
            if (this.aq) {
                this.aq = false;
                Main.a_.m(3);
                Main.a_.k();
                return;
            }
            if (this.ar) {
                this.ar = false;
                this.u();
                return;
            }
            this.t();
        }
        else if (command == Main.am) {
            ((Displayable)Main.ay).removeCommand(Main.ai);
            ((Displayable)Main.ay).addCommand(Main.aj);
            Main.ay.bl("Help", j.bk("Use <Navigation Keys> or <2>, <4>, <6>, <8> to control your character.\nPress <5> to remove a game message.\nIn Block and Score(TM) Soccer, you control a soccer player on a soccer field laid out on a grid. The object is to kick the soccer balls around on the playing field in an attempt to out-score your virtual opponent. Both players have their own balls - blue or red, and their own goal areas. Your virtual opponent's goal area is always at the top of the screen, and your balls always start in the lower part of the screen.\nEach player is allowed to kick ONE BALL of their color PER TURN. Balls can be kicked in any direction the character is moving except backwards towards his own goal. A kicked ball keeps going until it hits another ball, enters the goal area, or goes out of bounds at the sides of the screen. The character cannot kick a ball with another ball immediately next to it in the direction of the kick.\nPlayers are awarded 5 points for each cell on the playing field the ball passes towards the goal, and an additional 50 points if a goal is scored.\nPlay continues until neither opponent can make a move. The player with the most points WINS!\nContact THQ Wireless Support at: Support@THQ.com"), false);
        }
        else if (command == Main.aj) {
            ((Displayable)Main.ay).removeCommand(Main.aj);
            ((Displayable)Main.ay).addCommand(Main.ai);
            Main.az.setCurrent((Displayable)Main.a0);
        }
        else if (command == Main.ai) {
            if (this.ar) {
                this.ar = false;
                this.u();
                return;
            }
            if (this.aq) {
                this.aq = false;
                Main.a_.m(3);
                Main.a_.k();
                return;
            }
            this.t();
        }
        else if (command == Main.al) {
            this.t();
        }
        else if (command == Main.ab) {
            if (Main.a1 != null) {
                Main.a1.cm = i.h.g();
                if (Main.a1.cm >= 0) {
                    this.ar = true;
                    Main.a1.az(true);
                    return;
                }
            }
            this.u();
        }
    }
    
    public Main() {
        this.as = true;
        this.ar = false;
        this.aq = false;
        this.ap = false;
        this.ao = false;
        this.x = (CommandListener)new f(this);
        Main.a2 = this;
        Main.az = Display.getDisplay((MIDlet)this);
        ((Displayable)(this.at = new g())).addCommand(Main.z);
        ((Displayable)this.at).addCommand(Main.aa);
        ((Displayable)this.at).setCommandListener(this.x);
        ((Displayable)(Main.a0 = new h())).addCommand(Main.an);
        ((Displayable)Main.a0).addCommand(Main.am);
        ((Displayable)Main.a0).setCommandListener(this.x);
        ((Displayable)(Main.a_ = new b())).addCommand(Main.ac);
        ((Displayable)Main.a_).setCommandListener(this.x);
        Main.a_.m(1);
        ((Displayable)(Main.ay = new j())).addCommand(Main.ai);
        ((Displayable)Main.ay).setCommandListener(this.x);
        Main.a1 = new i();
        this.av = new c(this);
        ((Displayable)(Main.ax = new e(this))).addCommand(Main.ad);
        ((Displayable)Main.ax).setCommandListener(this.x);
        this.as = true;
    }
    
    public final void r() {
        (this.aw = new Form("Block and Score(TM)")).append("LOW MEMORY.\nUnable to access data.");
        ((Displayable)this.aw).addCommand(Main.ae);
        ((Displayable)this.aw).setCommandListener(this.x);
        Main.az.setCurrent((Displayable)this.aw);
    }
    
    public final void run() {
        this.at.v(1);
        if (this.ao) {
            this.u();
            return;
        }
        if (!Main.a1.bj()) {
            this.r();
            return;
        }
        this.at.v(2);
        if (this.ao) {
            this.u();
            return;
        }
        int n;
        for (n = 0; n < 10 && !Main.a0.ar(); ++n) {}
        if (n >= 10) {
            this.r();
            return;
        }
        this.at.v(3);
        if (this.ao) {
            this.u();
            return;
        }
        int n2;
        for (n2 = 0; n2 < 10 && !Main.a0.aq(); ++n2) {}
        if (n2 >= 10) {
            this.r();
            return;
        }
        this.at.v(4);
        if (this.ao) {
            this.u();
            return;
        }
        int n3;
        for (n3 = 0; n3 < 10 && !Main.a0.ap(); ++n3) {}
        if (n3 >= 10) {
            this.r();
            return;
        }
        this.at.v(5);
        if (this.ao) {
            this.u();
            return;
        }
        int n4;
        for (n4 = 0; n4 < 10 && !Main.a0.ao(); ++n4) {}
        if (n4 >= 10) {
            this.r();
            return;
        }
        this.at.v(6);
        if (this.ao) {
            this.u();
            return;
        }
        int n5;
        for (n5 = 0; n5 < 10 && !Main.a0.an(); ++n5) {}
        if (n5 >= 10) {
            this.r();
            return;
        }
        this.at.v(7);
        if (this.ao) {
            this.u();
            return;
        }
        int n6;
        for (n6 = 0; n6 < 10 && !Main.a0.am(); ++n6) {}
        if (n6 >= 10) {
            this.r();
            return;
        }
        this.at.v(8);
        if (this.ao) {
            this.u();
            return;
        }
        int n7;
        for (n7 = 0; n7 < 10 && !Main.a0.al(); ++n7) {}
        if (n7 >= 10) {
            this.r();
            return;
        }
        this.at.v(9);
        if (this.ao) {
            this.u();
            return;
        }
        int n8;
        for (n8 = 0; n8 < 10 && !Main.a0.ak(); ++n8) {}
        if (n8 >= 10) {
            this.r();
            return;
        }
        this.at.v(10);
        if (this.ao) {
            this.u();
            return;
        }
        Main.a1.p();
        this.av.p();
        Image image = null;
        for (int n9 = 0; n9 < 10 && image == null; ++n9) {
            try {
                image = Image.createImage("/intro.png");
            }
            catch (IOException ex) {}
        }
        if (image != null) {
            Main.az.setCurrent((Displayable)new d(this, image));
            try {
                Thread.sleep(3000L);
            }
            catch (Exception ex2) {}
        }
        this.t();
        this.at = null;
        System.gc();
    }
    
    public final void startApp() {
        if (this.as) {
            this.as = false;
            Main.az.setCurrent((Displayable)this.at);
            new Thread(this).start();
        }
    }
    
    public final void pauseApp() {
        if (Main.az.getCurrent() == Main.a0) {
            this.t();
        }
    }
    
    public final void destroyApp(final boolean b) {
        if (Main.a1 != null) {
            Main.a1.ay();
        }
        if (this.av != null) {
            this.av.o();
        }
    }
    
    static {
        Main.a2 = null;
        Main.a1 = null;
        Main.a0 = null;
        Main.a_ = null;
        Main.az = null;
        Main.ay = null;
        Main.ax = null;
        au = new String[] { "THQ TEAM", "", "Producer:", "Stuart Platt", "", "Associate Producer:", "Jeremy Rosenthal", "", "Lead Tester:", "Erik Hernandez", "", "Testers:", "Bridget Roy", "Carlos Restrepo", "Dio Rochino", "Jeremy Moseley", "Matthew Lee", "", "", "", "DEVELOPMENT TEAM", "", "Programmer:", "Damir Sagidullin", "", "Artists:", "Nikolay Gurov", "Vladimir Pronin", "", "Designer:", "Jon Decker", "", "Technical Writer:", "Vera Sivolapova", "", "Testers:", "Alexandra Dolgova", "Alexey Verkhovykh", "Ilya Kruchinin", "", "Producers:", "Eugene Sotnikov", "John Newcomer", "", "Executive Producer:", "Don Wisniewski" };
        Main.an = new Command("PAUSE", 1, 1);
        Main.am = new Command("HELP", 1, 2);
        Main.al = new Command("MENU", 1, 2);
        Main.ak = new Command("BACK", 2, 2);
        Main.aj = new Command("OK", 1, 1);
        Main.ai = new Command("OK", 1, 1);
        Main.ah = new Command("OK", 1, 1);
        Main.ag = new Command("OK", 1, 1);
        Main.af = new Command("CANCEL", 1, 2);
        Main.ae = new Command("OK", 4, 1);
        Main.ad = new Command("OK", 1, 1);
        Main.ac = new Command("SELECT", 4, 1);
        Main.ab = new Command("EXIT", 1, 2);
        Main.aa = new Command("EXIT", 1, 2);
        Main.z = new Command("", 1, 1);
        Main.y = null;
    }
}
