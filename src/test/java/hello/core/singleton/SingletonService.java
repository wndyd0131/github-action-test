package hello.core.singleton;

public class SingletonService {
    private static final SingletonService instance = new SingletonService(); // 자기 자신을 하나로 생성

    public static SingletonService getInstance() { // 이 메서드로만 호출 가능
        return instance;
    }

    private SingletonService(){

    }

    public static void main(String[] args) {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
