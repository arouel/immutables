package org.immutables.value.field;

import java.util.Collection;
import java.util.Set;

/**
 * Removes values from a collection field based on identifiers.
 *
 * @param <E>
 *            type of collection element
 * @param <T>
 *            type of collection
 */
public abstract class RemoveFieldValuesById<E, T extends Collection<E>> extends FieldUpdate<T> {

    public abstract Set<SetFieldValue<?>> identifiers();

}
