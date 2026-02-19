/*
 * Decompiled with CFR 0.152.
 */
package com.reflection.registry;

import a.Nw;
import a._c;
import com.app.io.SecureFileOutputStream;
import com.app.resource.ResourceIdentifier;
import com.core.exception.CustomRuntimeException;
import com.error.handling.ContextualExceptionHandler;
import com.reflection.management.ClassPoolRegistry;
import com.reflection.metadata.ClassMetadataExtractor;
import com.reverse.engineering.DecompilationAnalyzer;
import com.system.config.ResourceConfigurationBuilder;
import com.user.profile.UserProfileManager1412;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class MetaclassDefinitionRegistry {
    public static MetaclassDefinitionRegistry L;
    public static MetaclassDefinitionRegistry R;
    protected String i;
    public static MetaclassDefinitionRegistry G;
    public static MetaclassDefinitionRegistry b;
    public static MetaclassDefinitionRegistry M;
    public static MetaclassDefinitionRegistry t;
    public static String d;
    public static MetaclassDefinitionRegistry s;
    static MetaclassDefinitionRegistry[] B;
    public static MetaclassDefinitionRegistry T;
    public static MetaclassDefinitionRegistry Z;

    public void n(DataOutputStream dataOutputStream) throws ContextualExceptionHandler, IOException {
        throw new ContextualExceptionHandler("not a class");
    }

    public boolean q() {
        return false;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public DecompilationAnalyzer d(String string, String string2) throws CustomRuntimeException {
        throw new CustomRuntimeException(string);
    }

    void m() throws RuntimeException {
        try {
            if (this.c()) {
                throw new RuntimeException(this.H() + " class is frozen");
            }
        }
        catch (RuntimeException runtimeException) {
            throw MetaclassDefinitionRegistry.a(runtimeException);
        }
    }

    public ClassMetadataExtractor o() {
        return null;
    }

    public MetaclassDefinitionRegistry i() throws CustomRuntimeException {
        return null;
    }

    public boolean p() {
        return false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(this.getClass().getName());
        stringBuilder.append('@');
        stringBuilder.append(Integer.toHexString(this.hashCode()));
        stringBuilder.append('[');
        this.K(stringBuilder);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public byte[] x() throws IOException, ContextualExceptionHandler {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try (DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);){
            this.n(dataOutputStream);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public MetaclassDefinitionRegistry r() throws CustomRuntimeException {
        return null;
    }

    public _c[] L() {
        return new _c[0];
    }

    public ClassMetadataExtractor Q() {
        this.m();
        return this.o();
    }

    public boolean m() {
        return false;
    }

    public int a() {
        return 0;
    }

    DecompilationAnalyzer j(String string, String string2) {
        return null;
    }

    public void Z() {
        throw new RuntimeException("cannot defrost " + this.H());
    }

    public ResourceIdentifier H(String string, String string2) throws CustomRuntimeException {
        throw new CustomRuntimeException(string);
    }

    static {
        d = null;
        B = new MetaclassDefinitionRegistry[9];
        MetaclassDefinitionRegistry.B[0] = T = new UserProfileManager1412("boolean", 'Z', "java.lang.Boolean", "booleanValue", "()Z", 172, 4, 1);
        MetaclassDefinitionRegistry.B[1] = G = new UserProfileManager1412("char", 'C', "java.lang.Character", "charValue", "()C", 172, 5, 1);
        MetaclassDefinitionRegistry.B[2] = t = new UserProfileManager1412("byte", 'B', "java.lang.Byte", "byteValue", "()B", 172, 8, 1);
        MetaclassDefinitionRegistry.B[3] = s = new UserProfileManager1412("short", 'S', "java.lang.Short", "shortValue", "()S", 172, 9, 1);
        MetaclassDefinitionRegistry.B[4] = b = new UserProfileManager1412("int", 'I', "java.lang.Integer", "intValue", "()I", 172, 10, 1);
        MetaclassDefinitionRegistry.B[5] = L = new UserProfileManager1412("long", 'J', "java.lang.Long", "longValue", "()J", 173, 11, 2);
        MetaclassDefinitionRegistry.B[6] = R = new UserProfileManager1412("float", 'F', "java.lang.Float", "floatValue", "()F", 174, 6, 1);
        MetaclassDefinitionRegistry.B[7] = Z = new UserProfileManager1412("double", 'D', "java.lang.Double", "doubleValue", "()D", 175, 7, 2);
        MetaclassDefinitionRegistry.B[8] = M = new UserProfileManager1412("void", 'V', "java.lang.Void", null, null, 177, 0, 0);
    }

    void P() {
    }

    public MetaclassDefinitionRegistry[] l() throws CustomRuntimeException {
        return new MetaclassDefinitionRegistry[0];
    }

    public MetaclassDefinitionRegistry G() throws CustomRuntimeException {
        return null;
    }

    public String H() {
        return this.i;
    }

    public ClassPoolRegistry K() {
        return null;
    }

    public boolean h() {
        return false;
    }

    void y() {
    }

    protected MetaclassDefinitionRegistry(String string) {
        this.i = string;
    }

    public Nw t() {
        return null;
    }

    public ResourceConfigurationBuilder u() {
        return null;
    }

    public ResourceConfigurationBuilder w(String string) throws CustomRuntimeException {
        throw new CustomRuntimeException("no such constructor");
    }

    public DecompilationAnalyzer t(String string) throws CustomRuntimeException {
        return this.d(string, null);
    }

    protected void K(StringBuilder stringBuilder) {
        stringBuilder.append(this.H());
    }

    public boolean c() {
        return true;
    }

    protected DataOutputStream F(String string) {
        String string2 = this.H();
        String string3 = string + File.separatorChar + string2.replace('.', File.separatorChar) + ".class";
        int n = string3.lastIndexOf(File.separatorChar);
        if (n > 0) {
            String string4 = string3.substring(0, n);
            try {
                if (!string4.equals(".")) {
                    new File(string4).mkdirs();
                }
            }
            catch (RuntimeException runtimeException) {
                throw MetaclassDefinitionRegistry.a(runtimeException);
            }
        }
        return new DataOutputStream(new BufferedOutputStream(new SecureFileOutputStream(string3)));
    }

    public final String P() {
        String string = this.i;
        int n = string.lastIndexOf(46);
        try {
            if (n < 0) {
                return string;
            }
        }
        catch (RuntimeException runtimeException) {
            throw MetaclassDefinitionRegistry.a(runtimeException);
        }
        return string.substring(n + 1);
    }

    public boolean t(MetaclassDefinitionRegistry metaclassDefinitionRegistry) throws CustomRuntimeException {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (this != metaclassDefinitionRegistry && !this.H().equals(metaclassDefinitionRegistry.H())) break block4;
                    }
                    catch (CustomRuntimeException customRuntimeException) {
                        throw MetaclassDefinitionRegistry.a(customRuntimeException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomRuntimeException customRuntimeException) {
                    throw MetaclassDefinitionRegistry.a(customRuntimeException);
                }
            }
            bl = false;
        }
        return bl;
    }
}

