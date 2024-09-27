import java.util.Scanner;

/**
 * PemilihanHari06
 */
public class PemilihanHari06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String  dayType;
        int dayName;
        System.out.print("Input day name: ");
        dayName = sc.nextInt();
        switch (dayName) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dayType = "weekdays";
                break;
            case 6:
            case 7:
                dayType = "weekend";
            default:
                dayType = "invalid lek";
        }
        System.out.println(dayName + " is a " + dayType);
        sc.close();
    }
}
    
