import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B extends A{
    private int y;

    public void method1() throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        y = reader.read();
    }

    public int method2_1(){
        return super.x + y;
    }

}
