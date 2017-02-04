package com.h8.compiler.core.context;

import com.h8.compiler.core.definitions.Definition;
import lombok.Getter;
import lombok.Setter;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class Instance {
    private String name;
    private Class c;
    private Annotation annotation;
    private Definition definition;
    private List<Instance> fields = new ArrayList<>();
}
