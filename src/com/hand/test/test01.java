package com.hand.test;

import java.util.Scanner;

public class test01 {
	public static void main(String[] args) {
        double salary = 0;                        
        Scanner input=new Scanner(System.in);
        System.out.println("请输入工资：");
        salary=input.nextDouble();					//输入工资
        double taxsal = salary-3500.0 ;             //计算起证部分

        double culsal=0 ;                           //定义一个变量用于保存计算结果

        if(taxsal <= 0){                                //若工资不超过3500
            culsal = 0 ;
        }else if(taxsal <= 1500){                   //超过部分小于1500
            culsal = (taxsal-0)*0.03 ; 
        }else if(taxsal>1500 && taxsal<04500){      //超过1500~4500
            culsal = (taxsal-1500)*0.10 
                        + (1500-0)*0.03 ;
        }else if(taxsal>=4500 && taxsal<9000){      //超过4500~9000
            culsal = (taxsal-4500.0)*0.20 
                        + (4500-1500)*0.10
                        + (1500-0)*0.03 ;
        }else if(taxsal>=9000 && taxsal<35000){     //超过9000~35000
            culsal = (taxsal-9000.0)*0.25 
                        + (9000-4500)*0.20
                        + (4500-1500)*0.10 
                        + (1500-0)*0.03 ;
        }else if(taxsal>=35000 && taxsal<55000){    //超过35000~55000
            culsal = (taxsal-35000.0)*0.30 
                        + (35000-9000)*0.25
                        + (9000-4500)*0.20 
                        + (4500-1500)*0.10 
                        + (1500-0)*0.03 ;
        }else if(taxsal>=55000 && taxsal<80000){    //超过55000~80000    
            culsal = (taxsal-55000.0)*0.35 
                        + (55000-35000)*0.30 
                        + (35000-9000)*0.25
                        + (9000-4500)*0.20 
                        + (4500-1500)*0.10 
                        + (1500-0)*0.03 ;
        }else if(taxsal>=80000){                    //超过80000以上
            culsal = (taxsal-80000.0)*0.45 
                        + (80000-55000)*0.35 
                        + (55000-35000)*0.30 
                        + (35000-9000)*0.25 
                        + (9000-4500)*0.20 
                        + (4500-1500)*0.10 
                        + (1500-0)*0.03 ;
        }

        System.out.println("所需要缴纳的税费为："+culsal);
    }
}
