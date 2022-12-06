package linkedlist;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        linkedl list = new linkedl();
        while (true) {
            Scanner scanner=new Scanner(System.in);

            System.out.println("\n1 ile 7 arasında istediğiniz işlemi yapacağınız sayıyı girin" +
                    "\n" +
                    "Listenin başına ekleme yapmak için 1 girin" +
                    "\n" +
                    "Listenin sonuna ekleme yapmak için 2 girin" +
                    "\n" +
                    "Listeye sıralı biçimde ekleme yapmak için 3 girin" +
                    "\n" +
                    "istediğiniz yere bir eleman eklemek için 4 girin" +
                    "\n" +
                    "listeyi yazdırmak için 5 girin" +
                    "\n" +
                    "çıkış yapmak için 6 girin");

            int choice = scanner.nextInt();
            scanner.nextLine();


            switch (choice) {
                case 1:
                    String slash = "/";
                    while (slash.equals("/")) {
                        System.out.println("listeye eklemek istediğiniz numarayı girin");
                        int num = scanner.nextInt();
                        scanner.nextLine();
                        list.basaekle(num);
                        System.out.println("daha fazla sayı eklemek için enter'a basın. menüye dönmek için herhangi bir şey tuşlayın");
                         slash= scanner.next();
                        scanner.nextLine();
                    }
                    break;
                case 2:
                    String slash1 = "/";
                    while (slash1.equals("/")) {
                        System.out.println("listenin sonuna eklemek istediğiniz numarayı girin");
                        int num = scanner.nextInt();
                        list.sonaekle(num);
                        System.out.println("daha fazla sayı eklemek istiyorsanız enter'a basın. Menüye dönmek içib herhangi bir şey tuşlayın");
                        slash1 = scanner.next();
                        scanner.nextLine();
                    }
                    break;
                case 3:
                    String slash1a = "/";
                    while (slash1a.equals("/")) {
                        System.out.println("listeye eklemek istediğiniz numarayı girin");
                        int num = scanner.nextInt();
                        list.sıraliekle(num);
                        System.out.println("daha fazla eklemek için enter tuşlayın");
                        slash1a = scanner.next();
                        scanner.nextLine();
                    }
                    break;
                case 4:
                    String slash1b = "/";
                    while (slash1b.equals("/")) {
                        System.out.println("eklemek istediğiniz sayıyı girin");
                        int num = scanner.nextInt();
                        System.out.println("sayıyı eklemek istediğiniz liste yerini girin");
                        int index = scanner.nextInt();
                        list.arayaekle(num,index);
                        System.out.println("daha fazla ekleme yapmak için entera basın. menüye dönmek için ne yapmanız gerektiğini biliyorsunuz :)");
                        slash1b = scanner.next();
                    }
                    break;
                case 5:
                    list.listeyazdir();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("yanlış sayı girişi yaptınız, tekrar deneyin (1-7)");
            }
        }
    }
}