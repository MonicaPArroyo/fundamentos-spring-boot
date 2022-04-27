package com.fundamentos.springboot.fundamentosSP.bean;

public class MyBeanImplement implements MyBean{
    @Override
    public void print(){
        System.out.println("Hola desde my Bean");
    }
}
