package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter
@Setter
//@Builder
@NoArgsConstructor
//@AllArgsConstructor
@ToString
@Entity
@Accessors(chain = true)
@Table(name = "STP_APPLICATION")
public class STPApplication implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "STP_REFERENCE_NO", nullable = false)
    private String stpReferenceNo;

    @Column(name = "STP_CREATE_TIME", nullable = false)
    private Date stpCreateTime;

    @Column(name = "STP_USER_ID")
    private Long stpUserId;

    @Column(name = "STP_CHANNEL", nullable = false)
    private String stpChannel;

    @Column(name = "STP_APPLICATION_TYPE_CODE", nullable = false)
    private String stpApplicationTypeCode;

    @Column(name = "STP_APPLICATION_TYPE_DESC", nullable = false)
    private String stpApplicationTypeDesc;

    @Column(name = "STP_PREAPPROVED_SOURCE")
    private String stpPreapprovedSource;

    @Column(name = "STP_CUSTOMER_TYPE")
    private String stpCustomerType;

    /*@Column(name = "STP_PRESELECTION_FLAG")
    private String stpPreselectionFlag;*/

    @Column(name = "STP_ORGANIZATION")
    private String stpOrganization;

   /*@Column(name = "STP_SLIDER_INCOME")
    private String stpSliderIncome;

    @Column(name = "STP_CARD_DURATION")
    private String stpCardDuration;*/

    @Column(name = "STP_ACCOUNT_TYPE")
    private String stpAccountType;

    @Column(name = "STP_CUSTOMER_TITLE")
    private String stpCustomerTitle;

    @Column(name = "STP_CUSTOMER_NAME")
    private String stpCustomerName;

    /*@Column(name = "STP_CUSTOMER_NAME_ON_CARD")
    private String stpCustomerNameOnCard;*/

    @Column(name = "STP_CUSTOMER_DOB")
    private String stpCustomerDob;

    @Column(name = "STP_ID_TYPE_CODE")
    private String stpIdTypeCode;

    /*@Column(name = "STP_MDM_ID_TYPE_CODE")
    private String stpMdmIdTypeCode;*/

    @Column(name = "STP_ID_TYPE_DESC")
    private String stpIdTypeDesc;

    @Column(name = "STP_IDNO", nullable = false)
    private String stpIdno;

    @Column(name = "STP_EDUCATION_CODE")
    private String stpEducationCode;

    @Column(name = "STP_EDUCATION_DESC")
    private String stpEducationDesc;

    @Column(name = "STP_EMAIL")
    private String stpEmail;

    @Column(name = "STP_MOBILE_CONTACT_PREFIX")
    private String stpMobileContactPrefix;

    @Column(name = "STP_MOBILE_CONTACT_NUMBER")
    private String stpMobileContactNumber;

    @Column(name = "STP_HOME_CONTACT_PREFIX")
    private String stpHomeContactPrefix;

    @Column(name = "STP_HOME_CONTACT_NUMBER")
    private String stpHomeContactNumber;

    @Column(name = "STP_GENDER_CODE")
    private String stpGenderCode;

    @Column(name = "STP_GENDER_DESC")
    private String stpGenderDesc;

    @Column(name = "STP_RACE_CODE")
    private String stpRaceCode;

    @Column(name = "STP_RACE_DESC")
    private String stpRaceDesc;

    @Column(name = "STP_MARITAL_STATUS_CODE")
    private String stpMaritalStatusCode;

    @Column(name = "STP_MARITAL_STATUS_DESC")
    private String stpMaritalStatusDesc;

    @Column(name = "STP_NATIONALITY_CODE")
    private String stpNationalityCode;

    /*@Column(name = "STP_NATIONALITY_DESC")
    private String stpNationalityDesc;

    @Column(name = "STP_MOTHER_NAME")
    private String stpMotherName;*/

    @Column(name = "STP_HOME_ADDRESS1")
    private String stpHomeAddress1;

    @Column(name = "STP_HOME_ADDRESS2")
    private String stpHomeAddress2;

    @Column(name = "STP_HOME_ADDRESS3")
    private String stpHomeAddress3;

    @Column(name = "STP_HOME_POSTCODE")
    private String stpHomePostcode;

    @Column(name = "STP_HOME_CITY")
    private String stpHomeCity;

    @Column(name = "STP_HOME_STATE_CODE")
    private String stpHomeStateCode;

    @Column(name = "STP_HOME_STATE_DESC")
    private String stpHomeStateDesc;

    @Column(name = "STP_HOME_COUNTRY")
    private String stpHomeCountry;

    @Column(name = "STP_RESIDENTIAL_STATUS_CODE")
    private String stpResidentialStatusCode;

    @Column(name = "STP_RESIDENTIAL_STATUS_DESC")
    private String stpResidentialStatusDesc;

 /*   @Column(name = "STP_EMER_CONTACT_PERSON")
    private String stpEmerContactPerson;*/

    @Column(name = "STP_EMER_CONTACT_PREFIX")
    private String stpEmerContactPrefix;

    @Column(name = "STP_EMER_CONTACT_NUMBER")
    private String stpEmerContactNumber;

    @Column(name = "STP_EMPLOYER_NAME")
    private String stpEmployerName;

    @Column(name = "STP_OCCUPATION_CODE")
    private String stpOccupationCode;

    @Column(name = "STP_OCCUPATION_DESC")
    private String stpOccupationDesc;

    @Column(name = "STP_BUSINESS_NATURE_CODE")
    private String stpBusinessNatureCode;

