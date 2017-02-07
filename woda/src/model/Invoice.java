package model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Invoice {
    StringProperty ID;
    LocalDate issueDate;
    LocalDate saleDate;
    StringProperty issuePlace;
    Client client;
    List<InvoicePosition> positions;
//-----------------------------------------
//
//constructors
//
//-----------------------------------------
    public Invoice() {
        ID = new SimpleStringProperty();

        issueDate = LocalDate.now();
        saleDate = issueDate;
        issuePlace = new SimpleStringProperty();
        client = null;
        positions = new ArrayList<>();
    }

    public Invoice(Client client) {
        this();
        this.client = client;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public LocalDate getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(LocalDate saleDate) {
        this.saleDate = saleDate;
    }

    public String getIssuePlace() {
        return issuePlace.get();
    }

    public StringProperty issuePlaceProperty() {
        return issuePlace;
    }

    public void setIssuePlace(String issuePlace) {
        this.issuePlace.set(issuePlace);
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<InvoicePosition> getPositions() {
        return positions;
    }

    public void setPositions(List<InvoicePosition> positions) {
        this.positions = positions;
    }

    public String getID() {
        return ID.get();
    }

    public StringProperty IDProperty() {
        return ID;
    }

    public void setID(String ID) {
        this.ID.set(ID);
    }
}
