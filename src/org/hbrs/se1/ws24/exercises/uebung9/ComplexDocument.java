package org.hbrs.se1.ws24.exercises.uebung9;

import java.util.ArrayList;

public class ComplexDocument implements Document {
    private ArrayList<Document> documentArray;

    public ComplexDocument() {
        documentArray = new ArrayList<Document>();
    }

    public void addDocument(Document document) {
        documentArray.add(document);
    }

    public void deleteDocument(Document document) {
        documentArray.remove(document);
    }

    @Override
    public Integer getDocumentID() {
        Integer summOfDocumentId = 0;
        for (Document document : documentArray) {
            summOfDocumentId += document.getDocumentID();
        }
        return summOfDocumentId;
    }

    @Override
    public void setDocumentId(Integer documentId) {
        for (Document document : documentArray) {
            document.setDocumentId(documentId);
        }
    }

    @Override
    public Integer traverse() {
        Integer summOfbytes = 0;
        for (Document document : documentArray) {
            summOfbytes += document.traverse();
        }
        return summOfbytes;
    }
}
