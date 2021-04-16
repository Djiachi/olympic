package com.tansun.ider.model.bo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.tansun.ider.dao.beta.entity.CoreActivityArtifactRel;
import com.tansun.ider.dao.beta.entity.CoreEventActivityRel;
import com.tansun.ider.framwork.commun.BeanVO;

/**
 * 
 * 
 * @ClassName: X5396BO
 * 
 * @Function:用于Bus层调用
 * 
 * @author baiyu
 * 
 * @date 2019年4月30日
 * 
 * @version R04.00
 */
public class X5396BO extends BeanVO implements Serializable {
    private static final long serialVersionUID = -3110392235339871560L;

    /** 活动与构件对应关系表 */
    CoreEventActivityRel coreEventActivityRel;
    /** 活动与构件对应关系表 */
    List<CoreActivityArtifactRel> activityArtifactList;
    /** 全局事件编号 */
    private String globalEventNo;
    // 查询类型：同源交易查询1，入账情况查询2，客户还款历史查询3
    private String queryType;
    /** 证件号码 [30,0] */
    private String idNumber;
    /** 证件类型 */
    private String idType;
    /** 证件号码 [19,0] */
    private String externalIdentificationNo;
    /** 币种 [3,0] */
    private String currencyCode;
    /**查询币种标识*/
    private boolean queryBusinessProgramNo;
    /**业务项目代码*/
    private String businessProgramNo;
    /**查询起始结束日期标志*/
    private boolean queryDate;
    /**起始日期*/
    private String startDate;
    /**结束日期*/
    private String endDate;
    
