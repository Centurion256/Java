import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console {
    BufferedReader br;

    public Console(){
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public String readLine(){
        try{
            return br.readLine();
        }catch(IOException e)
        {
            return null;
        }
    }

}
