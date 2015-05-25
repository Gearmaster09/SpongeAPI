package org.spongepowered.api.data.projection.block;

import org.spongepowered.api.data.projection.DataProjection;
import org.spongepowered.api.data.type.QuartzType;
import org.spongepowered.api.data.value.BoundValue;
import org.spongepowered.api.data.value.Values;

public class QuartzVariant extends DataProjection {

    public final BoundValue<QuartzType> prismarineType = bind(Values.QUARTZ_TYPE);

}
