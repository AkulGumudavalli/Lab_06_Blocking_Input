import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args){
        double width = 0.0;
        double height = 0.0;
        boolean done = false;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("What is width of the rectangle");

            if(input.hasNextDouble()){
                width = input.nextDouble();
                done = true;
            }else{
                System.out.println("Wrong input type");
                input.nextLine();
            }

        }while(!done);
        done = false;
        do{
            System.out.println("What is height of the rectangle");

            if(input.hasNextDouble()){
                height = input.nextDouble();
                done = true;
            }else{
                System.out.println("Wrong input type");
                input.nextLine();
            }

        }while(!done);
        double diagonal = Math.sqrt((Math.pow(width,2)+Math.pow(height,2)));
        double area = width*height;
        double perimeter = width*2+height*2;
        System.out.println("The perimeter of the rectangle would be: "+ perimeter+ " units");
        System.out.println("The area of the rectangle would be: "+area+ " units squared");
        System.out.println("The diagonal of the rectangle would be: "+diagonal+ " units");
    }
}
