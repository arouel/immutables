package org.immutables.value;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Adds values to a collection field.
 *
 * @param <T>
 *            type of value
 */
public final class AddFieldValues<T> extends FieldUpdate<T> {
    private final List<T> _values;

    public AddFieldValues(Field<T> field, List<T> values) {
        super(field);
        _values = Collections.unmodifiableList(values);
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
        AddFieldValues<?> other = (AddFieldValues<?>) obj;
        return Objects.equals(field(), other.field()) && Objects.equals(_values, other._values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getClass().getName(), field(), _values);
    }

    public List<T> values() {
        return _values;
    }
}