/*    @Column(name = "STP_BUSINESS_NATURE_DESC")
    private String stpBusinessNatureDesc;

    @Column(name = "STP_BUSINESS_CLSF_CODE")
    private String stpBusinessClsfCode;

    @Column(name = "STP_BUSINESS_CLSF_DESC")
    private String stpBusinessClsfDesc;*/

    @Column(name = "STP_DESIGNATION")
    private String stpDesignation;

    @Column(name = "STP_SERVICE_LENGTH_YEAR")
    private String stpServiceLengthYear;

    @Column(name = "STP_SERVICE_LENGTH_MONTH")
    private String stpServiceLengthMonth;

    /*@Column(name = "STP_EMPLOYMENT_TERMS_CODE")
    private String stpEmploymentTermsCode;

    @Column(name = "STP_EMPLOYMENT_TERMS_DESC")
    private String stpEmploymentTermsDesc;*/

    @Column(name = "STP_EMPLOYER_ADDRESS1")
    private String stpEmployerAddress1;

    @Column(name = "STP_EMPLOYER_ADDRESS2")
    private String stpEmployerAddress2;

    @Column(name = "STP_EMPLOYER_ADDRESS3")
    private String stpEmployerAddress3;

    @Column(name = "STP_EMPLOYER_POSTCODE")
    private String stpEmployerPostcode;

    @Column(name = "STP_EMPLOYER_CITY")
    private String stpEmployerCity;

    @Column(name = "STP_EMPLOYER_STATE_CODE")
    private String stpEmployerStateCode;

    @Column(name = "STP_EMPLOYER_STATE_DESC")
    private String stpEmployerStateDesc;

    @Column(name = "STP_EMPLOYER_COUNTRY")
    private String stpEmployerCountry;

    @Column(name = "STP_EMPLOYER_CONTACT_PREFIX")
    private String stpEmployerContactPrefix;

    @Column(name = "STP_EMPLOYER_CONTACT_NUMBER")
    private String stpEmployerContactNumber;

    @Column(name = "STP_GROSS_INCOME")
    private String stpGrossIncome;

    @Column(name = "STP_NET_INCOME")
    private String stpNetIncome;

    @Column(name = "STP_EPF")
    private String stpEpf;

    @Column(name = "STP_INCOME_TAX")
    private String stpIncomeTax;

    @Column(name = "STP_SOCSO")
    private String stpSocso;

    @Column(name = "STP_OTHER_COMMITMENTS")
    private String stpOtherCommitments;

    /*@Column(name = "STP_RETIREMENT_INCOME_CODE")
    private String stpRetirementIncomeCode;

    @Column(name = "STP_RETIREMENT_INCOME_DESC")
    private String stpRetirementIncomeDesc;

    @Column(name = "STP_START_DATE")
    private String stpStartDate;

    @Column(name = "STP_END_DATE")
    private String stpEndDate;

    @Column(name = "STP_PURPOSE_CODE")
    private String stpPurposeCode;

    @Column(name = "STP_PURPOSE_DESC")
    private String stpPurposeDesc;

    @Column(name = "STP_CARD_STATEMENT_CODE")
    private String stpCardStatementCode;

    @Column(name = "STP_CARD_STATEMENT_DESC")
    private String stpCardStatementDesc;

    @Column(name = "STP_CARD_COLLECTION_CODE")
    private String stpCardCollectionCode;

    @Column(name = "STP_CARD_COLLECTION_DESC")
    private String stpCardCollectionDesc;*/

   /* @Column(name = "STP_CARD_COLLECTION_STATE_CODE")
    private String stpCardCollectionStateCode;

    @Column(name = "STP_CARD_COLLECTION_STATE_DESC")
    private String stpCardCollectionStateDesc;

    @Column(name = "STP_CARD_COLLECTION_DIST_CODE")
    private String stpCardCollectionDistCode;*/

   /* @Column(name = "STP_CARD_COLLECTION_DIST_DESC")
    private String stpCardCollectionDistDesc;

    @Column(name = "STP_CARD_COL_BRANCH_CODE")
    private String stpCardColBranchCode;

    @Column(name = "STP_CARD_COL_BRANCH_NAME")
    private String stpCardColBranchName;

    @Column(name = "STP_CARD_COL_BRANCH_ADDRESS")
    private String stpCardColBranchAddress;*/

   /* @Column(name = "STP_CARD_COL_BRANCH_PHONE")
    private String stpCardColBranchPhone;

    @Column(name = "STP_CARD_COL_BRANCH_FAX")
    private String stpCardColBranchFax;*/

   /* @Column(name = "STP_COMBINE_LIMIT")
    private String stpCombineLimit;*/

    @Column(name = "STP_PLAN_TYPE")
    private String stpPlanType;

    /*@Column(name = "STP_CARD_TOTAL_AMOUNT")
    private String stpCardTotalAmount;*/

    @Column(name = "STP_MONTHLY_INSTALMENT")
    private String stpMonthlyInstalment;

   /* @Column(name = "STP_RATE_PER_YEAR")
    private String stpRatePerYear;

    @Column(name = "STP_RATE_PER_MONTH")
    private String stpRatePerMonth;

    @Column(name = "STP_AMMC_PER_MONTH")
    private String stpAmmcPerMonth;*/

    @Column(name = "STP_TENURE")
    private String stpTenure;

