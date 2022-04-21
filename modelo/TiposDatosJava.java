package modelo; 
public class TiposDatosJava

{

public static void main(String[] args) 
    {
 
    //tipos de datos primitivps 
    int x=12;
    short w=2;
    char c ='@';
    double y=2.45;
    boolean esta=true;
    System.out.println("tipos de datos primitivos: ");
    System.out.println("x =" + x);

    //tipos de datos referenciados

    String s="Uis socorro";
    int[] a=new int [12];
    Punto p1= new Punto(2,3);
    System.out.println("tipos de datos referenciados: ");
    System.out.println("punto: " + p1);

    }


}