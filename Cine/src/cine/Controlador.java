package cine;

import java.util.ArrayList;

public class Controlador {

    public void run() {  
        Cine cine = new Cine("","");
        int opc; 

        do {
            Vista.showMenu();
            opc = Vista.leerOpcion();
            switch (opc) {
                case 1:
                    ArrayList<Butaca> butacas =  cine.listarButacasSala(Vista.leerSala());
                    for (Butaca butaca : butacas) {
                        Vista.showButaca(butaca);
                    }
                    break;
                case 2:
                  Vista.showTituloPelicula(cine.buscarPeliculaSala(Vista.leerSala()));
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                default:
                    break;
            }
        } while (opc!=0);
    }

}
