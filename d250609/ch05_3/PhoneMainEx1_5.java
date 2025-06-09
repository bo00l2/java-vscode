package d250609.ch05_3;

public class PhoneMainEx1_5 {
    public static void main(String[] args) {
        IphoneEx1_4 iphoneEx1_4 = new IphoneEx1_4("애플", "아이폰 16", "200만원", "서면롯데백화점");
        iphoneEx1_4.showinfo();

        GalaxyEx1_3 galaxyEx1_3 = new GalaxyEx1_3("삼성", "갤럭시 25", "약200만원", "삼성로고");
        galaxyEx1_3.showinfo();

        // 형 변환, 업캐스팅과 다운캐스팅 확인
        PhoneEx1_2 phoneIphone = new IphoneEx1_4("애플", "아이폰16", "약200만원", "프리비스");
        // 형 확인하는 연산자 이용해보기
        if (phoneIphone instanceof IphoneEx1_4) {
            // 다운 캐스팅 : 위 -> 아래
            // 부모 클래스에서 -> 자식 클래스 타입으로 변환
            // 원래대로 본인의 형으로 변환함
            IphoneEx1_4 iphoneEx1_42 = (IphoneEx1_4) phoneIphone;
            System.out.println("아이폰 클래스 형이 맞다면, 여기에 있는 기능 확인");
            iphoneEx1_4.sellInfo();
        } else if (phoneIphone instanceof GalaxyEx1_3) {
            GalaxyEx1_3 galaxyEx1_32 = (GalaxyEx1_3) phoneIphone;
            System.out.println("갤럭시 클래스 형이 맞다면, 여기에 있는 기능 확인");
            galaxyEx1_3.logoinfo();
        }

        PhoneEx1_2 samsungPhone = new GalaxyEx1_3("삼성", "갤럭시4", "약200만원", "삼성로고");
        samsungPhone.showinfo();
        // samsungPhone.logoinfo() // 현재 부모 타입이므로, 자식 타입 메서드 사용 x

    };
}
