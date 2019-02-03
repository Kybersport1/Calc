import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        try{
            calculation();
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    public static void calculation(){
        Scanner firstint = new Scanner(System.in);
        float one = firstint.nextInt();
        Scanner secondint = new Scanner(System.in);
        float two = secondint.nextInt();
        Scanner sim = new Scanner(System.in);
        char simv = sim.next().charAt(0);
        Methods obj = new Methods(one,two,simv);
    }
}

