package com.example.TASK1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
    private Long id;
    private Double input1;
    private Double input2;
    private Double result;
    private Character operation;


    public Product(Long id, Double input1, Double input2, Character operation) {
        this.id = id;
        this.input1 = input1;
        this.input2 = input2;
        this.operation = operation;
    }

    public Product() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getInput1() {
        return input1;
    }

    public void setInput1(Double input1) {
        this.input1 = input1;
    }

    public Double getInput2() {
        return input2;
    }

    public void setInput2(Double input2) {
        this.input2 = input2;
    }

    public Double getResult() {
        if(this.getOperation()=='+'){
            result=this.getInput1()+this.input2;
        }else if(this.getOperation()=='-'){
            result=this.getInput1()-this.input2;
        }else if(this.getOperation()=='*'){
            result=this.getInput1()*this.input2;
        }else if(this.getOperation()=='/'){
            result=this.getInput1()/this.input2;
        }
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }

    public Character getOperation() {
        return operation;
    }

    public void setOperation(Character operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "{\n" +
                "result= " + result +
                "\n}";
    }
}
