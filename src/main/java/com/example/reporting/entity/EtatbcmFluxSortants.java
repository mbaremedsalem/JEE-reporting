package com.example.reporting.entity;

import jakarta.persistence.*;
import lombok.Builder;


import java.math.BigInteger;
import java.sql.Date;

@Entity
@Table(name = "ETATBCM_FLUX_SORTANTS", schema = "AUBTST", catalog = "")
public class EtatbcmFluxSortants {

    @Id
    @Basic
    @Column(name = "ID")
    private BigInteger id;
    @Basic
    @Column(name = "BENEFICIAIRE")
    private String beneficiaire;
    @Basic
    @Column(name = "DATE_TRANSACTION")
    private Date dateTransaction;
    @Basic
    @Column(name = "DEVISE")
    private String devise;
    @Basic
    @Column(name = "MODE_REGLEMENT")
    private String modeReglement;
    @Basic
    @Column(name = "MONTANT_TRANSACTION")
    private BigInteger montantTransaction;
    @Basic
    @Column(name = "NIF_NNI")
    private String nifNni;
    @Basic
    @Column(name = "NOM_DONNEUR_ORDRE")
    private String nomDonneurOrdre;
    @Basic
    @Column(name = "PAYS")
    private String pays;
    @Basic
    @Column(name = "PRODUIT")
    private String produit;
    @Basic
    @Column(name = "REFERENCE_TRANSACTION")
    private String referenceTransaction;
    @Basic
    @Column(name = "SOURCE_DEVISE")
    private String sourceDevise;
    @Basic
    @Column(name = "TAUX_CHANGE")
    private BigInteger tauxChange;
    @Basic
    @Column(name = "TYPE_SWIFT")
    private String typeSwift;
    @Basic
    @Column(name = "BANQUE")
    private String banque;
    @Basic
    @Column(name = "NATUREECONOMIQUE")
    private String natureeconomique;
    @Basic
    @Column(name = "NATURE_ECONOMIQUE")
    private String natureEconomique;




    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getBeneficiaire() {
        return beneficiaire;
    }

    public void setBeneficiaire(String beneficiaire) {
        this.beneficiaire = beneficiaire;
    }

    public Date getDateTransaction() {
        return dateTransaction;
    }

    public void setDateTransaction(Date dateTransaction) {
        this.dateTransaction = dateTransaction;
    }

    public String getDevise() {
        return devise;
    }

    public void setDevise(String devise) {
        this.devise = devise;
    }

    public String getModeReglement() {
        return modeReglement;
    }

    public void setModeReglement(String modeReglement) {
        this.modeReglement = modeReglement;
    }

    public BigInteger getMontantTransaction() {
        return montantTransaction;
    }

    public void setMontantTransaction(BigInteger montantTransaction) {
        this.montantTransaction = montantTransaction;
    }

    public String getNifNni() {
        return nifNni;
    }

    public void setNifNni(String nifNni) {
        this.nifNni = nifNni;
    }

    public String getNomDonneurOrdre() {
        return nomDonneurOrdre;
    }

