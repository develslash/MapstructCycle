package com.develslash;

import org.mapstruct.BeforeMapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.TargetType;

import java.util.HashMap;
import java.util.Map;

public class CycleAvoidingMappingContext {
    private Map<Object, Object> knowInstances = new HashMap<>();

    @BeforeMapping
    public <T> T getMappedInstance(Object source, @TargetType Class<T> targetType) {
        return (T) knowInstances.get(source);
    }

    @BeforeMapping
    public void storeMappedInstance(Object source, @MappingTarget Object target) {
        knowInstances.put(source, target);
    }

}
