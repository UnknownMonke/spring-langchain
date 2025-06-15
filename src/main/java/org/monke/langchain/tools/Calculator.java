package org.monke.langchain.tools;

import dev.langchain4j.agent.tool.P;
import dev.langchain4j.agent.tool.Tool;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Tool("Returns a square root of a given number.")
    public double squareRoot(@P("Number to find the square root of.") double x) {
        return Math.sqrt(x);
    }
}
