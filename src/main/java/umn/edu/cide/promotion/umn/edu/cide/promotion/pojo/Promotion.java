package umn.edu.cide.promotion.umn.edu.cide.promotion.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.UUID;

@Document
public class Promotion {
    private @Id String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateActive() {
        return dateActive;
    }

    public void setDateActive(Date dateActive) {
        this.dateActive = dateActive;
    }

    private String name;
    private Date dateActive;

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    private String createdBy;


    public UUID getRevision() {
        return revision;
    }

    public void setRevision(UUID revision) {
        this.revision = revision;
    }

    public boolean isStackable() {
        return stackable;
    }

    public void setStackable(boolean stackable) {
        this.stackable = stackable;
    }

    private boolean stackable;
    private UUID revision;




    public Promotion(String id, String name, Date dateActive, String createdBy, UUID revision, boolean stackable){
        this.id = id;
        this.name = name;
        this.dateActive = dateActive;
        this.createdBy = createdBy;
        this.revision = revision;
        this.stackable = stackable;

    }
}
