/*
 * Decompiled with CFR 0.152.
 */
package com.reflection.management;

import com.core.exception.CustomRuntimeException;
import com.error.handling.ContextualExceptionHandler;
import com.metadata.introspection.MetadataIntrospectionEngine;
import com.reflection.metadata.ReflectionMetadataResolver933;
import com.reflection.registry.MetaclassDefinitionRegistry;
import com.system.cache.CacheStrategyManager;
import com.system.classpath.ClasspathResolver;
import com.vape.network.VapeDataExchangeProtocol;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ClassPoolRegistry {
    private Hashtable C = null;
    private ArrayList d;
    public static boolean G;
    protected Hashtable n = new Hashtable(191);
    public static boolean p;
    protected ClassPoolRegistry y;
    protected ClasspathResolver D = new ClasspathResolver();
    private int l;
    private static ClassPoolRegistry x;
    public boolean T = false;
    public static boolean F;

    void H() {
        if (this.l++ > 100) {
            this.l = 0;
            Enumeration enumeration = this.n.elements();
            try {
                while (enumeration.hasMoreElements()) {
                    ((MetaclassDefinitionRegistry)enumeration.nextElement()).y();
                }
            }
            catch (RuntimeException runtimeException) {
                throw ClassPoolRegistry.a(runtimeException);
            }
        }
    }

    public Object[] s(String string) {
        try {
            if (this.C == null) {
                this.C = new Hashtable();
            }
        }
        catch (RuntimeException runtimeException) {
            throw ClassPoolRegistry.a(runtimeException);
        }
        return (Object[])this.C.get(string);
    }

    protected void C(String string, MetaclassDefinitionRegistry metaclassDefinitionRegistry, boolean bl) {
        this.n.put(string, metaclassDefinitionRegistry);
    }

    public void I() {
        this.d = new ArrayList();
        this.d.add("java.lang");
    }

    static {
        p = false;
        G = true;
        F = true;
        x = null;
    }

    public String toString() {
        return this.D.toString();
    }

    void i(String string, OutputStream outputStream) throws CustomRuntimeException, IOException, ContextualExceptionHandler {
        this.D.N(string, outputStream);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public VapeDataExchangeProtocol A() {
        return this.D.l();
    }

    InputStream A(String string) throws CustomRuntimeException {
        return this.D.u(string);
    }

    protected synchronized MetaclassDefinitionRegistry C(String string, boolean bl) throws CustomRuntimeException {
        MetaclassDefinitionRegistry metaclassDefinitionRegistry;
        block18: {
            block16: {
                block17: {
                    block15: {
                        metaclassDefinitionRegistry = null;
                        if (bl) {
                            metaclassDefinitionRegistry = this.v(string);
                            try {
                                if (metaclassDefinitionRegistry != null) {
                                    return metaclassDefinitionRegistry;
                                }
                            }
                            catch (CustomRuntimeException customRuntimeException) {
                                throw ClassPoolRegistry.a(customRuntimeException);
                            }
                        }
                        try {
                            if (this.T || this.y == null) break block15;
                        }
                        catch (CustomRuntimeException customRuntimeException) {
                            throw ClassPoolRegistry.a(customRuntimeException);
                        }
                        metaclassDefinitionRegistry = this.y.C(string, bl);
                        try {
                            if (metaclassDefinitionRegistry != null) {
                                return metaclassDefinitionRegistry;
                            }
                        }
                        catch (CustomRuntimeException customRuntimeException) {
                            throw ClassPoolRegistry.a(customRuntimeException);
                        }
                    }
                    metaclassDefinitionRegistry = this.S(string, bl);
                    try {
                        try {
                            if (metaclassDefinitionRegistry == null) break block16;
                            if (!bl) break block17;
                        }
                        catch (CustomRuntimeException customRuntimeException) {
                            throw ClassPoolRegistry.a(customRuntimeException);
                        }
                        this.C(metaclassDefinitionRegistry.H(), metaclassDefinitionRegistry, false);
                    }
                    catch (CustomRuntimeException customRuntimeException) {
                        throw ClassPoolRegistry.a(customRuntimeException);
                    }
                }
                return metaclassDefinitionRegistry;
            }
            try {
                if (!this.T || this.y == null) break block18;
            }
            catch (CustomRuntimeException customRuntimeException) {
                throw ClassPoolRegistry.a(customRuntimeException);
            }
            metaclassDefinitionRegistry = this.y.C(string, bl);
        }
        return metaclassDefinitionRegistry;
    }

    public MetaclassDefinitionRegistry s(InputStream inputStream, boolean bl) throws IOException, RuntimeException {
        this.H();
        inputStream = new BufferedInputStream(inputStream);
        MetadataIntrospectionEngine metadataIntrospectionEngine = new MetadataIntrospectionEngine(inputStream, this);
        ((MetaclassDefinitionRegistry)metadataIntrospectionEngine).m();
        String string = metadataIntrospectionEngine.H();
        try {
            if (bl) {
                this.Q(string);
            }
        }
        catch (IOException iOException) {
            throw ClassPoolRegistry.a(iOException);
        }
        this.C(string, metadataIntrospectionEngine, true);
        return metadataIntrospectionEngine;
    }

    /*
     * Loose catch block
     */
    void Q(String string) throws RuntimeException {
        block13: {
            MetaclassDefinitionRegistry metaclassDefinitionRegistry;
            block12: {
                metaclassDefinitionRegistry = this.v(string);
                if (metaclassDefinitionRegistry != null) break block12;
                try {
                    block14: {
                        if (this.T) break block13;
                        break block14;
                        catch (CustomRuntimeException customRuntimeException) {
                            throw ClassPoolRegistry.a(customRuntimeException);
                        }
                    }
                    if (this.y == null) break block13;
                }
                catch (CustomRuntimeException customRuntimeException) {
                    throw ClassPoolRegistry.a(customRuntimeException);
                }
                try {
                    metaclassDefinitionRegistry = this.y.C(string, true);
                }
                catch (CustomRuntimeException customRuntimeException) {
                    // empty catch block
                }
                try {
                    if (metaclassDefinitionRegistry != null) {
                        throw new RuntimeException(string + " is in a parent ClassPool.  Use the parent.");
                    }
                    break block13;
                }
                catch (CustomRuntimeException customRuntimeException) {
                    throw ClassPoolRegistry.a(customRuntimeException);
                }
            }
            try {
                if (metaclassDefinitionRegistry.c()) {
                    throw new RuntimeException(string + ": frozen class (cannot edit)");
                }
            }
            catch (CustomRuntimeException customRuntimeException) {
                throw ClassPoolRegistry.a(customRuntimeException);
            }
        }
    }

    protected MetaclassDefinitionRegistry v(String string) {
        return (MetaclassDefinitionRegistry)this.n.get(string);
    }

    public VapeDataExchangeProtocol K(VapeDataExchangeProtocol vapeDataExchangeProtocol) {
        return this.D.r(vapeDataExchangeProtocol);
    }

    public ClassPoolRegistry(ClassPoolRegistry classPoolRegistry) {
        this.y = classPoolRegistry;
        if (classPoolRegistry == null) {
            MetaclassDefinitionRegistry[] metaclassDefinitionRegistryArray = MetaclassDefinitionRegistry.B;
            try {
                for (int i = 0; i < metaclassDefinitionRegistryArray.length; ++i) {
                    this.n.put(metaclassDefinitionRegistryArray[i].H(), metaclassDefinitionRegistryArray[i]);
                }
            }
            catch (RuntimeException runtimeException) {
                throw ClassPoolRegistry.a(runtimeException);
            }
        }
        this.C = null;
        this.l = 0;
        this.I();
    }

    public ClassPoolRegistry() {
        this(null);
    }

    public static synchronized ClassPoolRegistry q() {
        try {
            if (x == null) {
                x = new ClassPoolRegistry(null);
                x.A();
            }
        }
        catch (RuntimeException runtimeException) {
            throw ClassPoolRegistry.a(runtimeException);
        }
        return x;
    }

    public URL c(String string) {
        return this.D.x(string);
    }

    public Iterator<String> L() {
        return this.d.iterator();
    }

    public MetaclassDefinitionRegistry Q(String string) throws CustomRuntimeException {
        try {
            if (string.charAt(0) == '[') {
                return ReflectionMetadataResolver933.f(string, this);
            }
        }
        catch (CustomRuntimeException customRuntimeException) {
            throw ClassPoolRegistry.a(customRuntimeException);
        }
        return this.g(string);
    }

    public MetaclassDefinitionRegistry g(String string) throws CustomRuntimeException {
        MetaclassDefinitionRegistry metaclassDefinitionRegistry = string == null ? null : this.C(string, true);
        try {
            if (metaclassDefinitionRegistry == null) {
                throw new CustomRuntimeException(string);
            }
        }
        catch (CustomRuntimeException customRuntimeException) {
            throw ClassPoolRegistry.a(customRuntimeException);
        }
        metaclassDefinitionRegistry.P();
        return metaclassDefinitionRegistry;
    }

    protected MetaclassDefinitionRegistry S(String string, boolean bl) {
        if (string.charAt(0) == '[') {
            string = ReflectionMetadataResolver933.B(string);
        }
        if (string.endsWith("[]")) {
            block11: {
                String string2 = string.substring(0, string.indexOf(91));
                try {
                    try {
                        try {
                            if (bl && this.v(string2) != null) break block11;
                        }
                        catch (RuntimeException runtimeException) {
                            throw ClassPoolRegistry.a(runtimeException);
                        }
                        if (this.c(string2) != null) break block11;
                    }
                    catch (RuntimeException runtimeException) {
                        throw ClassPoolRegistry.a(runtimeException);
                    }
                    return null;
                }
                catch (RuntimeException runtimeException) {
                    throw ClassPoolRegistry.a(runtimeException);
                }
            }
            return new CacheStrategyManager(string, this);
        }
        try {
            if (this.c(string) == null) {
                return null;
            }
        }
        catch (RuntimeException runtimeException) {
            throw ClassPoolRegistry.a(runtimeException);
        }
        return new MetadataIntrospectionEngine(string, this);
    }
}

