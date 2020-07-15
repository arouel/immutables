package org.immutables.value.field;

import java.time.Instant;
import java.util.Collection;
import java.util.ServiceLoader;

import com.google.gson.reflect.TypeToken;

/**
 * Represents a field with a value of type <code>T</code>.
 *
 * @param <T>
 *            type of value
 */
public abstract class Field<T> {

    public static <E, T extends Collection<E>> CollectionField<E, T> ofCollectionField(String name, TypeToken<T> type, boolean mandatory) {
        for (Factory factory : ServiceLoader.load(Factory.class)) {
            return factory.buildCollectionField(name, type, mandatory);
        }
        return null;
    }

    public static <T> Field<T> ofField(String name, TypeToken<T> type, boolean mandatory) {
        for (Factory factory : ServiceLoader.load(Factory.class)) {
            return factory.buildField(name, type, mandatory);
        }
        return null;
    }

    public static <T> InstantField ofInstantField(String name, TypeToken<Instant> type, boolean mandatory) {
        for (Factory factory : ServiceLoader.load(Factory.class)) {
            return factory.buildInstantField(name, type, mandatory);
        }
        return null;
    }

    public static <T extends Number> NumberField<T> ofNumberField(String name, TypeToken<T> type, boolean mandatory) {
        for (Factory factory : ServiceLoader.load(Factory.class)) {
            return factory.buildNumberField(name, type, mandatory);
        }
        return null;
    }

    public abstract boolean mandatory();

    public abstract String name();

    public abstract TypeToken<T> type();

    public abstract SetFieldValue<T> value(T value);

}
