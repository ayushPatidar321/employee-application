package com.example.demo.repo;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.STPApplication;


public interface STPApplicationRepository extends JpaRepository<STPApplication, String>, JpaSpecificationExecutor<STPApplication> {

	@Query("select stp_card from STPApplication stp_card where stp_card.stpReferenceNo = :stpRefNo and stp_card.stpIdno = :idNo and stp_card.stpApplicationTypeCode= :productType")
	Optional<STPApplication> fetchSTPApplicationDetails(@Param("stpRefNo") String stpRefNo,@Param("idNo") String idNo, @Param("productType") String productType);
	
	@Query(value = "select TOP 1 * from STP_APPLICATION where STP_IDNO = :idNo and STP_APPLICATION_TYPE_CODE = :productType order by STP_CREATE_TIME desc, STP_REFERENCE_NO desc", nativeQuery = true)
	Optional<STPApplication> fetchResumeApplicationDetails(@Param("idNo") String idNo, @Param("productType") String productType);
	
	@Modifying
    @Transactional
    @Query("update STPApplication stp set stp.stpDeclareConsent = :declareConsent, stp.stpScreenResume= :stpScreenResume where stp.stpReferenceNo = :stpRefNum")
	int updateConsent(@Param("declareConsent") String declareConsent,@Param("stpScreenResume") String stpScreenResume, @Param("stpRefNum") String stpRefNum);
	
	@Modifying
    @Transactional
    @Query("update STPApplication stp set stp.stpTypeOfLoan= :stpTypeOfLoan,stp.stpAmountINeed = :stpAmountINeed,stp.stpCertificatesNum = :stpCertificatesNum,stp.stpTenure = :stpTenure, "
    		+ "stp.stpSmokerStatus = :stpSmokerStatus, stp.stpScreenResume= :stpScreenResume  where stp.stpReferenceNo = :stpRefNum")
	int updateFinancingDtls(@Param("stpTypeOfLoan") String stpTypeOfLoan,@Param("stpAmountINeed") String stpAmountINeed,@Param("stpCertificatesNum") String stpCertificatesNum,
			@Param("stpTenure") String stpTenure, @Param("stpSmokerStatus") String stpSmokerStatus, @Param("stpScreenResume") String stpScreenResume, @Param("stpRefNum") String stpRefNum);
	
	@Modifying
    @Transactional
    @Query("update STPApplication stp set stp.stpGrossIncome = :monthlyGrossIncome, stp.stpOtherCommitments = :monthlyNonBankCommitments, stp.stpState = :state,"+
            " stp.stpArea= :area, stp.stpBranch=:branch,stp.stpScreenResume= :stpScreenResume, stp.stpLeadBranchCode=:stpLeadBranchCode,stp.stpLeadStateCode= :stpLeadStateCode "
            + " where stp.stpReferenceNo = :stpRefNum ")
	int updateIncomeDtls(@Param("monthlyGrossIncome") String monthlyGrossIncome,@Param("monthlyNonBankCommitments") String monthlyNonBankCommitments, @Param("state") String state, 
			@Param("area") String area, @Param("branch") String branch, @Param("stpScreenResume") String stpScreenResume,@Param("stpLeadBranchCode") String stpLeadBranchCode, @Param("stpLeadStateCode") String stpLeadStateCode, @Param("stpRefNum") String stpRefNum );
	
	@Modifying
    @Transactional
	@Query("update STPApplication stp set stp.stpStaffId = :staffId, stp.stpScreenResume= :stpScreenResume where stp.stpReferenceNo = :stpRefNum")
	int updateStaffId(@Param("staffId") String staffId, @Param("stpScreenResume") String stpScreenResume, @Param("stpRefNum") String stpRefNum);
	
