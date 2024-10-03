public class Main {
    public static void main (String[] args ) {
        COCHE CocheUno = new COCHE("NISSAN", "fiesta", 2011);
        CocheUno.mostrarInformacion();
        CocheUno.calcularEdadDelCoche();
        COCHE CocheDos = new COCHE("FERRARI", "once", 1998 );
        CocheDos.mostrarInformacion();
        CocheDos.calcularEdadDelCoche();
        COCHE CocheTres = new COCHE("BYD", "doce", 2022 );
        CocheTres.mostrarInformacion();
        CocheTres.calcularEdadDelCoche();


    }
}