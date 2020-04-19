package org.immutables.value;

/**
 * Represents a field with a numeric value.
 *
 * @param <T>
 *            type of value
 */
public final class NumberField<T extends Number> extends Field<T> {
    public NumberField(String name, boolean mandatory) {
        super(name, mandatory);
    }

    public DecrementFieldValue<T> decrementValue() {
        return decrementValue(1);
    }

    public DecrementFieldValue<T> decrementValue(int amount) {
        return new DecrementFieldValue<>(this, amount);
    }

    public IncrementFieldValue<T> incrementValue() {
        return incrementValue(1);
    }

    public IncrementFieldValue<T> incrementValue(int amount) {
        return new IncrementFieldValue<>(this, amount);
    }
}