	@Modifying
    @Transactional
	@Query("update STPApplication stp set stp.stpMonthlyPayment = :stpMonthlyPayment,stp.stpTotalFinancingAmount = :stpTotalFinancingAmount,stp.stpFinancingTenure = :stpFinancingTenure ,stp.stpProfitRate = :stpProfitRate, stp.stpInsuranceRate = :stpInsuranceRate,stp.stpPotentialEarning = :stpPotentialEarning, stp.stpScreenResume= :stpScreenResume, stp.stpEligibilityTierList= :stpEligibilityTierList  where stp.stpReferenceNo = :stpRefNum")
	int updateMonthlyPayment(@Param("stpMonthlyPayment") double stpMonthlyPayment, @Param("stpTotalFinancingAmount") double stpTotalFinancingAmount, @Param("stpFinancingTenure") String stpFinancingTenure,@Param("stpProfitRate") double stpProfitRate,
			@Param("stpInsuranceRate") double stpInsuranceRate,@Param("stpPotentialEarning") double stpPotentialEarning, @Param("stpScreenResume") String stpScreenResume,@Param("stpEligibilityTierList") String stpEligibilityTierList , @Param("stpRefNum") String stpRefNum
			);
	
	@Modifying
    @Transactional
	@Query("update STPApplication stp set stp.stpIsUsaCitizen = :stpIsUsaCitizen , stp.stpCountryTaxResi= :stpCountryTaxResi, stp.stpMalaysiaTaxPayer = :stpMalaysiaTaxPayer,"
			+ " stp.stpReason = :stpReason, stp.stpScreenResume= :stpScreenResume where stp.stpReferenceNo = :stpRefNum")
	int updateFacta(@Param("stpIsUsaCitizen") String stpIsUsaCitizen,@Param("stpCountryTaxResi" )String stpCountryTaxResi,@Param("stpMalaysiaTaxPayer") String stpMalaysiaTaxPayer,@Param("stpReason" )String stpReason,
			@Param("stpScreenResume") String stpScreenResume, @Param("stpRefNum") String stpRefNum);
	
	@Modifying
    @Transactional
	@Query("update STPApplication stp set stp.stpMaritalStatusCode = :stpMaritalStatusCode ,stp.stpMaritalStatusDesc = :stpMaritalStatusDesc , stp.stpEducationCode= :stpEducationCode,stp.stpEducationDesc= :stpEducationDesc, stp.stpMobileContactPrefix = :stpMobileContactPrefix, stp.stpMobileContactNumber = :stpMobileContactNumber,"
			+ "stp.stpEmail = :stpEmail , stp.stpHomeCountry = :stpHomeCountry , stp.stpHomePostcode = :stpHomePostcode ,stp.stpHomeStateCode = :stpHomeStateCode, stp.stpHomeStateDesc = :stpHomeStateDesc, stp.stpHomeCity= :stpHomeCity, stp.stpHomeAddress1= :stpHomeAddress1, stp.stpHomeAddress2 = :stpHomeAddress2, stp.stpHomeAddress3 = :stpHomeAddress3, stp.stpRaceCode= :stpRaceCode, stp.stpRaceDesc=:stpRaceDesc , "
			+ "stp.stpScreenResume= :stpScreenResume where stp.stpReferenceNo = :stpRefNum")
	int updatePersonalDtls(@Param("stpMaritalStatusCode") String stpMaritalStatusCode,@Param("stpMaritalStatusDesc") String stpMaritalStatusDesc,@Param("stpEducationCode" )String stpEducationCode,@Param("stpEducationDesc" )String stpEducationDesc,@Param("stpMobileContactPrefix") String stpMobileContactPrefix, @Param("stpMobileContactNumber") String stpMobileContactNumber,@Param("stpEmail" )String stpEmail,
			@Param("stpHomeCountry") String stpHomeCountry, @Param ("stpHomePostcode") String stpHomePostcode,@Param("stpHomeStateCode") String stpHomeStateCode,@Param("stpHomeStateDesc") String stpHomeStateDesc, @Param("stpHomeCity") String stpHomeCity, @Param("stpHomeAddress1") String stpHomeAddress1,@Param("stpHomeAddress2") String stpHomeAddress2,@Param("stpHomeAddress3") String stpHomeAddress3,@Param("stpRaceCode") String stpRaceCode,@Param("stpRaceDesc") String stpRaceDesc, @Param("stpScreenResume") String stpScreenResume, @Param("stpRefNum") String stpRefNum);
	
