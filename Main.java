import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Wybierz case:");
    int z = scan.nextInt();

    switch (z){
      case 1:
      {
        System.out.println("1");
      }break;
        
      case 2:
      {
          System.out.println("2");
      }break;
    }
  }
}