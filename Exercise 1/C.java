import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C {

    private int a, b, c;

    public void method1() throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        a = reader.read();
        b = reader.read();;
        c = reader.read();
    }

    public int method2(){
        return a % 10;
    }

    public int method3(){
        return Integer.parseInt(String.valueOf(Integer.toString(a).charAt(0)));
    }

    public int method4(){
        int res = 0;
        int tmp = c;
        while (tmp > 0){
            res += tmp %  10;
            tmp /= 10;
        }
        return res;
    }

    public int method5(){
        return method2() * method3();
    }

    public int method6(){
        return method3() * method5();
    }

}
