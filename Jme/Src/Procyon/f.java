import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;

// 
// Decompiled by Procyon v0.5.36
// 

public class f implements CommandListener
{
    public final Main w;
    
    public f(final Main w) {
        this.w = w;
    }
    
    public final void commandAction(final Command y, final Displayable displayable) {
        if (y == Main.aa || y == Main.ae) {
            this.w.ao = true;
            this.w.u();
            return;
        }
        if (Main.y == null) {
            Main.y = y;
        }
    }
}
