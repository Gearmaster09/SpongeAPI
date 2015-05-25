package org.spongepowered.api.data.projection.block;

import org.spongepowered.api.data.projection.DataProjection;
import org.spongepowered.api.data.type.RailDirection;
import org.spongepowered.api.data.value.BoundValue;
import org.spongepowered.api.data.value.Values;

public class RailShape extends DataProjection {

    public final BoundValue<RailDirection> railDirection = bind(Values.RAIL_DIRECTION);

}