    /** 客户号 [12,0] */
    protected String customerNo;
    /** 客户号/账户号/余额单元号/余额对象号 账户定位活动赋值账户号，余额定位时赋值余额单元号 [23,0] Not NULL */
    protected String entityKey;
    /** 账户代码/余额单元代码 [23,0] */
    protected String accountId;
    /** 全局流水号 [36,0] Not NULL */
    protected String globalSerialNumbr;
    /** 发生日期 yyyy-MM-dd [10,0] Not NULL */
    protected String occurrDate;
    /** 发生时间 HH:mm:ss  [12,0] Not NULL */
    protected String occurrTime;
    /** 事件编号 [14,0] Not NULL */
    protected String eventNo;
    /** 活动编号 [8,0] Not NULL */
    protected String activityNo;
    /** 业务类型代码 [9,0] */
    protected String businessTypeCode;
    /** 余额对象代码 [9,0] */
    protected String balanceObjectCode;
    /** 余额类型 [1,0] */
    protected String balanceType;
    /** 交易描述 [50,0] */
    protected String transDesc;
    /** 交易日期 yyyy-MM-dd [10,0] */
    protected String transDate;
    /** 交易金额 [18,0] */
    protected BigDecimal transAmount;
    /** 交易币种 [3,0] */
    protected String transCurrCde;
    /** 交易币种小数位 [10,0] */
    protected Integer transCurrPoint;
    /** 入账金额 [18,0] */
    protected BigDecimal postingAmount;
    /** 入账币种 [3,0] */
    protected String postingCurrencyCode;
    /** 入账币种小数位 [10,0] */
    protected Integer postingCurrencyPoint;
    /** 清算金额 [18,0] */
    protected BigDecimal settlementAmount;
    /** 清算币种 [3,0] */
    protected String settlementCurrencyCode;
    /** 清算币种小数位 [10,0] */
    protected Integer settlementCurrencyPoint;
    /** 入账转换汇率 6位小数 [12,6] */
    protected BigDecimal postingConvertRate;
    /** 关联交易全局流水号 [36,0] */
    protected String globalSerialNumbrRelative;
    /** 授权码 : 授权码 [6,0] */
    protected String authCde;
    /** MCC 商户类别码,由收单机构为签约商户设置 : MCC 商户类别码,由收单机构为签约商户设置 [4,0] */
    protected String mcc;
    /** 交易国家代码 [5,0] */
    protected String transCountryCde;
    /** 交易城市代码 [11,0] */
    protected String transCityCde;
    /** 来源码 : 来源码 [4,0] */
    protected String sourceCde;
    /** 收单参考号 [23,0] */
    protected String acquireReferenceNumbr;
    /** 渠道代码 [8,0] */
    protected String channelCde;
    /** 商户代码 [15,0] */
    protected String merchantCde;
    /** 借贷标志 [1,0] */
    protected String loanSign;
    /** 还款类型 [1,0] */
    protected String paymentType;
    /** 交易识别代码 [4,0] */
    protected String transIdentifiNo;
    /** 实际入账金额 [18,0] */
    protected BigDecimal actualPostingAmount;
    /** 定价区域 [1,0] */
    protected String priceArea;
    /** 定价标签 [9,0] */
    protected String priceTag;
    /** 活动标签 [9,0] */
    protected String activityTag;
    /** 活动标签生效标志 Y:生效 N：无效 [1,0] */
    protected String activityTagValidFlag;
    /** 交易属性/产生来源   O-原生交易 D-衍生交易 [1,0] */
    protected String transProperty;
    /** 交易状态 NOR-正常 INS-已分期 REV-已冲正 FRT-全额退货 PRT-部分退货 DIS-争议登记 [3,0] */
    protected String transState;
    /** 日志层级 [1,0] */
    protected String logLevel;
    /** 日志类型 [1,0] */
    protected String logType;
    /** 清算分配金额 [18,0] */
    protected BigDecimal settleDistriAmount;
    /** 清算分配币种 [3,0] */
    protected String settleDistriCurrency;
    /** 清算分配币种小数位 [10,0] */
    protected Integer settleDistriCurrPoint;
    /** 周期号 [10,0] */
    protected Integer cycleNumber;
    /** 溢缴款冻结金额 [18,0] */
    protected BigDecimal overpayFrzAmount;
    /** 溢缴款冻结币种 [3,0] */
    protected String overpayFrzCurrCode;
    /** 溢缴款冻结小数位 [10,0] */
    protected Integer overpayFrzCurrPoint;
    /** 交易类型   P：还款   R：还款还原 [1,0] */
    protected String transType;
    /** 账户号 [18,0] */
    protected String accountNo;
    /** 溢缴款金额 [18,0] */
    protected BigDecimal overpayAmount;
    /** 溢缴款币种 [3,0] */
    protected String overpayCurrCode;
    /** 原交易入账账户 [18,0] */
    protected String oriTransPostingAccountId;
    /** 原交易入账币种 [3,0] */
    protected String oriTransPostingCurrCode;
    /** Y:已报销 N/空：未报销  [1,0] */
    protected String reimburseStatus;
    /** 创建时间 yyyy-MM-dd HH:mm:ss [23,0] */
    protected String gmtCreate;
    /** 时间戳 : oralce使用触发器更新， mysql使用自动更新 [19,0] Not NULL */
    protected Date timestamp;
    /** MERH：商户分期TXAT：自动分期CASH：现金分期SPCL：专项分期STMT：账单分期TRAN：交易分期LOAN:信贷分期 [4,0] */
    protected String installType;
    /** 版本号 [10,0] */
    protected Integer version;
    /** 结息节点发生日期 [10,0] */
    protected String billOccurDate;
    /** 结息周期号 [10,0] */
    protected Integer billCycleNo;
    /** 产品对象代码 [15,0] */
    protected String productObjectCode;
    /** 业务项目代码 [9,0] */
    protected String businessProgramCode;
    /** 核算状态码 [3,0] */
    protected String accountingStatusCode;
    /** 资产属性 [3,0] */
    protected String assetProperty;
    /** 交易机构 [10,0] */
    protected String transOrganization;
    /** 账户机构 [10,0] */
    protected String accountOrganization;
    /** 业务性质D：借方 C：贷方 N：不适用 [1,0] */
    protected String businessDebitCreditCode;
    /** 生成会计文件标识 [1,0] */
    protected String accountingFileFlag;
    
