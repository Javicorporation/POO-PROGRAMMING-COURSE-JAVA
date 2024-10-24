package com.proyecto03.generators;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.util.UUID;

public class CustomGenerator  implements IdentifierGenerator {
    @Override
    public Object generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object o) {
        String code = "udc-"+ UUID.randomUUID();
        return (long)code.hashCode();
    }
}
