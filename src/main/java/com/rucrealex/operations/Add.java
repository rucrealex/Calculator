package com.rucrealex.operations;

public class Add implements Operation {

    public String getOperationName() {
        return "plus";
    }

    public Long execute(Long operandA, Long operandB) {
        return operandA + operandB;
    }
}
