package org.immutables.value.field;

/**
 * Represents an update operation of a field value.
 *
 * @param <T>
 *            type of value
 */
public abstract class FieldUpdate<T> {

    public abstract Field<T> field();

}
