package com.npru.se65.id65001;
public class Test_Driver {

    public static void main(String[] args) {
    	HumanBeing hb = new HumanBeing();
    	hb.setHeight(177);
    	hb.setWeight(64);
    	hb.calculateBMI();
    	System.out.println("BMI: "+hb.getBmi());
    	System.out.println(hb.analyzeBmi());
    }
}