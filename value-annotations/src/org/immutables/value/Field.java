package org.immutables.value;

/**
 * Represents a field with a value of type <code>T</code>.
 *
 * @param <T>
 *            type of value
 */
public class Field<T> {
    private final boolean _mandatory;

    private final String _name;

    public Field(String name, boolean mandatory) {
        _name = name;
        _mandatory = mandatory;
    }

    public final boolean mandatory() {
        return _mandatory;
    }

    public final String name() {
        return _name;
    }

    public final SetFieldValue<T> value(T value) {
        return new SetFieldValue<>(this, value);
    }
}
