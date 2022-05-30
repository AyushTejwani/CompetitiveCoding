public class goldmanSach { // Java program to print minimum number that can be formed
    // from a given sequence of Is and Ds


        // Prints the minimum number that can be formed from
        // input sequence of I's and D's
        static void PrintMinNumberForPattern(String pattern)
        {
            int number=0;
            int max = 0;
            int lst = 0;
            int j;
            for (int i = 0; i < pattern.length(); i++)
            {
                int noOfNextD = 0;
                switch (pattern.charAt(i))
                {
                    case 'N':
                        j = i + 1;
                        while (j < pattern.length() && pattern.charAt(j) == 'D')
                        {
                            noOfNextD++;
                            j++;
                        }

                        if (i == 0)
                        {
                            max = noOfNextD + 2;
                            lst++;
                            number=number*10+lst;
                            number=number*10+max;
                            lst = max;
                        }
                        else
                        {
                            max = max + noOfNextD + 1;

                            lst = max;
                            number=number*10+lst;
                        }

                        for (int k = 0; k < noOfNextD; k++)
                        {
                           --lst;
                            number=number*10+lst;
                            i++;
                        }
                        break;

                    case 'M':
                        if (i == 0)
                        {
                            j = i + 1;
                            while (j < pattern.length() && pattern.charAt(j) == 'D')
                            {
                                noOfNextD++;
                                j++;
                            }
                            lst = noOfNextD + 2;
                            number=number*10+max;
                            number=number*10+(max-1);
                            lst = max - 1;
                        }
                        else
                        {
                            number=number*10+(lst-1);
                            lst--;
                        }
                        break;
                }
            }
            System.out.println(number);
        }

        // Driver code
        public static void main(String[] args)
        {
            PrintMinNumberForPattern("IDID");
            PrintMinNumberForPattern("I");
            PrintMinNumberForPattern("DD");
            PrintMinNumberForPattern("II");
            PrintMinNumberForPattern("DIDI");
            PrintMinNumberForPattern("IIDDD");
            PrintMinNumberForPattern("DDIDDIID");
        }

// 1 3 2 5 4
//         1 2
//         0 -1 -2
//         1 2 3
//         0 -1 2 1 3
//         1 2 6 5 4 3
//         0 -1 -2 3 2 1 4 6 5



}
