import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat, fizik, türkçe, kimya, müzik;
        int ort ;
        int count=0;
        int countDers = 0 ;
        Scanner inp = new Scanner(System.in);
        System.out.print("Matematik notunuz : ");
        mat = inp.nextInt();
        System.out.print("Fizik notunuz : ");
        fizik = inp.nextInt();
        System.out.print("Türkçe notunuz : ");
        türkçe = inp.nextInt();
        System.out.print("Kimya notunuz : ");
        kimya = inp.nextInt();
        System.out.print("Müzik notunuz : ");
        müzik = inp.nextInt();
        if (mat < 0 || mat > 100) {
            System.out.println("MATEMATİK Geçersiz Değer!");
        } else {
            count = count + mat;
            countDers = countDers + 1;
        }
        if (fizik < 0 || fizik > 100) {
            System.out.println("FİZİK Geçersiz Değer!");
        } else {
            count = count + fizik ;
            countDers = countDers + 1;
        }
        if (türkçe < 0 || türkçe > 100) {
            System.out.println("TÜRKÇE Geçersiz Değer!");
        } else {
            count = count + türkçe ;
            countDers = countDers + 1 ;
        }
        if (kimya < 0 || kimya > 100) {
            System.out.println("KİMYA Geçersiz Değer!");
        } else {
            count = count + kimya ;
            countDers = countDers + 1 ;
        }
        if (müzik < 0 || müzik > 100) {
            System.out.println("MÜZİK Geçersiz Değer!");
        } else {
            count = count + müzik ;
            countDers = countDers + 1 ;
        }
        ort = count / countDers ;
        System.out.println("ortalamanız : " + ort);
        if (ort >= 55) {
            System.out.println("Sınıfı Geçtiniz !!");
        } else {
            System.out.println("Sınıfta Kaldınız.");
        }
    }
}
