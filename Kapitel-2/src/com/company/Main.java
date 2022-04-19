package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(new PlusExpr(new Literal(5), new Literal(5)).eval());
    }
}
