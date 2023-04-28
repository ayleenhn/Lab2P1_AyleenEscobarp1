
package lab2p1_ayleenescobar;

import java.util.Scanner;

public class Lab2P1_AyleenEscobar {

    public static void main(String[] args) {
        
        boolean respuesta = true;
        
        Scanner sc = new Scanner(System.in);

        while (respuesta){
        
        System.out.println("Menu");
        System.out.println("1.Ejercicio 1");
        System.out.println("2.Ejercicio 2");
        System.out.println("3.Ejercicio 3");
        System.out.println("4.SALIR");
        System.out.println("Ingrese su opcion: ");

        int opcion = 0;
        opcion = sc.nextInt();
            
        switch(opcion){
            case 1:{
                System.out.print("Ingrese el numero que desea evaluar: ");
                int numero_evaluar = 0;
                numero_evaluar = sc.nextInt();
                while (numero_evaluar <= 0){
                    System.out.println("NUMERO NO VALIDO.(Debe ser mayor que cero.)");
                    System.out.print("Ingrese el numero que desea evaluar: ");
                    numero_evaluar = sc.nextInt();
                }
                int contador_primo = 1;
                int acumular_primo = 0;
                while (contador_primo <= numero_evaluar){
                    if(numero_evaluar % contador_primo ==0){
                        acumular_primo ++;
                    }
                    contador_primo = contador_primo +1;
                    }
                if (acumular_primo == 2){
                    if (numero_evaluar % 2 ==0){
                           System.out.println("El número ingresado es par y primo."); 
                        }else{
                           System.out.println("El número ingresado es impar y primo."); 
                        }
                }else {
                   if (numero_evaluar % 2 ==0){
                           System.out.println("El número ingresado es par."); 
                        }else{
                           System.out.println("El número ingresado es impar."); 
                        } 
                }
            }
            break;

            case 2:{
                System.out.print("Ingrese la precisión del cálculo: ");
                int numero = 0;
                numero = sc.nextInt();
                while(numero <= 0){
                   System.out.println("NUMERO NO VALIDO.(Debe ser mayor que cero.)");
                   System.out.print("Ingrese la precisión del cálculo: ");
                   numero = sc.nextInt();   
                }
                double num = 1;
                double res = 1;
                double den = 0;
                double nume = 0;
                int lim = 1;
                
                while (lim <= numero){
                    den = 4*(Math.pow(lim,2));
                    nume=(4*(Math.pow(lim,2)))-1;
                    res= res * den/nume;
                   lim ++;
                }
                res= res*2;
                System.out.println("PI: "+ res);
                
            }
            break;
            
            case 3 :{
                System.out.print("Ingrese A: ");
                int A = 0;
                A = sc.nextInt();
                System.out.print("Ingrese B: ");
                int B = 0;
                B = sc.nextInt();
                while (A<0 && B<0){
                   System.out.println("Los números ingresados deben ser positivos");
                }
                 System.out.print("El MCD de "+ A + " y "+B+ ":"  ); 
                while (A !=B){
                    if (A<B){
                        B= B-A;
                    }else{
                        A= A-B;          
                    }
                }
              System.out.print(A); 
                System.out.println();
                
            }
            case 4: {
                respuesta = false ; 
            }
            break;
            
            default:
                System.out.println("NUMERO NO VALIDO.");
                break;
        }
        }
        
    }
    
}
