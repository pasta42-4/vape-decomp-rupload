/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.app.correlation.management.UuidCorrelationManager;
import com.data.transformation.PayloadTransformationManager;
import com.data.transformation.TransformationProtocol;
import com.network.protocol.NetworkProtocolEncoder1013;

public class T1
extends UuidCorrelationManager<PayloadTransformationManager> {
    private TransformationProtocol w;

    @Override
    public void U(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        this.w = networkProtocolEncoder1013.L(TransformationProtocol.class);
    }

    public T1(PayloadTransformationManager payloadTransformationManager, TransformationProtocol transformationProtocol) {
        super(payloadTransformationManager);
        this.w = transformationProtocol;
    }

    public TransformationProtocol Q() {
        return this.w;
    }

    public T1() {
    }

    @Override
    public void X(NetworkProtocolEncoder1013 networkProtocolEncoder1013) {
        networkProtocolEncoder1013.N(this.w);
    }
}

