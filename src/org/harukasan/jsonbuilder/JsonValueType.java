package org.harukasan.jsonbuilder;

import com.sun.istack.internal.Nullable;
import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * Created by jmkim on 3/24/17.
 */
final class JsonValueType {
    private final Object value;

    JsonValueType(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        if (value == null) {
            return "null";
        } else if (value instanceof String) {
            return JsonUtils.stringMasker((String) value);
        } else if (value instanceof JsonObject) {
            return ((JsonObject) value).toString();
        } else if (value instanceof JsonArray) {
            return ((JsonArray) value).toString();
        } else if (value instanceof Boolean) {
            return (Boolean) value ? "true" : "false";
        } else if (value instanceof Byte) {
            return ((Byte) value).toString();
        } else if (value instanceof Double) {
            return ((Double) value).toString();
        } else if (value instanceof Float) {
            return ((Float) value).toString();
        } else if (value instanceof Integer) {
            return ((Integer) value).toString();
        } else if (value instanceof Long) {
            return ((Long) value).toString();
        } else if (value instanceof Short) {
            return ((Short) value).toString();
        } else if (value instanceof Number) {
            return ((Number) value).toString();
        } else {
            return "";
        }
    }
}
