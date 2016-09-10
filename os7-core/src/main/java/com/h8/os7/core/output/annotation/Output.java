package com.h8.os7.core.output.annotation;

import com.h8.os7.core.common.annotation.address.Address;
import com.h8.os7.core.output.type.OutputType;

public @interface Output {
    OutputType type();
    Address address();
}
