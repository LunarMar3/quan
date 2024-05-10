grammar Hello;

@header{
    package com.compile.hello;
    import java.util.*;
}

@members {
    public class Quadruple {
        public int address;
        public String operator;
        public String arg1;
        public String arg2;
        public String result;

        Quadruple(int address, String operator, String arg1, String arg2, String result) {
            this.address = address;
            this.operator = operator;
            this.arg1 = arg1;
            this.arg2 = arg2;
            this.result = result;
        }
    }

    static List<Quadruple> quadruples = new ArrayList<>();
    public static List<Quadruple> getquadruples(){
        return quadruples;
    }
    static int tempCount = 0;
    static int address = 100;

}
program
    :   statement*
    ;

statement returns [int Ebegin,int Etrue,int Efalse]
    :expression (SEMICN)?{
        $Ebegin = $expression.Ebegin;
    }
    |ifStatement (SEMICN)?{
        $Ebegin = $ifStatement.Ebegin;
        $Etrue = $ifStatement.Etrue;
        $Efalse = $ifStatement.Efalse;
    }
    |declarationStatement SEMICN
    |comparementStatement (SEMICN)?{
        $Ebegin = $comparementStatement.Ebegin;
        $Etrue = $comparementStatement.Etrue;
        $Efalse = $comparementStatement.Efalse;
    }
    |compoundStatement (SEMICN)?{
        $Ebegin = $compoundStatement.Ebegin;
    }
    |whileStatement (SEMICN)?
    ;

declarationStatement
    :typeSpecifier declaratorList
    ;

declaratorList
    :declarator
    |declarator ',' declaratorList
    ;

comparementStatement returns [int Ebegin,int Etrue,int Efalse]
    :left=expression compareOperator right=expression{
        quadruples.add(new Quadruple(address,"j"+$compareOperator.text, $left.op, $right.op, null));
        $Etrue = address;
        $Ebegin = address;
        address += 1;
        quadruples.add(new Quadruple(address,"jump", null, null, null));
        $Efalse = address;
        address += 1;

    }
    |left2=comparementStatement '&&' right2=comparementStatement{
        int temp1 = $right2.Etrue;
        $Etrue = temp1;
        int temp2 = $left2.Efalse;
        $Efalse = temp2;
        $Ebegin = $left2.Ebegin;
        for (Quadruple quadruple : quadruples) {
            if($left2.Etrue == quadruple.address){
                quadruple.result = String.valueOf($right2.Ebegin);
            }
            if($right2.Efalse == quadruple.address){
                quadruple.result = String.valueOf($left2.Ebegin);
            }
        }
    }
    |left3=comparementStatement '||' right3=comparementStatement{
        int temp1 = $left3.Etrue;
        $Etrue = temp1;
        int temp2 = $right3.Efalse;
        $Efalse = temp2;
        $Ebegin = $left3.Ebegin;
        for (Quadruple quadruple : quadruples) {
            if($right3.Etrue == quadruple.address){
                quadruple.result = String.valueOf($left3.Ebegin);
            }
            if($left3.Efalse == quadruple.address){
                quadruple.result = String.valueOf($right3.Ebegin);
            }
        }
    }
    ;

whileStatement returns [int Ebegin,int Etrue,int Efalse]
    :WHILETK '(' left=statement ')'  right=statement{
        quadruples.add(new Quadruple(address,"jump", null, null, String.valueOf($left.Ebegin)));
        address += 1;
        for (Quadruple quadruple : quadruples) {
            if (quadruple.address == $left.Etrue){
                quadruple.result = String.valueOf($right.Ebegin);

            }
        }
        $Ebegin = $left.Ebegin;
        $Etrue = $left.Etrue;
        $Efalse = $left.Efalse;
    }
    ;

compoundStatement returns [int Ebegin,int Etrue,int Efalse]
    :'{' statement* '}'{
        $Ebegin = $statement.Ebegin;
        $Etrue = $statement.Etrue;
        $Efalse = $statement.Efalse;
    }
    ;

ifStatement returns [int Ebegin,int Etrue,int Efalse]
    :IFTK '(' left=statement ')' right=statement{
        for (Quadruple quadruple : quadruples) {
            if (quadruple.address == $left.Etrue){
                quadruple.result = String.valueOf($right.Ebegin);
            }
        }
        $Ebegin = $left.Ebegin;
        $Etrue = $left.Etrue;
        $Efalse = $left.Efalse;
    }
    |IFTK '(' left1=statement ')' right1=statement (ELSETK end=statement)?{
        for (Quadruple quadruple : quadruples) {
            if (quadruple.address == $left1.Etrue){
                quadruple.result = String.valueOf($right1.Ebegin);
            }
            if (quadruple.address == $left1.Efalse){
                quadruple.result = String.valueOf($end.Ebegin);
            }
        }
        $Ebegin = $left1.Ebegin;
        $Etrue = $left1.Etrue;
        $Efalse = $left1.Efalse;
    }
    ;

