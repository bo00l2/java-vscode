package d250609.ch04;

public class Member_Main {
    public static void main(String[] args) {
        Member getsetMember1 = new Member("김보영1", "kby@naver.com 1", "1234");
        Member getsetMember2 = new Member("김보영2", "kby@naver.com 2", "2345");
        Member getsetMember3 = new Member("김보영3", "kby@naver.com 3", "3456");
        // getsetMember.showinfo();

        // getsetMember.changeNameEmailPassword("김보영 수정", "kby@naver.com 수정", "1234
        // 수정");
        // getsetMember.showinfo();

        // 방금 만든 설계 클래스를 담을 배열 생성
        // Member[] memberArray = new Member[3];
        Member[] memberArray = { getsetMember1, getsetMember2, getsetMember3 };

        // 반복문으로 담기
        // for(int i=0; i<memberArray.length; i++){
        // memberArray[i] = MemberTempArray[i];
        // }

        for (Member member : memberArray) {
            member.showinfo();
        }

        System.out.println("=================================");

        getsetMember1.changeNameEmailPassword("수정1 김보영", "수정1kby@naver.com", "수정1 1234");
        getsetMember1.changeNameEmailPassword("수정2 김보영", "수정2kby@naver.com", "수정2 1234");
        getsetMember1.changeNameEmailPassword("수정3 김보영", "수정3kby@naver.com", "수정3 1234");

        for (Member member : memberArray) {
            member.showinfo();
        }
    }
}
