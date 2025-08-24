public class ByteOps {
public static void main(String[] args) {
    byte a = Byte.parseByte(args[0]);
    byte b = Byte.parseByte(args[1]);
    int p = a*b;
    int q = a/b;
    int r = a%b;
    System.out.println(a + "*" + b + "=" + p);
    System.out.println(a + "/" + b + "=" + q);
    System.out.println(a + "%" + b + "=" + r);
    }
}
