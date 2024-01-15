package com.example.reporting.entity;

import jakarta.persistence.*;

import java.math.BigInteger;
import java.sql.Date;

@Entity
@Table(name = "ETATBCM_FLUX_ENTRANTS", schema = "AUBTST", catalog = "")
public class EtatbcmFluxEntrants {
    @Id
    @Basic
    @Column(name = "ID")
    private BigInteger id;
    @Basic
    @Column(name = "BANQUE")
    private String banque;
    @Basic
    @Column(name = "REFERENCETRANSACTION")
    private String referencetransaction;
    @Basic
    @Column(name = "DATETRANSACTION")
    private Date datetransaction;
    @Basic
    @Column(name = "TYPESWFIT")
    private String typeswfit;
    @Basic
    @Column(name = "MODEREGLEMENT")
    private String modereglement;
    @Basic
    @Column(name = "DEVISE")
    private String devise;
    @Basic
    @Column(name = "MONTANTTRANSACTION")
    private BigInteger montanttransaction;
    @Basic
    @Column(name = "TAUXDECHANGE")
    private BigInteger tauxdechange;
    @Basic
    @Column(name = "NOMDONNEURORDRE")
    private String nomdonneurordre;
    @Basic
    @Column(name = "NIF_NNI")
    private String nifNni;
    @Basic
    @Column(name = "BENEFICIAIRE")
    private String beneficiaire;
    @Basic
    @Column(name = "PRODUIT")
    private String produit;
    @Basic
    @Column(name = "NATUREECONOMIQUE")
    private String natureeconomique;
    @Basic
    @Column(name = "PAYS")
    private String pays;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getBanque() {
        return banque;
    }

    public void setBanque(String banque) {
        this.banque = banque;
    }

    public String getReferencetransaction() {
        return referencetransaction;
    }

    public void setReferencetransaction(String referencetransaction) {
        this.referencetransaction = referencetransaction;
    }

    public Date getDatetransaction() {
        return datetransaction;
    }

    public void setDatetransaction(Date datetransaction) {
        this.datetransaction = datetransaction;
    }

    public String getTypeswfit() {
        return typeswfit;
    }

    public void setTypeswfit(String typeswfit) {
        this.typeswfit = typeswfit;
    }

    public String getModereglement() {
        return modereglement;
    }

    public void setModereglement(String modereglement) {
        this.modereglement = modereglement;
    }

    public String getDevise() {
        return devise;
    }

    public void setDevise(String devise) {
        this.devise = devise;
    }

    public BigInteger getMontanttransaction() {
        return montanttransaction;
    }

    public void setMontanttransaction(BigInteger montanttransaction) {
        this.montanttransaction = montanttransaction;
    }

    public BigInteger getTauxdechange() {
        return tauxdechange;
    }

    public void setTauxdechange(BigInteger tauxdechange) {
        this.tauxdechange = tauxdechange;
    }

    public String getNomdonneurordre() {
        return nomdonneurordre;
    }

    public void setNomdonneurordre(String nomdonneurordre) {
        this.nomdonneurordre = nomdonneurordre;
    }

    public String getNifNni() {
        return nifNni;
    }

    public void setNifNni(String nifNni) {
        this.nifNni = nifNni;
    }

    public String getBeneficiaire() {
        return beneficiaire;
    }

    public void setBeneficiaire(String beneficiaire) {
        this.beneficiaire = beneficiaire;
    }

    public String getProduit() {
        return produit;
    }

    public void setProduit(String produit) {
        this.produit = produit;
    }

    public String getNatureeconomique() {
        return natureeconomique;
    }

    public void setNatureeconomique(String natureeconomique) {
        this.natureeconomique = natureeconomique;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EtatbcmFluxEntrants that = (EtatbcmFluxEntrants) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (banque != null ? !banque.equals(that.banque) : that.banque != null) return false;
        if (referencetransaction != null ? !referencetransaction.equals(that.referencetransaction) : that.referencetransaction != null)
            return false;
        if (datetransaction != null ? !datetransaction.equals(that.datetransaction) : that.datetransaction != null)
            return false;
        if (typeswfit != null ? !typeswfit.equals(that.typeswfit) : that.typeswfit != null) return false;
        if (modereglement != null ? !modereglement.equals(that.modereglement) : that.modereglement != null)
            return false;
        if (devise != null ? !devise.equals(that.devise) : that.devise != null) return false;
        if (montanttransaction != null ? !montanttransaction.equals(that.montanttransaction) : that.montanttransaction != null)
            return false;
        if (tauxdechange != null ? !tauxdechange.equals(that.tauxdechange) : that.tauxdechange != null) return false;
        if (nomdonneurordre != null ? !nomdonneurordre.equals(that.nomdonneurordre) : that.nomdonneurordre != null)
            return false;
        if (nifNni != null ? !nifNni.equals(that.nifNni) : that.nifNni != null) return false;
        if (beneficiaire != null ? !beneficiaire.equals(that.beneficiaire) : that.beneficiaire != null) return false;
        if (produit != null ? !produit.equals(that.produit) : that.produit != null) return false;
        if (natureeconomique != null ? !natureeconomique.equals(that.natureeconomique) : that.natureeconomique != null)
            return false;
        if (pays != null ? !pays.equals(that.pays) : that.pays != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (banque != null ? banque.hashCode() : 0);
        result = 31 * result + (referencetransaction != null ? referencetransaction.hashCode() : 0);
        result = 31 * result + (datetransaction != null ? datetransaction.hashCode() : 0);
        result = 31 * result + (typeswfit != null ? typeswfit.hashCode() : 0);
        result = 31 * result + (modereglement != null ? modereglement.hashCode() : 0);
        result = 31 * result + (devise != null ? devise.hashCode() : 0);
        result = 31 * result + (montanttransaction != null ? montanttransaction.hashCode() : 0);
        result = 31 * result + (tauxdechange != null ? tauxdechange.hashCode() : 0);
        result = 31 * result + (nomdonneurordre != null ? nomdonneurordre.hashCode() : 0);
        result = 31 * result + (nifNni != null ? nifNni.hashCode() : 0);
        result = 31 * result + (beneficiaire != null ? beneficiaire.hashCode() : 0);
        result = 31 * result + (produit != null ? produit.hashCode() : 0);
        result = 31 * result + (natureeconomique != null ? natureeconomique.hashCode() : 0);
        result = 31 * result + (pays != null ? pays.hashCode() : 0);
        return result;
    }
}
