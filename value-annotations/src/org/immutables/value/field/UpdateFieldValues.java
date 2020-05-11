package org.immutables.value.field;

import java.util.Collection;
import java.util.Set;

/**
 * Updates a value to be found within a collection field.
 *
 * @param <E>
 *            type of collection element
 * @param <T>
 *            type of collection
 */
public abstract class UpdateFieldValues<E, T extends Collection<E>> extends FieldUpdate<T> {

    public abstract Set<SetFieldValue<?>> identifiers();

    public abstract Set<FieldUpdate<?>> updates();

}
