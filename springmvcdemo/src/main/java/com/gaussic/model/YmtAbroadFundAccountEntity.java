package com.gaussic.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by huwenjing on 2017/3/20.
 */
@Entity
@Table(name = "Ymt_AbroadFundAccount", schema = "dbo", catalog = "YmtRelease")
public class YmtAbroadFundAccountEntity {
    private String sAccountId;
    private String sAccountName;
    private int iAccountType;
    private String sBankName;
    private String sRoutingNum;
    private String sBankAccNum;
    private String sBranchAddress;
    private String sCountry;
    private String sCurrency;
    private int iAction;
    private int iUserId;
    private Timestamp dAddTime;
    private String sExplain;
    private int iOwnerType;
    private Integer iCurrencyType;
    private String sBankCountry;
    private String sBankState;
    private String sBankCity;
    private String sSwiftCode;
    private String sIBanCode;
    private String sReceiverAddress;
    private String sRemark;
    private String fundAccountInvoiceId;
    private String sLoginId;
    private String sLoginEmail;

    @Id
    @Column(name = "sAccountId", nullable = false, length = 36)
    public String getsAccountId() {
        return sAccountId;
    }

    public void setsAccountId(String sAccountId) {
        this.sAccountId = sAccountId;
    }

    @Basic
    @Column(name = "sAccountName", nullable = true, length = 50)
    public String getsAccountName() {
        return sAccountName;
    }

    public void setsAccountName(String sAccountName) {
        this.sAccountName = sAccountName;
    }

    @Basic
    @Column(name = "iAccountType", nullable = false)
    public int getiAccountType() {
        return iAccountType;
    }

    public void setiAccountType(int iAccountType) {
        this.iAccountType = iAccountType;
    }

    @Basic
    @Column(name = "sBankName", nullable = false, length = 100)
    public String getsBankName() {
        return sBankName;
    }

    public void setsBankName(String sBankName) {
        this.sBankName = sBankName;
    }

    @Basic
    @Column(name = "sRoutingNum", nullable = true, length = 50)
    public String getsRoutingNum() {
        return sRoutingNum;
    }

    public void setsRoutingNum(String sRoutingNum) {
        this.sRoutingNum = sRoutingNum;
    }

    @Basic
    @Column(name = "sBankAccNum", nullable = false, length = 50)
    public String getsBankAccNum() {
        return sBankAccNum;
    }

    public void setsBankAccNum(String sBankAccNum) {
        this.sBankAccNum = sBankAccNum;
    }

    @Basic
    @Column(name = "sBranchAddress", nullable = true, length = 200)
    public String getsBranchAddress() {
        return sBranchAddress;
    }

    public void setsBranchAddress(String sBranchAddress) {
        this.sBranchAddress = sBranchAddress;
    }

    @Basic
    @Column(name = "sCountry", nullable = false, length = 20)
    public String getsCountry() {
        return sCountry;
    }

    public void setsCountry(String sCountry) {
        this.sCountry = sCountry;
    }

    @Basic
    @Column(name = "sCurrency", nullable = false, length = 10)
    public String getsCurrency() {
        return sCurrency;
    }

    public void setsCurrency(String sCurrency) {
        this.sCurrency = sCurrency;
    }

    @Basic
    @Column(name = "iAction", nullable = false)
    public int getiAction() {
        return iAction;
    }

    public void setiAction(int iAction) {
        this.iAction = iAction;
    }

    @Basic
    @Column(name = "iUserId", nullable = false)
    public int getiUserId() {
        return iUserId;
    }

    public void setiUserId(int iUserId) {
        this.iUserId = iUserId;
    }

    @Basic
    @Column(name = "dAddTime", nullable = false)
    public Timestamp getdAddTime() {
        return dAddTime;
    }

    public void setdAddTime(Timestamp dAddTime) {
        this.dAddTime = dAddTime;
    }

    @Basic
    @Column(name = "sExplain", nullable = true, length = 200)
    public String getsExplain() {
        return sExplain;
    }

    public void setsExplain(String sExplain) {
        this.sExplain = sExplain;
    }

