package org.immutables.value.field;

/**
 * Decrements a number field by the specified amount.
 *
 * @param <T>
 *            type of value
 */
public abstract class DecrementFieldValue<T extends Number> extends FieldUpdate<T> {

    public abstract int amount();

}
