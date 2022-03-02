// 
// Decompiled by Procyon v0.5.36
// 

public class c implements Runnable
{
    public boolean s;
    
    public c(final Main main) {
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
            try {
                Thread.currentThread();
                Thread.sleep(150L);
            }
            catch (Exception ex) {}
            if (Main.ay.j) {
                Main.ay.q();
            }
            else {
                if (!Main.ax.j) {
                    continue;
                }
                Main.ax.q();
            }
        }
    }
}
