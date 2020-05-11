package org.immutables.value.field;

/**
 * Sets a new value.
 *
 * @param <T>
 *            type of value
 */
public abstract class SetFieldValue<T> extends FieldUpdate<T> {

    public abstract T value();

}
