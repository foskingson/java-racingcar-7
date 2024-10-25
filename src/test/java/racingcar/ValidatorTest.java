package racingcar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidatorTest {
    @Test
    void 레이싱카의이름을5자보다길게쓴경우() {
        Assertions.assertThatThrownBy(() -> Validator.validateCarNames(new String[]{"racingcar1", "racingcar2"}))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("경주할 자동차의 이름의 길이는 5자 이하가 되야 합니다.");
    }
}