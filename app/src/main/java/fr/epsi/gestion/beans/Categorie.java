package fr.epsi.gestion.beans;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Categorie implements Serializable {

    @SerializedName("reference_categorie")
    private int ref_categorie;

    @SerializedName("nom")
    private String nom;

    @SerializedName("description")
    private String description;

    public Categorie() {
    }

    public Categorie(String nom, String description) {
        this.nom = nom;
        this.description = description;
    }

    public Categorie(int ref_categorie, String nom, String description) {
        this.ref_categorie = ref_categorie;
        this.nom = nom;
        this.description = description;
    }

    public int getRef_categorie() {
        return ref_categorie;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
