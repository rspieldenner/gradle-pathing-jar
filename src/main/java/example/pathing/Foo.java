package example.pathing;

import com.google.common.base.Strings;

public class Foo {
    public String foo(String str) {
        return "Foo " + Strings.nullToEmpty(str);
    }
}
