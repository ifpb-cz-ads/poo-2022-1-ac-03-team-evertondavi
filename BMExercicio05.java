import java.util.*;

class BMExercicio05{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int numero;
        
        System.out.print("Informe um numero de 1 a 7: ");
        numero = input.nextInt();
        
        
        if(numero <= 7 && numero >= 1){
            
            
            switch (numero){
                case 1:
                    System.out.print("Domingo");
                    break;
                case 2:
                    System.out.print("Segunda-feira");
                    break;
                case 3:
                    System.out.print("Terca-feira");
                    break;
                case 4:
                    System.out.print("Quarta-feira");
                    break;
                case 5:
                    System.out.print("Quinta-feira");
                    break;
                case 6:
                    System.out.print("Sexta-feira");
                    break;
                case 7:
                    System.out.print("Sabado");
                    break;
            }
            
            
        }else{
            System.out.println("Valor invalido.");
        }
    }
}