package com.vishnu.LambdaExpression;
@FunctionalInterface
interface MyLambda1{
    public void display(String str);
}
public class PassingparametersDemo2 {
    public static void main(String []args){
        MyLambda1 md1=(s)->{System.out.println(s);};
        md1.display("Hello Vishnu");
    }
}