//    @Column(name = "STP_DATE_loanRED")
//    private String stpDateloanred;

    /*@Column(name = "STP_LAST_INSTALMENT_AMT")
    private String stpLastInstalmentAmt;

    @Column(name = "STP_INSTALMENT_FROM")
    private String stpInstalmentFrom;

    @Column(name = "STP_INSTALMENT_TO")
    private String stpInstalmentTo;*/

    /*@Column(name = "STP_SUPP_ADDRESS2")
    private String stpSuppAddress2;*/



	/*
	 * @Column(name = "STP_SUPP_POSTCODE") private String stpSuppPostcode;
	 *
	 *
	 * @Column(name = "STP_SUPP_CITY") private String stpSuppCity;
	 *
	 * @Column(name = "STP_SUPP_STATE") private String stpSuppState;
	 */

	/*
	 * @Column(name = "STP_SUPP_COUNTRY") private String stpSuppCountry;
	 */

/*    @Column(name = "STP_SUPP_OCCUPATION_CODE")
    private String stpSuppOccupationCode;

    @Column(name = "STP_SUPP_OCCUPATION_DESC")
    private String stpSuppOccupationDesc;

    @Column(name = "STP_SUPP_CONTACT_PREFIX")
    private String stpSuppContactPrefix;


    @Column(name = "STP_MANCHESTER_CONSENT")
    private String stpManchesterConsent;*/

    @Column(name = "STP_DECLARE_PDPA")
    private String stpDeclarePdpa;

    @Column(name = "STP_DECLARE_CRS")
    private String stpDeclareCRS;

    /*@Column(name = "STP_DECLARE_EA")
    private String stpDeclareEA;

    @Column(name = "STP_DECLARE_PDPA_PROMOTION")
    private String stpDeclarePdpaPromotion;*/

    @Column(name = "STP_DECLARE_FATCA")
    private String stpDeclareFatca;

    @Column(name = "STP_DECLARE_TC")
    private String stpDeclareTc;

   /* @Column(name = "STP_DECLARE_MBB_EMPLOYEE")
    private String stpDeclareMbbEmployee;*/

    @Column(name = "STP_DECLARE_CONSENT")
    private String stpDeclareConsent;

    /*@Column(name = "STP_INCOME_UPDATED")
    private String stpIncomeUpdated;*/

    @Column(name = "STP_SCREEN_RESUME")
    private String stpScreenResume;

    @Column(name = "STP_STATUS")
    private String stpStatus;

  /*  @Column(name = "STP_END_SUBMISSION_DATE")
    private Date stpEndSubmissionDate;

    @Column(name = "STP_SUPP_ID_TYPE_CODE")
    private String stpSuppIdTypeCode;

    @Column(name = "STP_SUPP_ID_TYPE_DESC")
    private String stpSuppIdTypeDesc;*/

    @Column(name = "STP_APP_SUBMISSION_DATE")
    private Date stpAppSubmissionDate;

    @Column(name = "STP_EMPLOYMENT_TYPE_CODE")
    private String stpEmploymentTypeCode;

    @Column(name = "STP_EMPLOYMENT_TYPE_DESC")
    private String stpEmploymentTypeDesc;

    @Column(name = "STP_OCCUPATION_SECTOR_CODE")
    private String stpOccupationSectorCode;

    @Column(name = "STP_OCCUPATION_SECTOR_DESC")
    private String stpOccupationSectorDesc;

   /* @Column(name = "STP_OCCP_SECT_OTHERS_DESC")
    private String stpOccpSectOthersDesc;

    @Column(name = "STP_OCCP_OTHERS_DESC")
    private String stpOccpOthersDesc;

    @Column(name = "STP_SUPP_OCCP_OTHERS_DESC")
    private String stpSuppOccpOthersDesc;*/

    /*@Column(name = "STP_SUPP_EMP_TYPE_CODE")
    private String stpSuppEmpTypeCode;

    @Column(name = "STP_SUPP_EMP_TYPE_DESC")
    private String stpSuppEmpTypeDesc;

    @Column(name = "STP_SUPP_OCCP_SECTOR_CODE")
    private String stpSuppOccpSectorCode;*/

   /*@Column(name = "STP_SUPP_OCCP_SECTOR_DESC")
    private String stpSuppOccpSectorDesc;*/

  /*  @Column(name = "STP_SUPP_OCCP_SEC_OTH_DESC")
    private String stpSuppOccpSecOthDesc;

    @Column(name = "STP_MERCHANT_ID")
    private String stpMerchantId;

    @Column(name = "STP_LOAN_TERM")
    private String stpLoanTerm;*/

    @Column(name = "STP_LOAN_AMOUNT")
    private String stpLoanAmount;

    @Column(name = "STP_INTEREST_RATE")
    private String stpInterestRate;

    @Column(name = "STP_DIBM_ACC_NO")
    private String stpDibmAccNo;

    /*@Column(name = "STP_LOAN_PURPOSE")
    private String stpLoanPurpose;*/

    @Column(name = "STP_PL_INSRNCE")
    private String stpPlInsrnce;

    /*@Column(name = "STP_THRSHLD_AMT")
    private String stpThrshldAmt;

    @Column(name = "STP_MIPF_AKAD")
    private String stpMipfAkad;

    @Column(name = "STP_PL_PACKAGE_CODE")
    private String stpPlPackageCode;*/

    @Column(name = "STP_MNTHLY_RPYMNT")
    private String stpMnthlyRpymnt;

