package org.hbrs.se1.ws24.exercises.uebung9;

import java.io.UnsupportedEncodingException;

public class TextDocument extends CoreDocument {
    private String text;
    private Encoding encoding;

    public TextDocument(String text, Encoding encoding) {
        this.text = text;
        this.encoding = encoding;

    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Encoding getEncoding() {
        return encoding;
    }

    public void setEncoding(Encoding encoding) {
        this.encoding = encoding;
    }

    @Override
    public void setDocumentId(Integer documentId) {
        super.setDocumentId(documentId);
    }

    @Override
    public Integer getDocumentID() {
        return super.getDocumentID();
    }

    public enum Encoding {

        UTF8("UTF-8"), UTF16("UTF-16"), UTF32("UTF-32");

        private String value;

        Encoding(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

    }

    @Override
    public Integer traverse() {
        try {
            byte[] traverseResult = text.getBytes(encoding.getValue());
            return traverseResult.length;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return super.traverse();
        }
    }
}
