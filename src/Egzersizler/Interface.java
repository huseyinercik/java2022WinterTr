package Egzersizler;

public interface Interface {
    String x="d";
    void toplama();
    default void carpma(int s,int z){
        int sonuc=s*z;
    }
}
