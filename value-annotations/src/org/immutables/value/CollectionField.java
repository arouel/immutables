package org.immutables.value;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Represents a field that holds many values.
 *
 * @param <T>
 *            type of value
 */
public final class CollectionField<T> extends Field<T> {
    public CollectionField(String name, boolean mandatory) {
        super(name, mandatory);
    }

    private static <E> List<E> toList(Iterable<E> values) {
        if (values instanceof List) {
            return (List<E>) values;
        }
        if (values instanceof Collection) {
            return new ArrayList<>((Collection<E>) values);
        }
        List<E> list = new ArrayList<>();
        for (E e : values) {
            list.add(e);
        }
        return list;
    }

    public AddFieldValues<T> addValue(T value) {
        return addValues(Collections.singletonList(value));
    }

    public AddFieldValues<T> addValues(Iterable<T> values) {
        return new AddFieldValues<>(this, toList(values));
    }

    public RemoveFieldValues<T> removeValue(T value) {
        return removeValues(Collections.singletonList(value));
    }

    public RemoveFieldValues<T> removeValues(Iterable<T> values) {
        return new RemoveFieldValues<>(this, toList(values));
    }
}
