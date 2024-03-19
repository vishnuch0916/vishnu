package com.vishnu.LambdaExpression;
@FunctionalInterface
interface MyLambda{
    public void display();
}
public class Demo1 {
    public static void main(String []args){
        MyLambda md=()->{System.out.println("Hello World");};
        md.display();
    }
}
