package org.spongepowered.api.data.value;

import org.spongepowered.api.data.projection.DataProjection;

public class BoundValue<V> {

    private final Value<V> value;
    private final DataProjection dataProjection;

    private BoundValue(Value<V> value, DataProjection dataProjection) {
        this.value = value;
        this.dataProjection = dataProjection;
    }

    public V get() {
        return dataProjection.getDataObject().tryGet(value, value.getValueClass());
    }

    public static <V> BoundValue<V> of(Value<V> value, DataProjection dataProjection) {
        return new BoundValue<V>(value, dataProjection);
    }

}
