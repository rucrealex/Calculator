package com.rucrealex.operations;

public interface Operation {
    String getOperationName();

    Long execute(Long operandA, Long operandB);
}
