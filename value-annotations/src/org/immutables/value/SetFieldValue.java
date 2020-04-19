package org.immutables.value;

import java.util.Objects;

/**
 * Sets a new value.
 *
 * @param <T>
 *            type of value
 */
public final class SetFieldValue<T> extends FieldUpdate<T> {
    private final T _value;

    public SetFieldValue(Field<T> field, T value) {
        super(field);
        _value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        SetFieldValue<?> other = (SetFieldValue<?>) obj;
        return Objects.equals(field(), other.field()) && Objects.equals(_value, other._value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getClass().getName(), field(), _value);
    }

    public T value() {
        return _value;
    }
}
