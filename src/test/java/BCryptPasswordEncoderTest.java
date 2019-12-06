import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author Xie ZuoZhi
 * @date 2019/6/5 14:11
 */
public class BCryptPasswordEncoderTest {
    @Test
    public void test() {
        System.out.println(new BCryptPasswordEncoder().encode("secret"));
    }
}
