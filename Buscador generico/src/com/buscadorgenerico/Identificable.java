package com.buscadorgenerico;

public interface Identificable<T> {
    public abstract T getId();
    public abstract void setId(T id);
    public abstract boolean sameId(T id);
}