	@Modifying
    @Transactional
    @Query("update STPApplication stp set stp.stpOccupationCode = :stpOccupationCode , stp.stpOccupationDesc= :stpOccupationDesc, stp.stpOccupationSectorCode= :stpOccupationSectorCode, stp.stpOccupationSectorDesc = :stpOccupationSectorDesc, stp.stpEmployerName = :stpEmployerName,"
			+ "stp.stpEmploymentTypeCode = :stpEmploymentTypeCode , stp.stpEmploymentTypeDesc= :stpEmploymentTypeDesc, stp.stpEmploymentDuration= :stpEmploymentDuration, stp.stpServiceLengthYear= :stpEmploymentDurationYear , stp.stpServiceLengthMonth= :stpEmploymentDurationMonth, stp.stpScreenResume= :stpScreenResume  where stp.stpReferenceNo = :stpRefNum")
	int updateEmploymentDtls1(@Param("stpOccupationCode") String stpOccupationCode,@Param("stpOccupationDesc") String stpOccupationDesc, @Param("stpOccupationSectorCode" ) String stpOccupationSectorCode, @Param("stpOccupationSectorDesc")String stpOccupationSectorDesc, @Param("stpEmployerName") String stpEmployerName,@Param("stpEmploymentTypeCode" )String stpEmploymentTypeCode,
			@Param("stpEmploymentTypeDesc") String stpEmploymentTypeDesc, @Param("stpEmploymentDuration") String stpEmploymentDuration, @Param("stpEmploymentDurationYear") String stpEmploymentDurationYear,@Param("stpEmploymentDurationMonth") String stpEmploymentDurationMonth, @Param("stpScreenResume") String stpScreenResume, @Param("stpRefNum") String stpRefNum);
	
	@Modifying
    @Transactional
	@Query("update STPApplication stp set stp.stpEmployerCountry = :stpEmployerCountry , stp.stpEmployerAddress1= :stpEmployerAddress1, stp.stpEmployerAddress2 = :stpEmployerAddress2,"
			+ "stp.stpEmployerAddress3 = :stpEmployerAddress3 , stp.stpEmployerPostcode= :stpEmployerPostcode,stp.stpEmployerStateCode= :stpEmployerStateCode,stp.stpEmployerStateDesc= :stpEmployerStateDesc, stp.stpEmployerCity= :stpEmployerCity, "
			+ "stp.stpEmployerContactPrefix=:stpEmployerContactPrefix, stp.stpEmployerContactNumber= :stpEmployerContactNumber,stp.stpScreenResume= :stpScreenResume where stp.stpReferenceNo = :stpRefNum")
	int updateEmploymentDtls2(@Param("stpEmployerCountry") String stpEmployerCountry,@Param("stpEmployerAddress1" ) String stpEmployerAddress1,@Param("stpEmployerAddress2") String stpEmployerAddress2,@Param("stpEmployerAddress3" )String stpEmployerAddress3,
			@Param("stpEmployerPostcode") String stpEmployerPostcode, @Param("stpEmployerStateCode") String stpEmployerStateCode,@Param("stpEmployerStateDesc") String stpEmployerStateDesc, @Param("stpEmployerCity") String stpEmployerCity, @Param("stpEmployerContactPrefix") String stpEmployerContactPrefix, @Param("stpEmployerContactNumber") String stpEmployerContactNumber, @Param("stpScreenResume") String stpScreenResume, @Param("stpRefNum") String stpRefNum);
	
	@Modifying
    @Transactional
	@Query("update STPApplication stp set stp.stpSourceOfIncome = :stpSourceOfIncome , stp.stpSourceOfWealth= :stpSourceOfWealth,stp.stpScreenResume= :stpScreenResume where stp.stpReferenceNo = :stpRefNum")
	int updateAdditionalIncome(@Param("stpSourceOfIncome") String stpSourceOfIncome,@Param("stpSourceOfWealth" ) String stpSourceOfWealth,@Param("stpScreenResume") String stpScreenResume, @Param("stpRefNum") String stpRefNum);
	
