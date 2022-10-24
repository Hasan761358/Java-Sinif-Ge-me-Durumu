import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int mat, fizik, turkce, kimya, muzik,derstoplam=0;
        double toplam=0;

        System.out.print(" Matematik Notunuz : ");
        mat=scan.nextInt();
        if(mat<=100&&mat>=0){
            toplam+=mat;
            derstoplam+=1;
        }else {
            System.out.println(" Ders ortalamaya dahil edilmedi.");
        }

        System.out.print(" Fizik Notunuz : ");
        fizik=scan.nextInt();
        if(fizik<=100&&fizik>=0){
            toplam+=fizik;
            derstoplam+=1;
        }else {
            System.out.println(" Ders ortalamaya dahil edilmedi.");
        }
        System.out.print(" Türkçe Notunuz : ");
        turkce=scan.nextInt();
        if(turkce<=100&&turkce>=0){
            toplam+=turkce;
            derstoplam+=1;
        }else {
            System.out.println(" Ders ortalamaya dahil edilmedi.");
        }
        System.out.print(" Kimya Notunuz : ");
        kimya=scan.nextInt();
        if(kimya<=100&&kimya>=0){
            toplam+=kimya;
            derstoplam+=1;
        }else {
            System.out.println(" Ders ortalamaya dahil edilmedi.");
        }
        System.out.print(" Müzik Notunuz : ");
        muzik=scan.nextInt();
        if(muzik<=100&&muzik>=0){
            toplam+=muzik;
            derstoplam+=1;
        }else {
            System.out.println(" Ders ortalamaya dahil edilmedi.");
        }
        System.out.println(" Ortalamanız : "+toplam/derstoplam );
        if (toplam/derstoplam>=55){
            System.out.println(" Sınıfı Geçtiniz.");
        }else {
            System.out.println(" Sınıfta kaldınız.");
        }
    }
}