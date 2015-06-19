package base.aspects.performance;

/**
 * Created by Dewy on 17.06.2015.
 */
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Audience {

    @Pointcut("execution(** Performance.perform(..))")
    public void performance() {}

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint jp) {
        try {
            System.out.println("Around before");
            jp.proceed();
            System.out.println("Around after");
        } catch (Throwable e) {
            System.out.println("Demanding a refund");
        }
    }

    @Before("execution(** Performance.perform(..))")
    public void silenceCellPhones() {
        System.out.println("Silencing cell phones");
    }

    @Before("execution(** Performance.perform(..))")
    public void takeSeats() {
        System.out.println("Taking seats");
    }
    @AfterReturning("execution(** Performance.perform(..))")
    public void applause() {
        System.out.println("CLAP CLAP CLAP!!!");
    }
    @AfterThrowing("execution(** Performance.perform(..))")
    public void demandRefund() {
        System.out.println("Demanding a refund");
    }
}
