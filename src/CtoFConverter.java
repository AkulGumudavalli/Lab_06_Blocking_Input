import java.util.Scanner;

class CtoFConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String trash;
        double temp;
        boolean done = false;
        do{
            System.out.println("Please input your temperature in C");
            if(input.hasNextDouble()){
                temp = input.nextDouble();
                double f_temp = (temp * (9.0/5.0)) + 32;
                System.out.println("The temperature in F: " + f_temp);
                done = true;
            }else{
                trash = input.nextLine();
                System.out.println("Wrong input type, you inputted: "+trash);
                input.nextLine();
            }
        }while(!done);
    }
}