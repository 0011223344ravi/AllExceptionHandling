package com;

class Test
{
public static void main(String[] args){
try{
System.out.println(10/0);
}
catch(ArithmeticException e)
{
System.out.println(10/0);
}
finally{
String s=null;
System.out.println(s.length());
}
}}

//Note: Default exception handler can handle only one exception at a time and that is the
//most recently raised exception, which is null pointer exception
