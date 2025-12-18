package DataTypes;

public class DataTypeConversion {
    public static void main(String[] args) {
        byte b = 127;         // size : 8 bits        => range : -128 to 127
        short s = 128;        // size : 16 bits
        int i = 10;           // size : 32 bits
        long l = 20;          // size : 64 bits
        float f = 50.12f;     // size : 32 bits
        double d = 100;       // size : 64 bits

        //  data conversion from decimal to integer
        //  Data loss can happen, which can lead to data unprecision
        //  so it has to be handle explicitely
        long dl = (long) d;
        long fl = (long) f;  

        // implcite conversion => larger range can store small range data without data loss
        float lf = l;
        double ld = l;
        double id = i;
        int bi = b;

        // size problem => need to convert explicitly
        byte ib = (byte) i;
        int li =(int) l;
        long il = l;

    }
}