	@Modifying
    @Transactional
	@Query("update STPApplication stp set stp.stpLoanAmount = :stpLoanAmount , stp.stpTenure= :stpTenure, stp.stpCertificatesNum= :stpCertificatesNum, stp.stpGrossIncome = :stpGrossIncome,"
			+ "stp.stpQuotationId = :stpQuotationId , stp.stpTotalGrossPremium= :stpTotalGrossPremium,stp.stpTotalNetPremium= :stpTotalNetPremium,stp.stpInterestRate= :stpInterestRate, stp.stpMonthlyInstalment= :stpMonthlyInstalment, "
			+ " stp.stpInterestRate2 = :stpInterestRate2, stp.stpMonthlyInstalment2= :stpMonthlyInstalment2, stp.stpTier1Year = :stpTier1Year, stp.stpTier2Year=:stpTier2Year where stp.stpReferenceNo = :stpRefNum")
	int savePremiumResponse(@Param("stpLoanAmount") String stpLoanAmount,@Param("stpTenure" ) String stpTenure, @Param("stpCertificatesNum") String stpCertificatesNum, @Param("stpGrossIncome" ) String stpGrossIncome, @Param("stpQuotationId") String stpQuotationId,@Param("stpTotalGrossPremium" )String stpTotalGrossPremium,
			@Param("stpTotalNetPremium") String stpTotalNetPremium,@Param("stpInterestRate") String stpInterestRate, @Param("stpMonthlyInstalment") String stpMonthlyInstalment, @Param("stpInterestRate2") String stpInterestRate2,@Param("stpMonthlyInstalment2") String stpMonthlyInstalment2, @Param("stpTier1Year") String stpTier1Year, @Param("stpTier2Year") String stpTier2Year, @Param("stpRefNum") String stpRefNum);

	@Query("select stp_card from STPApplication stp_card where stp_card.stpReferenceNo = :stpRefNo")
	Optional<STPApplication> fetchLoanDetails(@Param("stpRefNo") String stpRefNo);
	
	@Modifying
    @Transactional
	@Query("update STPApplication stp set stp.stpStatus = :stpStatus where stp.stpReferenceNo = :stpRefNum")
	int updateStatus(@Param("stpStatus") String stpStatus, @Param("stpRefNum") String stpRefNum);
	
	@Modifying
    @Transactional
	@Query("update STPApplication stp set stp.stpAccountNumber=:stpAccountNumber, stp.stpAccountType=:stpAccountType, stp.stpAccountSName=:stpAccountSName, stp.stpScreenResume= :stpScreenResume where stp.stpReferenceNo = :stpRefNum")
	int updateAccountDtls(@Param("stpAccountNumber") String stpAccountNumber, @Param("stpAccountType") String stpAccountType, @Param("stpAccountSName") String stpAccountSName, @Param("stpScreenResume") String stpScreenResume, @Param("stpRefNum") String stpRefNum);
	
	@Modifying
    @Transactional
	@Query("update STPApplication stp set stp.stpEligibilityResponse = :stpEligibilityResponse, stp.stpStatus=:stpStatus where stp.stpReferenceNo = :stpRefNum")
	int updateEligibilityResAndStatus(@Param("stpEligibilityResponse") String stpEligibilityResponse, @Param("stpRefNum") String stpRefNum, @Param("stpStatus") String stpStatus);
	
	@Modifying
    @Transactional
	@Query("update STPApplication stp set stp.stpDeclarePdpa = :declarePdpa, stp.stpScreenResume= :stpScreenResume where stp.stpReferenceNo = :stpRefNum")
	int updateDeclarePdpa(@Param("declarePdpa") String declarePdpa, @Param("stpScreenResume") String stpScreenResume, @Param("stpRefNum") String stpRefNum);
	
	@Modifying
    @Transactional
	@Query("update STPApplication stp set stp.stpStatus = :stpStatus, stp.stpAppSubmissionDate=:stpAppSubmissionDate where stp.stpReferenceNo = :stpRefNum")
	int updateStatusDtls(@Param("stpStatus") String stpStatus, @Param("stpAppSubmissionDate") Date stpAppSubmissionDate, @Param("stpRefNum") String stpRefNum);
	
