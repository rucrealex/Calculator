package com.rucrealex.operations;

public class Divide implements Operation {

    public String getOperationName() {
        return "divide";
    }

    public Long execute(Long operandA, Long operandB) {
        return operandA / operandB;
    }
}
