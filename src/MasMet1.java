/**
 * Created by Devil Trigger S on 14.10.2014.
 */
public class MasMet1 {
    public static void MyFanction(int[] xx, int[] yy, int[] zz, int dd) {
        for (int i = 0; i < xx.length; i++) {
            zz[i] = xx[i];
            dd = xx.length;
        }
        for (int i = 0; i < yy.length; i++) {
            zz[dd] = yy[i];
            dd++;
        }
    }

    public static void main(String[] args) {
        int d = 0;
        int[] x = {2, 3, 4};
        int[] y = {7, 6};
        int[] z = new int[x.length + y.length];
        MyFanction(x, y, z, d);
        for (int i = 0; i < z.length; i++) System.out.println(z[i]);
    }
}
