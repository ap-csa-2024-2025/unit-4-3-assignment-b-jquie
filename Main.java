import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    System.out.println(isPrime(1));
    Scanner sc = new Scanner(System.in);
    System.out.println("Input a number");
    N = sc.nextInt();
    System.out.println(isPrime(N));
  }

  public static boolean isPrime(int N)
  {
    if (N == 1)
    {
      return false;
    }
    for (int i = 2; i <= N; i++)
    {
      if (N % i == 0)
      {
        return false;
      }
    }
    return true;
  }
}
