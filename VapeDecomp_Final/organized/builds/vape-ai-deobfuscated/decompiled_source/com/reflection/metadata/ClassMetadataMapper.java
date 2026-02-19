/*
 * Decompiled with CFR 0.152.
 */
package com.reflection.metadata;

import java.util.HashMap;
import java.util.Map;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ClassMetadataMapper {
    private static final Map<String, String> P;
    private final String j;
    private final String e;

    private static String h(String string, boolean bl) {
        StringBuilder stringBuilder;
        block13: {
            block16: {
                String string2;
                block14: {
                    block15: {
                        block12: {
                            try {
                                if ("".equals(string)) {
                                    return string;
                                }
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw ClassMetadataMapper.a(illegalArgumentException);
                            }
                            stringBuilder = new StringBuilder();
                            int n = 0;
                            while (true) {
                                n = string.indexOf("[]", n) + 1;
                                try {
                                    if (n <= 0) break;
                                    stringBuilder.append('[');
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw ClassMetadataMapper.a(illegalArgumentException);
                                }
                            }
                            string2 = string.substring(0, string.length() - stringBuilder.length() * 2);
                            String string3 = P.get(string2);
                            try {
                                if (string3 == null) break block12;
                                stringBuilder.append(string3);
                                break block13;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw ClassMetadataMapper.a(illegalArgumentException);
                            }
                        }
                        try {
                            try {
                                stringBuilder.append('L');
                                if (string2.indexOf(46) >= 0) break block14;
                                if (bl) break block15;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw ClassMetadataMapper.a(illegalArgumentException);
                            }
                            stringBuilder.append("java/lang/");
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ClassMetadataMapper.a(illegalArgumentException);
                        }
                    }
                    stringBuilder.append(string2);
                    break block16;
                }
                stringBuilder.append(string2.replace('.', '/'));
            }
            stringBuilder.append(';');
        }
        return stringBuilder.toString();
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    public ClassMetadataMapper(String string, String string2) {
        this.e = string;
        this.j = string2;
    }

    public int hashCode() {
        return this.e.hashCode() ^ this.j.hashCode();
    }

    public static ClassMetadataMapper h(String string, boolean bl) {
        int n;
        int n2;
        int n3;
        int n4;
        block10: {
            n4 = string.indexOf(32);
            n3 = string.indexOf(40, n4) + 1;
            n2 = string.indexOf(41, n3);
            try {
                block9: {
                    try {
                        try {
                            if (n4 == -1 || n3 == 0) break block9;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ClassMetadataMapper.a(illegalArgumentException);
                        }
                        if (n2 != -1) break block10;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ClassMetadataMapper.a(illegalArgumentException);
                    }
                }
                throw new IllegalArgumentException();
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw ClassMetadataMapper.a(illegalArgumentException);
            }
        }
        String string2 = string.substring(0, n4);
        String string3 = string.substring(n4 + 1, n3 - 1).trim();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('(');
        do {
            String string4;
            if ((n = string.indexOf(44, n3)) == -1) {
                string4 = ClassMetadataMapper.h(string.substring(n3, n2).trim(), bl);
            } else {
                string4 = ClassMetadataMapper.h(string.substring(n3, n).trim(), bl);
                n3 = n + 1;
            }
            stringBuilder.append(string4);
        } while (n != -1);
        stringBuilder.append(')').append(ClassMetadataMapper.h(string2, bl));
        return new ClassMetadataMapper(string3, stringBuilder.toString());
    }

    public boolean equals(Object object) {
        boolean bl;
        block8: {
            block7: {
                try {
                    if (!(object instanceof ClassMetadataMapper)) {
                        return false;
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ClassMetadataMapper.a(illegalArgumentException);
                }
                ClassMetadataMapper classMetadataMapper = (ClassMetadataMapper)object;
                try {
                    try {
                        if (!this.e.equals(classMetadataMapper.e) || !this.j.equals(classMetadataMapper.j)) break block7;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ClassMetadataMapper.a(illegalArgumentException);
                    }
                    bl = true;
                    break block8;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ClassMetadataMapper.a(illegalArgumentException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public static ClassMetadataMapper Y(String string) {
        return ClassMetadataMapper.h(string, false);
    }

    static {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("void", "V");
        hashMap.put("byte", "B");
        hashMap.put("char", "C");
        hashMap.put("double", "D");
        hashMap.put("float", "F");
        hashMap.put("int", "I");
        hashMap.put("long", "J");
        hashMap.put("short", "S");
        hashMap.put("boolean", "Z");
        P = hashMap;
    }

    public String toString() {
        return this.e + this.j;
    }
}

