import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt())
        {
            int cases = sc.nextInt();

            int arr[] = new int[cases];
            for(int i = 0;i < arr.length;i++)
            {
                arr[i] = sc.nextInt();
            }

            boolean flag=true;
            if(cases != 1)
            {
                int table[] = new int[cases-1];
                for(int i = 0;i < table.length;i++)
                {
                    table[i] = Math.abs(arr[i] - arr[i+1]);
                }
                Arrays.sort(table);
                for(int i = 0;i < table.length;i++)
                {
                    if(table[i] != i+1)
                    {
                        flag = false;
                        break;
                    }
                }
            }
            if(flag) System.out.println("Jolly");
            else System.out.println("Not jolly");
        }
    }
}
/*for(int i = 0;i < table.length;i++)
        {
            if(table[i] != i+1)
            {
                flag = false;
                break;
            }
        }*/
