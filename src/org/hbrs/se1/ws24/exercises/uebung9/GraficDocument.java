package org.hbrs.se1.ws24.exercises.uebung9;

public class GraficDocument extends CoreDocument {
    private String url;

    public GraficDocument(String url) {
        this.url = url;
    }

    @Override
    public void setDocumentId(Integer documentId) {
        super.setDocumentId(documentId);
    }

    @Override
    public Integer getDocumentID() {
        return super.getDocumentID();
    }

    @Override
    public Integer traverse() {
        return 1200;
    }

    public String getUrl() {
        return url;
    }
}