    private String programDesc;
    private String transCurrDesc;
    private String postingCurrencyDesc;
    private String settlementCurrencyDesc;
    private String businessDesc;
    private String objectDesc;
    private String currencyDesc;
    
    public X5396BO() {

    }
    
    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public CoreEventActivityRel getCoreEventActivityRel() {
        return coreEventActivityRel;
    }

    public void setCoreEventActivityRel(CoreEventActivityRel coreEventActivityRel) {
        this.coreEventActivityRel = coreEventActivityRel;
    }

    public List<CoreActivityArtifactRel> getActivityArtifactList() {
        return activityArtifactList;
    }

    public void setActivityArtifactList(List<CoreActivityArtifactRel> activityArtifactList) {
        this.activityArtifactList = activityArtifactList;
    }

    public String getGlobalEventNo() {
        return globalEventNo;
    }

    public void setGlobalEventNo(String globalEventNo) {
        this.globalEventNo = globalEventNo;
    }

    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getExternalIdentificationNo() {
        return externalIdentificationNo;
    }

    public void setExternalIdentificationNo(String externalIdentificationNo) {
        this.externalIdentificationNo = externalIdentificationNo;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
     
    public boolean getQueryBusinessProgramNo() {
        return queryBusinessProgramNo;
    }

    public void setQueryBusinessProgramNo(boolean queryBusinessProgramNo) {
        this.queryBusinessProgramNo = queryBusinessProgramNo;
    }

    public String getBusinessProgramNo() {
        return businessProgramNo;
    }

    public void setBusinessProgramNo(String businessProgramNo) {
        this.businessProgramNo = businessProgramNo;
    }

    public boolean getQueryDate() {
        return queryDate;
    }

    public void setQueryDate(boolean queryDate) {
        this.queryDate = queryDate;
    }

    @Override
    public String toString() {
        return "X5396BO [coreEventActivityRel=" + coreEventActivityRel + ", activityArtifactList="
                + activityArtifactList + ", globalEventNo=" + globalEventNo + ", queryType=" + queryType + ", idNumber="
                + idNumber + ", idType=" + idType + ", externalIdentificationNo=" + externalIdentificationNo
                + ", currencyCode=" + currencyCode + "]";
    }

	public String getCustomerNo() {
		return customerNo;
	}

	public void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}

	public String getEntityKey() {
		return entityKey;
	}

