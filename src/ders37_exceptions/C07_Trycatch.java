package ders37_exceptions;

public class C07_Trycatch {

    public static void main(String[] args) {
        try {
            calis();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void calis() {
        calis();
        throw new RuntimeException ("Çoook çalış");
    }

}
