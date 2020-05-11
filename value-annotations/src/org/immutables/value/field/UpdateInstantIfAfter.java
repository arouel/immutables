package org.immutables.value.field;

import java.time.Instant;

/**
 * Sets a new instant if it is after the stored instant.
 */
public abstract class UpdateInstantIfAfter extends FieldUpdate<Instant> {

    public abstract Instant value();

}
