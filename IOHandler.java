import java.util.InputMismatchException;
import java.util.Scanner;

public class IOHandler {

    public int validateInput(int lower, int upper)
    {
        Scanner sc = new Scanner(System.in);
        boolean valid = false;
        String choice = "";
        int conv = 0;

        if(lower > upper)
        {
            int temp = lower;
            lower = upper;
            upper = temp;
        }

        while(!valid)
        {
            try
            {
                choice = sc.nextLine();
                conv = Integer.parseInt(choice);
                if(conv <= upper && conv >=lower)
                {
                    valid = true;
                }
                else
                {
                    throw new IllegalArgumentException("Invalid entry, please select again");
                }
            }
            catch(InputMismatchException | IllegalArgumentException e)
            {
                System.out.println("Invalid entry, please select again");
            }
        }

        return conv;
    }
}
