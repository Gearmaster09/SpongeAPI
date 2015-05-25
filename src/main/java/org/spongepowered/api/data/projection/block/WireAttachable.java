package org.spongepowered.api.data.projection.block;

import org.spongepowered.api.data.projection.DataProjection;
import org.spongepowered.api.data.type.WireAttachmentType;
import org.spongepowered.api.data.value.BoundValue;
import org.spongepowered.api.data.value.Values;

public class WireAttachable extends DataProjection {

    public final BoundValue<WireAttachmentType> attachedNorth = bind(Values.ATTACHED_NORTH);

    public final BoundValue<WireAttachmentType> attachedEast = bind(Values.ATTACHED_EAST);

    public final BoundValue<WireAttachmentType> attachedSouth = bind(Values.ATTACHED_SOUTH);

    public final BoundValue<WireAttachmentType> attachedWest = bind(Values.ATTACHED_WEST);


}
