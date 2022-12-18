/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.new1;
import java.util.ArrayList;
/**
 *
 * @author Kasun Chathuranga
 */
class Checker{
    static void checker(int[] arr){  
        boolean res=true;
        ArrayList val=new ArrayList();
        for (int i=0;i<arr.length-1;i++){
            res=true;
            int count=0;
            for(int j=1+i;j<=arr.length-1;j++){
                if (arr[i]==arr[j]){
                    count++;
                    res=false;   
                }     
            }
            if (res==false & count==1){
                val.add(arr[i]);
            }               
        }
        if (val.size()!=0){
            for(Object l:val){
                System.out.println("Duplicate is : "+l);
            }
        }
        else{
            System.out.println("No Duplicates");
        }
    }
}
public class checkduplicates {
    public static void main(String[] args) {
        int[] a={2,3,4,5,4,4,4,4,4,6,6,6,2,8,7,9,3,5,4,6,9,8,7,3,6,5,4,8,8,96,2,5,3};
        Checker.checker(a);
        
        }
    }

