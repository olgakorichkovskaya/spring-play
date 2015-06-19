package base.aspects.disk;

import org.springframework.stereotype.Component;

/**
 * Created by Dewy on 18.06.2015.
 */
@Component
public class CompactDiscImpl {

    public void playTrack(int count) {
        System.out.println("Play track "+count+" times");
    }
}
