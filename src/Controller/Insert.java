/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Classes.Jugador;
import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.OID;
import org.neodatis.odb.Objects;

/**
 *
 * @author IFC
 */
public class Insert {

    public static void main(String[] args) {
        ODB objectDataBase = ODBFactory.open("neodatis.test");
        Jugador nuevoJugador = new Jugador("Hugo", "Tenis", "Pamplona", 20);
        
        //Almacenar el objeto en bd
        objectDataBase.store(nuevoJugador);

        // Obtener el identificador del objeto, una vez almacenado en bd
        OID objectId = objectDataBase.getObjectId(nuevoJugador); // Esta llamada solo se puede hacer despues de hacer un store
        // Alguna llamada como la anterior entrara en el examen
        System.out.println("Identificador del nuevo jugador: " + objectId);

        Objects<Jugador> jugadores = objectDataBase.getObjects(Jugador.class);
        
        for(Jugador jugador : jugadores){
            System.out.println(jugador.getNombre());
        }
        objectDataBase.close();

    }
}
