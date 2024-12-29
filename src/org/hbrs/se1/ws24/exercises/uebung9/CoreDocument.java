package org.hbrs.se1.ws24.exercises.uebung9;

public abstract class CoreDocument implements Document {

    private Integer documentId;

    @Override
    public Integer getDocumentID() {
        return documentId;
    }

    @Override
    public void setDocumentId(Integer documentId) {
        this.documentId = documentId;
    }

    @Override
    public Integer traverse() {
        return 0;
    }

}
