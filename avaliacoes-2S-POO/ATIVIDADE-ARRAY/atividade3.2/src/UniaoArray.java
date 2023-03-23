import java.util.Arrays;

public class UniaoArray {

    int[] v1 = new int[7], v2 = new int[7], v3 = new int[14];


    public int[] getV1() {
        return v1;
    }

    public void setV1(int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
        this.v1[0] = v1;
        this.v1[1] = v2;
        this.v1[2] = v3;
        this.v1[3] = v4;
        this.v1[4] = v5;
        this.v1[5] = v6;
        this.v1[6] = v7;
    }

    public int[] getV2() {
        return v2;
    }

    public void setV2(int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
        this.v2[0] = v1;
        this.v2[1] = v2;
        this.v2[2] = v3;
        this.v2[3] = v4;
        this.v2[4] = v5;
        this.v2[5] = v6;
        this.v2[6] = v7;
    }

    public int[] getV3() {
        return v3;
    }

    public void setV3(int[] v3) {
        this.v3 = v3;
    }

    public String union() {

        for (int i = 0; i < 7; i++) {
            this.v3[i] = this.v1[i];
            this.v3[i + 7] = this.v2[i];

        }
        return "Array v1: " + Arrays.toString(this.v1) +
                "\n Array v2: " + Arrays.toString(this.v2) +
                "\n Array v3: " + Arrays.toString(this.v3);
    }

}
