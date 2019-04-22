import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    float t,p;
    String d,tu;
    Scanner lectura = new Scanner(System.in);
    
    System.out.println("Ingrese los minutos completos al telefono: ");
    t = lectura.nextFloat();
    System.out.println("Ingrese el dia de la llameda(LUN,MAR,MIER,JUE,VIE,SAB,DOM)");
    d = lectura.next();
    System.out.println("Ingrese el turno correspondiente: (matutino = M ; vespertino = v)");
    tu = lectura.next();

    if(t<=5){        
        p=1;
    }else if(t<8){
        p=(float)((t-5)*0.8)+5;
    }else if(t<10){
        p=(float)((t-8)*0.7 + 7.4);
    }else{
        p=(float)((t-10)*0.5);
    }

    if(d=="DOM"){
        p=(float)(p+p*0.05);
    }else if(tu=="M"){
        p=(float)(p+p*0.15);
    }else{
        p=(float)(p+p*0.10);
    }
    
    System.out.println("El valor de la llamada es: " + p);
  }
}