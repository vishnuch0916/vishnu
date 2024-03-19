package com.vishnu.LambdaExpression;
@FunctionalInterface
interface MyLambda2{
    public int add(int a, int b);
}
public class PassingparametersDemo3 {
    public static void main(String []args){
        MyLambda2 md2=(a,b)->{return a+b;};
        System.out.println(md2.add(10,25));
    }
}