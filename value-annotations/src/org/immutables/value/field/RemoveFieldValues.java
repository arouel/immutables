package org.immutables.value.field;

import java.util.Collection;
import java.util.List;

/**
 * Removes values from a collection field.
 *
 * @param <E>
 *            type of collection element
 * @param <T>
 *            type of collection
 */
public abstract class RemoveFieldValues<E, T extends Collection<E>> extends FieldUpdate<T> {

    public abstract List<E> values();

}
