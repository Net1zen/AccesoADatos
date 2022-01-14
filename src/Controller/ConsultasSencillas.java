/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Classes.Jugador;
import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.Objects;
import org.neodatis.odb.core.query.IQuery;
import org.neodatis.odb.core.query.criteria.Where;
import org.neodatis.odb.impl.core.query.criteria.CriteriaQuery;

/**
 *
 * @author IFC
 */
public class ConsultasSencillas {

    public static void main(String[] args) {
        ODB objectDataBase = ODBFactory.open("neodatis.test");

        IQuery query = new CriteriaQuery(Jugador.class, Where.equal("deporte", "Fútbol"));
        query.orderByAsc("nombre,edad");

        Objects<Jugador> jugadores = objectDataBase.getObjects(query); // Obtener todos los jugadores
        Jugador jugador = (Jugador) objectDataBase.getObjects(query).getFirst(); // Obtener el primer jugador
        for(Jugador j : jugadores){
            System.out.println(jugador.getNombre());
        }
        objectDataBase.close();
    }
}
