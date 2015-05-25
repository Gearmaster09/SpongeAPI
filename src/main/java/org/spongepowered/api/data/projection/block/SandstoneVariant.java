package org.spongepowered.api.data.projection.block;

import org.spongepowered.api.data.projection.DataProjection;
import org.spongepowered.api.data.type.SandstoneType;
import org.spongepowered.api.data.value.BoundValue;
import org.spongepowered.api.data.value.Values;

public class SandstoneVariant extends DataProjection {

    public final BoundValue<SandstoneType> sandstoneType = bind(Values.SANDSTONE_TYPE);

}
