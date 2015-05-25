package org.spongepowered.api.data.projection;

import org.spongepowered.api.data.DataObject;
import org.spongepowered.api.data.value.BoundValue;
import org.spongepowered.api.data.value.Value;

import java.util.ArrayList;
import java.util.List;

public class DataProjection {

    private DataObject dataObject;
    private List<BoundValue> values = new ArrayList<BoundValue>();

    public DataProjection() {}

    protected <V> BoundValue<V> bind(Value<V> value) {
        BoundValue<V> bound = BoundValue.of(value, this);
        this.values.add(bound);
        return bound;
    }

    void setDataObject(DataObject dataObject) {
        this.dataObject = dataObject;
    }

    public DataObject getDataObject() {
        return dataObject;
    }

}