expression returns [String op, int Ebegin]
    :   assignmentExpression{
        $op = $assignmentExpression.op;
        $Ebegin = $assignmentExpression.Ebegin;
    }
    |   expression ',' assignmentExpression
    ;

literal
	:	DecimalConst
	|	OctalConst
	|	Hexadecimal
	;
declarator
    :   IDENTR ('=' expression)?{
        quadruples.add(new Quadruple(address,"=", $IDENTR.text, null, $expression.op));
        address += 1;
    }
    ;

typeSpecifier
    :INTTK
    |CHARTK
    ;

assignmentExpression returns [String op,int Ebegin]
    :   additiveExpression {$op = $additiveExpression.op;}
    |   IDENTR assignmentOperator additiveExpression{
        $Ebegin = $additiveExpression.Ebegin;
        quadruples.add(new Quadruple(address,"=", $additiveExpression.op, null, $IDENTR.text));
        address += 1;
    }
    ;

assignmentOperator
    :   '='
    |   '*='
    |	'/='
    |   '%='
    |   '+='
    |   '-='
    ;

compareOperator
    :   '=='
    |   '!='
    |   '>='
    |   '>'
    |   '<'
    |   '<='
    ;

additiveExpression returns [String op,int Ebegin]
    :   multiplicativeExpression {$op = $multiplicativeExpression.op;$Ebegin = $multiplicativeExpression.Ebegin;}
    |   left=additiveExpression '+' right=multiplicativeExpression{
        quadruples.add(new Quadruple(address,"+", $left.op, $multiplicativeExpression.op, "t"+tempCount));
        $Ebegin = address;
        address += 1;
        $op = "t"+tempCount;
        tempCount += 1;
    }
    |   left=additiveExpression '-' multiplicativeExpression
    {
            quadruples.add(new Quadruple(address,"-", $left.op, $multiplicativeExpression.op, "t"+tempCount));
            $Ebegin = address;
            address += 1;
            $op = "t"+tempCount;
            tempCount += 1;
        }
    ;

multiplicativeExpression returns [String op,int Ebegin]
    :   primaryExpression{
        $op = $primaryExpression.op;
    }
    |   left=multiplicativeExpression '*' right=primaryExpression{
        quadruples.add(new Quadruple(address,"*", $left.op, $right.op, "t"+tempCount));
        $Ebegin = address;
        address += 1;
        $op = "t"+tempCount;
        tempCount += 1;
    }
    |   left2=multiplicativeExpression '/' right2=primaryExpression{
        quadruples.add(new Quadruple(address,"/", $left2.op, $right2.op, "t"+tempCount));
        $Ebegin = address;
        address += 1;
        $op = "t"+tempCount;
        tempCount += 1;
    }
    |   left3=multiplicativeExpression '%' right3 = primaryExpression{
        quadruples.add(new Quadruple(address,"/", $left3.op, $right3.op, "t"+tempCount));
        $Ebegin = address;
        address += 1;
        $op = "t"+tempCount;
        tempCount += 1;
    }
    ;

primaryExpression returns [String op]
    :   IDENTR {$op = $IDENTR.text;}
    |   literal {$op = $literal.text;}
    |   IDENTR '(' argumentExpressionList? ')'
    |   '(' expression ')'{$op = $expression.op;}
    ;

argumentExpressionList
    :   assignmentExpression
    |   argumentExpressionList ',' assignmentExpression
    ;

//关键字
IFTK :              'if';
WHILETK:            'while';
ELSETK:             'else';
CONSTTK:            'const';
CHARTK:             'char';
VOIDTK:             'void';
MAINTK:             'main';
INTTK :             'int';
DOTK:               'do';
FORTK:              'for';
SCANFTK:            'scanf';
PRINTFTK:           'printf';
RETURNTK:           'return';

DecimalConst:       [1-9]([0-9])*;
OctalConst:         '0'([0-7])*;
Hexadecimal:        ('0x'|'0X')[0-9a-fA-F]+;

ASSIGN:             '=';
LSS:                '<';
LEQ:                '<=';
GRE:                '>';
GEQ:                '>=';
EQL:                '==';
NEQ:                '!=';
MULT:               '*';
DIV:                '/';
PLUS:               '+';
MINUS:              '-';
SEMICN:             ';';
COMMA:              ',';
LPARENT:            '(';
RPARENT:            ')';
RBRACK:             '[';
LBRACK:             ']';
LBRACE:             '{';
RBRACE:             '}';

IDENTR :            [a-zA-Z_]([a-zA-Z_] | [0-9])*;
ILLEGALIDENTR:      [0-9]+ IDENTR;

Whitespace:         [ \t]+ -> skip;
Newline:            ( '\r' '\n'?|'\n')-> skip;
OneLineComment:     '//' .*? '\n' -> skip;
MultiLineComment : '/*' .*? '*/' -> skip;
ErrMultiLineCommentMissingEnd : '/*' .*? -> channel(HIDDEN);