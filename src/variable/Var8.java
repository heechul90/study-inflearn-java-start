package variable;

public class Var8 {
    public static void main(String[] args) {
        //정수
        //-128 ~ 127 : 2의 2승
        byte b = 127;

        //-32768 ~ 32767 : 2의 16승
        short s = 32767;

        //-2147483648 ~ 2147483647 (약 20억) : 2의 32승
        int i = 2147483647;

        //-9223372036854775808 ~ 9223372036854775807 : 2의 64승
        long l = 9223372036854775807L;

        //실수
        float f = 10.0f;
        double d = 10.0;
    }
}
