package com.gurukrupa.diceroller;

public class Pattern {

    public static void main(String[] args) {

        for (int i=0; i<=5; i++)
        {
            for (int j=1; j<=5; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
        /* Out put
        *****
        *****
        *****
        *****
        *****
        ***** */
        for (int i=0; i<=5; i++)
        {
            for (int j=1; j<=5; j++)
            {
                System.out.print(j + " ");
            }

            System.out.println();
        }
        /* out put
        1 2 3 4 5
        1 2 3 4 5
        1 2 3 4 5
        1 2 3 4 5
        1 2 3 4 5
        1 2 3 4 5*/


        for (int i = 0; i <= 5; i++) {
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        /* out put
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
        1 2 3 4 5 6*/

        for (int i =1; i<5;i++)
        {
            int alphabet =  65; //ASCII value of A
            for (int j =1; j<=i; j++)
            {
                System.out.print((char)alphabet);

                alphabet++;
            }
            System.out.println();
        }

        /* out put
       A
       AB
       ABC
       ABCD
        */

        int alphabet =  65; //ASCII value of A
        for (int i =1; i<5;i++)
        {
            for (int j =1; j<=i; j++)
            {
                System.out.print((char)alphabet);
                alphabet++;
            }
            System.out.println();
        }
        /*Out put
        A
        BC
        DEF
        GHIJ
        * */

        int alphabet1 =  65;
        for (int i =1; i<5;i++)
        {
            for (int j =1; j<=i; j++)
            {
                System.out.print((char)alphabet1);
            }
            System.out.println();
            alphabet1++;
        }

        /*Out put
       A
       BB
       CCC
       DDDD
        * */

        for (int i =1; i<10;i++) // increase count 10 to 27 to print till "z"
        {
            int alphabet2 =  97; //ASCII value of A = 65 and a=97
            String strChars = "";
            for (int j =1; j<=i; j++)
            {
                strChars =  strChars + (char) alphabet2 + "+" ;
                alphabet2++;
            }
            System.out.println("(" + strChars.substring(0,strChars.length()-1) + ")");
        }
/*Out put
(a)
(a+b)
(a+b+c)
(a+b+c+d)
(a+b+c+d+e)
(a+b+c+d+e+f)
(a+b+c+d+e+f+g)
(a+b+c+d+e+f+g+h)
(a+b+c+d+e+f+g+h+i)
        * */
    }
}
