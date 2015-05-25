package org.spongepowered.api.data.projection.block;

import org.spongepowered.api.data.projection.DataProjection;
import org.spongepowered.api.data.type.PrismarineType;
import org.spongepowered.api.data.value.BoundValue;
import org.spongepowered.api.data.value.Values;

public class PrismarineVariant extends DataProjection {

    public final BoundValue<PrismarineType> prismarineType = bind(Values.PRISMARINE_TYPE);

}