    @Basic
    @Column(name = "iOwnerType", nullable = false)
    public int getiOwnerType() {
        return iOwnerType;
    }

    public void setiOwnerType(int iOwnerType) {
        this.iOwnerType = iOwnerType;
    }

    @Basic
    @Column(name = "iCurrencyType", nullable = true)
    public Integer getiCurrencyType() {
        return iCurrencyType;
    }

    public void setiCurrencyType(Integer iCurrencyType) {
        this.iCurrencyType = iCurrencyType;
    }

    @Basic
    @Column(name = "sBankCountry", nullable = true, length = 50)
    public String getsBankCountry() {
        return sBankCountry;
    }

    public void setsBankCountry(String sBankCountry) {
        this.sBankCountry = sBankCountry;
    }

    @Basic
    @Column(name = "sBankState", nullable = true, length = 50)
    public String getsBankState() {
        return sBankState;
    }

    public void setsBankState(String sBankState) {
        this.sBankState = sBankState;
    }

    @Basic
    @Column(name = "sBankCity", nullable = true, length = 50)
    public String getsBankCity() {
        return sBankCity;
    }

    public void setsBankCity(String sBankCity) {
        this.sBankCity = sBankCity;
    }

    @Basic
    @Column(name = "sSwiftCode", nullable = true, length = 100)
    public String getsSwiftCode() {
        return sSwiftCode;
    }

    public void setsSwiftCode(String sSwiftCode) {
        this.sSwiftCode = sSwiftCode;
    }

    @Basic
    @Column(name = "sIBanCode", nullable = true, length = 100)
    public String getsIBanCode() {
        return sIBanCode;
    }

    public void setsIBanCode(String sIBanCode) {
        this.sIBanCode = sIBanCode;
    }

    @Basic
    @Column(name = "sReceiverAddress", nullable = true, length = 200)
    public String getsReceiverAddress() {
        return sReceiverAddress;
    }

    public void setsReceiverAddress(String sReceiverAddress) {
        this.sReceiverAddress = sReceiverAddress;
    }

    @Basic
    @Column(name = "sRemark", nullable = true, length = 1000)
    public String getsRemark() {
        return sRemark;
    }

    public void setsRemark(String sRemark) {
        this.sRemark = sRemark;
    }

    @Basic
    @Column(name = "FundAccountInvoiceId", nullable = true, length = 20)
    public String getFundAccountInvoiceId() {
        return fundAccountInvoiceId;
    }

    public void setFundAccountInvoiceId(String fundAccountInvoiceId) {
        this.fundAccountInvoiceId = fundAccountInvoiceId;
    }

    @Basic
    @Column(name = "sLoginId", nullable = true, length = 200)
    public String getsLoginId() {
        return sLoginId;
    }

    public void setsLoginId(String sLoginId) {
        this.sLoginId = sLoginId;
    }

    @Basic
    @Column(name = "sLoginEmail", nullable = true, length = 200)
    public String getsLoginEmail() {
        return sLoginEmail;
    }

