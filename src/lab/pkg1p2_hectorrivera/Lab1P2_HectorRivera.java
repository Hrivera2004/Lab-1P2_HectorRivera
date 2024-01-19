/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.pkg1p2_hectorrivera;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author hrolriverav
 */
public class Lab1P2_HectorRivera {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        Usario Objeto = new Usario();
        ArrayList<Usario> List = new ArrayList<Usario>();
        
        System.out.println("---Menu---");
        System.out.println("1.Registrar Usario \n2. Listar Todo \n3.Listar Por Dominio\n4.Salir");
        
        int opc = sc.nextInt();
        while(opc!=4){
            switch(opc){
                case 1:
                    sc.nextLine();
                    System.out.println("\nRgeistrar");
                    Objeto = new Usario(mail(),cont(),Fecha());
                    List.add(Objeto);
                    System.out.println(List.get(0).getFn());
                    break;
                case 2:
                    System.out.println("\nListar");
                    Listar(List);
                    break;
                case 3:
                    System.out.println("\nListar con edad Excata");
                    ListarEXCAT(List);
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
            }
            System.out.println("---Menu---");
            System.out.println("1.Registrar Usario \n2. Listar Todo \n3.Listar Por Dominio\n4.Salir");
        }
    }
    public static String cont(){
        System.out.println("Ingrese su correo: ");
        String mail = sc.nextLine();
        return mail;
    }
    public static String mail(){
        System.out.println("Ingrese una conntraseña: ");
        String cont = sc.nextLine();
        return cont;
    }
    public static Date Fecha(){
        System.out.println("Ingrese una fecha en Formato(yyyy/MM/dd): ");
        String Date = sc.nextLine();
        
        Date fecha = new Date(Date);
        while(edad(fecha)<13){
            System.out.println("tiene que ser mayor de 13 para ingresar ");
            Date = sc.nextLine();
            fecha = new Date(Date);
        }

        return fecha;
    }
    
    public static void Listar(ArrayList<Usario> List){
        for (int i = 0; i < List.size(); i++) {
            System.out.println(i+1+". Correo: "+List.get(i).getMail()+" Contraseña: "+List.get(i).getCon()+" Fecha: " + List.get(i).getFn());
        }
    }
    public static void ListarEXCAT(ArrayList<Usario> List){
        for (int i = 0; i < List.size(); i++) {
            System.out.println(i+1+". Correo: "+List.get(i).getMail()+" Contraseña: "+List.get(i).getCon()+" Fecha: " + edad(List.get(i).getFn()));
        }
    }
    public static int edad(Date Fn){
        Date aux = new Date();
        int edad = aux.getYear()- Fn.getYear();
        if (Fn.getMonth()>=aux.getMonth()) {
            if (Fn.getDay()>=aux.getDay()) {
                edad++;
            }else{
                edad--;
            }
        }else{
            edad--;
        }
                
        return edad;        
    }
}
    
