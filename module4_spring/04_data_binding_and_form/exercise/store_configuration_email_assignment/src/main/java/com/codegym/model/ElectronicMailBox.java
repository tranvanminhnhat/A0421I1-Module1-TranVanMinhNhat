package com.codegym.model;

public class ElectronicMailBox {
    private String language;
    private int size;
    private boolean isSpam;
    private String signature;

    public ElectronicMailBox() {
    }

    public ElectronicMailBox(String language, int size, boolean isSpam, String signature) {
        this.language = language;
        this.size = size;
        this.isSpam = isSpam;
        this.signature = signature;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isSpam() {
        return isSpam;
    }

    public void setSpam(boolean spam) {
        isSpam = spam;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
