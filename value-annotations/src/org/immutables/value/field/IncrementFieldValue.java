package org.immutables.value.field;

/**
 * Increments a number field by the specified amount.
 *
 * @param <T>
 *            type of value
 */
public abstract class IncrementFieldValue<T extends Number> extends FieldUpdate<T> {

    public abstract int amount();

}
