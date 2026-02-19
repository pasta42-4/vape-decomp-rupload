/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.minecraft.event;

import com.exception.system.CustomSystemException;
import com.notification.dispatch.NotificationDispatchInterface2673;
import org.jetbrains.annotations.Nullable;

public interface RenderEventInterface<T> {
    private static String lambda$createStringFormatter$1(String string, String string2) {
        String string3;
        try {
            string3 = string2 != null ? string2 : string;
        }
        catch (CustomSystemException customSystemException) {
            throw RenderEventInterface.a(customSystemException);
        }
        return string3;
    }

    private static String lambda$createNamedFormatter$0(String string, NotificationDispatchInterface2673 notificationDispatchInterface2673) {
        String string2;
        try {
            string2 = notificationDispatchInterface2673 != null ? notificationDispatchInterface2673.O() : string;
        }
        catch (CustomSystemException customSystemException) {
            throw RenderEventInterface.a(customSystemException);
        }
        return string2;
    }

    public static <N extends NotificationDispatchInterface2673> RenderEventInterface<N> V() {
        return RenderEventInterface.C("");
    }

    public static <N extends NotificationDispatchInterface2673> RenderEventInterface<N> C(@Nullable String string) {
        return arg_0 -> RenderEventInterface.lambda$createNamedFormatter$0(string, arg_0);
    }

    public static RenderEventInterface<String> e() {
        return RenderEventInterface.R("");
    }

    public static RenderEventInterface<String> R(@Nullable String string) {
        return arg_0 -> RenderEventInterface.lambda$createStringFormatter$1(string, arg_0);
    }

    public String W(T var1);

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }
}

