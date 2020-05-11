package org.immutables.value.field;

import java.util.Collection;
import java.util.Collections;

/**
 * Represents a field that holds many values.
 *
 * @param <E>
 *            type of collection element
 * @param <T>
 *            type of collection
 */
public abstract class CollectionField<E, T extends Collection<E>> extends Field<T> {

    public AddFieldValues<E, T> addValue(E value) {
        return addValues(Collections.singletonList(value));
    }

    public abstract AddFieldValues<E, T> addValues(Iterable<E> values);

    public RemoveFieldValues<E, T> removeValue(E value) {
        return removeValues(Collections.singletonList(value));
    }

    public abstract RemoveFieldValues<E, T> removeValues(Iterable<E> values);

    public abstract RemoveFieldValuesById<E, T> removeValuesById(SetFieldValue<?> identifier, SetFieldValue<?>... identifiers);

    public abstract RemoveFieldValuesById<E, T> removeValuesById(Iterable<SetFieldValue<?>> identifiers);

    public abstract UpdateFieldValues<E, T> updateValues(SetFieldValue<?> identifier, FieldUpdate<?> update, FieldUpdate<?>... updates);

    public abstract UpdateFieldValues<E, T> updateValues(SetFieldValue<?> identifier, Iterable<FieldUpdate<?>> updates);

}
