package hello.aop.internalcall;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CallServiceV1 {
    /*
    스프링부트 2.6부터 순환참조를 금지함
    허용하고 싶으면 spring.main.allow-circular-references=true 옵션이 필요함.
    */

//    private CallServiceV1 callServiceV1;
//
//    @Autowired
//    public void setCallServiceV1(CallServiceV1 callServiceV1) {
//        this.callServiceV1 = callServiceV1;
//    }
//
//    public void external() {
//        log.info("call external");
//        callServiceV1.internal();
//    }
//
//    public void internal() {
//        log.info("call internal");
//    }
}
