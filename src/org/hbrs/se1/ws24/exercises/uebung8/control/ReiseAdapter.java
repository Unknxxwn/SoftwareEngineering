package org.hbrs.se1.ws24.exercises.uebung8.control;

import org.hbrs.se1.ws24.exercises.uebung8.model.QueryObject;
import org.hbrs.se1.ws24.exercises.uebung8.model.QueryResult;
import org.hbrs.se1.ws24.exercises.uebung8.model.SuchAuftrag;
import org.hbrs.se1.ws24.exercises.uebung8.model.SuchErgebnis;

public class ReiseAdapter implements SuchInterface {
    private ReiseAnbieter reiseAnbieter;

    public ReiseAdapter() {
        this.reiseAnbieter = new ReiseAnbieter();
    }

    @Override
    public SuchErgebnis suche(SuchAuftrag suchAuftrag) {

        return convertOutbound(reiseAnbieter.executeQuery(convertInbound(suchAuftrag)));
    }

    private QueryObject convertInbound(SuchAuftrag suchAuftrag) {
        return new QueryObject();
    }

    private SuchErgebnis convertOutbound(QueryResult queryResult) {
        return new SuchErgebnis();
    }
}
