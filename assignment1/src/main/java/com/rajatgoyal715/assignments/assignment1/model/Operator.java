package com.rajatgoyal715.assignments.assignment1.model;

public enum Operator {

    // Conditional Operators
    LESS_THAN ("<"),
    EQUALS_TO ("=="),
    GREATER_THAN (">"),
    LESS_THAN_EQUALS_TO ("<="),
    GREATER_THAN_EQUALS_TO (">="),
    NOT_EQUALS_TO ("!="),
    BETWEEN ("BETWEEN"),
    ALLOF ("ALLOF"),
    NONEOF ("NONEOF"),

    // Logical Operators
    AND ("AND"),
    OR ("OR");

    private String symbol;

    Operator(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
