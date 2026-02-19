/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.O_;
import a.eq;
import a.s1;
import a.s6;
import a.s8;
import a.s9;
import a.sB;
import a.sE;
import a.sG;
import a.sJ;
import a.sL;
import a.sP;
import a.sS;
import a.sU;
import a.sY;
import a.sZ;
import a.sb;
import a.sd;
import a.sk;
import a.sn;
import a.sq;
import a.sr;
import a.sw;
import a.sx;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class s5 {
    private static String[] G;
    int z;
    byte[] b;
    protected eq D;

    static List<s5> X(List<s5> list, eq eq2) {
        try {
            if (list == null) {
                return null;
            }
        }
        catch (O_ o_2) {
            throw s5.b(o_2);
        }
        ArrayList<s5> arrayList = new ArrayList<s5>();
        for (s5 s52 : list) {
            arrayList.add(s52.O(eq2, null));
        }
        return arrayList;
    }

    public static String[] q() {
        return G;
    }

    static int N(List<s5> list) {
        int n2 = 0;
        for (s5 s52 : list) {
            n2 += s52.Y();
        }
        return n2;
    }

    static void E(List<s5> list, DataOutputStream dataOutputStream) throws IOException {
        try {
            if (list == null) {
                return;
            }
        }
        catch (IOException iOException) {
            throw s5.b(iOException);
        }
        for (s5 s52 : list) {
            s52.f(dataOutputStream);
        }
    }

    public s5(eq eq2, String string, byte[] byArray) {
        this(eq2, eq2.D(string), byArray);
    }

    static s5 J(List<s5> list, String string) {
        try {
            if (list == null) {
                return null;
            }
        }
        catch (O_ o_2) {
            throw s5.b(o_2);
        }
        for (s5 s52 : list) {
            try {
                if (!s52.n().equals(string)) continue;
                return s52;
            }
            catch (O_ o_3) {
                throw s5.b(o_3);
            }
        }
        return null;
    }

    public void p(byte[] byArray) {
        this.b = byArray;
    }

    static {
        if (s5.q() != null) {
            s5.p(new String[1]);
        }
    }

    void f(DataOutputStream dataOutputStream) throws IOException {
        try {
            dataOutputStream.writeShort(this.z);
            dataOutputStream.writeInt(this.b.length);
            if (this.b.length > 0) {
                dataOutputStream.write(this.b);
            }
        }
        catch (IOException iOException) {
            throw s5.b(iOException);
        }
    }

    static s5 R(eq eq2, DataInputStream dataInputStream) throws IOException {
        int n2;
        block81: {
            String string;
            block82: {
                char c10;
                block77: {
                    block80: {
                        block79: {
                            block78: {
                                block75: {
                                    block76: {
                                        block73: {
                                            block74: {
                                                n2 = dataInputStream.readUnsignedShort();
                                                string = eq2.Z(n2);
                                                c10 = string.charAt(0);
                                                try {
                                                    try {
                                                        if (c10 >= 'E') break block73;
                                                        if (!string.equals("AnnotationDefault")) break block74;
                                                    }
                                                    catch (IOException iOException) {
                                                        throw s5.b(iOException);
                                                    }
                                                    return new sP(eq2, n2, dataInputStream);
                                                }
                                                catch (IOException iOException) {
                                                    throw s5.b(iOException);
                                                }
                                            }
                                            try {
                                                if (string.equals("BootstrapMethods")) {
                                                    return new sG(eq2, n2, dataInputStream);
                                                }
                                            }
                                            catch (IOException iOException) {
                                                throw s5.b(iOException);
                                            }
                                            try {
                                                if (string.equals("Code")) {
                                                    return new sS(eq2, n2, dataInputStream);
                                                }
                                            }
                                            catch (IOException iOException) {
                                                throw s5.b(iOException);
                                            }
                                            try {
                                                if (string.equals("ConstantValue")) {
                                                    return new sq(eq2, n2, dataInputStream);
                                                }
                                            }
                                            catch (IOException iOException) {
                                                throw s5.b(iOException);
                                            }
                                            try {
                                                if (string.equals("Deprecated")) {
                                                    return new s8(eq2, n2, dataInputStream);
                                                }
                                            }
                                            catch (IOException iOException) {
                                                throw s5.b(iOException);
                                            }
                                        }
                                        try {
                                            try {
                                                if (c10 >= 'M') break block75;
                                                if (!string.equals("EnclosingMethod")) break block76;
                                            }
                                            catch (IOException iOException) {
                                                throw s5.b(iOException);
                                            }
                                            return new sL(eq2, n2, dataInputStream);
                                        }
                                        catch (IOException iOException) {
                                            throw s5.b(iOException);
                                        }
                                    }
                                    try {
                                        if (string.equals("Exceptions")) {
                                            return new sb(eq2, n2, dataInputStream);
                                        }
                                    }
                                    catch (IOException iOException) {
                                        throw s5.b(iOException);
                                    }
                                    try {
                                        if (string.equals("InnerClasses")) {
                                            return new sB(eq2, n2, dataInputStream);
                                        }
                                    }
                                    catch (IOException iOException) {
                                        throw s5.b(iOException);
                                    }
                                    try {
                                        if (string.equals("LineNumberTable")) {
                                            return new sY(eq2, n2, dataInputStream);
                                        }
                                    }
                                    catch (IOException iOException) {
                                        throw s5.b(iOException);
                                    }
                                    try {
                                        if (string.equals("LocalVariableTable")) {
                                            return new sr(eq2, n2, dataInputStream);
                                        }
                                    }
                                    catch (IOException iOException) {
                                        throw s5.b(iOException);
                                    }
                                    try {
                                        if (string.equals("LocalVariableTypeTable")) {
                                            return new s9(eq2, n2, dataInputStream);
                                        }
                                    }
                                    catch (IOException iOException) {
                                        throw s5.b(iOException);
                                    }
                                }
                                try {
                                    try {
                                        if (c10 >= 'S') break block77;
                                        if (!string.equals("MethodParameters")) break block78;
                                    }
                                    catch (IOException iOException) {
                                        throw s5.b(iOException);
                                    }
                                    return new sE(eq2, n2, dataInputStream);
                                }
                                catch (IOException iOException) {
                                    throw s5.b(iOException);
                                }
                            }
                            try {
                                if (string.equals("NestHost")) {
                                    return new s1(eq2, n2, dataInputStream);
                                }
                            }
                            catch (IOException iOException) {
                                throw s5.b(iOException);
                            }
                            try {
                                if (string.equals("NestMembers")) {
                                    return new sU(eq2, n2, dataInputStream);
                                }
                            }
                            catch (IOException iOException) {
                                throw s5.b(iOException);
                            }
                            try {
                                try {
                                    if (!string.equals("RuntimeVisibleAnnotations") && !string.equals("RuntimeInvisibleAnnotations")) break block79;
                                }
                                catch (IOException iOException) {
                                    throw s5.b(iOException);
                                }
                                return new sx(eq2, n2, dataInputStream);
                            }
                            catch (IOException iOException) {
                                throw s5.b(iOException);
                            }
                        }
                        try {
                            try {
                                if (!string.equals("RuntimeVisibleParameterAnnotations") && !string.equals("RuntimeInvisibleParameterAnnotations")) break block80;
                            }
                            catch (IOException iOException) {
                                throw s5.b(iOException);
                            }
                            return new sJ(eq2, n2, dataInputStream);
                        }
                        catch (IOException iOException) {
                            throw s5.b(iOException);
                        }
                    }
                    try {
                        try {
                            if (!string.equals("RuntimeVisibleTypeAnnotations") && !string.equals("RuntimeInvisibleTypeAnnotations")) break block77;
                        }
                        catch (IOException iOException) {
                            throw s5.b(iOException);
                        }
                        return new sk(eq2, n2, dataInputStream);
                    }
                    catch (IOException iOException) {
                        throw s5.b(iOException);
                    }
                }
                try {
                    try {
                        if (c10 < 'S') break block81;
                        if (!string.equals("Signature")) break block82;
                    }
                    catch (IOException iOException) {
                        throw s5.b(iOException);
                    }
                    return new s6(eq2, n2, dataInputStream);
                }
                catch (IOException iOException) {
                    throw s5.b(iOException);
                }
            }
            try {
                if (string.equals("SourceFile")) {
                    return new sd(eq2, n2, dataInputStream);
                }
            }
            catch (IOException iOException) {
                throw s5.b(iOException);
            }
            try {
                if (string.equals("Synthetic")) {
                    return new sw(eq2, n2, dataInputStream);
                }
            }
            catch (IOException iOException) {
                throw s5.b(iOException);
            }
            try {
                if (string.equals("StackMap")) {
                    return new sZ(eq2, n2, dataInputStream);
                }
            }
            catch (IOException iOException) {
                throw s5.b(iOException);
            }
            try {
                if (string.equals("StackMapTable")) {
                    return new sn(eq2, n2, dataInputStream);
                }
            }
            catch (IOException iOException) {
                throw s5.b(iOException);
            }
        }
        return new s5(eq2, n2, dataInputStream);
    }

    public int Y() {
        return this.b.length + 6;
    }

    protected s5(eq eq2, String string) {
        this(eq2, string, (byte[])null);
    }

    public static void p(String[] stringArray) {
        G = stringArray;
    }

    private static Exception b(Exception exception) {
        return exception;
    }

    protected s5(eq eq2, int n2, byte[] byArray) {
        this.D = eq2;
        this.z = n2;
        this.b = byArray;
    }

    public byte[] p() {
        return this.b;
    }

    static synchronized s5 e(List<s5> list, String string) {
        try {
            if (list == null) {
                return null;
            }
        }
        catch (O_ o_2) {
            throw s5.b(o_2);
        }
        for (s5 s52 : list) {
            try {
                try {
                    if (!s52.n().equals(string) || !list.remove(s52)) continue;
                }
                catch (O_ o_3) {
                    throw s5.b(o_3);
                }
                return s52;
            }
            catch (O_ o_4) {
                throw s5.b(o_4);
            }
        }
        return null;
    }

    protected s5(eq eq2, int n2, DataInputStream dataInputStream) throws IOException {
        this.D = eq2;
        this.z = n2;
        int n3 = dataInputStream.readInt();
        try {
            this.b = new byte[n3];
            if (n3 > 0) {
                dataInputStream.readFully(this.b);
            }
        }
        catch (IOException iOException) {
            throw s5.b(iOException);
        }
    }

    public s5 O(eq eq2, Map<String, String> map) {
        return new s5(eq2, this.n(), Arrays.copyOf(this.b, this.b.length));
    }

    public eq K() {
        return this.D;
    }

    public String n() {
        return this.D.Z(this.z);
    }
}

