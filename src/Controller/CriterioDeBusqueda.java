/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Classes.Jugador;
import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.core.query.IQuery;
import org.neodatis.odb.core.query.criteria.And;
import org.neodatis.odb.core.query.criteria.ICriterion;
import org.neodatis.odb.core.query.criteria.Where;
import org.neodatis.odb.impl.core.query.criteria.CriteriaQuery;

/**
 *
 * @author IFC
 */
public class CriterioDeBusqueda {
    
    public static void main(String[] args){
        
        ODB objectDataBase = ODBFactory.open("neodatis.test");
        
        ICriterion criterio = new And().add(Where.equal("localidad", "Pamplona"))
                .add(Where.equal("edad",11));
        
        IQuery query = new CriteriaQuery(Jugador.class, criterio);
    }
}
