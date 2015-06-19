package base.aspects.performance;

import org.springframework.stereotype.Component;

/**
 * Created by Dewy on 17.06.2015.
 */
@Component
public class PerformanceImpl implements Performance {

    @Override
    public void perform() {
        System.out.println("Performance work");
    }
}
