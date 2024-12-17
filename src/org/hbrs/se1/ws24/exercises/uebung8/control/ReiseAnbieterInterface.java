package org.hbrs.se1.ws24.exercises.uebung8.control;

import org.hbrs.se1.ws24.exercises.uebung8.model.QueryObject;
import org.hbrs.se1.ws24.exercises.uebung8.model.QueryResult;

public interface ReiseAnbieterInterface {
    public QueryResult executeQuery(QueryObject queryObject);
}
