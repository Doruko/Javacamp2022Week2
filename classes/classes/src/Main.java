public class Main {
    public static void main(String[] args) {
       CustomerManager customerManager = new CustomerManager();
       CustomerManager customerManager2 = new CustomerManager();
       customerManager=customerManager2;
       customerManager.Add();
       customerManager.Remove();
       customerManager.Update();

       /*örnek
        int sayi1 = 10;
        int sayi2 = 20;
        int sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2);
        //Burada önemli olan husus sayi2 sayi 1 e eşitlendikten sonra sayi2 ye tekrardan bir değer atanmadığı için 10 olarak kalmaya devam eder.*/


        int[] sayilar1 = new int[] {1,2,3};
        int[] sayilar2 = new int[] {4,5,6};
        sayilar2 = sayilar1;
        sayilar1[0] = 10;
        System.out.println(sayilar2[0]);
        //Array türünde yazılan denklemlerde referansa göre kural işletir. Buna istinaden önceki örneğin aksine son güncel bilgiye göre sonuç verir.

    }
}