	@Query("select stp_eligibility from STPApplication stp_eligibility where stp_eligibility.stpReferenceNo = :stpRefNo")
	Optional<STPApplication> fetchSTPApplicationDtls(@Param("stpRefNo") String stpRefNo);
	
	
	@Query(value = "select  * from STP_APPLICATION where STP_IDNO = :idNo "
			+ "and STP_APPLICATION_TYPE_CODE = :productType "
			+ "and STP_FO_CREATE_TIME is not null and STP_STATUS in :statusList"
			+ " order by STP_CREATE_TIME desc, STP_REFERENCE_NO desc"
			, nativeQuery = true)
	Optional<List<STPApplication>> fetchResumeApplicationDetailsForFO(@Param("idNo") String idNo, @Param("productType") String productType,
			@Param("statusList") List<String> statusList);
	
	
	@Query(value = "select  * from STP_APPLICATION where STP_IDNO = :idNo "
			+ "and STP_APPLICATION_TYPE_CODE = :productType and"
			+ " ( STP_STATUS in :statusList ) AND STP_ROLE_TYPE = 'A'"
			+ " order by STP_CREATE_TIME desc, STP_REFERENCE_NO desc"
			, nativeQuery = true)
	Optional<List<STPApplication>> fetchResumeApplicationDtlsForApplicant(@Param("idNo") String idNo, @Param("productType") String productType,
			@Param("statusList") List<String> statusList);
	
	@Modifying
    @Transactional
	@Query("update STPApplication stp set stp.stpRiskRating = :stpRiskRating, stp.stpRiskRatingDesc= :stpRiskRatingDesc,stp.stpManualRiskRatingCode = :stpManualRiskRatingCode, stp.stpManualRiskRatingDesc= :stpManualRiskRatingDesc,stp.stpAssessmentId = :stpAssessmentId, stp.stpScreenResume= :stpScreenResume where stp.stpReferenceNo = :stpRefNum")
	int updateRiskDtls(@Param("stpRiskRating") String stpRiskRating, @Param("stpRiskRatingDesc") String stpRiskRatingDesc,@Param("stpManualRiskRatingCode") String stpManualRiskRatingCode,@Param("stpManualRiskRatingDesc") String stpManualRiskRatingDesc,@Param("stpAssessmentId") String stpAssessmentId,@Param("stpScreenResume") String stpScreenResume, @Param("stpRefNum") String stpRefNum);
	
	
	/*
	 * @Modifying
	 * 
	 * @Transactional
	 * 
	 * @Query("update STPApplication stp set stp.stpAccountProfile = :stpAccountProfile where stp.stpReferenceNo = :stpRefNum"
	 * ) int updateAccoutProfile(@Param("stpAccountProfile") String
	 * stpAccountProfile, @Param("stpRefNum") String stpRefNum);
	 */
	
	@Query("select stp_card from STPApplication stp_card where stp_card.stpReferenceNo = :stpRefNo and stp_card.stpDocAcknowledgementDate is not null")
	Optional<STPApplication> fetchSTPApplicationDetailsWithDocAcknowledementDate(@Param("stpRefNo") String stpRefNo);
	
	@Modifying
    @Transactional
	@Query("update STPApplication stp set stp.stpStatus = :stpStatus , stp.stpDocAcknowledgementDate = :stpDocAcknowledgementDate  where stp.stpReferenceNo = :stpRefNum ")
	int updateStatusAndDocAcknowledgementDate(@Param("stpStatus") String stpStatus, @Param("stpDocAcknowledgementDate") Date stpDocAcknowledgementDate ,@Param("stpRefNum") String stpRefNum);
	
	@Modifying
    @Transactional
	@Query("update STPApplication stp set stp.stpStatus = :stpStatus, stp.stpFOCreateTime=:stpFOCreateTime where stp.stpReferenceNo = :stpRefNum")
	int updateStatusAndFOCreateTime(@Param("stpStatus") String stpStatus, @Param("stpFOCreateTime") Date stpFOCreateTime, @Param("stpRefNum") String stpRefNum);
	
