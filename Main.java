
import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
    Scanner lF = new Scanner(System.in);

    String si = lF.nextLine();
    String sk = lF.nextLine();
    int sl = lF.nextInt();
    lF.nextLine();
    lastFirstN(si, sk, sl);
    String sh = lF.nextLine();
    String sj = lF.nextLine();
    
    stringManip(sh, sj);
    String st = lF.nextLine();
    String sn = lF.nextLine();
    System.out.println(removeStr(st, sn));
  }

  /** Precondition: s1 and s2 are not null
  * Precondition: 0 <= n <= min(s1.length(), s2.length()
  */
  public static void lastFirstN(String s1, String s2, int n)
  {
    System.out.println("Sample inputs:");
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(n);
    String na="";
    na += s1.substring(Math.max(0, s1.length() - n),s1.length());
    na += s2.substring(0, Math.min(s2.length(), n));
    System.out.println("\nOutput:\n"+na);
    return;
  }

  /** Precondition: s1 and s2 are not null
  */
  public static void stringManip(String s1, String s2)
  {
    System.out.println("\n" + s1.toUpperCase());
    System.out.println(Character.toString(s2.charAt(0)).toUpperCase()+s2.substring(1).toLowerCase() + "\n");
  
  }

  /** Precondition: s1 and s2 are not null
  * Precondition: s2 is a substring of s1 and can be found at least one time in s1
  */
  public static String removeStr(String s1, String s2)
  {
    String output = null;
    System.out.println(s1);
    System.out.println(s2);

    output=s1.substring(0, s1.indexOf(s2)) + s1.substring(s1.indexOf(s2) + s2.length());
    return output;
  }
}
