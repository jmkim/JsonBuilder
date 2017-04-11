package org.harukasan.jsonbuilder;

import com.sun.istack.internal.Nullable;

import java.util.Map;
import java.util.StringJoiner;
import java.util.TreeMap;

/**
 * Created by jmkim on 3/24/17.
 */
public class JsonObject implements Jsonable {
    private Map<String, JsonValueType> object;

    public JsonObject() {
        object = new TreeMap<>();
    }

    private JsonObject add(String key, Object value) {
        object.put(key, new JsonValueType(value));
        return this;
    }

    public JsonObject add(String key, String value) {
        return add(key, (Object) value);
    }

    public JsonObject add(String key, Number value) {
        return add(key, (Object) value);
    }

    public JsonObject add(String key, JsonObject value) {
        return add(key, (Object) value);
    }

    public JsonObject add(String key, JsonArray value) {
        return add(key, (Object) value);
    }

    public JsonObject add(String key, @Nullable Boolean value) {
        return add(key, (Object) value);
    }

    public JsonObject add(String key, Byte value) {
        return add(key, (Object) value);
    }

    public JsonObject add(String key, Double value) {
        return add(key, (Object) value);
    }

    public JsonObject add(String key, Float value) {
        return add(key, (Object) value);
    }

    public JsonObject add(String key, Integer value) {
        return add(key, (Object) value);
    }

    public JsonObject add(String key, Long value) {
        return add(key, (Object) value);
    }

    public JsonObject add(String key, Short value) {
        return add(key, (Object) value);
    }

    @Override
    public String toJsonString() {
        StringBuilder jsonString = new StringBuilder();
        {
            StringJoiner jsonElementString = new StringJoiner(",", "{", "}");
            for (Map.Entry<String, JsonValueType> element : object.entrySet()) {
                jsonElementString.add(JsonUtils.stringMasker(element.getKey()) + ":" + element.getValue().toString());
            }
            jsonString.append(jsonElementString);
        }

        return jsonString.toString();
    }
}
