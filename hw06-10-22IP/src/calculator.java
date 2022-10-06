import java.util.Scanner;

public class calculator {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Select:\n1-byte\n" +
                "2-short \n" +
                "3-int \n" +
                "4-long \n" +
                "5-float \n" +
                "6-double \n" +
                "7-boolean \n");

        int promenliva = sc.nextInt();
        switch (promenliva){
            case 1:
                System.out.print("Write 2 nums of type byte: ");
                byte b1 = sc.nextByte();
                byte b2 = sc.nextByte();
                byteCalculator(b1,b2);
                break;
            case 2:
                System.out.print("Write 2 nums of type short: ");
                short s1 = sc.nextShort();
                short s2 = sc.nextShort();
                shortCalculator(s1,s2);
                break;
            case 3:
                System.out.print("Write 2 nums of type int: ");
                int i1 = sc.nextInt();
                int i2 = sc.nextInt();
                intCalculator(i1,i2);
                break;
            case 4:
                System.out.print("Write 2 nums of type long: ");
                long l1 = sc.nextLong();
                long l2 = sc.nextLong();
                longCalculator(l1,l2);
                break;
            case 5:
                System.out.print("Write 2 nums of type float: ");
                float f1 = sc.nextFloat();
                float f2 = sc.nextFloat();
                floatCalculator(f1,f2);
                break;
            case 6:
                System.out.print("Write 2 nums of type double: ");
                double d1 = sc.nextDouble();
                double d2 = sc.nextDouble();
                doubleCalculator(d1,d2);
                break;
            case 7:
                System.out.print("Write 2 nums of type boolean: ");
                boolean bool1 = sc.nextBoolean();
                boolean bool2 = sc.nextBoolean();
                booleanCalculator(bool1, bool2);
                break;
        }

    }
    public static void byteCalculator(byte a1, byte a2){
        print();
        int a = sc.nextInt();
        switch (a){
            case 1:
                System.out.print(a1*a2);
                break;
            case 2:
                System.out.print(a1/a2);
                break;
        }

    }

    public static void shortCalculator(short a1, short a2){
        print();
        int a = sc.nextInt();
        switch (a){
            case 1:
                System.out.print(a1*a2);
                break;
            case 2:
                System.out.print(a1/a2);
                break;
        }

    }

    public static void intCalculator(int a1, int a2){
        print();
        int a = sc.nextInt();
        switch (a){
            case 1:
                System.out.print(a1*a2);
                break;
            case 2:
                System.out.print(a1/a2);
                break;
        }

    }

    public static void longCalculator(long a1, long a2){
        print();
        int a = sc.nextInt();
        switch (a){
            case 1:
                System.out.print(a1*a2);
                break;
            case 2:
                System.out.print(a1/a2);
                break;
        }

    }

    public static void floatCalculator(float a1, float a2){
        print();
        int a = sc.nextInt();
        switch (a){
            case 1:
                System.out.print(a1*a2);
                break;
            case 2:
                System.out.print(a1/a2);
                break;
        }

    }

    public static void doubleCalculator(double a1, double a2){
        print();
        int a = sc.nextInt();
        switch (a){
            case 1:
                System.out.print(a1*a2);
                break;
            case 2:
                System.out.print(a1/a2);
                break;
        }

    }

    public static void booleanCalculator(boolean a1, boolean a2){
        print();
        int a = sc.nextInt();
        switch (a){
            case 1:
                System.out.print(a1&a2);
                break;
            case 2:
                System.out.print(a1|a2);
                break;
        }

    }

    public static void print(){
        System.out.print("multiplication - 1\ndivision - 2");
    }


}