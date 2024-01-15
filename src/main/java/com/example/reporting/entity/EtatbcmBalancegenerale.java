package com.example.reporting.entity;

import jakarta.persistence.*;

import java.math.BigInteger;

@Entity
@Table(name = "ETATBCM_BALANCEGENERALE", schema = "AUBTST", catalog = "")
public class EtatbcmBalancegenerale {

    @Basic
    @Column(name = "NCG")
    private String ncg;
    @Basic
    @Column(name = "DEVISE")
    private String devise;
    @Basic
    @Column(name = "CPTNB")
    private BigInteger cptnb;
    @Basic
    @Column(name = "CPTNBDB")
    private BigInteger cptnbdb;
    @Basic
    @Column(name = "CPTNBCR")
    private BigInteger cptnbcr;
    @Basic
    @Column(name = "SLDDEVDB")
    private BigInteger slddevdb;
    @Basic
    @Column(name = "SLDDEVCR")
    private BigInteger slddevcr;
    @Basic
    @Column(name = "CPTMDEVDB")
    private BigInteger cptmdevdb;
    @Basic
    @Column(name = "CPTMDEVCR")
    private BigInteger cptmdevcr;
    @Id
    @GeneratedValue
    private Long id;

    public String getNcg() {
        return ncg;
    }

    public void setNcg(String ncg) {
        this.ncg = ncg;
    }

    public String getDevise() {
        return devise;
    }

    public void setDevise(String devise) {
        this.devise = devise;
    }

    public BigInteger getCptnb() {
        return cptnb;
    }

    public void setCptnb(BigInteger cptnb) {
        this.cptnb = cptnb;
    }

    public BigInteger getCptnbdb() {
        return cptnbdb;
    }

    public void setCptnbdb(BigInteger cptnbdb) {
        this.cptnbdb = cptnbdb;
    }

    public BigInteger getCptnbcr() {
        return cptnbcr;
    }

    public void setCptnbcr(BigInteger cptnbcr) {
        this.cptnbcr = cptnbcr;
    }

    public BigInteger getSlddevdb() {
        return slddevdb;
    }

    public void setSlddevdb(BigInteger slddevdb) {
        this.slddevdb = slddevdb;
    }

    public BigInteger getSlddevcr() {
        return slddevcr;
    }

    public void setSlddevcr(BigInteger slddevcr) {
        this.slddevcr = slddevcr;
    }

    public BigInteger getCptmdevdb() {
        return cptmdevdb;
    }

    public void setCptmdevdb(BigInteger cptmdevdb) {
        this.cptmdevdb = cptmdevdb;
    }

    public BigInteger getCptmdevcr() {
        return cptmdevcr;
    }

    public void setCptmdevcr(BigInteger cptmdevcr) {
        this.cptmdevcr = cptmdevcr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EtatbcmBalancegenerale that = (EtatbcmBalancegenerale) o;

        if (ncg != null ? !ncg.equals(that.ncg) : that.ncg != null) return false;
        if (devise != null ? !devise.equals(that.devise) : that.devise != null) return false;
        if (cptnb != null ? !cptnb.equals(that.cptnb) : that.cptnb != null) return false;
        if (cptnbdb != null ? !cptnbdb.equals(that.cptnbdb) : that.cptnbdb != null) return false;
        if (cptnbcr != null ? !cptnbcr.equals(that.cptnbcr) : that.cptnbcr != null) return false;
        if (slddevdb != null ? !slddevdb.equals(that.slddevdb) : that.slddevdb != null) return false;
        if (slddevcr != null ? !slddevcr.equals(that.slddevcr) : that.slddevcr != null) return false;
        if (cptmdevdb != null ? !cptmdevdb.equals(that.cptmdevdb) : that.cptmdevdb != null) return false;
        if (cptmdevcr != null ? !cptmdevcr.equals(that.cptmdevcr) : that.cptmdevcr != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ncg != null ? ncg.hashCode() : 0;
        result = 31 * result + (devise != null ? devise.hashCode() : 0);
        result = 31 * result + (cptnb != null ? cptnb.hashCode() : 0);
        result = 31 * result + (cptnbdb != null ? cptnbdb.hashCode() : 0);
        result = 31 * result + (cptnbcr != null ? cptnbcr.hashCode() : 0);
        result = 31 * result + (slddevdb != null ? slddevdb.hashCode() : 0);
        result = 31 * result + (slddevcr != null ? slddevcr.hashCode() : 0);
        result = 31 * result + (cptmdevdb != null ? cptmdevdb.hashCode() : 0);
        result = 31 * result + (cptmdevcr != null ? cptmdevcr.hashCode() : 0);
        return result;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
