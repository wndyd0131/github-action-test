package hello.core.singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import static org.junit.jupiter.api.Assertions.*;

class StatefulServiceTest {
    @Test
    void statefulServiceSingleton() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class); //컨테이너
        StatefulService statefulService1 = ac.getBean(StatefulService.class);
        StatefulService statefulService2 = ac.getBean(StatefulService.class);

        //ThreadA
        int userAPrice = statefulService1.order("userA", 10000);
        //ThreadB
        int userBPrice = statefulService2.order("userB", 20000);

//        int price = statefulService1.getPrice();
//        Assertions.assertThat(statefulService1.getPrice()).isEqualTo(20000);
        Assertions.assertThat(userAPrice).isEqualTo(10000);
        // 사용자2에 의해 price 값이 바뀜
        // 변경후: 이제 10000원으로 유지 잘 됨
    }

    static class TestConfig {
        @Bean
        public StatefulService statefulService() {
            return new StatefulService();
        }
    }
}