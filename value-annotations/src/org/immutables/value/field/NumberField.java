package org.immutables.value.field;

/**
 * Represents a field with a numeric value.
 *
 * @param <T>
 *            type of value
 */
public abstract class NumberField<T extends Number> extends Field<T> {

    public DecrementFieldValue<T> decrementValue() {
        return decrementValue(1);
    }

    public abstract DecrementFieldValue<T> decrementValue(int amount);

    public IncrementFieldValue<T> incrementValue() {
        return incrementValue(1);
    }

    public abstract IncrementFieldValue<T> incrementValue(int amount);

}
