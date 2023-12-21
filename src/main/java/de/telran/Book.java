package de.telran;

import lombok.ToString;

@ToString
public class Book {
    private String autor;
    private String name;
    private int issueYear;
    private Condition condition;
    private boolean isEBOOK;

    public Book(String autor, String name, int issueYear, Condition condition, boolean isEBOOK) {
        this.autor = autor;
        this.name = name;
        this.issueYear = issueYear;
        this.condition = condition;
        this.isEBOOK = isEBOOK;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIssueYear() {
        return issueYear;
    }

    public void setIssueYear(int issueYear) {
        this.issueYear = issueYear;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public boolean isEBOOK() {
        return isEBOOK;
    }

    public void setEBOOK(boolean EBOOK) {
        isEBOOK = EBOOK;
    }

//    @Override
//    public String toString() {
//        return "Book{" +
//                "autor='" + autor + '\'' +
//                ", name='" + name + '\'' +
//                ", issueYear=" + issueYear +
//                ", condition=" + condition +
//                ", isEBOOK=" + isEBOOK +
//                '}';
//    }
}
