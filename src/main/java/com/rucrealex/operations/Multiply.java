package com.rucrealex.operations;

public class Multiply implements Operation {

    public String getOperationName() {
        return "multiply";
    }

    public Long execute(Long operandA, Long operandB) {
        return operandA * operandB;
    }
}
