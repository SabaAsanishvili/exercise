import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A {

    protected int x;

    public A(){
        System.out.println("Hello");
    }

    public void method1() throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        x = reader.read();
    }

    public void method2(){
        System.out.println(x + 12);
    }

    /**
     *
     * @return true if x is even or false otherwise
     */
    public boolean method3(){
        return x % 2 == 0;
    }

}
