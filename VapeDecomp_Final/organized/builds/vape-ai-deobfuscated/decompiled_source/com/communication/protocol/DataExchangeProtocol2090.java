/*
 * Decompiled with CFR 0.152.
 */
package com.communication.protocol;

import com.encoding.protocol.EncodingProtocolEnum;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value={ElementType.METHOD})
@Retention(value=RetentionPolicy.RUNTIME)
public @interface DataExchangeProtocol2090 {
    public EncodingProtocolEnum b() default EncodingProtocolEnum.NORMAL;

    public boolean F() default false;
}

