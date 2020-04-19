package org.immutables.value;

/**
 * Represents an update operation of a field value.
 *
 * @param <T>
 *            type of value
 */
public abstract class FieldUpdate<T> {
    private final Field<T> _field;

    public FieldUpdate(Field<T> field) {
        _field = field;
    }

    @Override
    public abstract boolean equals(Object obj);

    public Field<T> field() {
        return _field;
    }

    @Override
    public abstract int hashCode();
}
