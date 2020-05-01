/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agente;

/**
 *
 * @author oswal
 */
public class AgenteSimple {
//
    String percepcionActual; //3 semaforo en verde ,4 semaforo en rojo
    int accion; //1 acelera,2 frenar
    int k, p, x;

    AgenteSimple() {
    }

    public void recibePercepcion(String percep) {
        percepcionActual = percep;
    }

    public String escogeLaMejorAccion(String percepcionActual) {
        String reglas[][] = new String[8][8];
        reglas[1][0] = "checar habitacion";
        reglas[1][1] = "limpiar";//
        reglas[1][2] = "limpiar";
        reglas[1][3] = "limpiar";
        reglas[1][4] = "limpiar";
        reglas[1][4] = "checar habitacion";
        reglas[1][6] = "moverse a otro lado";
        reglas[1][7] = "moverse a otro lado";
        for (k = 1; k < 8; k++) {
            for (p = 0; p < 4; p++) {
                reglas[1][0] = "1";
                reglas[1][1] = "2";
                reglas[1][2] = "2";
                reglas[1][3] = "2";
                reglas[1][4] = "2";
                reglas[1][5] = "1";
                reglas[1][6] = "3";
                reglas[1][7] = "4";
            }
        }
        for (x = 1; x < 8; x++) {
            if (reglas[1][x].equals(percepcionActual)) {
                return percepcionActual;
            }
        }
        return null;
    }

    String interpretaAccion(String accion) {
        if (accion.equals("1")) {
            return ("Percibi la habitacion sucia, por lo tanto limpiare");
        }else if (accion.equals("2")) {
            return ("Percibi la habitacion limpia, por lo tanto no limpiare");
        } else if(accion.equals("3")){
            return ("Percibi la habitacion sucia del lado izquierdo, por lo tanto limpiare");
        }else if(accion.equals("4")){
            return ("Percibi la habitacion sucia del lado derecho, por lo tanto limpiare");
        }
        return ("No sé que hacer, por lo tanto me apago");
    }

    public static void main(String args[]) {

    }

}