/*    @Column(name = "STP_GROSS_INCOME_PL")
    private String stpGrossIncomePl;*/

    @Column(name = "STP_ASB_HOLDER_NUM")
    private String stpAsbHolderNum;

    @Column(name = "STP_SMOKER_STATUS")
    private String stpSmokerStatus;

    @Column(name = "STP_INSRNCE_AMOUNT")
    private String stpInsrnceAmount;

    @Column(name = "STP_CERTIFICATES_NUM")
    private String stpCertificatesNum;

    @Column(name = "STP_RELIGION_CODE")
    private String stpReligionCode;

    @Column(name = "STP_ETHNIC_CODE")
    private String stpEthnicCode;

   /* @Column(name = "STP_OVERSEA_ADDR")
    private String stpOverseaAddr;*/

    @Column(name = "STP_LEAD_GEN_NAME")
    private String stpLeadGenName;

    @Column(name = "STP_LEAD_GEN_PF_NO")
    private String stpLeadGenPfNo;

    /*@Column(name = "STP_TAX_COUNTRY")
    private String stpTaxCountry;

    @Column(name = "STP_TAX_PAYER_ID")
    private String stpTaxPayerId;

    @Column(name = "STP_TAX_PAYER_ID_FLAG")
    private String stpTaxPayerIdFlag;

    @Column(name = "STP_TIN_REASON")
    private String stpTinReason;

    @Column(name = "STP_TAX_PAYER_MY")
    private String stpTaxPayerMy;*/

   /* @Column(name = "STP_SALES_PERSON_PF_NO")
    private String stpSalesPersonPfNo;

    @Column(name = "STP_CAMPAIGN_CODE")
    private String stpCampaignCode;*/

    @Column(name = "STP_LEAD_BRANCH_CODE")
    private String stpLeadBranchCode;

    @Column(name = "STP_PEP")
    private String stpPep;

    @Column(name = "STP_RISK_RATING")
    private String stpRiskRating;

    @Column(name = "STP_RISK_RATING_DESC")
    private String stpRiskRatingDesc;

    @Column(name = "STP_COUNTRY_OF_BIRTH")
    private String stpCountryOfBirth;

    @Column(name = "STP_UCIF_NO")
    private String stpUcifNo;

    @Column(name = "STP_SOURCE_OF_INCOME")
    private String stpSourceOfIncome;

   /* @Column(name = "STP_SOURCE_OF_FUND")
    private String stpSourceOfFund;*/

    @Column(name = "STP_SOURCE_OF_WEALTH")
    private String stpSourceOfWealth;

    /*@Column(name = "STP_PARTY_CREATED")
    private String stpPartyCreated;*/

    //new Added

    /*@Column(name = "STP_CREDIT_SCORE")
    private String stpCreditScore;*/

    @Column(name = "STP_CITIZENSHIP_CODE")
    private String stpCitizenshipCode;

    @Column(name = "STP_CITIZENSHIP_DESC")
    private String stpCitizenshipDesc;

    @Column(name = "STP_INCOME_TYPE")
    private String stpIncomeType;

    @Column(name = "STP_FACILITY")
    private String stpFacility;

    @Column(name = "STP_BACKEND_REF_NO")
    private String stpBackendRefNo;

    @Column(name = "STP_STATUS_DESC")
    private String stpStatusDesc;

    @Column(name = "STP_HOME_ADDR_IDENTIFIER")
    private Integer stpHomeAddrIdentifier;

    // need to add
    @Column(name = "STP_OFFICE_ADDR_IDENTIFIER")
    private Integer stpOfficeAddrIdentifier;

    @Column(name = "STP_HOME_PHONE_IDENTIFIER")
    private Integer stpHomePhoneIdentifier;

    @Column(name = "STP_MOBILE_PHONE_IDENTIFIER")
    private Integer stpMobilePhoneIdentifier;

    @Column(name = "STP_OFFICE_PHONE_IDENTIFIER")
    private Integer stpOfficePhoneIdentifier;

    @Column(name = "STP_MANUAL_RISK_RATING_CODE")
    private String stpManualRiskRatingCode;

    @Column(name = "STP_MANUAL_RISK_RATING_DESC")
    private String stpManualRiskRatingDesc;

    @Column(name = "STP_ASSESSMENT_ID")
    private String stpAssessmentId;

    @Column(name = "STP_SANCTION_TAGGING_CODE")
    private String stpSanctionsTaggingCode;

    @Column(name = "STP_SANCTION_TAGGING_DESC")
    private String stpSanctionsTaggingDesc;

    @Column(name = "STP_NUM_OF_WATCH_LIST_HITS")
    private Integer stpNumOfWatchlistHits;

    @Column(name = "STP_CUSTOMER_TITLE_DESC")
    private String stpCustomerTitleDesc;

    @Column(name = "STP_ACCOUNT_NUMBER")
    private String stpAccountNumber;

    /*@Column(name = "STP_DIBM_ACC_NO_CODE")
    private String stpDibmAccNoCode;*/

    @Column(name = "STP_DIBM_ACC_NAME")
    private String stpDibmAccName;

    @Column(name = "STP_GCIF_NO")
    private String stpGcifNo;

    /*@Column(name = "STP_OFFERED_AMOUNT")
    private String stpOfferedAmount;

    @Column(name = "STP_PREQUAL2_STATUS")
    private String stpPrequal2Status;*/

    @Column(name = "STP_PRE3_REF_NO")
    private String stpPre3StpRefNo;

    @Column(name = "STP_DISBURSED_AMOUNT")
    private String stpDisbursedAmount;

    /*@Column(name = "STP_IET_GROSS_INCOME")
    private String stpIetGrossIncome;

    @Column(name = "STP_IET_NET_INCOME")
    private String stpIetNetIncome;*/

    @Column(name = "STP_MOB_PRIM_INDC")
    private String stpMobPrimIndc;

    /*@Column(name = "STP_LOAN_ACC_NO")
    private String stpLoanAccNo;

    @Column(name = "STP_LAST_INSTALMENT_DATE")
    private String stpLastInstalmentDate;

    @Column(name = "STP_OUTSTANDING_AMT")
    private String stpOutstandingAmt;*/

    //newly added for ASB

    @Column(name = "STP_UBB_UNITS")
    private String stpUbbUnits;

    @Column(name = "STP_UBC_UNITW")
    private String stpUbcUnits;

    @Column(name = "STP_TYPE_OF_LOAN")
    private String stpTypeOfLoan;

    @Column(name = "STP_AMOUNT_I_NEED")
    private String stpAmountINeed;

    @Column(name = "STP_BRANCH")
    private String stpBranch;

    @Column(name = "STP_STATE")
    private String stpState;

    @Column(name = "STP_Area")
    private String stpArea;

    @Column(name = "STP_STAFFID")
    private String stpStaffId;

    @JsonFormat(timezone="Asia/Kuala_Lumpur")
    @Column(name = "STP_LAST_UPDATED_DATE")
    private Date stpLastUpdatedDate;

    @Column(name = "STP_IS_USA_CITIZEN")
    private String stpIsUsaCitizen;

    @Column(name = "STP_COUNTRY_TAX_RESI")
    private String stpCountryTaxResi;

    @Column(name = "STP_MALAYSIA_TAX_PAYER")
    private String stpMalaysiaTaxPayer;

    @Column(name = "STP_REASON")
    private String stpReason;

    @Column(name = "STP_EMPLOYMENT_DURATION")
    private String stpEmploymentDuration;

    @Column(name = "STP_PRODUCT_CODE")
    private String stpProductCode;

    /*@Column(name = "STP_PRODUCT_DESC")
    private String stpProductDesc;*/

    @Column(name = "STP_PARTY_CLASS_CODE")
    private String stpPartyClassCode;

    @Column(name = "STP_PARTY_CLASS_DESC")
    private String stpPartyClassDesc;

    @Column(name = "STP_QUOTATION_ID")
    private String stpQuotationId;

    @Column(name = "STP_TOTAL_GROSS_PREMIUM")
    private String stpTotalGrossPremium;

    @Column(name = "STP_TOTAL_NET_PREMIUM")
    private String stpTotalNetPremium;

    @Column(name = "STP_MONTHLY_INSTALMENT2")
    private String stpMonthlyInstalment2;

    @Column(name = "STP_INTEREST_RATE2")
    private String stpInterestRate2;

    @Column(name = "STP_COUNTRY_SOURCE_OF_FUNDS_CODE")
    private String stpCountrySourceOfFundsCode;

    @Column(name = "STP_COUNTRY_SOURCE_OF_FUNDS_DESC")
    private String stpCountrySourceOfFundsDesc;

    @Column(name = "STP_ONBOARDING_STATUS_CODE")
    private String stpOnboardingStatusCode;

    @Column(name = "STP_ONBOARDING_STATUS_DESC")
    private String stpOnboardingStatusDesc;

    @Column(name = "STP_MONTHLY_PAYMENT")
    private Double stpMonthlyPayment;

    @Column(name = "STP_TOTAL_FINANCING_AMOUNT")
    private Double stpTotalFinancingAmount;

    @Column(name = "STP_RECOMMENDED_FINANCING_TENURE")
    private String stpFinancingTenure;

    @Column(name = "STP_PROFIT_RATE")
    private Double stpProfitRate;

    @Column(name = "STP_INSURANCE_FEE")
    private Double stpInsuranceRate;

    @Column(name = "STP_POTENTIAL_EARNING")
    private Double stpPotentialEarning;

    @Column(name = "STP_TIER1_YEAR")
    private String stpTier1Year;

    @Column(name = "STP_TIER2_YEAR")
    private String stpTier2Year;

    @Column(name = "STP_ELIGIBILITY_RESPONSE")
    private String stpEligibilityResponse;

    @Column(name = "STP_FO_CREATE_TIME")
    private Date stpFOCreateTime;

    @Column(name = "STP_ACCOUNT_SNAME")
    private String stpAccountSName;

    @Column(name = "STP_LEAD_STATE_CODE")
    private String stpLeadStateCode;

    @Column(name = "STP_ELIGIBILTY_TIER_LIST")
    private String stpEligibilityTierList;

    @Column(name = "STP_ACCOUNT_PROFILE")
    private String stpAccountProfile;

    @Column(name = "STP_DOC_ACKNOWLEDGEMENT_DATE")
    private Date stpDocAcknowledgementDate ;

    @Column(name = "STP_APPLICANT_REF")
    private String stpApplicantRef;

    @Column(name = "STP_RELATIONSHIP_TO_APPLICANT")
    private String stpRelationshipToApplicant;

    @Column(name = "STP_ROLE_TYPE")
    private String stpRoleType;

    @Column(name = "STP_IS_STAFF")
    private String stpIsStaff;

    @Column(name = "STP_INSURED_TENURE")
    private String stpInsuredTenure;

    @Column(name = "STP_IS_INSURED")
    private String stpIsInsured;

    @Column(name = "STP_ADDITIONAL_INCOME")
    private String stpAdditionalIncome;

    //added as a part of Migration for Maya Home

    @Column(name = "STP_IS_MAILING_ADDR")
    private String stpIsMailingAdd;

    @Column(name = "STP_DCRSR_CHECK")
    private String stpDcrsrCheck;

    @Column(name = "STP_FATCA1_CHECK")
    private String stpFatca1Check;

    @Column(name = "STP_FATCA2_CHECK")
    private String stpFatca2Check;

    @Column(name = "STP_PDI_CHECK")
    private String stpPdiCheck;

    @Column(name = "STP_PDS_CHECK")
    private String stpPdsCheck;

    @Column(name = "STP_PN_CHECK")
    private String stpPnCheck;

    @Column(name = "STP_PN_YES_CHECK")
    private String stpPnYesCheck;

    @Column(name = "STP_ACCEPT_PRODUCT_CHECK")
    private String stpAcceptProductCheck;

    @Column(name = "STP_STAFF_NAME")
    private String stpStaffName;

    @Column(name = "STP_CAR_LOAN")
    private String stpCarLoan;

    @Column(name = "STP_PERSONAL_LOAN")
    private String stpPersonalLoan;

    @Column(name = "STP_CC_REPAYMENTS")
    private String stpCcRepayments;

    @Column(name = "STP_SPOUSE_INCOME")
    private String stpSpouseIncome;

    @Column(name = "STP_PAN")
    private String stpPan;

    @Column(name = "STP_SAVE_DATA")
    private String stpSaveData;

    @Column(name = "STP_EXISTING_HOUSE_LOAN")
    private String stpExistingHouseLoan;

    @Column(name = "STP_HOUSING_LOAN")
    private String stpHousingLoan;

    @Column(name = "STP_ONGOING_LOAN")
    private String stpOngoingLoan;

    @Column(name = "STP_CCRIS_LOAN_COUNT")
    private String stpCcrisLoanCount;

    @Column(name = "STP_ORIG_LOAN_AMOUNT")
    private String stpOrigLoanAmount;

    @Column(name = "STP_ORIG_TENURE")
    private String stpOrigTenure;

    @Column(name = "STP_OVERDRAFT")
    private String stpOverdraft;

    @Column(name = "STP_PROGRESS_STATUS")
    private String stpProgressStatus;

    @Column(name = "STP_STAGE")
    private String stpStage;

    @Column(name = "STP_STAGE_DESC")
    private String stpStageDesc;

    @Column(name = "STP_IS_SAME_PROP")
    private String stpIsSameProp;

    @Column(name = "STP_STATUS_ORDER")
    private Integer stpStatusOrder;

    @Column(name = "STP_MAILING_ADDR1")
    private String stpMailingAddr1;

    @Column(name = "STP_MAILING_ADDR2")
    private String stpMailingAddr2;

    @Column(name = "STP_MAILING_ADDR3")
    private String stpMailingAddr3;

    @Column(name = "STP_MAILING_CITY")
    private String stpMailingCity;

    @Column(name = "STP_MAILING_STATE")
    private String stpMailingState;

    @Column(name = "STP_MAILING_POSTCODE")
    private String stpMailingPostcode;

    @Column(name = "STP_MAILING_COUNTRY")
    private String stpMailingCountry;

    @Column(name = "STP_FINANCING_PLAN_TITLE")
    private String stpFinancingPlanTitle;

    @Column(name = "STP_FINANCING_TYPE_TITLE")
    private String stpFinancingTypeTitle;

    @Column(name = "STP_PRIMARY_SOURCE_OF_INCOME")
    private String stpPrimarySourceOfIncome;

    @Column(name = "STP_CONSENT_OPTION")
    private String stpConsentOption;

    @Column(name = "STP_SIGNATURE")
    private String stpSignature;

    @Column(name = "STP_VIEW_PARTY_RESPONSE")
    private String stpViewPartyResponse;

    @Column(name = "STP_MOBILE_CONTACT_COUNTRY_CODE")
    private String stpMobileContactCountryCode;

    @Column(name = "STP_HOME_CONTACT_COUNTRY_CODE")
    private String stpHomeContactCountryCode;

    @Column(name = "STP_EMPLOYER_CONTACT_COUNTRY_CODE")
    private String stpEmployerContactCountryCode;

    @Transient
    private String stpIsHomeAsMailingAdd;

    @Column(name = "STP_PARTY_GROUP")
    private String stpPartyGroup;

    @Column(name = "STP_IS_FIRST_TIME_BUYER")
    private String stpIsFirstTimeBuyer;

    @Column(name = "STP_GUARANTOR_NAME")
    private String stpGuarantorName;

    @Column(name = "STP_STAFF_CONTACT_NUMBER")
    private String stpStaffContactNumber;

    @Column(name = "STP_STAFF_CONTACT_PREFIX")
    private String stpStaffContactPrefix;

    @Column(name = "STP_ZAKAT")
    private String stpZakat;

    @Column(name = "STP_ALTERNATE_ID_TYPE")
    private String stpAlternateIdType;

    @Column(name = "STP_ALTERNATE_ID_NUMBER")
    private String stpAlternateIdNumber;

    @Column(name = "STP_ALTERNATE_ID_IDENTIFIER")
    private Integer stpAlternateIdIdentifier;

    @Column(name = "STP_CONTRACTUAL_BONUS")
    private String stpContractualBonus;

    @Column(name = "STP_NONCONTRACTUAL_BONUS")
    private String stpNonContractualBonus;

    @Column(name = "STP_FIXED_ALLOWANCES")
    private String stpFixedAllowances;

    @Column(name = "STP_VARIABLE_ALLOWANCES")
    private String stpVariableAllowances;

    @Column(name = "STP_EXISTING_RENTAL")
    private String stpExistingRental;

    @Column(name = "STP_PENSION")
    private String stpPension;

    @Column(name = "STP_INTEREST_DEPOSIT_FIXED")
    private String stpInterestDepositFixed;

    @Column(name = "STP_COMMISSION")
    private String stpCommission;

    @Column(name = "STP_OVERTIME")
    private String stpOverTime;

    @Column(name = "STP_SERVICE_POINTS")
    private String stpServicePoints;

    @Column(name = "STP_DIVIDENDS_EPF")
    private String stpDividendsEpf;

    @Column(name = "STP_DIVIDENDS_HAJI_TABUNG")
    private String stpDividendsHajiTabung;

    @Column(name = "STP_DIVIDENDS_FUNDS_ASNB")
    private String stpDividendsFundsAsnb;

    @Column(name = "STP_TOTAL_GROSS_INCOME")
    private String stpTotalGrossIncome;

    @Column(name = "STP_TOTAL_NET_INCOME")
    private String stpTotalNetIncome;

    @Column(name = "STP_OTHER_HIRE_PURCHASE")
    private String stpOtherHirePurchase;

    @Column(name = "STP_OTHER_TERM_LOAN")
    private String stpOtherTermLoan;

    @Column(name = "STP_OTHER_HOUSING_LOAN")
    private String stpOtherHousingLoan;

    @Column(name = "STP_OTHER_OVERDRAFT")
    private String stpOtherOverdraft;

    @Column(name = "STP_CREDIT_CARD_COMMIT")
    private String stpCreditCard;

    @Column(name = "STP_DSR_VALUE")
    private String stpDsrValue;
}

