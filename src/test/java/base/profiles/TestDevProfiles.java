package base.profiles;

import base.DemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Dewy on 15.06.2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoApplication.class)
@ActiveProfiles("dev")
public class TestDevProfiles {

    @Autowired
    MySettings mySettings;

    @Test
    public void testProfileDev() throws Exception {
        assertNotNull(mySettings);
        assertEquals("dev", mySettings.msg);
    }
}
