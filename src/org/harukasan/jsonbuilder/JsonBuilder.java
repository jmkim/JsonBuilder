package org.harukasan.jsonbuilder;

import com.sun.istack.internal.Nullable;

/**
 * Created by jmkim on 3/24/17.
 */
public class JsonBuilder implements Jsonable {
    private JsonObject root;

    public JsonBuilder() {
        root = new JsonObject();
    }

    public JsonObject add(String key, String value) {
        root.add(key, value);
        return root;
    }

    public JsonObject add(String key, Number value) {
        root.add(key, value);
        return root;
    }

    public JsonObject add(String key, JsonObject value) {
        root.add(key, value);
        return root;
    }

    public JsonObject add(String key, JsonArray value) {
        root.add(key, value);
        return root;
    }

    public JsonObject add(String key, @Nullable Boolean value) {
        root.add(key, value);
        return root;
    }

    @Override
    public String toJsonString() {
        return root.toJsonString();
    }
}
