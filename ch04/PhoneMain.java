package ch04;

public class PhoneMain {
    public static void main(String[] args) {
        // Phone phone1 = new Phone();

        // phone1.model = "iphone";
        // phone1.price = "150만원";
        // phone1.company = "apple";

        // phone1.showinfo2();

        Phone[] phone = new Phone[3];

        Phone phone1 = new Phone("iPhone 14", "120만원", "apple");
        Phone phone2 = new Phone("iPhone 14", "120만원", "apple");
        Phone phone3 = new Phone("Galaxy S23", "100만원", "samsung");

        phone[0] = phone1;
        phone[1] = phone2;
        phone[2] = phone3;

        System.out.println("phone1 주소: " + System.identityHashCode(phone1));
        System.out.println("phone2 주소: " + System.identityHashCode(phone2));
        System.out.println("phone2 주소: " + System.identityHashCode(phone3));

        Phone phone4 = new Phone("Pixel 7", "90만원", "Google");
        phone4.showinfo2();
    }
}
