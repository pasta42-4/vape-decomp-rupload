/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.O_;
import a.Zv;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class i {
    public static final i H = new i();
    private final Map<Class<? extends Zv>, List<Consumer<Zv>>> K = new LinkedHashMap<Class<? extends Zv>, List<Consumer<Zv>>>();

    public <T extends Zv> void E(T t10) {
        List<Consumer<Zv>> list = this.K.get(t10.getClass());
        try {
            if (list == null) {
                return;
            }
        }
        catch (Throwable throwable) {
            throw i.a(throwable);
        }
        try {
            for (Consumer<Zv> consumer : list) {
                consumer.accept(t10);
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    private static List lambda$listen$0(Consumer consumer, Class clazz, List list) {
        List list2;
        try {
            list2 = list != null ? list : new ArrayList();
        }
        catch (O_ o_2) {
            throw i.a(o_2);
        }
        List list3 = list2;
        list3.add(consumer);
        return list3;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    public <T extends Zv> void t(Class<T> clazz, Consumer<T> consumer) {
        this.K.compute(clazz, (arg_0, arg_1) -> i.lambda$listen$0(consumer, arg_0, arg_1));
    }
}

