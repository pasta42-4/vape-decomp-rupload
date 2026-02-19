/*
 * Decompiled with CFR 0.152.
 */
package com.app.concurrent;

import com.app.event.EventTrigger;
import com.network.configuration.NetworkConfigurationManager2657;

public class BackgroundJobProcessor
extends NetworkConfigurationManager2657 {
    public static void call() {
        new EventTrigger().fire();
    }
}

