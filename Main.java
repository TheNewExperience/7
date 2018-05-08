
import static java.lang.Math.pow;

public class Main {


    public static void main(String[] args)
    {
        Main c = new Main();

        c.checkTriangleIsPosible(9,5,4);
    }

    public boolean checkTriangleIsPosible(int a, int b, int c)
    {
        boolean statusOfTriangle;

        if((pow(a,2)+pow(b,2)>pow(c,2))&&(a+c>b)&&(b+c>a))
        {   statusOfTriangle= true;
            System.out.println("Można stworzyć trójkąt");

        }
        else
        {
            statusOfTriangle=false;
            System.out.println("Nie można stworzyć trójkąta");
        }

        if((pow(a,2)+pow(b,2)<pow(c,2))&&(pow(a,2)+pow(c,2)<pow(b,2))&&(pow(b,2)+pow(c,2)<pow(a,2)))
        {
            System.out.println("Trójkąt rozwartokątny!");

        }
        return statusOfTriangle;
    }

}
