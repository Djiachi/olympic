package com.tansun.ider.model.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import com.tansun.ider.framwork.commun.BeanVO;

/**
 * 可分期交易历史查询
 * @author liuyanxi
 *
 */
public class X5438VO extends BeanVO implements Serializable {

	private static final long serialVersionUID = -6775800658598956966L;
	/** 客户号 [12,0] */
    protected String customerNo;
    /** 客户号/账户号/余额单元号/余额对象号 账户定位活动赋值账户号，余额定位时赋值余额单元号 [23,0] Not NULL */
    protected String entityKey;
    /** 账户代码/余额单元代码 [23,0] */
    protected String accountId;
    /** 币种 [3,0] Not NULL */
    protected String currencyCode;
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
    /** 外部识别号 格式：000+BBBBBB+sssssssss+C       BBBBB:Bin号；  sssssssss：按BIN的顺序号（乱序）；C：校验位 [32,0] */
    protected String externalIdentificationNo;
    /** DAPN识别号 [32,0] */
    protected String dpanExternalIdentificationNo;
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
    /** 交易状态 NOR-正常 INS-已分期 REV-已冲正 FRT-全额退货 PRT-部分退货 DIS-争议登记  ADJ-已调整 [3,0] */
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
    /** 运营模式 [3,0] */
    protected String operationMode;
    /** 起息日 [10,0] */
    protected String interestStartDate;
    /** 法人实体编号 [10,0] */
    protected String corporationEntityNo;
    /** 核算场景事件编号 [14,0] */
    protected String accountingSceneEventNo;
    /** 已调整金额 [18,0] */
    protected BigDecimal adjustedAmount;
    /** 资产转变阶段:PACK-封包,TRSF-转让,REPO-回购 [4,0] */
    protected String capitalStage;
    /** 资产转出机构代码 [25,0] */
    protected String capitalOrganizationCode;
    /** 余额 [18,0] */
    protected BigDecimal balance;
    /** 累计利息 [18,0] */
    protected BigDecimal accumulatedInterest;
    /** 当期最低还款 [18,0] */
    protected BigDecimal currentDue;
    /** 生效利率 [8,7] */
    protected BigDecimal interestRate;
    /** 更新标识 : 1：没有PENDING状态的修改 2：当天未修改 3：下个交易日生效 4：下个账单日生效 5：下个入账日生效 [1,0] */
    protected String rateChangeFlag;
    /** pending生效利率 [8,7] */
    protected BigDecimal pendingInterestRate;
    /** 溢缴款利率变动标志 1：变动 0：不变动 [1,0] */
    protected String overpayRateChangeFlag;
    /** 分期标识  0：不可分期   1：可分期 [1,0] */
    protected String installmentFlag;
    /** 动态计息利率 [8,7] */
    protected BigDecimal dynamicInterestRate;
    /** 描述 [50,0] */
    protected String businessDesc;
    /** 描述 [50,0] Not NULL */
    protected String objectDesc;
    /** 币种描述 [50,0] */
    protected String currencyDesc;
    /** 币种描述 [50,0] */
    protected String postingCurrencyDesc;
    /** 币种描述 [50,0] */
    protected String transCurrDesc;
    /** 已分期金额 [18,0] */
    protected BigDecimal installmentAmount;
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
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
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
	public String getExternalIdentificationNo() {
		return externalIdentificationNo;
	}
	public void setExternalIdentificationNo(String externalIdentificationNo) {
		this.externalIdentificationNo = externalIdentificationNo;
	}
	public String getDpanExternalIdentificationNo() {
		return dpanExternalIdentificationNo;
	}
	public void setDpanExternalIdentificationNo(String dpanExternalIdentificationNo) {
		this.dpanExternalIdentificationNo = dpanExternalIdentificationNo;
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
	public String getOperationMode() {
		return operationMode;
	}
	public void setOperationMode(String operationMode) {
		this.operationMode = operationMode;
	}
	public String getInterestStartDate() {
		return interestStartDate;
	}
	public void setInterestStartDate(String interestStartDate) {
		this.interestStartDate = interestStartDate;
	}
	public String getCorporationEntityNo() {
		return corporationEntityNo;
	}
	public void setCorporationEntityNo(String corporationEntityNo) {
		this.corporationEntityNo = corporationEntityNo;
	}
	public String getAccountingSceneEventNo() {
		return accountingSceneEventNo;
	}
	public void setAccountingSceneEventNo(String accountingSceneEventNo) {
		this.accountingSceneEventNo = accountingSceneEventNo;
	}
	public BigDecimal getAdjustedAmount() {
		return adjustedAmount;
	}
	public void setAdjustedAmount(BigDecimal adjustedAmount) {
		this.adjustedAmount = adjustedAmount;
	}
	public String getCapitalStage() {
		return capitalStage;
	}
	public void setCapitalStage(String capitalStage) {
		this.capitalStage = capitalStage;
	}
	public String getCapitalOrganizationCode() {
		return capitalOrganizationCode;
	}
	public void setCapitalOrganizationCode(String capitalOrganizationCode) {
		this.capitalOrganizationCode = capitalOrganizationCode;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	public BigDecimal getAccumulatedInterest() {
		return accumulatedInterest;
	}
	public void setAccumulatedInterest(BigDecimal accumulatedInterest) {
		this.accumulatedInterest = accumulatedInterest;
	}
	public BigDecimal getCurrentDue() {
		return currentDue;
	}
	public void setCurrentDue(BigDecimal currentDue) {
		this.currentDue = currentDue;
	}
	public BigDecimal getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(BigDecimal interestRate) {
		this.interestRate = interestRate;
	}
	public String getRateChangeFlag() {
		return rateChangeFlag;
	}
	public void setRateChangeFlag(String rateChangeFlag) {
		this.rateChangeFlag = rateChangeFlag;
	}
	public BigDecimal getPendingInterestRate() {
		return pendingInterestRate;
	}
	public void setPendingInterestRate(BigDecimal pendingInterestRate) {
		this.pendingInterestRate = pendingInterestRate;
	}
	public String getOverpayRateChangeFlag() {
		return overpayRateChangeFlag;
	}
	public void setOverpayRateChangeFlag(String overpayRateChangeFlag) {
		this.overpayRateChangeFlag = overpayRateChangeFlag;
	}
	public String getInstallmentFlag() {
		return installmentFlag;
	}
	public void setInstallmentFlag(String installmentFlag) {
		this.installmentFlag = installmentFlag;
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
	public String getPostingCurrencyDesc() {
		return postingCurrencyDesc;
	}
	public void setPostingCurrencyDesc(String postingCurrencyDesc) {
		this.postingCurrencyDesc = postingCurrencyDesc;
	}
	public String getTransCurrDesc() {
		return transCurrDesc;
	}
	public void setTransCurrDesc(String transCurrDesc) {
		this.transCurrDesc = transCurrDesc;
	}
	public BigDecimal getDynamicInterestRate() {
		return dynamicInterestRate;
	}
	public void setDynamicInterestRate(BigDecimal dynamicInterestRate) {
		this.dynamicInterestRate = dynamicInterestRate;
	}
	public BigDecimal getInstallmentAmount() {
		return installmentAmount;
	}
	public void setInstallmentAmount(BigDecimal installmentAmount) {
		this.installmentAmount = installmentAmount;
	}
	@Override
	public String toString() {
		return "X5438VO [customerNo=" + customerNo + ", entityKey=" + entityKey + ", accountId=" + accountId
				+ ", currencyCode=" + currencyCode + ", globalSerialNumbr=" + globalSerialNumbr + ", occurrDate="
				+ occurrDate + ", occurrTime=" + occurrTime + ", eventNo=" + eventNo + ", activityNo=" + activityNo
				+ ", businessTypeCode=" + businessTypeCode + ", balanceObjectCode=" + balanceObjectCode
				+ ", balanceType=" + balanceType + ", externalIdentificationNo=" + externalIdentificationNo
				+ ", dpanExternalIdentificationNo=" + dpanExternalIdentificationNo + ", transDesc=" + transDesc
				+ ", transDate=" + transDate + ", transAmount=" + transAmount + ", transCurrCde=" + transCurrCde
				+ ", transCurrPoint=" + transCurrPoint + ", postingAmount=" + postingAmount + ", postingCurrencyCode="
				+ postingCurrencyCode + ", postingCurrencyPoint=" + postingCurrencyPoint + ", settlementAmount="
				+ settlementAmount + ", settlementCurrencyCode=" + settlementCurrencyCode + ", settlementCurrencyPoint="
				+ settlementCurrencyPoint + ", postingConvertRate=" + postingConvertRate
				+ ", globalSerialNumbrRelative=" + globalSerialNumbrRelative + ", authCde=" + authCde + ", mcc=" + mcc
				+ ", transCountryCde=" + transCountryCde + ", transCityCde=" + transCityCde + ", sourceCde=" + sourceCde
				+ ", acquireReferenceNumbr=" + acquireReferenceNumbr + ", channelCde=" + channelCde + ", merchantCde="
				+ merchantCde + ", loanSign=" + loanSign + ", paymentType=" + paymentType + ", transIdentifiNo="
				+ transIdentifiNo + ", actualPostingAmount=" + actualPostingAmount + ", priceArea=" + priceArea
				+ ", priceTag=" + priceTag + ", activityTag=" + activityTag + ", activityTagValidFlag="
				+ activityTagValidFlag + ", transProperty=" + transProperty + ", transState=" + transState
				+ ", logLevel=" + logLevel + ", logType=" + logType + ", settleDistriAmount=" + settleDistriAmount
				+ ", settleDistriCurrency=" + settleDistriCurrency + ", settleDistriCurrPoint=" + settleDistriCurrPoint
				+ ", cycleNumber=" + cycleNumber + ", overpayFrzAmount=" + overpayFrzAmount + ", overpayFrzCurrCode="
				+ overpayFrzCurrCode + ", overpayFrzCurrPoint=" + overpayFrzCurrPoint + ", transType=" + transType
				+ ", accountNo=" + accountNo + ", overpayAmount=" + overpayAmount + ", overpayCurrCode="
				+ overpayCurrCode + ", oriTransPostingAccountId=" + oriTransPostingAccountId
				+ ", oriTransPostingCurrCode=" + oriTransPostingCurrCode + ", reimburseStatus=" + reimburseStatus
				+ ", gmtCreate=" + gmtCreate + ", timestamp=" + timestamp + ", installType=" + installType
				+ ", version=" + version + ", billOccurDate=" + billOccurDate + ", billCycleNo=" + billCycleNo
				+ ", productObjectCode=" + productObjectCode + ", businessProgramCode=" + businessProgramCode
				+ ", accountingStatusCode=" + accountingStatusCode + ", assetProperty=" + assetProperty
				+ ", transOrganization=" + transOrganization + ", accountOrganization=" + accountOrganization
				+ ", businessDebitCreditCode=" + businessDebitCreditCode + ", accountingFileFlag=" + accountingFileFlag
				+ ", operationMode=" + operationMode + ", interestStartDate=" + interestStartDate
				+ ", corporationEntityNo=" + corporationEntityNo + ", accountingSceneEventNo=" + accountingSceneEventNo
				+ ", adjustedAmount=" + adjustedAmount + ", capitalStage=" + capitalStage + ", capitalOrganizationCode="
				+ capitalOrganizationCode + ", balance=" + balance + ", accumulatedInterest=" + accumulatedInterest
				+ ", currentDue=" + currentDue + ", interestRate=" + interestRate + ", rateChangeFlag=" + rateChangeFlag
				+ ", pendingInterestRate=" + pendingInterestRate + ", overpayRateChangeFlag=" + overpayRateChangeFlag
				+ ", installmentFlag=" + installmentFlag + ", dynamicInterestRate=" + dynamicInterestRate
				+ ", businessDesc=" + businessDesc + ", objectDesc=" + objectDesc + ", currencyDesc=" + currencyDesc
				+ ", postingCurrencyDesc=" + postingCurrencyDesc + ", transCurrDesc=" + transCurrDesc
				+ ", installmentAmount=" + installmentAmount + "]";
	}
	
}
