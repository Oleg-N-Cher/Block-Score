import javax.microedition.rms.RecordStoreException;
import java.io.InputStream;
import java.io.DataInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.DataOutputStream;
import java.io.ByteArrayOutputStream;
import javax.microedition.lcdui.Graphics;
import javax.microedition.rms.RecordStore;

// 
// Decompiled by Procyon v0.5.36
// 

public class a
{
    public String i;
    public int h;
    public int[] e;
    public String[] d;
    public int c;
    public RecordStore b;
    public static final String[] a;
    
    public a() {
        this.b = null;
        this.i = new String("Player");
        try {
            this.b = RecordStore.openRecordStore("BaSScores", true);
        }
        catch (Exception ex) {}
        this.h = 0;
        this.e = new int[5];
        this.d = new String[5];
        for (int i = 0; i < 5; ++i) {
            this.e[i] = 50 - 10 * i;
            this.d[i] = a.a[i];
        }
    }
    
    public final void j(final String s) {
        if (s.replace('\n', ' ').trim().length() != 0) {
            this.i = s.replace('\n', ' ').trim();
        }
    }
    
    public final void i() {
        this.h = 0;
    }
    
    public final void h(final int n) {
        this.h += n;
    }
    
    public final int g() {
        final int n = -1;
        for (int i = 0; i < 5; ++i) {
            if (this.h > this.e[i]) {
                return i;
            }
        }
        return n;
    }
    
    public final int f() {
        int n = -1;
        for (int i = 0; i < 5; ++i) {
            if (this.h > this.e[i]) {
                n = i;
                break;
            }
        }
        if (n == -1) {
            return n;
        }
        for (int j = 4; j > n; --j) {
            this.e[j] = this.e[j - 1];
            this.d[j] = this.d[j - 1];
        }
        this.e[n] = this.h;
        this.d[n] = this.i;
        this.a();
        this.i();
        return n;
    }
    
    public final void e(final int n, final String s) {
        if (n >= 0 && n < 5) {
            this.d[n] = s.replace('\n', ' ').trim();
            final int length = this.d[n].length();
            if (length < 6) {
                for (int i = length; i < 6; ++i) {
                    final StringBuffer sb = new StringBuffer();
                    final String[] d = this.d;
                    d[n] = sb.append(d[n]).append(" ").toString();
                }
            }
            this.a();
        }
    }
    
    public final void d(final Graphics bk, final int n, final int n2) {
        h.bk = bk;
        h.x();
        String string;
        if (n == 0) {
            if (n2 < 7) {
                string = (((n2 & 0x1) == 0x0) ? "" : "NEW CHAMPION!");
            }
            else {
                string = "FIRST PLACE!";
            }
        }
        else if (n > 0) {
            string = "NEW #" + (n + 1) + " Score!";
        }
        else {
            string = "High Scores";
        }
        h.y(string);
        final int n3 = h.ba + (142 - h.ba - h.a8 * 5) / 2;
        h.z(0, n3, 120, h.a8 * 5, 16777215, 11582660, 16777215);
        bk.setFont(h.a9);
        for (int i = 0; i < 5; ++i) {
            if (i == n) {
                bk.setColor(128);
                bk.fillRect(0, n3 + i * h.a8, 120, h.a8);
                bk.setColor(16777215);
            }
            else {
                bk.setColor(0);
            }
            bk.drawString(this.d[i], 15, n3 + i * h.a8, 0x4 | 0x10);
            bk.drawString("" + this.e[i], 105, n3 + i * h.a8, 0x8 | 0x10);
        }
    }
    
    public final int c() {
        return this.h;
    }
    
    public final boolean b() {
        if (this.b == null) {
            return false;
        }
        try {
            if (this.b.getNumRecords() == 0) {
                for (int i = 0; i < 5; ++i) {
                    this.e[i] = 50 - 10 * i;
                    this.d[i] = a.a[i];
                }
                final ByteArrayOutputStream out = new ByteArrayOutputStream();
                final DataOutputStream dataOutputStream = new DataOutputStream(out);
                try {
                    for (int j = 0; j < 5; ++j) {
                        dataOutputStream.writeInt(this.e[j]);
                        int length = this.d[j].length();
                        if (length > 6) {
                            length = 6;
                        }
                        for (int k = 0; k < length; ++k) {
                            dataOutputStream.writeChar(this.d[j].charAt(k));
                        }
                        for (int l = length; l < 6; ++l) {
                            dataOutputStream.writeChar(32);
                        }
                    }
                }
                catch (IOException ex) {
                    return false;
                }
                final byte[] byteArray = out.toByteArray();
                this.c = this.b.addRecord(byteArray, 0, byteArray.length);
            }
            else {
                this.c = this.b.getNextRecordID();
                if (this.c > 0) {
                    --this.c;
                }
                final byte[] record = this.b.getRecord(this.c);
                if (record != null) {
                    final DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(record));
                    final char[] value = new char[6];
                    for (int n = 0; n < 5; ++n) {
                        this.e[n] = dataInputStream.readInt();
                        for (int n2 = 0; n2 < 6; ++n2) {
                            value[n2] = dataInputStream.readChar();
                        }
                        this.d[n] = new String(value);
                    }
                }
                else {
                    for (int n3 = 0; n3 < 5; ++n3) {
                        this.e[n3] = 50 - 10 * n3;
                        this.d[n3] = a.a[n3];
                    }
                }
            }
        }
        catch (Exception ex2) {
            return false;
        }
        return true;
    }
    
    public final void a() {
        if (this.b == null) {
            return;
        }
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final DataOutputStream dataOutputStream = new DataOutputStream(out);
        try {
            for (int i = 0; i < 5; ++i) {
                dataOutputStream.writeInt(this.e[i]);
                int length = this.d[i].length();
                if (length > 6) {
                    length = 6;
                }
                for (int j = 0; j < length; ++j) {
                    dataOutputStream.writeChar(this.d[i].charAt(j));
                }
                for (int k = length; k < 6; ++k) {
                    dataOutputStream.writeChar(32);
                }
            }
        }
        catch (IOException ex) {}
        final byte[] byteArray = out.toByteArray();
        try {
            this.b.setRecord(this.c, byteArray, 0, byteArray.length);
        }
        catch (RecordStoreException ex2) {}
    }
    
    static {
        a = new String[] { "Damir", "Kelly", "John", "Dawn", "Tom" };
    }
}