    public void setNomDonneurOrdre(String nomDonneurOrdre) {
        this.nomDonneurOrdre = nomDonneurOrdre;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getProduit() {
        return produit;
    }

    public void setProduit(String produit) {
        this.produit = produit;
    }

    public String getReferenceTransaction() {
        return referenceTransaction;
    }

    public void setReferenceTransaction(String referenceTransaction) {
        this.referenceTransaction = referenceTransaction;
    }

    public String getSourceDevise() {
        return sourceDevise;
    }

    public void setSourceDevise(String sourceDevise) {
        this.sourceDevise = sourceDevise;
    }

    public BigInteger getTauxChange() {
        return tauxChange;
    }

    public void setTauxChange(BigInteger tauxChange) {
        this.tauxChange = tauxChange;
    }

    public String getTypeSwift() {
        return typeSwift;
    }

    public void setTypeSwift(String typeSwift) {
        this.typeSwift = typeSwift;
    }

    public String getBanque() {
        return banque;
    }

    public void setBanque(String banque) {
        this.banque = banque;
    }

    public String getNatureeconomique() {
        return natureeconomique;
    }

    public void setNatureeconomique(String natureeconomique) {
        this.natureeconomique = natureeconomique;
    }

    public String getNatureEconomique() {
        return natureEconomique;
    }

    public void setNatureEconomique(String natureEconomique) {
        this.natureEconomique = natureEconomique;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EtatbcmFluxSortants that = (EtatbcmFluxSortants) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (beneficiaire != null ? !beneficiaire.equals(that.beneficiaire) : that.beneficiaire != null) return false;
        if (dateTransaction != null ? !dateTransaction.equals(that.dateTransaction) : that.dateTransaction != null)
            return false;
        if (devise != null ? !devise.equals(that.devise) : that.devise != null) return false;
        if (modeReglement != null ? !modeReglement.equals(that.modeReglement) : that.modeReglement != null)
            return false;
        if (montantTransaction != null ? !montantTransaction.equals(that.montantTransaction) : that.montantTransaction != null)
            return false;
        if (nifNni != null ? !nifNni.equals(that.nifNni) : that.nifNni != null) return false;
        if (nomDonneurOrdre != null ? !nomDonneurOrdre.equals(that.nomDonneurOrdre) : that.nomDonneurOrdre != null)
            return false;
        if (pays != null ? !pays.equals(that.pays) : that.pays != null) return false;
        if (produit != null ? !produit.equals(that.produit) : that.produit != null) return false;
        if (referenceTransaction != null ? !referenceTransaction.equals(that.referenceTransaction) : that.referenceTransaction != null)
            return false;
        if (sourceDevise != null ? !sourceDevise.equals(that.sourceDevise) : that.sourceDevise != null) return false;
        if (tauxChange != null ? !tauxChange.equals(that.tauxChange) : that.tauxChange != null) return false;
        if (typeSwift != null ? !typeSwift.equals(that.typeSwift) : that.typeSwift != null) return false;
        if (banque != null ? !banque.equals(that.banque) : that.banque != null) return false;
        if (natureeconomique != null ? !natureeconomique.equals(that.natureeconomique) : that.natureeconomique != null)
            return false;
        if (natureEconomique != null ? !natureEconomique.equals(that.natureEconomique) : that.natureEconomique != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (beneficiaire != null ? beneficiaire.hashCode() : 0);
        result = 31 * result + (dateTransaction != null ? dateTransaction.hashCode() : 0);
        result = 31 * result + (devise != null ? devise.hashCode() : 0);
        result = 31 * result + (modeReglement != null ? modeReglement.hashCode() : 0);
        result = 31 * result + (montantTransaction != null ? montantTransaction.hashCode() : 0);
        result = 31 * result + (nifNni != null ? nifNni.hashCode() : 0);
        result = 31 * result + (nomDonneurOrdre != null ? nomDonneurOrdre.hashCode() : 0);
        result = 31 * result + (pays != null ? pays.hashCode() : 0);
        result = 31 * result + (produit != null ? produit.hashCode() : 0);
        result = 31 * result + (referenceTransaction != null ? referenceTransaction.hashCode() : 0);
        result = 31 * result + (sourceDevise != null ? sourceDevise.hashCode() : 0);
        result = 31 * result + (tauxChange != null ? tauxChange.hashCode() : 0);
        result = 31 * result + (typeSwift != null ? typeSwift.hashCode() : 0);
        result = 31 * result + (banque != null ? banque.hashCode() : 0);
        result = 31 * result + (natureeconomique != null ? natureeconomique.hashCode() : 0);
        result = 31 * result + (natureEconomique != null ? natureEconomique.hashCode() : 0);
        return result;
    }
}

