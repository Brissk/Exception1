import java.io.FileReader;
import java.io.IOException;

//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
public class Task1 {
    public static void main(String[] args) throws IOException {
        int []array = {1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7};
        num(array);
        str();
        mine();
    }

    static void num(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i+1] = 0;
        }
    }

    static void str(){
        String  s = "90O0";
        Integer.parseInt(s);

        System.out.println(s);
    }

    static void mine() throws IOException {
        FileReader fr = new FileReader("file-1");
        fr.read();
    }
}