    public void setsLoginEmail(String sLoginEmail) {
        this.sLoginEmail = sLoginEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        YmtAbroadFundAccountEntity that = (YmtAbroadFundAccountEntity) o;

        if (iAccountType != that.iAccountType) return false;
        if (iAction != that.iAction) return false;
        if (iUserId != that.iUserId) return false;
        if (iOwnerType != that.iOwnerType) return false;
        if (sAccountId != null ? !sAccountId.equals(that.sAccountId) : that.sAccountId != null) return false;
        if (sAccountName != null ? !sAccountName.equals(that.sAccountName) : that.sAccountName != null) return false;
        if (sBankName != null ? !sBankName.equals(that.sBankName) : that.sBankName != null) return false;
        if (sRoutingNum != null ? !sRoutingNum.equals(that.sRoutingNum) : that.sRoutingNum != null) return false;
        if (sBankAccNum != null ? !sBankAccNum.equals(that.sBankAccNum) : that.sBankAccNum != null) return false;
        if (sBranchAddress != null ? !sBranchAddress.equals(that.sBranchAddress) : that.sBranchAddress != null)
            return false;
        if (sCountry != null ? !sCountry.equals(that.sCountry) : that.sCountry != null) return false;
        if (sCurrency != null ? !sCurrency.equals(that.sCurrency) : that.sCurrency != null) return false;
        if (dAddTime != null ? !dAddTime.equals(that.dAddTime) : that.dAddTime != null) return false;
        if (sExplain != null ? !sExplain.equals(that.sExplain) : that.sExplain != null) return false;
        if (iCurrencyType != null ? !iCurrencyType.equals(that.iCurrencyType) : that.iCurrencyType != null)
            return false;
        if (sBankCountry != null ? !sBankCountry.equals(that.sBankCountry) : that.sBankCountry != null) return false;
        if (sBankState != null ? !sBankState.equals(that.sBankState) : that.sBankState != null) return false;
        if (sBankCity != null ? !sBankCity.equals(that.sBankCity) : that.sBankCity != null) return false;
        if (sSwiftCode != null ? !sSwiftCode.equals(that.sSwiftCode) : that.sSwiftCode != null) return false;
        if (sIBanCode != null ? !sIBanCode.equals(that.sIBanCode) : that.sIBanCode != null) return false;
        if (sReceiverAddress != null ? !sReceiverAddress.equals(that.sReceiverAddress) : that.sReceiverAddress != null)
            return false;
        if (sRemark != null ? !sRemark.equals(that.sRemark) : that.sRemark != null) return false;
        if (fundAccountInvoiceId != null ? !fundAccountInvoiceId.equals(that.fundAccountInvoiceId) : that.fundAccountInvoiceId != null)
            return false;
        if (sLoginId != null ? !sLoginId.equals(that.sLoginId) : that.sLoginId != null) return false;
        if (sLoginEmail != null ? !sLoginEmail.equals(that.sLoginEmail) : that.sLoginEmail != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sAccountId != null ? sAccountId.hashCode() : 0;
        result = 31 * result + (sAccountName != null ? sAccountName.hashCode() : 0);
        result = 31 * result + iAccountType;
        result = 31 * result + (sBankName != null ? sBankName.hashCode() : 0);
        result = 31 * result + (sRoutingNum != null ? sRoutingNum.hashCode() : 0);
        result = 31 * result + (sBankAccNum != null ? sBankAccNum.hashCode() : 0);
        result = 31 * result + (sBranchAddress != null ? sBranchAddress.hashCode() : 0);
        result = 31 * result + (sCountry != null ? sCountry.hashCode() : 0);
        result = 31 * result + (sCurrency != null ? sCurrency.hashCode() : 0);
        result = 31 * result + iAction;
        result = 31 * result + iUserId;
        result = 31 * result + (dAddTime != null ? dAddTime.hashCode() : 0);
        result = 31 * result + (sExplain != null ? sExplain.hashCode() : 0);
        result = 31 * result + iOwnerType;
        result = 31 * result + (iCurrencyType != null ? iCurrencyType.hashCode() : 0);
        result = 31 * result + (sBankCountry != null ? sBankCountry.hashCode() : 0);
        result = 31 * result + (sBankState != null ? sBankState.hashCode() : 0);
        result = 31 * result + (sBankCity != null ? sBankCity.hashCode() : 0);
        result = 31 * result + (sSwiftCode != null ? sSwiftCode.hashCode() : 0);
        result = 31 * result + (sIBanCode != null ? sIBanCode.hashCode() : 0);
        result = 31 * result + (sReceiverAddress != null ? sReceiverAddress.hashCode() : 0);
        result = 31 * result + (sRemark != null ? sRemark.hashCode() : 0);
        result = 31 * result + (fundAccountInvoiceId != null ? fundAccountInvoiceId.hashCode() : 0);
        result = 31 * result + (sLoginId != null ? sLoginId.hashCode() : 0);
        result = 31 * result + (sLoginEmail != null ? sLoginEmail.hashCode() : 0);
        return result;
    }
}
