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
import org.neodatis.odb.core.oid.OIDFactory;

/**
 *
 * @author IFC
 */
public class Delete {
    
    public static void main(String[] args){
        ODB objectDataBase = ODBFactory.open("neodatis.test");
        
        OID oid = OIDFactory.buildObjectOID(2); // Obtener objeto con oid2
        Jugador jugador = (Jugador) objectDataBase.getObjectFromId(oid);
        
        objectDataBase.delete(jugador);
        objectDataBase.close();
    }
}
