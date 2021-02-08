package net.barakiroth.java14barebone;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThatCode;

@ExtendWith(MockitoExtension.class)
public class MainTest {

    @Mock
    private X_Code mockedXCode;

    @Test
    public void when_x_then_y() {
        assertThatCode(() -> Main.main("Hello ", "world!")).doesNotThrowAnyException();
    }
}
