/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danielcastelao.newproyect.Proyectos.Prog;
import java.util.Scanner;
/**Cambiar de dolares a euros
 *@version 1.1
 * @author Dima Aparicio
 */
public class Boletin2_3 {
   public static void main(String[] args){
       Scanner s=new Scanner(System.in);
    System.out.println("Dimecual es tu nombre?:");
    String nombre;
      /*Variable string de identidad nombre*/
     nombre = s.nextLine();
    System.out.println("Hola "+ nombre);
    System.out.println("Cuantos euros quieres cambiar a dólares?:");
      /*variable int dinero*/
     int dinero;
     dinero=s.nextInt();
      /*Operacion con variables dadas*/
     double dolares = dinero*(1.11);
      /*Salida de resultados*/
     System.out.println("Tienes "+ dolares  +" $");
 s.close();
    
    
    
    
}
}
