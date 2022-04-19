eval::Exp -> Double
data Exp = PlusExpr Exp Exp | MinusExpr Exp Exp | MultExpr Exp Exp | DivExpr Exp Exp | Literal Double

eval (Literal x) = x

eval (PlusExpr a b) = eval a + eval b
eval (MinusExpr a b) = eval a - eval b
eval (MultExpr a b) = eval a * eval b
eval (DivExpr a b) = eval a / eval b