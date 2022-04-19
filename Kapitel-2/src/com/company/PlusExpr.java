package com.company;

public class PlusExpr extends Expr{

    private final Expr a;
    private final Expr b;

    public PlusExpr(Expr a, Expr b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double eval() {
        return a.eval()+b.eval();
    }
}
