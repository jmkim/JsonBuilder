package org.harukasan.jsonbuilder;

import com.sun.istack.internal.Nullable;

import java.util.*;

/**
 * Created by jmkim on 3/24/17.
 */
public class JsonArray implements Jsonable {
    private List<JsonValueType> array;

    public JsonArray() {
        array = new ArrayList<>();
    }

    protected JsonArray add(Object value) {
        array.add(new JsonValueType(value));
        return this;
    }

    public JsonArray add(String value) {
        return add((Object) value);
    }

    public JsonArray add(Number value) {
        return add((Object) value);
    }

    public JsonArray add(JsonObject value) {
        return add((Object) value);
    }

    public JsonArray add(JsonArray value) {
        return add((Object) value);
    }

    public JsonArray add(@Nullable Boolean value) {
        return add((Object) value);
    }

    public JsonArray add(Byte value) {
        return add((Object) value);
    }

    public JsonArray add(Double value) {
        return add((Object) value);
    }

    public JsonArray add(Float value) {
        return add((Object) value);
    }

    public JsonArray add(Integer value) {
        return add((Object) value);
    }

    public JsonArray add(Long value) {
        return add((Object) value);
    }

    public JsonArray add(Short value) {
        return add((Object) value);
    }

    protected JsonArray addList(List<Object> values) {
        for (Object value : values) {
            array.add(new JsonValueType(value));
        }
        return this;
    }

    public JsonArray addListString(List<String> value) {
        return addList((List<Object>) (List<?>) value);
    }

    public JsonArray addListNumber(List<Number> value) {
        return addList((List<Object>) (List<?>) value);
    }

    public JsonArray addListJsonObject(List<JsonObject> value) {
        return addList((List<Object>) (List<?>) value);
    }

    public JsonArray addListJsonArray(List<JsonArray> value) {
        return addList((List<Object>) (List<?>) value);
    }

    public JsonArray addListBoolean(List<Boolean> value) {
        return addList((List<Object>) (List<?>) value);
    }

    public JsonArray addListByte(List<Byte> value) {
        return addList((List<Object>) (List<?>) value);
    }

    public JsonArray addListDouble(List<Double> value) {
        return addList((List<Object>) (List<?>) value);
    }

    public JsonArray addListFloat(List<Float> value) {
        return addList((List<Object>) (List<?>) value);
    }

    public JsonArray addListInteger(List<Integer> value) {
        return addList((List<Object>) (List<?>) value);
    }

    public JsonArray addListLong(List<Long> value) {
        return addList((List<Object>) (List<?>) value);
    }

    public JsonArray addListShort(List<Short> value) {
        return addList((List<Object>) (List<?>) value);
    }

    @Override
    public String toJsonString() {
        StringBuilder jsonString = new StringBuilder();
        {
            StringJoiner jsonElementString = new StringJoiner(",", "[", "]");
            for (JsonValueType value : array) {
                jsonElementString.add(value.toString());
            }
            jsonString.append(jsonElementString);
        }

        return jsonString.toString();
    }
}
