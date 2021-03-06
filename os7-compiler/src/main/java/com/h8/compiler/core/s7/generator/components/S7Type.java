package com.h8.compiler.core.s7.generator.components;

import com.h8.compiler.core.s7.snippets.SnippetParameter;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class S7Type implements S7CodeComponent {
    private String name;
    private String version;
    private S7CodeComponents<S7Parameter> parameters;

    @Override
    public SnippetParameter toSnippetParameter() {
        return SnippetParameter.nestedParameters()
                .with("NAME", name)
                .with("VERSION", version)
                .with("PARAMETERS", parameters.toSnippetParameter());
    }
}
