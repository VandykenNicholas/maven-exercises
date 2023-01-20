import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class StringUtilsPractice {


    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Put in a string");
        String input = Input.nextLine();
        System.out.println(StringUtils.isNumeric(input));
        System.out.println("Now the flip case");
        System.out.println(StringUtils.swapCase(input));
        System.out.println("Now the reverse");
        System.out.println(StringUtils.reverse(input));
    }
}
