package org.spongepowered.api.data.projection.block;

import org.spongepowered.api.data.projection.DataProjection;
import org.spongepowered.api.data.value.BoundValue;
import org.spongepowered.api.data.value.Values;

public class Diode extends DataProjection {

    public final BoundValue<Boolean> isLocked = bind(Values.IS_LOCKED);

    public final BoundValue<Integer> delay = bind(Values.DELAY);

}
