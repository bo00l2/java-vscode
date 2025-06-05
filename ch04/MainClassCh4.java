package ch04;

public class MainClassCh4 {
    public static void main(String[] args) {

        // 퀴즈, 폰 클래스를 담을 배열 만들어서
        // 담기, 출력, 각 멤버의 주소값 확인

        // 클래스 객체를 배열의 요소로 사용
        Phone[] phones = new Phone[5];
        // 클래스 타입으로 인식함 -> 참조형 변수
        Phone phone1 = new Phone("Galaxy S23", " 100만원", "Samsung");
        Phone phone2 = new Phone("iPhone 14", "120만원", "Apple");
        Phone phone3 = new Phone("Pixel 7", "90만원", "Google");
        Phone phone4 = new Phone("OnePlus 11", "80만원", "OnePlus");
        Phone phone5 = new Phone("Xiaomi 13", "70만원", "Xiaomi");
        // 배열에 객체를 할당
        phones[0] = phone1; // 0번째 요소에 phone1 객체 할당
        phones[1] = phone2; // 1번째 요소에 phone2 객체 할당
        phones[2] = phone3; // 2번째 요소에 phone3 객체 할당
        phones[3] = phone4; // 3번째 요소에 phone4 객체 할당
        phones[4] = phone5; // 4번째 요소에 phone5 객체 할당

        // 직접 할당.
        Phone[] phones2 = {
                phone1,
                phone2,
                phone3,
                phone4,
                phone5
        };

        System.out.println("phone1 주소: " + System.identityHashCode(phone1));
        System.out.println("phone2 주소: " + System.identityHashCode(phone2));

        // 문자열 타입을 요소로 가지는 배열.
        String[] carModels = { "suv", "k5세단", "아반떼", "소나타", "그랜저" };
        // 정수 타입을 요소로 가지는 배열.
        int[] carPrices = { 4000, 3000, 2500, 3500, 5000 }; // 단위 : 만원

        // 설계한 클래스를 이용해서 객체 생성
        // [클래스명] 객체명(인스턴스 변수명) = new [클래스명]();
        Car car1 = new Car();

        // 멤버 변수에 값 대입
        // getter/ setter 메소드를 사용 -> 불변성을 이용해서 캡슐화
        car1.model = "suv";
        car1.price = "4000만원";
        car1.company = "기아자동차";

        // 기능 확인
        car1.showinfo();

        // 또다른 인스턴스 생성
        Car car2 = new Car();
        car2.model = "k5세단";
        car2.price = "3000만원";
        car2.company = "기아자동차";
        car2.showinfo();

        // Phone phone1 = new Phone();

        // phone1.model = "iphone";
        // phone1.price = "150만원";
        // phone1.company = "apple";

        // Phone phone2 = new Phone();

        // phone2.model = "Z-filp";
        // phone2.price = "120만원";
        // phone2.company = "samsung";

        // Phone phone3 = new Phone();

        // phone3.model = "iphone se";
        // phone3.price = "80만원";
        // phone3.company = "apple";

        // phone1.showinfo2();
        // phone2.showinfo2();
        // phone3.showinfo2();
    }
}
