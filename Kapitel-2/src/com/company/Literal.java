package com.company;

public class Literal extends Expr{

    private final double literal;

    public Literal(double literal) {
        this.literal = literal;
    }

    @Override
    public double eval() {
        return this.literal;
    }
}
