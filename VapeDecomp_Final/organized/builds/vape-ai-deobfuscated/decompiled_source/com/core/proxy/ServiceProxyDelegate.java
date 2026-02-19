/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.UnmodifiableView
 */
package com.core.proxy;

import a.KB;
import com.app.event.core.EventCancellationProtocol;
import com.app.events.EventNotificationBroker2314;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.computation.AbstractComputationKernel;
import com.encoding.protocol.EncodingProtocolEnum;
import com.event.filtering.EventFilterController;
import com.exception.system.CustomSystemException;
import com.network.config.NetworkConfigurationResolver2717;
import com.network.protocol.DataTransformationContract;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import org.jetbrains.annotations.UnmodifiableView;

public class ServiceProxyDelegate {
    private static AbstractComputationKernel[] e;
    private final Predicate<EventNotificationBroker2314>[] U;
    private final NetworkConfigurationResolver2717 s;
    private final Map<Class<? extends EventNotificationBroker2314>, ArrayList<EventFilterController>> f = new LinkedHashMap<Class<? extends EventNotificationBroker2314>, ArrayList<EventFilterController>>();

    private void l() {
        try {
            for (Method method : this.s.getClass().getMethods()) {
                DataExchangeProtocol2090 dataExchangeProtocol2090 = method.getDeclaredAnnotation(DataExchangeProtocol2090.class);
                try {
                    if (dataExchangeProtocol2090 == null) {
                        continue;
                    }
                }
                catch (Exception exception) {
                    throw ServiceProxyDelegate.a(exception);
                }
                try {
                    if (method.getParameterCount() != 1) {
                        continue;
                    }
                }
                catch (Exception exception) {
                    throw ServiceProxyDelegate.a(exception);
                }
                Class<?> clazz = method.getParameterTypes()[0];
                try {
                    if (!EventNotificationBroker2314.class.isAssignableFrom(clazz)) {
                        continue;
                    }
                }
                catch (Exception exception) {
                    throw ServiceProxyDelegate.a(exception);
                }
                Class<?> clazz2 = clazz;
                DataTransformationContract dataTransformationContract = DataTransformationContract.F(this.s, clazz2, method);
                EventFilterController eventFilterController = new EventFilterController(this, dataExchangeProtocol2090.b(), dataExchangeProtocol2090.F(), dataTransformationContract);
                List list = this.f.computeIfAbsent(clazz2, ServiceProxyDelegate::lambda$processHandlers$0);
                list.add(eventFilterController);
            }
            for (List list : this.f.values()) {
                list.sort(Comparator.comparing(EventFilterController::b));
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public NetworkConfigurationResolver2717 n() {
        return this.s;
    }

    public <T extends EventNotificationBroker2314> T V(T t, EncodingProtocolEnum encodingProtocolEnum) {
        EventCancellationProtocol eventCancellationProtocol;
        ArrayList<EventFilterController> arrayList;
        block17: {
            boolean bl = t instanceof KB;
            arrayList = this.f.get(t.getClass());
            try {
                try {
                    if (arrayList != null && !arrayList.isEmpty()) break block17;
                }
                catch (CustomSystemException customSystemException) {
                    throw ServiceProxyDelegate.a(customSystemException);
                }
                return t;
            }
            catch (CustomSystemException customSystemException) {
                throw ServiceProxyDelegate.a(customSystemException);
            }
        }
        try {
            eventCancellationProtocol = t instanceof EventCancellationProtocol ? (EventCancellationProtocol)t : null;
        }
        catch (CustomSystemException customSystemException) {
            throw ServiceProxyDelegate.a(customSystemException);
        }
        EventCancellationProtocol eventCancellationProtocol2 = eventCancellationProtocol;
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            EventFilterController eventFilterController;
            block18: {
                eventFilterController = arrayList.get(i);
                try {
                    if (!eventFilterController.b().equals((Object)encodingProtocolEnum)) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ServiceProxyDelegate.a(customSystemException);
                }
                try {
                    try {
                        try {
                            if (!eventFilterController.w() || eventCancellationProtocol2 == null) break block18;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ServiceProxyDelegate.a(customSystemException);
                        }
                        if (eventCancellationProtocol2.isCanceled()) {
                            continue;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ServiceProxyDelegate.a(customSystemException);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ServiceProxyDelegate.a(customSystemException);
                }
            }
            eventFilterController.q(t);
        }
        return t;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public @UnmodifiableView Collection<Class<? extends EventNotificationBroker2314>> w() {
        return this.f.keySet();
    }

    private static ArrayList lambda$processHandlers$0(Class clazz) {
        return new ArrayList();
    }

    public static void K(AbstractComputationKernel[] abstractComputationKernelArray) {
        e = abstractComputationKernelArray;
    }

    static {
        if (ServiceProxyDelegate.d() != null) {
            ServiceProxyDelegate.K(new AbstractComputationKernel[4]);
        }
    }

    public static AbstractComputationKernel[] d() {
        return e;
    }

    public boolean E(EventNotificationBroker2314 eventNotificationBroker2314) {
        for (Predicate<EventNotificationBroker2314> predicate : this.U) {
            try {
                if (predicate.test(eventNotificationBroker2314)) continue;
                return false;
            }
            catch (CustomSystemException customSystemException) {
                throw ServiceProxyDelegate.a(customSystemException);
            }
        }
        return true;
    }

    public ServiceProxyDelegate(NetworkConfigurationResolver2717 networkConfigurationResolver2717, Predicate<EventNotificationBroker2314> ... predicateArray) {
        this.s = networkConfigurationResolver2717;
        this.U = predicateArray;
        this.l();
    }
}

