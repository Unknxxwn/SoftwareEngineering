package test.org.hbrs.se1.ws24.tests.uebung9;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.hbrs.se1.ws24.exercises.uebung9.ComplexDocument;
import org.hbrs.se1.ws24.exercises.uebung9.GraficDocument;
import org.hbrs.se1.ws24.exercises.uebung9.TextDocument;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DocumentTest {
    private TextDocument doc2;
    private GraficDocument doc4;
    private TextDocument doc5;
    private ComplexDocument doc1;
    private ComplexDocument doc3;

    // arrange
    @BeforeEach
    public void initialize() {
        // creating Leafs
        doc2 = new TextDocument("Die Klausur im Fach SE findet bald statt!", TextDocument.Encoding.UTF8);
        doc4 = new GraficDocument("localhost:8080");
        doc5 = new TextDocument("Software Engineering I ist eine Vorlesung in den Studiengaengen BIS und BCS",
                TextDocument.Encoding.UTF32);
        // creating Compounds
        doc1 = new ComplexDocument();
        doc3 = new ComplexDocument();
    }

    // act
    // assert
    @Test
    public void getURL() {
        // act
        // assert
        assertEquals("localhost8080", doc4.getUrl());
    }

    @Test
    public void getText() {
        // act
        // assert
        assertEquals("Die Klausur im Fach SE findet bald statt!", doc2.getText());
    }

    @Test
    public void setIDAndgetID() {
        // act
        doc2.setDocumentId(2);
        // assert
        assertEquals(2, doc2.getDocumentID());
    }

    @Test
    public void addLeafToCompound() {
        // arrange
        // act
        doc2.setDocumentId(78);
        doc1.addDocument(doc2);
        // assert
        assertEquals(78, doc1.getDocumentID());

    }

    @Test
    public void correctTraverse() {
        // act

        doc1.addDocument(doc2);
        doc1.addDocument(doc3);
        doc3.addDocument(doc5);
        doc3.addDocument(doc4);
        // assert
        assertEquals(1541, doc1.traverse());
    }
}
