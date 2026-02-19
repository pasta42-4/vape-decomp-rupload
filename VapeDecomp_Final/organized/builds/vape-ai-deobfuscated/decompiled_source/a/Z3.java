/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.app.events.EventNotificationBroker2314;
import com.app.temporal.sequencing.TemporalDataSequencer;
import com.concurrency.tracking.ConcurrentRequestTracker;
import com.configuration.management.ConfigurationResolver1858;
import com.core.proxy.ServiceProxyDelegate;
import com.encoding.protocol.EncodingProtocolEnum;
import com.exception.system.CustomSystemException;
import com.monitoring.performance.PerformanceMetricTracker;
import com.network.config.NetworkConfigurationResolver2717;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class Z3 {
    private static Method y;
    private final Map<Class<? extends EventNotificationBroker2314>, ConcurrentRequestTracker> Y = new LinkedHashMap<Class<? extends EventNotificationBroker2314>, ConcurrentRequestTracker>();
    private static Method B;
    public static boolean X;
    private static int[] s;
    private final Map<Class<? extends EventNotificationBroker2314>, ArrayList<ServiceProxyDelegate>> u;
    private final ConfigurationResolver1858 g;
    private final Map<NetworkConfigurationResolver2717, ServiceProxyDelegate> a = new LinkedHashMap<NetworkConfigurationResolver2717, ServiceProxyDelegate>();
    private static final Z3 N;

    public boolean l(NetworkConfigurationResolver2717 networkConfigurationResolver2717) {
        Collection<Class<? extends EventNotificationBroker2314>> collection;
        ServiceProxyDelegate serviceProxyDelegate;
        block14: {
            try {
                if (networkConfigurationResolver2717 == null) {
                    return false;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw Z3.a(customSystemException);
            }
            serviceProxyDelegate = this.a.remove(networkConfigurationResolver2717);
            try {
                if (serviceProxyDelegate == null) {
                    return false;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw Z3.a(customSystemException);
            }
            collection = serviceProxyDelegate.w();
            try {
                try {
                    if (collection != null && !collection.isEmpty()) break block14;
                }
                catch (CustomSystemException customSystemException) {
                    throw Z3.a(customSystemException);
                }
                return false;
            }
            catch (CustomSystemException customSystemException) {
                throw Z3.a(customSystemException);
            }
        }
        for (Class<? extends EventNotificationBroker2314> clazz : collection) {
            List list = this.u.get(clazz);
            try {
                if (list == null) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw Z3.a(customSystemException);
            }
            list.remove(serviceProxyDelegate);
            this.u(clazz).F();
        }
        return true;
    }

    public static Method X(Class<? extends EventNotificationBroker2314> clazz) {
        for (Method method : clazz.getDeclaredMethods()) {
            try {
                try {
                    try {
                        if (method.getReturnType() != ConcurrentRequestTracker.class || method.getParameterCount() != 0) continue;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw Z3.a(customSystemException);
                    }
                    if (!Modifier.isStatic(method.getModifiers())) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw Z3.a(customSystemException);
                }
                return method;
            }
            catch (CustomSystemException customSystemException) {
                throw Z3.a(customSystemException);
            }
        }
        try {
            if (EventNotificationBroker2314.class.isAssignableFrom(clazz.getSuperclass())) {
                return Z3.X(clazz.getSuperclass());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw Z3.a(customSystemException);
        }
        return null;
    }

    public Map<Class<? extends EventNotificationBroker2314>, ArrayList<ServiceProxyDelegate>> x() {
        return this.u;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    public ConfigurationResolver1858 Q() {
        return this.g;
    }

    public static Z3 s() {
        return N;
    }

    static {
        N = new Z3();
        Z3.J(new int[4]);
        X = false;
    }

    public static void J(int[] nArray) {
        s = nArray;
    }

    private ConcurrentRequestTracker u(Class<? extends EventNotificationBroker2314> clazz) {
        ConcurrentRequestTracker concurrentRequestTracker = this.Y.get(clazz);
        try {
            if (concurrentRequestTracker != null) {
                return concurrentRequestTracker;
            }
        }
        catch (Throwable throwable) {
            throw Z3.a(throwable);
        }
        try {
            Method method = Z3.X(clazz);
            if (method == null) {
                return null;
            }
            ConcurrentRequestTracker concurrentRequestTracker2 = (ConcurrentRequestTracker)method.invoke(null, new Object[0]);
            this.Y.put(clazz, concurrentRequestTracker2);
            return concurrentRequestTracker2;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    @SafeVarargs
    public final void A(NetworkConfigurationResolver2717 networkConfigurationResolver2717, Predicate<EventNotificationBroker2314> ... predicateArray) {
        try {
            if (this.a.containsKey(networkConfigurationResolver2717)) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw Z3.a(customSystemException);
        }
        ServiceProxyDelegate serviceProxyDelegate = new ServiceProxyDelegate(networkConfigurationResolver2717, predicateArray);
        this.a.put(networkConfigurationResolver2717, serviceProxyDelegate);
        for (Class<? extends EventNotificationBroker2314> clazz : serviceProxyDelegate.w()) {
            this.u.computeIfAbsent(clazz, Z3::lambda$registerListener$0).add(serviceProxyDelegate);
            this.u(clazz).z();
        }
    }

    public static Method P(Class<?> clazz) {
        if (y == null) {
            for (Method method : EventNotificationBroker2314.class.getDeclaredMethods()) {
                try {
                    try {
                        if (method.getReturnType() != Boolean.TYPE || method.getParameterCount() != 0) continue;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw Z3.a(customSystemException);
                    }
                    y = method;
                    break;
                }
                catch (CustomSystemException customSystemException) {
                    throw Z3.a(customSystemException);
                }
            }
        }
        return y;
    }

    public Z3() {
        this.u = new LinkedHashMap<Class<? extends EventNotificationBroker2314>, ArrayList<ServiceProxyDelegate>>();
        this.g = new ConfigurationResolver1858();
    }

    public static int[] S() {
        return s;
    }

    public <T extends EventNotificationBroker2314> T k(T t) {
        TemporalDataSequencer temporalDataSequencer;
        block20: {
            temporalDataSequencer = null;
            if (X) {
                temporalDataSequencer = new TemporalDataSequencer(t.getClass());
            }
            try {
                ArrayList<ServiceProxyDelegate> arrayList;
                block19: {
                    arrayList = this.u.get(t.getClass());
                    try {
                        if (arrayList != null && !arrayList.isEmpty()) break block19;
                        break block20;
                    }
                    catch (Throwable throwable) {
                        throw Z3.a(throwable);
                    }
                }
                ArrayList<ServiceProxyDelegate> arrayList2 = new ArrayList<ServiceProxyDelegate>();
                for (int i = 0; i < arrayList.size(); ++i) {
                    ServiceProxyDelegate serviceProxyDelegate = arrayList.get(i);
                    try {
                        if (!serviceProxyDelegate.E(t)) {
                            continue;
                        }
                    }
                    catch (Throwable throwable) {
                        throw Z3.a(throwable);
                    }
                    arrayList2.add(serviceProxyDelegate);
                }
                if (arrayList2.isEmpty()) break block20;
                for (EncodingProtocolEnum encodingProtocolEnum : EncodingProtocolEnum.values()) {
                    for (int i = 0; i < arrayList2.size(); ++i) {
                        try {
                            ServiceProxyDelegate serviceProxyDelegate = (ServiceProxyDelegate)arrayList2.get(i);
                            PerformanceMetricTracker performanceMetricTracker = null;
                            if (X) {
                                performanceMetricTracker = new PerformanceMetricTracker(serviceProxyDelegate);
                            }
                            try {
                                serviceProxyDelegate.V(t, encodingProtocolEnum);
                                if (!X) continue;
                                performanceMetricTracker.Y();
                                temporalDataSequencer.T(performanceMetricTracker);
                                continue;
                            }
                            catch (Throwable throwable) {
                                throw Z3.a(throwable);
                            }
                        }
                        catch (Throwable throwable) {
                            // empty catch block
                        }
                    }
                }
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        try {
            if (X) {
                temporalDataSequencer.z();
                this.g.u(temporalDataSequencer);
            }
        }
        catch (Throwable throwable) {
            throw Z3.a(throwable);
        }
        return t;
    }

    public static Method x() {
        if (B == null) {
            for (Method method : ConcurrentRequestTracker.class.getDeclaredMethods()) {
                try {
                    try {
                        if (method.getReturnType() != Boolean.TYPE || method.getParameterCount() != 0) continue;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw Z3.a(customSystemException);
                    }
                    B = method;
                    break;
                }
                catch (CustomSystemException customSystemException) {
                    throw Z3.a(customSystemException);
                }
            }
        }
        return B;
    }

    private static ArrayList lambda$registerListener$0(Class clazz) {
        return new ArrayList();
    }
}

