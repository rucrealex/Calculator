package com.rucrealex.operations;

public class Sub implements Operation{

    public String getOperationName() {
        return "minus";
    }

    public Long execute(Long operandA, Long operandB) {
        return operandA - operandB;
    }
}
