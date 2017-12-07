package de.michaelzinn.null4jexample;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static biz.cosee.null4j.Null4j.let;
import static biz.cosee.null4j.Null4j.orDefault;

public class Null4jTest {
    private @Nullable String replaceSpecialChars(@Nullable String str) {
        return let(str, string -> {
            return orDefault(string.replace('/', '_'),
                    "wtf");
        });
    }
}
