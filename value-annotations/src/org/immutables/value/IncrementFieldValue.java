package org.immutables.value;

import java.util.Objects;

/**
 * Increments a number field by the specified amount.
 *
 * @param <T>
 *            type of value
 */
public final class IncrementFieldValue<T extends Number> extends FieldUpdate<T> {
    private final int _amount;

    public IncrementFieldValue(Field<T> field, int amount) {
        super(field);
        _amount = amount;
    }

    public int amount() {
        return _amount;
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
        IncrementFieldValue<?> other = (IncrementFieldValue<?>) obj;
        return Objects.equals(field(), other.field()) && Objects.equals(_amount, other._amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getClass().getName(), field(), _amount);
    }
}
