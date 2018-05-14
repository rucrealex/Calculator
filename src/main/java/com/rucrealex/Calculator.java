package com.rucrealex;

import com.rucrealex.operations.Operation;
import com.rucrealex.screen.BaseMonitor;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Calculator {
    private BaseMonitor baseMonitor;
    private Operation operation;

    public Calculator(BaseMonitor baseMonitor, Operation operation) {
        this.baseMonitor = baseMonitor;
        this.operation = operation;
    }

    private void execute(String[] args) {
        Long op1 = Long.valueOf(args[0]);
        Long op2 = Long.valueOf(args[1]);
        String str = "RESULT: " + args[0] +" " + this.operation.getOperationName() + " " + args[1] + " = " +
                operation.execute(op1, op2);
        this.baseMonitor.print(str);
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Calculator calculator = (Calculator) context.getBean("calculator");
        calculator.execute(args);
    }
}
