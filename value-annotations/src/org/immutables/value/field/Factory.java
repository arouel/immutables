package org.immutables.value.field;

import java.time.Instant;
import java.util.Collection;

import com.google.gson.reflect.TypeToken;

public abstract class Factory {

    public abstract <E, T extends Collection<E>> CollectionField<E, T> buildCollectionField(String name, TypeToken<T> type, boolean mandatory);

    public abstract <T> Field<T> buildField(String name, TypeToken<T> type, boolean mandatory);

    public abstract InstantField buildInstantField(String name, TypeToken<Instant> type, boolean mandatory);

    public abstract <T extends Number> NumberField<T> buildNumberField(String name, TypeToken<T> type, boolean mandatory);

}
