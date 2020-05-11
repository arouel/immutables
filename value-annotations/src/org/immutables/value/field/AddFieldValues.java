package org.immutables.value.field;

import java.util.Collection;
import java.util.List;

/**
 * Adds values to a collection field.
 *
 * @param <E>
 *            type of collection element
 * @param <T>
 *            type of collection
 */
public abstract class AddFieldValues<E, T extends Collection<E>> extends FieldUpdate<T> {

    public abstract List<E> values();

}
