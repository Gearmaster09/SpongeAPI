package org.spongepowered.api.data.projection;

import org.spongepowered.api.data.value.BoundValue;
import org.spongepowered.api.data.value.Value;
import org.spongepowered.api.data.value.Values;

public class HealthData extends DataProjection {

    public static final Value<Integer> HEALTH = Values.HEALTH;
    public static final Value<Integer> MAX_HEALTH = Values.MAX_HEALTH;

    public BoundValue<Integer> health = bind(HEALTH);
    public BoundValue<Integer> maxHealth = bind(MAX_HEALTH);

}
