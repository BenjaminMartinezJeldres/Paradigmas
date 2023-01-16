import java.util.Scanner;

/*Crear un programa e java que determine si un areglo de enteros tienen un elemento mayoritario,.
 * El elemento mayoritario , es aquel elemento que se repite mas de la mitad de las veces en el arreglo(en cualquier posicion),
 * Suponga que el arreglo posee 6 elementos. Entonces el siguiente arreglo, poee un elemento mayoritario que es 1
 *  1 0 1 0 1 1 1
 */
public class ElementoMayoritario {
   public static void main(String[]args){

 /* En caso de que quiera hacer un mayoritario pre hecho, sin ingresar valores por teclado   
      int[] numeros = new int[6];

        numeros[0]=1;
        numeros[1]=0;
        numeros[2]=1;
        numeros[3]=0;
        numeros[4]=1;
        numeros[5]=1;
        numeros[6]=1;
tambien puede escribirse de la siguiente manera(forma 2):
 int[] numeros = {1,0,1,0,1,1,1};
*/
      int i,j, pos=0 , cont;
      int v[]=new int[6];
      Scanner linea =new Scanner(System.in);

      for(i=0;i<6;i++){
         System.out.println("ingrese el elemento "+i);
         v[i]=linea.nextInt();
      }
      for(i=0,cont=0;i<6;i++ ){
         for(j=i+1;j<6;j++){
            if(v[i]==v[j]){
               cont++;
                  pos=v[i];
            }
         }
         
}
      if(cont>3)
         System.out.println("existe un numero mayoritario= "+ pos);
       else  System.out.println("no existe un numero  mayoritario");
   }

}
