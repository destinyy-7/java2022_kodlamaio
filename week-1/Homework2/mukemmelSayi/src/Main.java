public class Main {

    public static void main(String[] args) {
        //mükemmel sayı:kendinden başka pozitif tüm tam bölenlerin toplamı kendine eşit olan sayı
        //6-->1,2,3
        //26-->1,2,4,7,14
	    int number = 28;
	    int total=0;

	    for (int i=1;i<number;i++){
	        if (number%i==0){
	            total=total+i;
            }
        }
	    if (total == number){
            System.out.println("Mükemmel Sayıdır");
        }else {
            System.out.println("Mükemmel Sayı Değildir");
        }

    }
}
