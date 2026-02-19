/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package com.core.generic;

import a.Ne;
import a.Qh;
import com.app.context.transformation.ContextTransformationEngine;
import com.app.transactions.TransactionOrchestrator1544;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.transformation.DataTransformationPipeline;
import com.event.management.EventSubscriptionRegistry;
import com.exception.system.CustomSystemException;
import com.math.computation.NumericComputationEngine1131;
import com.minecraft.render.MinecraftRenderContextManager;
import com.network.connection.NetworkConnectionHandler1281;
import com.network.protocol.MultiProtocolContextManager;
import com.network.session.ConnectionStateTracker2569;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.rendering.buffer.GraphicsBufferAllocator;
import com.runtime.context.ContextualExecutionFramework;
import com.security.negotiation.CryptoContextNegotiator684;
import com.system.execution.ConditionalExecutionManager;
import com.system.resource.ResourceAllocator1518;
import java.awt.Color;
import org.lwjgl.opengl.GL11;

public class GenericTypeHandler
extends ContextTransformationEngine<DataTransformationPipeline> {
    private final DataTransformationPipeline V = (DataTransformationPipeline)this.n();

    @DataExchangeProtocol2090
    public void U(MinecraftRenderContextManager minecraftRenderContextManager) {
        Qh qh = minecraftRenderContextManager.getEntityPlayer();
        float f = 57.29578f;
        GL11.glPushMatrix();
        Ne.h.z(2929);
        minecraftRenderContextManager.getEntityRenderer().H(0.0);
        double d2 = NumericComputationEngine1131.b();
        double d3 = NumericComputationEngine1131.S();
        double d4 = NumericComputationEngine1131.n();
        Color color = this.V.K(minecraftRenderContextManager.getThePlayer(), qh.M());
        if (color != null) {
            boolean bl;
            block18: {
                MultiProtocolContextManager multiProtocolContextManager = ConditionalExecutionManager.a(qh, minecraftRenderContextManager.getThePlayer());
                if (multiProtocolContextManager.T()) {
                    color = Color.BLUE;
                }
                float f2 = ApplicationLifecycleManager.K().h();
                double d5 = qh.b();
                double d6 = qh.q();
                double d7 = qh.I();
                double d8 = d5 + (qh.F() - d5) * (double)f2 - d2;
                double d9 = d6 + (qh.V() - d6) * (double)f2 - d3;
                double d10 = d7 + (qh.B() - d7) * (double)f2 - d4;
                bl = GL11.glIsEnabled((int)3042);
                try {
                    CryptoContextNegotiator684.Y();
                    GL11.glBlendFunc((int)770, (int)771);
                    if (!bl) {
                        Ne.h.y(3042);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw GenericTypeHandler.a(customSystemException);
                }
                GL11.glBlendFunc((int)770, (int)771);
                GraphicsBufferAllocator.Y(color);
                Ne.h.z(2896);
                Ne.h.y(2848);
                Ne.h.z(3553);
                GL11.glTranslated((double)d8, (double)d9, (double)d10);
                ResourceAllocator1518 resourceAllocator1518 = this.V.o.D(qh);
                if (resourceAllocator1518.B(ReflectionMetadataResolver.Ee)) {
                    double d11;
                    float f3;
                    EventSubscriptionRegistry eventSubscriptionRegistry = new EventSubscriptionRegistry(resourceAllocator1518.M());
                    ConnectionStateTracker2569 connectionStateTracker2569 = eventSubscriptionRegistry.Q();
                    try {
                        if (!connectionStateTracker2569.r() || !connectionStateTracker2569.B(ReflectionMetadataResolver.V)) break block18;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GenericTypeHandler.a(customSystemException);
                    }
                    float f4 = (float)multiProtocolContextManager.u();
                    float f5 = Math.max(4.0f * ((100.0f - Math.min(f4, 100.0f)) / 100.0f), 0.1f);
                    GL11.glLineWidth((float)f5);
                    TransactionOrchestrator1544 transactionOrchestrator1544 = new TransactionOrchestrator1544(connectionStateTracker2569.M());
                    boolean bl2 = multiProtocolContextManager.h();
                    try {
                        f3 = bl2 ? 0.6f : 0.75f;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GenericTypeHandler.a(customSystemException);
                    }
                    float f6 = f3;
                    float f7 = qh.U();
                    try {
                        GL11.glRotatef((float)f7, (float)0.0f, (float)-999.0f, (float)0.0f);
                        d11 = bl2 ? -0.2 : 0.0;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GenericTypeHandler.a(customSystemException);
                    }
                    double d12 = d11;
                    GL11.glTranslated((double)-0.15, (double)f6, (double)d12);
                    NetworkConnectionHandler1281 networkConnectionHandler1281 = transactionOrchestrator1544.Z();
                    float f8 = networkConnectionHandler1281.i() * f;
                    float f9 = networkConnectionHandler1281.a() * f;
                    float f10 = networkConnectionHandler1281.E() * f;
                    GL11.glRotatef((float)f8, (float)1.0f, (float)0.0f, (float)0.0f);
                    GL11.glRotatef((float)(-f9), (float)0.0f, (float)1.0f, (float)0.0f);
                    GL11.glRotatef((float)(-f10), (float)0.0f, (float)0.0f, (float)1.0f);
                    GL11.glBegin((int)1);
                    GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
                    GL11.glVertex3d((double)0.0, (double)(-f6), (double)0.0);
                    GL11.glEnd();
                    GL11.glRotatef((float)f10, (float)0.0f, (float)0.0f, (float)1.0f);
                    GL11.glRotatef((float)f9, (float)0.0f, (float)1.0f, (float)0.0f);
                    GL11.glRotatef((float)(-f8), (float)1.0f, (float)0.0f, (float)0.0f);
                    GL11.glTranslated((double)0.3, (double)0.0, (double)0.0);
                    NetworkConnectionHandler1281 networkConnectionHandler12812 = transactionOrchestrator1544.q();
                    f8 = networkConnectionHandler12812.i() * f;
                    f9 = networkConnectionHandler12812.a() * f;
                    f10 = networkConnectionHandler12812.E() * f;
                    try {
                        GL11.glRotatef((float)f8, (float)1.0f, (float)0.0f, (float)0.0f);
                        GL11.glRotatef((float)(-f9), (float)0.0f, (float)1.0f, (float)0.0f);
                        GL11.glRotatef((float)(-f10), (float)0.0f, (float)0.0f, (float)1.0f);
                        GL11.glBegin((int)1);
                        GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
                        GL11.glVertex3d((double)0.0, (double)(-f6), (double)0.0);
                        GL11.glEnd();
                        GL11.glRotatef((float)f10, (float)0.0f, (float)0.0f, (float)1.0f);
                        GL11.glRotatef((float)f9, (float)0.0f, (float)1.0f, (float)0.0f);
                        GL11.glRotatef((float)(-f8), (float)1.0f, (float)0.0f, (float)0.0f);
                        GL11.glTranslated((double)-0.15, (double)0.0, (double)0.0);
                        GL11.glBegin((int)1);
                        GL11.glVertex3d((double)0.15, (double)0.0, (double)0.0);
                        GL11.glVertex3d((double)-0.15, (double)0.0, (double)0.0);
                        GL11.glEnd();
                        if (bl2) {
                            GL11.glRotatef((float)20.0f, (float)1.0f, (float)0.0f, (float)0.0f);
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GenericTypeHandler.a(customSystemException);
                    }
                    GL11.glBegin((int)1);
                    GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
                    GL11.glVertex3d((double)0.0, (double)0.65, (double)0.0);
                    GL11.glEnd();
                    GL11.glTranslated((double)0.0, (double)0.65, (double)0.0);
                    GL11.glBegin((int)1);
                    GL11.glVertex3d((double)0.35, (double)0.0, (double)0.0);
                    GL11.glVertex3d((double)-0.35, (double)0.0, (double)0.0);
                    GL11.glEnd();
                    GL11.glTranslated((double)-0.35, (double)0.0, (double)0.0);
                    NetworkConnectionHandler1281 networkConnectionHandler12813 = transactionOrchestrator1544.s();
                    f8 = networkConnectionHandler12813.i() * f;
                    f9 = networkConnectionHandler12813.a() * f;
                    f10 = networkConnectionHandler12813.E() * f;
                    GL11.glRotatef((float)f8, (float)1.0f, (float)0.0f, (float)0.0f);
                    GL11.glRotatef((float)(-f9), (float)0.0f, (float)1.0f, (float)0.0f);
                    GL11.glRotatef((float)(-f10), (float)0.0f, (float)0.0f, (float)1.0f);
                    GL11.glBegin((int)1);
                    GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
                    GL11.glVertex3d((double)0.0, (double)-0.6, (double)0.0);
                    GL11.glEnd();
                    GL11.glRotatef((float)f10, (float)0.0f, (float)0.0f, (float)1.0f);
                    GL11.glRotatef((float)f9, (float)0.0f, (float)1.0f, (float)0.0f);
                    GL11.glRotatef((float)(-f8), (float)1.0f, (float)0.0f, (float)0.0f);
                    GL11.glTranslated((double)0.7, (double)0.0, (double)0.0);
                    NetworkConnectionHandler1281 networkConnectionHandler12814 = transactionOrchestrator1544.d();
                    f8 = networkConnectionHandler12814.i() * f;
                    f9 = networkConnectionHandler12814.a() * f;
                    f10 = networkConnectionHandler12814.E() * f;
                    GL11.glRotatef((float)f8, (float)1.0f, (float)0.0f, (float)0.0f);
                    GL11.glRotatef((float)(-f9), (float)0.0f, (float)1.0f, (float)0.0f);
                    GL11.glRotatef((float)(-f10), (float)0.0f, (float)0.0f, (float)1.0f);
                    GL11.glBegin((int)1);
                    GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
                    GL11.glVertex3d((double)0.0, (double)-0.6, (double)0.0);
                    GL11.glEnd();
                    GL11.glRotatef((float)f10, (float)0.0f, (float)0.0f, (float)1.0f);
                    GL11.glRotatef((float)f9, (float)0.0f, (float)1.0f, (float)0.0f);
                    GL11.glRotatef((float)(-f8), (float)1.0f, (float)0.0f, (float)0.0f);
                    GL11.glTranslated((double)-0.35, (double)0.0, (double)0.0);
                    GL11.glRotatef((float)(-f7), (float)0.0f, (float)-999.0f, (float)0.0f);
                    float f11 = qh.q();
                    float f12 = qh.S();
                    double d13 = 0.4;
                    GL11.glRotated((double)f11, (double)0.0, (double)-999.0, (double)0.0);
                    GL11.glRotated((double)f12, (double)999.0, (double)0.0, (double)0.0);
                    GL11.glBegin((int)1);
                    GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
                    GL11.glVertex3d((double)0.0, (double)d13, (double)0.0);
                    GL11.glEnd();
                    GL11.glBegin((int)1);
                    GL11.glVertex3d((double)0.0, (double)d13, (double)0.0);
                    GL11.glVertex3d((double)0.0, (double)d13, (double)0.25);
                    GL11.glEnd();
                    GL11.glRotated((double)f12, (double)999.0, (double)0.0, (double)0.0);
                    GL11.glRotated((double)(-f11), (double)0.0, (double)999.0, (double)0.0);
                }
            }
            try {
                if (!bl) {
                    Ne.h.z(3042);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw GenericTypeHandler.a(customSystemException);
            }
            Ne.h.y(3553);
            Ne.h.z(2848);
            Ne.h.y(2896);
            CryptoContextNegotiator684.J();
        }
        GL11.glColor3d((double)1.0, (double)1.0, (double)1.0);
        minecraftRenderContextManager.getEntityRenderer().F(0.0);
        Ne.h.y(2929);
        GL11.glPopMatrix();
    }

    public GenericTypeHandler(ContextualExecutionFramework contextualExecutionFramework, String string) {
        super(contextualExecutionFramework, string);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

