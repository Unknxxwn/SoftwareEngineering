package org.hbrs.se1.ws24.exercises.uebung9;

public class TestClient {
    public void start() {
        ComplexDocument doc1 = new ComplexDocument();
        doc1.setDocumentId(1);
        TextDocument doc2 = new TextDocument("Die Klasur im Fach SE findet bald statt!", TextDocument.Encoding.UTF8);
        doc2.setDocumentId(2);
        ComplexDocument doc3 = new ComplexDocument();
        doc3.setDocumentId(3);
        GraficDocument doc4 = new GraficDocument("localhost:8080");
        doc4.setDocumentId(4);
        TextDocument doc5 = new TextDocument(
                "Software Engineering I ist eine Vorlesung in den Studiengengen BIS und BCS",
                TextDocument.Encoding.UTF32);
        doc5.setDocumentId(5);

        doc1.addDocument(doc2);
        doc1.addDocument(doc3);
        doc1.addDocument(doc4);
        doc3.addDocument(doc5);

        System.out.println(doc1.getDocumentID());

        System.out.println(doc1.traverse());

    }
}
