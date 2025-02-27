package gmbs;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RandomNumberTest {
    @Test
    @DisplayName("1~9 사이 랜덤 숫자 생성 테스트")
    void RandomTest() {
        RandomNumber randomNumber = new RandomNumber();
        List<Integer> test = randomNumber.create();
        assertThat(3).isEqualTo(test.size());
    }
}
