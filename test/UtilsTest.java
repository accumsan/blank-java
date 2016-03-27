import com.minhdd.isograd.Utils;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by admin on 27/03/2016.
 */
public class UtilsTest {
    @Test
    public void getFloatsArrayTest1(){
        String line = "48.8580001 2.2910001 48.8800001 2.4040001";
        double[] expected = new double[]{48.8580001, 2.2910001, 48.8800001, 2.4040001};
        assertArrayEquals(expected, Utils.getDoubleArray(line, 4), 0.0000000001);
    }
}
