public class e_7_11 {

    
     public static void main(String[] args)
     {

     // inciso a)    
     int[] cuentas = new int[10]; // crea el objeto arreglo
   
    System.out.printf("%s%8s%n", "Indice", "Valor"); // encabezados de columnas
   
    // imprime el valor de cada elemento del arreglo
    for (int contador = 0; contador < cuentas.length; contador++)
    System.out.printf("%5d%8d%n", contador, cuentas[contador]);

     // inciso b) 
     int [] bono=new int[14];
     int sum=0;
     System.out.printf("%s%8s%n", "Indice", "+ 1");
     for(int c=0; c<bono.length; c++)
          //for(int cs=0; cs<bono.length; cs++){
         System.out.printf("%5d%8d%n",c, sum+=(bono[c]+1) );
     
     //inciso c)
     int[] mejoresPuntuaciones={ 98,96,100,90,92};
     System.out.printf("%s%8s%n", "#", "Puntuaciones");
     for(int c=0; c<mejoresPuntuaciones.length; c++)
         System.out.printf("%5d%8d%n",c, mejoresPuntuaciones[c] );

     
  }
}
    








