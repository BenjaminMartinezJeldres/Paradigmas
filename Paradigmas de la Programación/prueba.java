
package laboratorio;

import java.util.Scanner;


public class Laboratorio {

   
    public static void main(String[] args) {
       
       
        //Ejercicio 1  Una función que reciba un arreglo de tipo entero y lo imprima de derecha a izquierda.
        int arregloInt[]={8,4,2,1,6,7};
        imprimirRev(arregloInt);
        
        //Ejercicio2 Una función iterativa, que calcule el Factorial de un número natural x (x>0). Utilice el siguiente prototipo: int FuncionFactorial(int x)
        int x;
        do{
            System.out.println("ingrese numero natural, x>0");
            Scanner leer=new Scanner(System.in);//scanf
            x=leer.nextInt();
        }while(x<=0);
        
        System.out.println("el factorial es:"+Factorial(x));
        
        
        //Ejercicio3 Una función que imprima de forma recursiva una cadena de caracteres.
        
        String nombre="Marcela";
        int largo=nombre.length();
        ImprimirRec(nombre, largo-1);

        //Ejercicio 4 Una función que reciba un arreglo de tipo struct persona y el tamaño
        //del arreglo, e imprima nombre y edad de los struct persona que se encuentran
       //en las posiciones del arreglo con índices impares.
       
        Persona arreglo[]= new Persona[5];
        
        arreglo[0]=new Persona();
        arreglo[0].nombre="Maria";
        arreglo[0].edad=23;
        
        arreglo[1]= new Persona();
        arreglo[1].nombre="Jose";
        arreglo[1].edad=18;
        
        arreglo[2]= new Persona();
        arreglo[2].nombre="Luis";
        arreglo[2].edad=34;
        
        arreglo[3]= new Persona();
        arreglo[3].nombre="Esteban";
        arreglo[3].edad=30;
        
        arreglo[4]= new Persona();
        arreglo[4].nombre="Joaquin";
        arreglo[4].edad=50;
        
        ImprimirPersonas(arreglo);
    }
    
    public static void ImprimirPersonas(Persona arreglo[])
    {
        for (int i = 0; i < arreglo.length; i++) 
        {
            if(i%2!=0)
            {
                System.out.print("["+arreglo[i].nombre+"  ");
                System.out.println(arreglo[i].edad+"]");
            }
        }   
    }
    
    public static void ImprimirRec(String  cadena, int largo)
    {
        if(largo==-1);
        else
        {  
            ImprimirRec(cadena, largo-1);  
            System.out.print(cadena.charAt(largo)); 
        }    
    }
    
    public static void imprimirRev(int arreglo[])
    {
        for (int i = arreglo.length-1; i >=0; i--) 
        {
            System.out.print("["+arreglo[i]+"]");//print
            
        }   
    }
    
    public static int Factorial(int x)
    {
        int fact=1;
        if(x==1)
            return x;
        else
        {
            for (int i = 1; i <=x; i++) {
                fact=fact*i;
            }
            return fact;
        }
        
        
    }
    
    
    
}