	@Modifying
    @Transactional
	@Query("update STPApplication stp set stp.stpDeclareTc = :guarantorTcDeclare, stp.stpScreenResume= :stpScreenResume where stp.stpReferenceNo = :stpRefNum")
	int updateGuarantorDeclaration(@Param("guarantorTcDeclare") String guarantorTcDeclare, @Param("stpScreenResume") String stpScreenResume, @Param("stpRefNum") String stpRefNum);
	
	@Query("select stp from STPApplication stp where stp.stpApplicantRef = :stpApplicantRef and stp.stpRoleType = :stpRoleType")
	Optional<STPApplication> fetchSTPApplicationDtlsByStpApplicantRefAndStpRoleType(@Param("stpApplicantRef") String stpApplicantRef, @Param("stpRoleType") String stpRoleType);
	
	@Query("select stp_card from STPApplication stp_card where stp_card.stpIdno = :stpIdno and stp_card.stpRoleType NOT IN (:stpRoleType) order by STP_CREATE_TIME desc, STP_REFERENCE_NO desc")
	Optional<List<STPApplication>> fetchSTPApplicationDtlsWithICNoAndRoleTypeNotIn(@Param("stpIdno") String stpIdno,@Param("stpRoleType") String stpRoleType);
	
	@Modifying
    @Transactional
	@Query("update STPApplication stp set stp.stpScreenResume = :stpScreenResume ,stp.stpTypeOfLoan= :stpTypeOfLoan, stp.stpLoanAmount = :stpLoanAmount,"
			+ "stp.stpTenure = :stpTenure , stp.stpInsuredTenure= :stpInsuredTenure,stp.stpCertificatesNum= :stpCertificatesNum,stp.stpPlInsrnce= :stpPlInsrnce,stp.stpInsrnceAmount= :stpInsrnceAmount,stp.stpIsInsured= :stpIsInsured, stp.stpSmokerStatus= :stpSmokerStatus where stp.stpReferenceNo = :stpRefNum")
	int updateInsuredLoanDetails(@Param("stpScreenResume") String stpScreenResume,@Param("stpTypeOfLoan" ) String StpTypeOfLoan,@Param("stpLoanAmount") String stpLoanAmount,@Param("stpTenure" )String stpTenure,
			@Param("stpInsuredTenure") String stpInsuredTenure, @Param("stpCertificatesNum") String stpCertificatesNum,@Param("stpPlInsrnce") String stpPlInsrnce, @Param("stpInsrnceAmount") String StpInsrnceAmount, @Param("stpIsInsured") String stpIsInsured, @Param("stpSmokerStatus") String stpSmokerStatus,@Param("stpRefNum") String stpRefNum);
	
	@Query(value = "SELECT * FROM STP_APPLICATION WHERE STP_STAFFID = :staffId "
			+ "AND STP_APPLICATION_TYPE_CODE = :productType "
			+ "AND STP_STATUS in :stpStatus " + "AND STP_CREATE_TIME >= DATEADD(day,-:retrieveCasesDays, GETDATE())"
			, nativeQuery = true)
	Optional<List<STPApplication>> fetchActiveCasesList(@Param("staffId") String staffId, @Param("productType") String productType,
			@Param("stpStatus") List<String> stpStatus,@Param("retrieveCasesDays") int retrieveCasesDays);
	
	@Query(value = "SELECT * FROM STP_APPLICATION WHERE STP_STAFFID = :staffId "
			+ "AND STP_APPLICATION_TYPE_CODE = :productType "
			+ "AND STP_STATUS in :stpStatus " + "AND STP_APP_SUBMISSION_DATE >= DATEADD(day,-:submissionDays, GETDATE())"
			, nativeQuery = true)
	Optional<List<STPApplication>> fetchActiveCasesListBasedOnSubmissionDate(@Param("staffId") String staffId, @Param("productType") String productType,
			@Param("stpStatus") List<String> stpStatus,@Param("submissionDays") int submissionDays);
	
