package com.interfacesgenericos;


// si queremos hacer a una intefaz generica debemos usta <>
public interface Identificable <T> {

    public abstract T getId();
    public abstract void setId(T id);
}
