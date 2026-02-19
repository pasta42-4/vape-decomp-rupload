/*
 * Decompiled with CFR 0.152.
 */
package com.runtime.control;

import com.exception.system.CustomSystemException;
import com.processing.transformation.DataTransformationEngine817;
import java.util.HashMap;

public class ExecutionStateController {
    private static boolean Z;
    public static boolean i;
    private HashMap<String, String> z = new HashMap();

    static {
        i = false;
        ExecutionStateController.J(true);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static void J(boolean bl) {
        Z = bl;
    }

    public String Z(String string) {
        return this.z.getOrDefault(string, null);
    }

    public void I(String string, String string2) {
        String string3 = this.z.get(string);
        this.z.put(string, string2);
        if (i) {
            String string4;
            String string5 = DataTransformationEngine817.Y(string);
            try {
                string4 = string5 != null ? string5 : string;
            }
            catch (CustomSystemException customSystemException) {
                throw ExecutionStateController.a(customSystemException);
            }
            DataTransformationEngine817.U(string4, string2);
        }
    }

    public static boolean X() {
        return Z;
    }

    public static boolean x() {
        boolean bl = ExecutionStateController.X();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ExecutionStateController.a(customSystemException);
        }
        return false;
    }
}

