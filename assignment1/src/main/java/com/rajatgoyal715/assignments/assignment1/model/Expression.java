package com.rajatgoyal715.assignments.assignment1.model;

/**
 * Model class for Expression
 *
 * @author rajatgoyal715
 */
public class Expression {

    String key;
    Operator operator;
    Object targetValue;
    Datatype datatype;

    public Expression(String key, Operator operator, Object targetValue, Datatype datatype) {
        this.key = key;
        this.operator = operator;
        this.targetValue = targetValue;
        this.datatype = datatype;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public Object getTargetValue() {
        return targetValue;
    }

    public void setTargetValue(Object targetValue) {
        this.targetValue = targetValue;
    }

    public Datatype getDatatype() {
        return datatype;
    }

    public void setDatatype(Datatype datatype) {
        this.datatype = datatype;
    }
}
