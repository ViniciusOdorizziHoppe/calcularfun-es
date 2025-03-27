import java.util.Scanner;

public class fun {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Use 1,2,3 para utilizar esse programa Sendo 1 já sabendo o valor de X, 2 para saber o lucro e 3  para ser = 0");

        int x = entrada.nextInt();


        if (x==1) {
            System.out.println("qual o valor de X?");
            double vx = entrada.nextDouble();
            System.out.println("qual é o valor fixo a ser pago?");
            double vff = entrada.nextDouble();
            System.out.println("qual é o valor do custo váriavel");
            double val11 = entrada.nextDouble();
            System.out.println("por quanto ele vende?");
            double val22 = entrada.nextDouble();

            double s = (val22*vx) - (val11*vx);
            double ss = s - vff;

            System.out.println("Resultado="+ss);

        }
       else if (x==2) {
            System.out.println("qual é o valor fixo a ser pago?");
            double vf = entrada.nextDouble();
            System.out.println("qual é o valor do custo váriavel");
            double val1 = entrada.nextDouble();
            System.out.println("por quanto ele vende?");
            double val2 = entrada.nextDouble();

            double l = val2 - val1;
            double c = vf / l;

            System.out.println("x="+ c);

        } 
        if (x==3) {
            System.out.println("qual é o valor fixo a ser pago?");
            double vfff = entrada.nextDouble();
            System.out.println("qual é o valor do custo váriavel");
            double val111 = entrada.nextDouble();
            System.out.println("por quanto ele vende?");
            double val222 = entrada.nextDouble();

            double sss = val222 - val111;
            double j = vfff / sss;

            System.out.println("Resultado" + j);

        System.out.println("ME DIGA OQUE ACHOU DO PROGRAMA :)" );
        }
        

     
       

       

       
       

    }

}
