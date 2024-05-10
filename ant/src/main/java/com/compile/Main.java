package com.compile;
import com.compile.hello.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
import java.net.*;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception{
        Scanner input1 = new Scanner(System.in);
        System.out.println("作者姓名：yzm");
        System.out.println("班级：xxxxx班");
        System.out.println("xxxxxxx");
        System.out.println("请输入需要分析的程序文件(该文件请放入resource文件夹下)");
        String temp = input1.next();
        URL url1 = Main.class.getResource("/"+temp);
        String fileName = url1.getPath();
        InputStream inputStream = new FileInputStream(fileName);
        CharStream input = CharStreams.fromStream(inputStream);

        HelloLexer lexer = new HelloLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        HelloParser parser = new HelloParser(tokens);

        ParseTree tree = parser.program();
        List<HelloParser.Quadruple> quadruples = HelloParser.getquadruples();
        for (HelloParser.Quadruple quadruple : quadruples) {
            System.out.println(quadruple.address + "( " +quadruple.operator + ", " + quadruple.arg1 + ", " + quadruple.arg2 + ", " + quadruple.result+" )");
        }
    }
}
