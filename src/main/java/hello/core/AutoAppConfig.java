package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        basePackages = {"hello.core.member"}, // 해당 이름의 패키지가 대상이 됨
        basePackageClasses = AutoAppConfig.class, // 해당 클래스의 패키지가 대상이 됨 (지정하지 않으면 자신의 패키지가 대상이 됨)
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
) //@Component를 찾아서 등록 (@Configuration도 @Component임)
// 여기서는 @Configuration이 이미 AppConfig에 있기 때문에, @Configuration을 제외한 컴포넌트들을 불러오도록 함
public class AutoAppConfig {
}
