package org.immutables.value.field;

import java.time.Instant;

/**
 * Represents a field with an {@link Instant} value.
 */
public abstract class InstantField extends Field<Instant> {

    /**
     * Updates the currently stored instant only if it is before the given instant.
     *
     * @param value
     * @return field value update definition
     */
    public abstract UpdateInstantIfAfter updateIfAfter(Instant value);

}
