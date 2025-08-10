import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class Ex8 {

    @ParameterizedTest
    @ValueSource(strings = {"my", "name", "is", "jaiswal", "memanasa"})
    void checkAllStringsAreLowerCase(String s) {
    	assertTrue(s.equals(s.toLowerCase()), "Not lowercase " + s);
    }

}
