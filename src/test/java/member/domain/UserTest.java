package test.java.member.domain;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import member.domain.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class UserTest {

    @Test
    void 이름_생성_성공_테스트() {
        assertThatCode(() -> new User("dh"))
                .doesNotThrowAnyException();
    }

    @ParameterizedTest
    @ValueSource(strings = {" ", "", "     "})
    void 이름_공백_예외_테스트(String name) {
        assertThatThrownBy(() -> new User(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR] 이름은 공백일 수 없습니다.");
    }

    @Test
    void 이름_6자_초과일_때_예외_테스트() {
        String invalidName = "masters";

        assertThatThrownBy(() -> new User(invalidName))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR] 이름은 6자를 넘을 수 없습니다.");
    }
}
