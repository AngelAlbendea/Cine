package cine;

public class Vista {

    public static void showMenu() {
        System.out.println("1. Consultar butacas de una sala. \n"
                + "2. Consultar pelicula sala. \n"
                + "3. Consultar cartelera. \n"
                + "4. Vender entradas. \n"
                + "5. Liberar butacas. \n"
                + "0. Salir.");
    }

    public static int leerOpcion() {
        return Utils.readUnsignedInt();
    }

    public static int leerSala() {
        int sala = 0;
        System.out.println("Introduce nº de sala");
        do {
            sala = Utils.readUnsignedInt();
        } while (sala < 1 || sala > 4);
        return sala;
    }

    public static void showButaca(Butaca butaca) {
        System.out.println("Fila: " + butaca.getFila());
        System.out.println("Número: " + butaca.getNumero());
        System.out.println("Estado: " + (butaca.isLibre() ? "Libre" : "Ocupada"));
    }
    
    public static void showTituloPelicula(String pelicula){
        //System.out.println(pelicula!=null ? pelicula : "No hay pelicula");//// Forma mas efectiva de hacerlo.
        if (pelicula != null) {
            System.out.println(pelicula);
        }else{
            System.out.println("No hay pelicula");
        }
    }
}
