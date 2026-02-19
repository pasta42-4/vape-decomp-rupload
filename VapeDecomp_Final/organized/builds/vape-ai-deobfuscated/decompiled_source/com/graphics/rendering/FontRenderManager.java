/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package com.graphics.rendering;

import a.FO;
import a.GB;
import a.tl;
import com.app.exceptions.CustomExecutionException;
import com.app.sorting.util.DataSortingComparator;
import com.cache.management.EvictionAwareCacheMap;
import com.collections.management.MultiContainerRegistry;
import com.deobfuscation.lifecycle.ComponentLifecycleManager;
import com.geospatial.resolver.GeoLocationResolver;
import com.graphics.model.GeometricColorDescriptor;
import com.graphics.rendering.GraphicsRenderEngine;
import com.media.imaging.ImageMetadataDescriptor;
import com.network.protocol.ProtocolNegotiationInterface;
import com.security.cryptography.CryptographicKeyGenerator2396;
import com.signal.processing.SignalParameterContainer;
import com.system.configuration.MultiParameterConfigurationManager;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Rectangle;
import java.awt.font.GlyphVector;
import java.awt.font.TextAttribute;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.opengl.GL11;

public class FontRenderManager
implements ComponentLifecycleManager {
    private int c;
    private final List K;
    private static final long a = MultiContainerRegistry.a(3453970734379466854L, 3916500618261219687L, MethodHandles.lookup().lookupClass()).a(85824266403746L);
    private int U;
    private final LinkedHashMap L;
    private int F;
    private int W;
    private int j;
    private static final Map f = new HashMap(13);
    private boolean z;
    private final FO[][] y;
    private final List A;
    private int r;
    private static final SignalParameterContainer H;
    private int S;
    private static final Comparator X;
    private int N;
    private int O;
    private static final long[] d;
    private FO D;
    private int I;
    private int b;
    private static final GB t;
    private static final Integer[] e;
    private final List E;
    private int g;
    private int R;
    private Font w;
    private int Z;

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = FontRenderManager.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public boolean Q(int n) throws CustomExecutionException {
        try {
            if (this.A.isEmpty()) {
                return false;
            }
        }
        catch (CustomExecutionException customExecutionException) {
            throw FontRenderManager.a(customExecutionException);
        }
        try {
            if (this.K.isEmpty()) {
                throw new IllegalStateException("The UnicodeFont must have at least one effect before any glyphs can be loaded.");
            }
        }
        catch (CustomExecutionException customExecutionException) {
            throw FontRenderManager.a(customExecutionException);
        }
        Object object = this.A.iterator();
        while (object.hasNext()) {
            Object object2;
            block24: {
                block23: {
                    object2 = (FO)object.next();
                    int n2 = ((FO)object2).i();
                    try {
                        try {
                            if (((FO)object2).P() != 0 && n2 != 32) break block23;
                        }
                        catch (CustomExecutionException customExecutionException) {
                            throw FontRenderManager.a(customExecutionException);
                        }
                        object.remove();
                        continue;
                    }
                    catch (CustomExecutionException customExecutionException) {
                        throw FontRenderManager.a(customExecutionException);
                    }
                }
                try {
                    try {
                        if (!((FO)object2).u()) continue;
                        if (this.D == null) break block24;
                    }
                    catch (CustomExecutionException customExecutionException) {
                        throw FontRenderManager.a(customExecutionException);
                    }
                    if (object2 == this.D) continue;
                }
                catch (CustomExecutionException customExecutionException) {
                    throw FontRenderManager.a(customExecutionException);
                }
                object.remove();
                continue;
            }
            this.D = object2;
        }
        Collections.sort(this.A, X);
        for (Object object2 : this.E) {
            n -= ((GraphicsRenderEngine)object2).M(this.A, n);
            try {
                try {
                    if (n != 0 && !this.A.isEmpty()) continue;
                }
                catch (CustomExecutionException customExecutionException) {
                    throw FontRenderManager.a(customExecutionException);
                }
                return true;
            }
            catch (CustomExecutionException customExecutionException) {
                throw FontRenderManager.a(customExecutionException);
            }
        }
        while (!this.A.isEmpty()) {
            object = new GraphicsRenderEngine(this, this.I, this.r);
            this.E.add(object);
            n -= ((GraphicsRenderEngine)object).M(this.A, n);
            try {
                if (n != 0) continue;
                return true;
            }
            catch (CustomExecutionException customExecutionException) {
                throw FontRenderManager.a(customExecutionException);
            }
        }
        return true;
    }

    public void p() {
        this.Q(32, 255);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void t(char c, float[] fArray) {
        try {
            switch (c) {
                case '4': {
                    fArray[0] = 1.0f;
                    fArray[1] = 0.0f;
                    fArray[2] = 0.0f;
                    return;
                }
                case 'c': {
                    fArray[0] = 1.0f;
                    fArray[1] = 0.33f;
                    fArray[2] = 0.33f;
                    return;
                }
                case '6': {
                    fArray[0] = 1.0f;
                    fArray[1] = 0.66f;
                    fArray[2] = 0.0f;
                    return;
                }
                case 'e': {
                    fArray[0] = 1.0f;
                    fArray[1] = 1.0f;
                    fArray[2] = 0.33f;
                    return;
                }
                case '2': {
                    fArray[0] = 0.0f;
                    fArray[1] = 0.66f;
                    fArray[2] = 0.0f;
                    return;
                }
                case 'a': {
                    fArray[0] = 0.33f;
                    fArray[1] = 1.0f;
                    fArray[2] = 0.33f;
                    return;
                }
                case 'b': {
                    fArray[0] = 0.33f;
                    fArray[1] = 1.0f;
                    fArray[2] = 1.0f;
                    return;
                }
                case '3': {
                    fArray[0] = 0.0f;
                    fArray[1] = 0.66f;
                    fArray[2] = 0.66f;
                    return;
                }
                case '1': {
                    fArray[0] = 0.0f;
                    fArray[1] = 0.0f;
                    fArray[2] = 0.66f;
                    return;
                }
                case '9': {
                    fArray[0] = 0.33f;
                    fArray[1] = 0.33f;
                    fArray[2] = 1.0f;
                    return;
                }
                case 'd': {
                    fArray[0] = 1.0f;
                    fArray[1] = 0.33f;
                    fArray[2] = 1.0f;
                    return;
                }
                case '5': {
                    fArray[0] = 0.66f;
                    fArray[1] = 0.0f;
                    fArray[2] = 0.66f;
                    return;
                }
                case 'f': {
                    fArray[0] = 1.0f;
                    fArray[1] = 1.0f;
                    fArray[2] = 1.0f;
                    return;
                }
                case '7': {
                    fArray[0] = 0.66f;
                    fArray[1] = 0.66f;
                    fArray[2] = 0.66f;
                    return;
                }
                case '8': {
                    fArray[0] = 0.33f;
                    fArray[1] = 0.33f;
                    fArray[2] = 0.33f;
                    return;
                }
                case '0': {
                    fArray[0] = 0.0f;
                    fArray[1] = 0.0f;
                    fArray[2] = 0.0f;
                    return;
                }
                default: {
                    return;
                }
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw FontRenderManager.a(illegalArgumentException);
        }
    }

    static int P(FontRenderManager fontRenderManager, int n) {
        fontRenderManager.c = n;
        return fontRenderManager.c;
    }

    public int H() {
        return this.U;
    }

    @Override
    public int w(String string) {
        try {
            if (string == null) {
                throw new IllegalArgumentException("text cannot be null.");
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw FontRenderManager.a(illegalArgumentException);
        }
        try {
            if (string.length() == 0) {
                return 0;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw FontRenderManager.a(illegalArgumentException);
        }
        char[] cArray = string.toCharArray();
        GlyphVector glyphVector = this.w.layoutGlyphVector(GraphicsRenderEngine.r, cArray, 0, cArray.length, 0);
        int n = 0;
        int n2 = 0;
        int n3 = glyphVector.getNumGlyphs();
        for (int i = 0; i < n3; ++i) {
            int n4 = glyphVector.getGlyphCharIndex(i);
            int n5 = string.codePointAt(n4);
            try {
                if (n5 == 32) {
                    continue;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw FontRenderManager.a(illegalArgumentException);
            }
            Rectangle rectangle = this.X(glyphVector, i, n5);
            n2 = Math.max(n2, this.W + rectangle.y + rectangle.height);
            if (n5 != 10) continue;
            ++n;
            n2 = 0;
        }
        return n * this.F() + n2;
    }

    public int Z() {
        return this.O;
    }

    /*
     * Loose catch block
     */
    public SignalParameterContainer z(float f, float f2, String string, GeometricColorDescriptor geometricColorDescriptor, int n, int n2) {
        SignalParameterContainer signalParameterContainer;
        block98: {
            block97: {
                int n3;
                int n4;
                int n5;
                boolean bl;
                block96: {
                    GlyphVector glyphVector;
                    char[] cArray;
                    block92: {
                        block80: {
                            String string2;
                            block86: {
                                block84: {
                                    block88: {
                                        block87: {
                                            block85: {
                                                block81: {
                                                    block83: {
                                                        block82: {
                                                            block101: {
                                                                block100: {
                                                                    block99: {
                                                                        try {
                                                                            if (string == null) {
                                                                                throw new IllegalArgumentException("text cannot be null.");
                                                                            }
                                                                        }
                                                                        catch (CustomExecutionException customExecutionException) {
                                                                            throw FontRenderManager.a(customExecutionException);
                                                                        }
                                                                        try {
                                                                            if (string.length() == 0) {
                                                                                return H;
                                                                            }
                                                                        }
                                                                        catch (CustomExecutionException customExecutionException) {
                                                                            throw FontRenderManager.a(customExecutionException);
                                                                        }
                                                                        try {
                                                                            if (geometricColorDescriptor == null) {
                                                                                throw new IllegalArgumentException("color cannot be null.");
                                                                            }
                                                                        }
                                                                        catch (CustomExecutionException customExecutionException) {
                                                                            throw FontRenderManager.a(customExecutionException);
                                                                        }
                                                                        f -= (float)this.O;
                                                                        f2 -= (float)this.j;
                                                                        bl = GL11.glIsEnabled((int)3553);
                                                                        int n6 = ((int)(geometricColorDescriptor.f * 255.0f) & 0xFF) << 24 | ((int)(geometricColorDescriptor.P * 255.0f) & 0xFF) << 16 | ((int)(geometricColorDescriptor.I * 255.0f) & 0xFF) << 8 | ((int)(geometricColorDescriptor.F * 255.0f) & 0xFF) << 0;
                                                                        string2 = string.substring(n, n2) + n6;
                                                                        MultiParameterConfigurationManager.T();
                                                                        signalParameterContainer = null;
                                                                        if (!this.z) break block80;
                                                                        if (!this.A.isEmpty()) break block80;
                                                                        break block99;
                                                                        catch (CustomExecutionException customExecutionException) {
                                                                            throw FontRenderManager.a(customExecutionException);
                                                                        }
                                                                    }
                                                                    if (this.S != -1) break block81;
                                                                    break block100;
                                                                    catch (CustomExecutionException customExecutionException) {
                                                                        throw FontRenderManager.a(customExecutionException);
                                                                    }
                                                                }
                                                                this.S = t.I(200);
                                                                if (this.S != 0) break block81;
                                                                break block101;
                                                                catch (CustomExecutionException customExecutionException) {
                                                                    throw FontRenderManager.a(customExecutionException);
                                                                }
                                                            }
                                                            try {
                                                                block102: {
                                                                    this.S = -1;
                                                                    this.z = false;
                                                                    if (!bl) break block82;
                                                                    break block102;
                                                                    catch (CustomExecutionException customExecutionException) {
                                                                        throw FontRenderManager.a(customExecutionException);
                                                                    }
                                                                }
                                                                tl.B();
                                                                break block83;
                                                            }
                                                            catch (CustomExecutionException customExecutionException) {
                                                                throw FontRenderManager.a(customExecutionException);
                                                            }
                                                        }
                                                        tl.R();
                                                    }
                                                    return new SignalParameterContainer();
                                                }
                                                signalParameterContainer = (SignalParameterContainer)this.L.get(string2);
                                                if (signalParameterContainer == null) break block84;
                                                try {
                                                    block103: {
                                                        if (!signalParameterContainer.Y) break block85;
                                                        break block103;
                                                        catch (CustomExecutionException customExecutionException) {
                                                            throw FontRenderManager.a(customExecutionException);
                                                        }
                                                    }
                                                    signalParameterContainer.Y = false;
                                                    break block86;
                                                }
                                                catch (CustomExecutionException customExecutionException) {
                                                    throw FontRenderManager.a(customExecutionException);
                                                }
                                            }
                                            try {
                                                t.b(f, f2, 0.0f);
                                                t.M(signalParameterContainer.b);
                                                t.b(-f, -f2, 0.0f);
                                                if (!bl) break block87;
                                                tl.B();
                                                break block88;
                                            }
                                            catch (CustomExecutionException customExecutionException) {
                                                throw FontRenderManager.a(customExecutionException);
                                            }
                                        }
                                        tl.R();
                                    }
                                    return signalParameterContainer;
                                }
                                if (signalParameterContainer == null) {
                                    signalParameterContainer = new SignalParameterContainer();
                                    int n7 = this.L.size();
                                    try {
                                        this.L.put(string2, signalParameterContainer);
                                        signalParameterContainer.b = n7 < 200 ? this.S + n7 : this.c;
                                    }
                                    catch (CustomExecutionException customExecutionException) {
                                        throw FontRenderManager.a(customExecutionException);
                                    }
                                }
                            }
                            this.L.put(string2, signalParameterContainer);
                        }
                        cArray = new char[string.length()];
                        Arrays.fill(cArray, '\u0000');
                        int n8 = 0;
                        String string3 = "";
                        char[] cArray2 = string.toCharArray();
                        for (int i = 0; i < cArray2.length; ++i) {
                            char c;
                            block89: {
                                char c2;
                                block91: {
                                    block105: {
                                        block104: {
                                            block90: {
                                                c = cArray2[i];
                                                if (c != '\u00a7') break block89;
                                                try {
                                                    if (++i >= cArray2.length) {
                                                        break;
                                                    }
                                                    break block90;
                                                    catch (CustomExecutionException customExecutionException) {
                                                        throw FontRenderManager.a(customExecutionException);
                                                    }
                                                }
                                                catch (CustomExecutionException customExecutionException) {
                                                    throw FontRenderManager.a(customExecutionException);
                                                }
                                            }
                                            c2 = cArray2[i];
                                            if (c2 == 'o') continue;
                                            if (c2 == 'l') continue;
                                            break block104;
                                            catch (CustomExecutionException customExecutionException) {
                                                throw FontRenderManager.a(customExecutionException);
                                            }
                                        }
                                        if (c2 == 'm') continue;
                                        break block105;
                                        catch (CustomExecutionException customExecutionException) {
                                            throw FontRenderManager.a(customExecutionException);
                                        }
                                    }
                                    try {
                                        if (c2 == 'n') {
                                            continue;
                                        }
                                        break block91;
                                        catch (CustomExecutionException customExecutionException) {
                                            throw FontRenderManager.a(customExecutionException);
                                        }
                                    }
                                    catch (CustomExecutionException customExecutionException) {
                                        throw FontRenderManager.a(customExecutionException);
                                    }
                                }
                                cArray[n8] = c2;
                                continue;
                            }
                            string3 = string3 + c;
                            ++n8;
                        }
                        string = string3;
                        n2 = string.length();
                        try {
                            t.b(f, f2, 0.0f);
                            if (signalParameterContainer != null) {
                                t.R(signalParameterContainer.b, 4865);
                            }
                        }
                        catch (CustomExecutionException customExecutionException) {
                            throw FontRenderManager.a(customExecutionException);
                        }
                        char[] cArray3 = string.substring(0, n2).toCharArray();
                        glyphVector = this.w.layoutGlyphVector(GraphicsRenderEngine.r, cArray3, 0, cArray3.length, 0);
                        try {
                            if (this.A.size() <= 0) break block92;
                            this.L();
                            break block92;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw FontRenderManager.a(illegalArgumentException);
                        }
                        {
                            catch (CustomExecutionException customExecutionException) {
                                customExecutionException.printStackTrace();
                            }
                        }
                    }
                    n5 = 0;
                    n4 = 0;
                    n3 = 0;
                    int n9 = 0;
                    int n10 = this.W;
                    boolean bl2 = false;
                    ProtocolNegotiationInterface protocolNegotiationInterface = null;
                    GeometricColorDescriptor geometricColorDescriptor2 = geometricColorDescriptor;
                    geometricColorDescriptor2.t();
                    int n11 = glyphVector.getNumGlyphs();
                    for (int i = 0; i < n11; ++i) {
                        ImageMetadataDescriptor imageMetadataDescriptor;
                        Rectangle rectangle;
                        int n12;
                        block94: {
                            FO fO2;
                            block93: {
                                int n13 = glyphVector.getGlyphCharIndex(i);
                                try {
                                    if (n13 < n) {
                                        continue;
                                    }
                                }
                                catch (CustomExecutionException customExecutionException) {
                                    throw FontRenderManager.a(customExecutionException);
                                }
                                try {
                                    if (n13 > n2) {
                                        break;
                                    }
                                }
                                catch (CustomExecutionException customExecutionException) {
                                    throw FontRenderManager.a(customExecutionException);
                                }
                                char c = cArray[i];
                                if (c != '\u0000') {
                                    float[] fArray = new float[3];
                                    FontRenderManager.t(c, fArray);
                                    geometricColorDescriptor2 = new GeometricColorDescriptor(fArray[0], fArray[1], fArray[2]);
                                    if (c == 'r') {
                                        geometricColorDescriptor2 = geometricColorDescriptor;
                                    }
                                }
                                geometricColorDescriptor2.t();
                                n12 = string.codePointAt(n13);
                                rectangle = this.X(glyphVector, i, n12);
                                fO2 = this.s(glyphVector.getGlyphCode(i), n12, rectangle, glyphVector, i);
                                try {
                                    if (!bl2 || n12 == 10) break block93;
                                }
                                catch (CustomExecutionException customExecutionException) {
                                    throw FontRenderManager.a(customExecutionException);
                                }
                                n9 = -rectangle.x;
                                bl2 = false;
                            }
                            imageMetadataDescriptor = fO2.g();
                            try {
                                try {
                                    if (imageMetadataDescriptor != null || this.D == null) break block94;
                                }
                                catch (CustomExecutionException customExecutionException) {
                                    throw FontRenderManager.a(customExecutionException);
                                }
                                if (!fO2.u()) break block94;
                            }
                            catch (CustomExecutionException customExecutionException) {
                                throw FontRenderManager.a(customExecutionException);
                            }
                            imageMetadataDescriptor = this.D.g();
                        }
                        if (imageMetadataDescriptor != null) {
                            ProtocolNegotiationInterface protocolNegotiationInterface2;
                            block95: {
                                protocolNegotiationInterface2 = imageMetadataDescriptor.l();
                                try {
                                    if (protocolNegotiationInterface == null || protocolNegotiationInterface == protocolNegotiationInterface2) break block95;
                                }
                                catch (CustomExecutionException customExecutionException) {
                                    throw FontRenderManager.a(customExecutionException);
                                }
                                t.r();
                                protocolNegotiationInterface = null;
                            }
                            if (protocolNegotiationInterface == null) {
                                protocolNegotiationInterface2.P();
                                t.l(7);
                                protocolNegotiationInterface = protocolNegotiationInterface2;
                            }
                            imageMetadataDescriptor.s(rectangle.x + n9, rectangle.y + n10, imageMetadataDescriptor.Y(), imageMetadataDescriptor.w());
                        }
                        if (i >= 0) {
                            n9 += this.g + this.O + this.N;
                        }
                        n5 = Math.max(n5, rectangle.x + n9 + rectangle.width);
                        n4 = Math.max(n4, this.W + rectangle.y + rectangle.height);
                        if (n12 != 10) continue;
                        bl2 = true;
                        n10 += this.F();
                        ++n3;
                        n4 = 0;
                    }
                    try {
                        if (protocolNegotiationInterface != null) {
                            t.r();
                        }
                    }
                    catch (CustomExecutionException customExecutionException) {
                        throw FontRenderManager.a(customExecutionException);
                    }
                    try {
                        try {
                            if (signalParameterContainer == null) break block96;
                            t.L();
                            if (this.A.isEmpty()) break block96;
                        }
                        catch (CustomExecutionException customExecutionException) {
                            throw FontRenderManager.a(customExecutionException);
                        }
                        signalParameterContainer.Y = true;
                    }
                    catch (CustomExecutionException customExecutionException) {
                        throw FontRenderManager.a(customExecutionException);
                    }
                }
                t.b(-f, -f2, 0.0f);
                if (signalParameterContainer == null) {
                    signalParameterContainer = new SignalParameterContainer();
                }
                try {
                    signalParameterContainer.o = (short)n5;
                    signalParameterContainer.P = (short)(n3 * this.F() + n4);
                    if (!bl) break block97;
                    tl.B();
                    break block98;
                }
                catch (CustomExecutionException customExecutionException) {
                    throw FontRenderManager.a(customExecutionException);
                }
            }
            tl.R();
        }
        return signalParameterContainer;
    }

    public Font S() {
        return this.w;
    }

    public void z(String string) {
        try {
            if (string == null) {
                throw new IllegalArgumentException("text cannot be null.");
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw FontRenderManager.a(illegalArgumentException);
        }
        char[] cArray = string.toCharArray();
        GlyphVector glyphVector = this.w.layoutGlyphVector(GraphicsRenderEngine.r, cArray, 0, cArray.length, 0);
        int n = glyphVector.getNumGlyphs();
        for (int i = 0; i < n; ++i) {
            int n2 = string.codePointAt(glyphVector.getGlyphCharIndex(i));
            Rectangle rectangle = this.X(glyphVector, i, n2);
            this.s(glyphVector.getGlyphCode(i), n2, rectangle, glyphVector, i);
        }
    }

    @Override
    public int F() {
        return this.R + this.W + this.Z + this.j + this.U + this.b;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/aC" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7D4C;
        if (e[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])f.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/aC", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            FontRenderManager.e[n2] = n3;
        }
        return e[n2];
    }

    public void Q(int n, int n2) {
        try {
            for (int i = n; i <= n2; ++i) {
                this.z(new String(Character.toChars(i)));
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw FontRenderManager.a(illegalArgumentException);
        }
    }

    public int O() {
        return this.g;
    }

    public int K() {
        return this.j;
    }

    public List I() {
        return this.K;
    }

    private void k(Font font, int n, boolean bl, boolean bl2) {
        Float f;
        TextAttribute textAttribute;
        Map<TextAttribute, ?> map;
        Float f2;
        TextAttribute textAttribute2;
        Map<TextAttribute, ?> map2;
        Map<TextAttribute, ?> map3 = font.getAttributes();
        try {
            map3.put(TextAttribute.SIZE, new Float(n));
            map2 = map3;
            textAttribute2 = TextAttribute.WEIGHT;
            f2 = bl ? TextAttribute.WEIGHT_BOLD : TextAttribute.WEIGHT_REGULAR;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw FontRenderManager.a(illegalArgumentException);
        }
        try {
            map2.put(textAttribute2, f2);
            map = map3;
            textAttribute = TextAttribute.POSTURE;
            f = bl2 ? TextAttribute.POSTURE_OBLIQUE : TextAttribute.POSTURE_REGULAR;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw FontRenderManager.a(illegalArgumentException);
        }
        map.put(textAttribute, f);
        map3.put(TextAttribute.KERNING, TextAttribute.KERNING_ON);
        this.w = font.deriveFont(map3);
        FontMetrics fontMetrics = GraphicsRenderEngine.R().getFontMetrics(this.w);
        this.W = fontMetrics.getAscent();
        this.R = fontMetrics.getDescent();
        this.Z = fontMetrics.getLeading();
        char[] cArray = " ".toCharArray();
        GlyphVector glyphVector = this.w.layoutGlyphVector(GraphicsRenderEngine.r, cArray, 0, cArray.length, 0);
        this.F = glyphVector.getGlyphLogicalBounds((int)0).getBounds().width;
    }

    public int J() {
        return this.W;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x3B0BDD64762L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[3];
        int n = 0;
        String string = "\u0004\u0097k\u00e2;\u00ea\u0096\u00d0\u00e5\u00cc\u00d0\u00a3\u0098~\u00b4\u00cdJg\u00a9\u00fc\u0011.q8";
        int n2 = "\u0004\u0097k\u00e2;\u00ea\u0096\u00d0\u00e5\u00cc\u00d0\u00a3\u0098~\u00b4\u00cdJg\u00a9\u00fc\u0011.q8".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        d = lArray;
        e = new Integer[3];
        t = GeoLocationResolver.Y();
        H = new SignalParameterContainer();
        X = new DataSortingComparator();
    }

    public boolean L() throws CustomExecutionException {
        return this.Q(-1);
    }

    @Override
    public void X(float f, float f2, String string, GeometricColorDescriptor geometricColorDescriptor, int n, int n2) {
        this.z(f, f2, string, geometricColorDescriptor, n, n2);
    }

    @Override
    public void u(float f, float f2, String string, GeometricColorDescriptor geometricColorDescriptor) {
        this.X(f, f2, string, geometricColorDescriptor, 0, string.length());
    }

    private Rectangle X(GlyphVector glyphVector, int n, int n2) {
        Rectangle rectangle = glyphVector.getGlyphPixelBounds(n, GraphicsRenderEngine.r, 0.0f, 0.0f);
        try {
            if (n2 == 32) {
                rectangle.width = this.F;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw FontRenderManager.a(illegalArgumentException);
        }
        return rectangle;
    }

    private FO s(int n, int n2, Rectangle rectangle, GlyphVector glyphVector, int n3) {
        FO fO2;
        block9: {
            block8: {
                long l = a ^ 0x2D313D11C9BDL;
                try {
                    try {
                        if (n >= 0 && n < FontRenderManager.a("q", (int)4974, (long)(0x3A1EDAE40D60AD70L ^ l))) break block8;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw FontRenderManager.a(illegalArgumentException);
                    }
                    return new CryptographicKeyGenerator2396(this, n2, rectangle, glyphVector, n3, this);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw FontRenderManager.a(illegalArgumentException);
                }
            }
            int n4 = n / 512;
            int n5 = n & 0x1FF;
            fO2 = null;
            FO[] fOArray = this.y[n4];
            if (fOArray != null) {
                fO2 = fOArray[n5];
                try {
                    if (fO2 != null) {
                        return fO2;
                    }
                    break block9;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw FontRenderManager.a(illegalArgumentException);
                }
            }
            this.y[n4] = new FO[512];
            fOArray = this.y[n4];
        }
        fO2 = fOArray[n5] = new FO(n2, rectangle, glyphVector, n3, this);
        this.A.add(fO2);
        return fO2;
    }

    @Override
    public int K(String string) {
        Object object;
        try {
            if (string == null) {
                throw new IllegalArgumentException("text cannot be null.");
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw FontRenderManager.a(illegalArgumentException);
        }
        try {
            if (string.length() == 0) {
                return 0;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw FontRenderManager.a(illegalArgumentException);
        }
        if (this.z) {
            object = (SignalParameterContainer)this.L.get(string);
            try {
                if (object != null) {
                    return object.o;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw FontRenderManager.a(illegalArgumentException);
            }
        }
        object = string.toCharArray();
        GlyphVector glyphVector = this.w.layoutGlyphVector(GraphicsRenderEngine.r, (char[])object, 0, ((char[])object).length, 0);
        int n = 0;
        int n2 = 0;
        boolean bl = false;
        int n3 = glyphVector.getNumGlyphs();
        for (int i = 0; i < n3; ++i) {
            Rectangle rectangle;
            int n4;
            block14: {
                int n5 = glyphVector.getGlyphCharIndex(i);
                n4 = string.codePointAt(n5);
                rectangle = this.X(glyphVector, i, n4);
                try {
                    if (!bl || n4 == 10) break block14;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw FontRenderManager.a(illegalArgumentException);
                }
                n2 = -rectangle.x;
            }
            if (i > 0) {
                n2 += this.O + this.g + this.N;
            }
            n = Math.max(n, rectangle.x + n2 + rectangle.width);
            if (n4 != 10) continue;
            bl = true;
        }
        return n;
    }

    public FontRenderManager(Font font) {
        long l = a ^ 0x64544AD585DFL;
        this.y = new FO[2175][];
        this.E = new ArrayList();
        this.A = new ArrayList(256);
        this.K = new ArrayList();
        this.I = (int)FontRenderManager.a("q", (int)26474, (long)(0x76641545EC0B9514L ^ l));
        this.r = (int)FontRenderManager.a("q", (int)8120, (long)(0x43A32310E0266DC5L ^ l));
        this.z = true;
        this.S = -1;
        this.L = new EvictionAwareCacheMap(this, 200, 1.0f, true);
        this.k(font, font.getSize(), font.isBold(), font.isItalic());
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(FontRenderManager.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