	public void setEntityKey(String entityKey) {
		this.entityKey = entityKey;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getGlobalSerialNumbr() {
		return globalSerialNumbr;
	}

	public void setGlobalSerialNumbr(String globalSerialNumbr) {
		this.globalSerialNumbr = globalSerialNumbr;
	}

	public String getOccurrDate() {
		return occurrDate;
	}

	public void setOccurrDate(String occurrDate) {
		this.occurrDate = occurrDate;
	}

	public String getOccurrTime() {
		return occurrTime;
	}

	public void setOccurrTime(String occurrTime) {
		this.occurrTime = occurrTime;
	}

	public String getEventNo() {
		return eventNo;
	}

	public void setEventNo(String eventNo) {
		this.eventNo = eventNo;
	}

	public String getActivityNo() {
		return activityNo;
	}

	public void setActivityNo(String activityNo) {
		this.activityNo = activityNo;
	}

	public String getBusinessTypeCode() {
		return businessTypeCode;
	}

	public void setBusinessTypeCode(String businessTypeCode) {
		this.businessTypeCode = businessTypeCode;
	}

	public String getBalanceObjectCode() {
		return balanceObjectCode;
	}

	public void setBalanceObjectCode(String balanceObjectCode) {
		this.balanceObjectCode = balanceObjectCode;
	}

	public String getBalanceType() {
		return balanceType;
	}

	public void setBalanceType(String balanceType) {
		this.balanceType = balanceType;
	}

	public String getTransDesc() {
		return transDesc;
	}

	public void setTransDesc(String transDesc) {
		this.transDesc = transDesc;
	}

	public String getTransDate() {
		return transDate;
	}

	public void setTransDate(String transDate) {
		this.transDate = transDate;
	}

	public BigDecimal getTransAmount() {
		return transAmount;
	}

	public void setTransAmount(BigDecimal transAmount) {
		this.transAmount = transAmount;
	}

	public String getTransCurrCde() {
		return transCurrCde;
	}

	public void setTransCurrCde(String transCurrCde) {
		this.transCurrCde = transCurrCde;
	}

	public Integer getTransCurrPoint() {
		return transCurrPoint;
	}

	public void setTransCurrPoint(Integer transCurrPoint) {
		this.transCurrPoint = transCurrPoint;
	}

	public BigDecimal getPostingAmount() {
		return postingAmount;
	}

	public void setPostingAmount(BigDecimal postingAmount) {
		this.postingAmount = postingAmount;
	}

	public String getPostingCurrencyCode() {
		return postingCurrencyCode;
	}

	public void setPostingCurrencyCode(String postingCurrencyCode) {
		this.postingCurrencyCode = postingCurrencyCode;
	}

	public Integer getPostingCurrencyPoint() {
		return postingCurrencyPoint;
	}

	public void setPostingCurrencyPoint(Integer postingCurrencyPoint) {
		this.postingCurrencyPoint = postingCurrencyPoint;
	}

	public BigDecimal getSettlementAmount() {
		return settlementAmount;
	}

	public void setSettlementAmount(BigDecimal settlementAmount) {
		this.settlementAmount = settlementAmount;
	}

	public String getSettlementCurrencyCode() {
		return settlementCurrencyCode;
	}

	public void setSettlementCurrencyCode(String settlementCurrencyCode) {
		this.settlementCurrencyCode = settlementCurrencyCode;
	}

	public Integer getSettlementCurrencyPoint() {
		return settlementCurrencyPoint;
	}

	public void setSettlementCurrencyPoint(Integer settlementCurrencyPoint) {
		this.settlementCurrencyPoint = settlementCurrencyPoint;
	}

	public BigDecimal getPostingConvertRate() {
		return postingConvertRate;
	}

	public void setPostingConvertRate(BigDecimal postingConvertRate) {
		this.postingConvertRate = postingConvertRate;
	}

	public String getGlobalSerialNumbrRelative() {
		return globalSerialNumbrRelative;
	}

	public void setGlobalSerialNumbrRelative(String globalSerialNumbrRelative) {
		this.globalSerialNumbrRelative = globalSerialNumbrRelative;
	}

	public String getAuthCde() {
		return authCde;
	}

	public void setAuthCde(String authCde) {
		this.authCde = authCde;
	}

	public String getMcc() {
		return mcc;
	}

	public void setMcc(String mcc) {
		this.mcc = mcc;
	}

	public String getTransCountryCde() {
		return transCountryCde;
	}

	public void setTransCountryCde(String transCountryCde) {
		this.transCountryCde = transCountryCde;
	}

	public String getTransCityCde() {
		return transCityCde;
	}

	public void setTransCityCde(String transCityCde) {
		this.transCityCde = transCityCde;
	}

	public String getSourceCde() {
		return sourceCde;
	}

	public void setSourceCde(String sourceCde) {
		this.sourceCde = sourceCde;
	}

	public String getAcquireReferenceNumbr() {
		return acquireReferenceNumbr;
	}

	public void setAcquireReferenceNumbr(String acquireReferenceNumbr) {
		this.acquireReferenceNumbr = acquireReferenceNumbr;
	}

	public String getChannelCde() {
		return channelCde;
	}

	public void setChannelCde(String channelCde) {
		this.channelCde = channelCde;
	}

	public String getMerchantCde() {
		return merchantCde;
	}

	public void setMerchantCde(String merchantCde) {
		this.merchantCde = merchantCde;
	}

	public String getLoanSign() {
		return loanSign;
	}

	public void setLoanSign(String loanSign) {
		this.loanSign = loanSign;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getTransIdentifiNo() {
		return transIdentifiNo;
	}

	public void setTransIdentifiNo(String transIdentifiNo) {
		this.transIdentifiNo = transIdentifiNo;
	}

	public BigDecimal getActualPostingAmount() {
		return actualPostingAmount;
	}

	public void setActualPostingAmount(BigDecimal actualPostingAmount) {
		this.actualPostingAmount = actualPostingAmount;
	}

	public String getPriceArea() {
		return priceArea;
	}

	public void setPriceArea(String priceArea) {
		this.priceArea = priceArea;
	}

	public String getPriceTag() {
		return priceTag;
	}

	public void setPriceTag(String priceTag) {
		this.priceTag = priceTag;
	}

	public String getActivityTag() {
		return activityTag;
	}

	public void setActivityTag(String activityTag) {
		this.activityTag = activityTag;
	}

	public String getActivityTagValidFlag() {
		return activityTagValidFlag;
	}

	public void setActivityTagValidFlag(String activityTagValidFlag) {
		this.activityTagValidFlag = activityTagValidFlag;
	}

	public String getTransProperty() {
		return transProperty;
	}

	public void setTransProperty(String transProperty) {
		this.transProperty = transProperty;
	}

	public String getTransState() {
		return transState;
	}

	public void setTransState(String transState) {
		this.transState = transState;
	}

	public String getLogLevel() {
		return logLevel;
	}

	public void setLogLevel(String logLevel) {
		this.logLevel = logLevel;
	}

	public String getLogType() {
		return logType;
	}

	public void setLogType(String logType) {
		this.logType = logType;
	}

	public BigDecimal getSettleDistriAmount() {
		return settleDistriAmount;
	}

	public void setSettleDistriAmount(BigDecimal settleDistriAmount) {
		this.settleDistriAmount = settleDistriAmount;
	}

	public String getSettleDistriCurrency() {
		return settleDistriCurrency;
	}

	public void setSettleDistriCurrency(String settleDistriCurrency) {
		this.settleDistriCurrency = settleDistriCurrency;
	}

	public Integer getSettleDistriCurrPoint() {
		return settleDistriCurrPoint;
	}

	public void setSettleDistriCurrPoint(Integer settleDistriCurrPoint) {
		this.settleDistriCurrPoint = settleDistriCurrPoint;
	}

	public Integer getCycleNumber() {
		return cycleNumber;
	}

	public void setCycleNumber(Integer cycleNumber) {
		this.cycleNumber = cycleNumber;
	}

	public BigDecimal getOverpayFrzAmount() {
		return overpayFrzAmount;
	}

	public void setOverpayFrzAmount(BigDecimal overpayFrzAmount) {
		this.overpayFrzAmount = overpayFrzAmount;
	}

	public String getOverpayFrzCurrCode() {
		return overpayFrzCurrCode;
	}

	public void setOverpayFrzCurrCode(String overpayFrzCurrCode) {
		this.overpayFrzCurrCode = overpayFrzCurrCode;
	}

	public Integer getOverpayFrzCurrPoint() {
		return overpayFrzCurrPoint;
	}

	public void setOverpayFrzCurrPoint(Integer overpayFrzCurrPoint) {
		this.overpayFrzCurrPoint = overpayFrzCurrPoint;
	}

	public String getTransType() {
		return transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public BigDecimal getOverpayAmount() {
		return overpayAmount;
	}

	public void setOverpayAmount(BigDecimal overpayAmount) {
		this.overpayAmount = overpayAmount;
	}

	public String getOverpayCurrCode() {
		return overpayCurrCode;
	}

	public void setOverpayCurrCode(String overpayCurrCode) {
		this.overpayCurrCode = overpayCurrCode;
	}

	public String getOriTransPostingAccountId() {
		return oriTransPostingAccountId;
	}

	public void setOriTransPostingAccountId(String oriTransPostingAccountId) {
		this.oriTransPostingAccountId = oriTransPostingAccountId;
	}

	public String getOriTransPostingCurrCode() {
		return oriTransPostingCurrCode;
	}

	public void setOriTransPostingCurrCode(String oriTransPostingCurrCode) {
		this.oriTransPostingCurrCode = oriTransPostingCurrCode;
	}

	public String getReimburseStatus() {
		return reimburseStatus;
	}

	public void setReimburseStatus(String reimburseStatus) {
		this.reimburseStatus = reimburseStatus;
	}

	public String getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getInstallType() {
		return installType;
	}

	public void setInstallType(String installType) {
		this.installType = installType;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getBillOccurDate() {
		return billOccurDate;
	}

	public void setBillOccurDate(String billOccurDate) {
		this.billOccurDate = billOccurDate;
	}

	public Integer getBillCycleNo() {
		return billCycleNo;
	}

	public void setBillCycleNo(Integer billCycleNo) {
		this.billCycleNo = billCycleNo;
	}

	public String getProductObjectCode() {
		return productObjectCode;
	}

	public void setProductObjectCode(String productObjectCode) {
		this.productObjectCode = productObjectCode;
	}

	public String getBusinessProgramCode() {
		return businessProgramCode;
	}

	public void setBusinessProgramCode(String businessProgramCode) {
		this.businessProgramCode = businessProgramCode;
	}

	public String getAccountingStatusCode() {
		return accountingStatusCode;
	}

	public void setAccountingStatusCode(String accountingStatusCode) {
		this.accountingStatusCode = accountingStatusCode;
	}

	public String getAssetProperty() {
		return assetProperty;
	}

	public void setAssetProperty(String assetProperty) {
		this.assetProperty = assetProperty;
	}

	public String getTransOrganization() {
		return transOrganization;
	}

	public void setTransOrganization(String transOrganization) {
		this.transOrganization = transOrganization;
	}

	public String getAccountOrganization() {
		return accountOrganization;
	}

	public void setAccountOrganization(String accountOrganization) {
		this.accountOrganization = accountOrganization;
	}

	public String getBusinessDebitCreditCode() {
		return businessDebitCreditCode;
	}

	public void setBusinessDebitCreditCode(String businessDebitCreditCode) {
		this.businessDebitCreditCode = businessDebitCreditCode;
	}

	public String getAccountingFileFlag() {
		return accountingFileFlag;
	}

	public void setAccountingFileFlag(String accountingFileFlag) {
		this.accountingFileFlag = accountingFileFlag;
	}

	public String getProgramDesc() {
		return programDesc;
	}

	public void setProgramDesc(String programDesc) {
		this.programDesc = programDesc;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getTransCurrDesc() {
		return transCurrDesc;
	}

	public void setTransCurrDesc(String transCurrDesc) {
		this.transCurrDesc = transCurrDesc;
	}

	public String getPostingCurrencyDesc() {
		return postingCurrencyDesc;
	}

	public void setPostingCurrencyDesc(String postingCurrencyDesc) {
		this.postingCurrencyDesc = postingCurrencyDesc;
	}

	public String getSettlementCurrencyDesc() {
		return settlementCurrencyDesc;
	}

	public void setSettlementCurrencyDesc(String settlementCurrencyDesc) {
		this.settlementCurrencyDesc = settlementCurrencyDesc;
	}

	public String getBusinessDesc() {
		return businessDesc;
	}

	public void setBusinessDesc(String businessDesc) {
		this.businessDesc = businessDesc;
	}

	public String getObjectDesc() {
		return objectDesc;
	}

	public void setObjectDesc(String objectDesc) {
		this.objectDesc = objectDesc;
	}

	public String getCurrencyDesc() {
		return currencyDesc;
	}

	public void setCurrencyDesc(String currencyDesc) {
		this.currencyDesc = currencyDesc;
	}

}
