package com.hand.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class test02 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String string="";
		String mstr="";
		String dstr="";
		System.out.println("请输入日期：");
		string=input.nextLine();
//		System.out.println(isValidDate(string));
		boolean b=isValidDate(string);
		if(b){int y;
		int m,d;
		y=Integer.parseInt(string.substring(0, 4));
		m=Integer.parseInt(string.substring(5, 7));
		d=Integer.parseInt(string.substring(8, 10));
		switch (m) {
		case 1:case 3:case 5:case 7:case 8:case 10:
			if(d==31){
				if(y==12){
					y+=1;
					m+=1;
					d=1;
				}else{
				d+=1;}
			}else {
				d+=1;
			}
			break;
		case 4:case 6:case 9:case 11:
			if (d==30) {
				m+=1;
				d+=1;
			}else{
			d+=1;}
			break;
		case 2:
			if(y%4==0){
				if(d==29){
					m+=1;
					d=1;
				}else{
					d+=1;
				}
			}else {
				if (d==28) {
					m+=1;
					d=1;
				}else{
					d+=1;
				}
			}
			break;
		default:
			break;
		}
		if(m<10){
			 mstr="0"+m;
		}else {
			mstr=""+m;
		}
		if(d<10){
			 dstr="0"+d;
		}else {
			dstr=""+d;
		}
		System.out.print("下一天的日期为："+y+"-"+mstr+"-"+dstr);
		}else{
			System.out.println("您输入得日期不存在！");
		}
	}
	 public static boolean isValidDate(String str) {
	        boolean convertSuccess=true;
	         SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	         try {
	            format.setLenient(false);
	            format.parse(str);
	         } catch (ParseException e) {
	            convertSuccess=false;
	        } 
	        return convertSuccess;
	 }
}