	@Query("select stp from STPApplication stp where stp.stpReferenceNo = :stpReferenceNo and stp.stpRoleType = :stpRoleType")
	Optional<STPApplication> fetchSTPApplicationDtlsByStpReferenceNoAndStpRoleType(@Param("stpReferenceNo") String stpReferenceNo, @Param("stpRoleType") String stpRoleType);
	
	@Query("select stp from STPApplication stp where stp.stpApplicantRef = :stpApplicantRef and stp.stpRoleType = :stpRoleType and stp.stpStatus NOT IN (:statusList)")
	Optional<STPApplication> fetchSTPApplicationDtlsByStpApplicantRefAndStpRoleTypeAndStatusNotIn(@Param("stpApplicantRef") String stpApplicantRef, @Param("stpRoleType") String stpRoleType,@Param("statusList") List<String> statusList);
	
	@Query(value = "SELECT * FROM STP_APPLICATION WHERE STP_IDNO = :idNumber "
			+ "AND STP_APPLICATION_TYPE_CODE = :productType "
			+ "AND STP_STATUS in :stpStatus ", nativeQuery = true)
	Optional<List<STPApplication>> fetchApplicationList(@Param("idNumber") String idNumber, @Param("productType") String productType,
			@Param("stpStatus") List<String> stpStatus);
	
	@Query("select stp from STPApplication stp where stp.stpApplicantRef = :stpApplicantReferenceNumber and stp.stpRoleType = 'G' and stp.stpStatus In ('DRFT','STPAPPSUB') and stp.stpApplicationTypeCode='ASB'")
	Optional<List<STPApplication>> fetchGuarantorDraftApplications(@Param("stpApplicantReferenceNumber") String stpApplicantReferenceNumber);
	
	@Query(value = "SELECT * FROM STP_APPLICATION WHERE STP_APPLICANT_REF = :stpApplicantRef "
			+ "AND STP_STATUS in :stpStatus "
			+ "AND STP_CREATE_TIME >= DATEADD(day,-:retrieveCasesDays, GETDATE())", nativeQuery = true)
	Optional<STPApplication> fetchActiveCase(@Param("stpApplicantRef") String stpApplicantRef,
			@Param("stpStatus") List<String> stpStatus, @Param("retrieveCasesDays") int retrieveCasesDays);

	@Query(value = "SELECT * FROM STP_APPLICATION WHERE STP_APPLICANT_REF = :stpApplicantRef "
			+ "AND STP_STATUS in :stpStatus "
			+ "AND STP_APP_SUBMISSION_DATE >= DATEADD(day,-:submissionDays, GETDATE())", nativeQuery = true)
	Optional<STPApplication> fetchActiveCaseBasedOnSubmissionDate(@Param("stpApplicantRef") String stpApplicantRef,
			@Param("stpStatus") List<String> stpStatus, @Param("submissionDays") int submissionDays);
	
	@Query(value = "SELECT * FROM STP_APPLICATION WHERE STP_IDNO = :stpId "
			+ "ORDER BY STP_CREATE_TIME DESC", nativeQuery = true)
	Optional<List<STPApplication>>  fetchLatesStpApplicationByStpIdNo(@Param("stpId") String stpId);
	
	@Query(value = "SELECT * FROM STP_APPLICATION stp WHERE stp.STP_IDNO = :idNumber "
			+ "AND stp.STP_APPLICATION_TYPE_CODE = :productType "
			+ "AND stp.STP_STATUS in :stpStatus "
			+"AND (( CONVERT(date,stp.STP_CREATE_TIME) = CONVERT(date,SYSDATETIME()))OR(DATEADD(DAY, -1, CONVERT(date,SYSDATETIME())) = CONVERT(date,stp.STP_CREATE_TIME)))", nativeQuery = true)
	Optional<List<STPApplication>> fetchLastTwoDaysApplicationList(@Param("idNumber") String idNumber, @Param("productType") String productType,
			@Param("stpStatus") List<String> stpStatus);


} 
