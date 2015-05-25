package org.spongepowered.api.data.projection.block;

import org.spongepowered.api.data.projection.DataProjection;
import org.spongepowered.api.data.type.ComparisonMode;
import org.spongepowered.api.data.value.BoundValue;
import org.spongepowered.api.data.value.Values;

public class ComparisonVariant extends DataProjection {

    public BoundValue<ComparisonMode> comparisonMode = bind(Values.COMPARISON_MODE);

}
