/*
 * Allcloud (Allcloud)
 * # Integration Document  The following are the endpoints to be called during and pre/post disbursement state of a loan.  ## Authentication  Authentication details and host will be shared privately.  ## Workflow  **Create Loan** is the initial endpoint to be called to create a loan. Loan will be processed in the background and the status of loan will be provided through the configured Webhook. However, the client can also poll the server via the **Get Loan Details** endpoint to know the loan's status(**Get Loan Details** is rate throttled and polling this API will be restricted). Loan's shall be considered rejected if proper response is not available within 10minutes.  All other endpoints are self-explanatory and can be retried upto 3 times before marking as failure.  ## Allowed Links  All Link attributes should contain 1. Accessible File Link URL which can be Public/Expiry URL/Whitelisted File Server Link(Write to tech.colending@credavenue.com for obtaining our IP address to whitelist) 2. File Link URL with Header Authentication (Header values should be shared with tech.colending@credavenue.com)  ## Allowed Fields Length <table border=\"2\" cellspacing=\"0\" cellpadding=\"6\" rules=\"groups\" frame=\"hsides\">  <colgroup>  <col  class=\"org-left\" />  <col  class=\"org-left\" />  </colgroup> <thead> <tr> <th scope=\"col\" class=\"org-left\">Data Type</th> <th scope=\"col\" class=\"org-left\">Max Length</th> </tr> </thead>  <tbody> <tr> <td class=\"org-left\">String</td> <td class=\"org-left\">65,535 bytes</td> </tr>  <tr> <td class=\"org-left\">Float</td> <td class=\"org-left\">8 bytes</td> </tr>  <tr> <td class=\"org-left\">Integer</td> <td class=\"org-left\">4 bytes</td> </tr>  <tr> <td class=\"org-left\">Date</td> <td class=\"org-left\">10 characters</td> </tr>  </tbody> </table>  # Webhooks  Webhooks can be configured for the below events  1. Loan status change      Response Payload :      {         \"product_id\": \"\",         \"client_loan_id\": \"\",         \"principal_amount\": \"\",         \"interest_rate\": \"\",         \"tenure\": \"\",         \"tenure_frequency\": \"MONTHLY\",         \"cibil_score\": \"\",         \"purpose\": \"\",         \"repayment_frequency\":\"\",         \"number_of_repayments\": \"\",         \"status\": \"\",         \"principal_outstanding\": \"\",         \"reject_reason\": \"\"     }          Statuses : ['new', 'approved', 'rejected', 'agreement_signed', 'dropped', 'disbursement_ready', 'disbursed', 'matured', 'partner_settled']     2. Loan disbursement details (Disbursed through razorpay)      Callback Payload:      {         \"client_loan_id\":\"\",         \"status\":\"borrower_disbursed\",         \"disbursed_date\":\"\",         \"utr_number\":\"\",         \"disbursement_type\":\"\",         \"payment_reversed\": \"TRUE/FALSE\",         \"disbursement_amount\":\"\",         \"investor_disbursed_amount\": \"\",         \"partner_disbursed_amount\": \"\",         \"differential_interest\":\"\",         \"investor_differential_interest\":\"\",         \"partner_differential_interest\":\"\",         \"differential_days\":\"\",         \"interest_start_date\":\"\",         \"investor_processing_fee\":\"\",         \"partner_processing_fee\":\"\",         \"investor_stamp_duty\":\"\",         \"partner_stamp_duty\":\"\",         \"investor_documentation_charges\":\"\",         \"partner_documentation_charges\":\"\"     }  Provide the following details to configure the webhooks 1. callback URL 2. authentication for the callback URL (header authentication)    # Validations  **PAN**  - **Example**: ABGPA1232P - **Sequence**: First five digits will be alpha, next four will be Numerical and again last single digit will be alpha  **GSTIN**  - **Example**: 33AAACT2727Q1ZV - **Sequence**: First two digits is Numerical, Next is PAN sequence as specified above, again thirteenth digit will be numerical, fourteenth digit is alpha, last digit will be alpha or numerical  **CIN**  - **Example**: U65929TN2017PTC117196 - **Sequence**: First digit is Alpha, next 5 numeric digits, next two alpha, next set of 4 numeric digits, Next 3 alpha, last 6 numeric digits  **PASSPORT**  - **Example**: A2096457 - **Sequence**: Total 8 digits, first digit is Alpha, remaining digits are numerical  **AADHAR NO**  - The standard 12 digits numerical.  **MOBILE NO**  - **Sequence**: 10 numerical digits  **IFSC CODE**  - **Example**: PUNB0596600 - **Sequence**: First four alpha, next fifth digit is 0 (zero) always and last six digit is alpha/numeric. Totally 11 digits.  **PIN CODE**  - 6 numerical digits
 *
 * The version of the OpenAPI document: 0.0.1
 * Contact: support@colending.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.BodyCreateLoanReferences;
import org.openapitools.client.model.BodyUpdatePostDisbursementBankStatement;
import org.openapitools.client.model.BodyUpdatePostDisbursementCoApplicants;
import org.openapitools.client.model.BodyUpdatePostDisbursementFinancialData;
import org.openapitools.client.model.BodyUpdatePostDisbursementInsuranceDetails;
import org.openapitools.client.model.BodyUpdatePostDisbursementVideoKycDetail;
import org.threeten.bp.LocalDate;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for BodyUpdatePostDisbursement
 */
public class BodyUpdatePostDisbursementTest {
    private final BodyUpdatePostDisbursement model = new BodyUpdatePostDisbursement();

    /**
     * Model tests for BodyUpdatePostDisbursement
     */
    @Test
    public void testBodyUpdatePostDisbursement() {
        // TODO: test BodyUpdatePostDisbursement
    }

    /**
     * Test the property 'customerType'
     */
    @Test
    public void customerTypeTest() {
        // TODO: test customerType
    }

    /**
     * Test the property 'customerCategory'
     */
    @Test
    public void customerCategoryTest() {
        // TODO: test customerCategory
    }

    /**
     * Test the property 'firstName'
     */
    @Test
    public void firstNameTest() {
        // TODO: test firstName
    }

    /**
     * Test the property 'middleName'
     */
    @Test
    public void middleNameTest() {
        // TODO: test middleName
    }

    /**
     * Test the property 'lastName'
     */
    @Test
    public void lastNameTest() {
        // TODO: test lastName
    }

    /**
     * Test the property 'gender'
     */
    @Test
    public void genderTest() {
        // TODO: test gender
    }

    /**
     * Test the property 'dateOfBirth'
     */
    @Test
    public void dateOfBirthTest() {
        // TODO: test dateOfBirth
    }

    /**
     * Test the property 'age'
     */
    @Test
    public void ageTest() {
        // TODO: test age
    }

    /**
     * Test the property 'mobileNumber'
     */
    @Test
    public void mobileNumberTest() {
        // TODO: test mobileNumber
    }

    /**
     * Test the property 'email'
     */
    @Test
    public void emailTest() {
        // TODO: test email
    }

    /**
     * Test the property 'officialEmailId'
     */
    @Test
    public void officialEmailIdTest() {
        // TODO: test officialEmailId
    }

    /**
     * Test the property 'currentAddress'
     */
    @Test
    public void currentAddressTest() {
        // TODO: test currentAddress
    }

    /**
     * Test the property 'currentCity'
     */
    @Test
    public void currentCityTest() {
        // TODO: test currentCity
    }

    /**
     * Test the property 'currentDistrict'
     */
    @Test
    public void currentDistrictTest() {
        // TODO: test currentDistrict
    }

    /**
     * Test the property 'currentState'
     */
    @Test
    public void currentStateTest() {
        // TODO: test currentState
    }

    /**
     * Test the property 'currentPincode'
     */
    @Test
    public void currentPincodeTest() {
        // TODO: test currentPincode
    }

    /**
     * Test the property 'residenceTypeCurrentAddress'
     */
    @Test
    public void residenceTypeCurrentAddressTest() {
        // TODO: test residenceTypeCurrentAddress
    }

    /**
     * Test the property 'yearsOfStayInCurrentAddress'
     */
    @Test
    public void yearsOfStayInCurrentAddressTest() {
        // TODO: test yearsOfStayInCurrentAddress
    }

    /**
     * Test the property 'permanentAddress'
     */
    @Test
    public void permanentAddressTest() {
        // TODO: test permanentAddress
    }

    /**
     * Test the property 'permanentCity'
     */
    @Test
    public void permanentCityTest() {
        // TODO: test permanentCity
    }

    /**
     * Test the property 'permanentDistrict'
     */
    @Test
    public void permanentDistrictTest() {
        // TODO: test permanentDistrict
    }

    /**
     * Test the property 'permanentState'
     */
    @Test
    public void permanentStateTest() {
        // TODO: test permanentState
    }

    /**
     * Test the property 'permanentPincode'
     */
    @Test
    public void permanentPincodeTest() {
        // TODO: test permanentPincode
    }

    /**
     * Test the property 'residenceTypePermanentAddress'
     */
    @Test
    public void residenceTypePermanentAddressTest() {
        // TODO: test residenceTypePermanentAddress
    }

    /**
     * Test the property 'yearsOfStayInPermanentAddress'
     */
    @Test
    public void yearsOfStayInPermanentAddressTest() {
        // TODO: test yearsOfStayInPermanentAddress
    }

    /**
     * Test the property 'maritalStatus'
     */
    @Test
    public void maritalStatusTest() {
        // TODO: test maritalStatus
    }

    /**
     * Test the property 'religion'
     */
    @Test
    public void religionTest() {
        // TODO: test religion
    }

    /**
     * Test the property 'nationality'
     */
    @Test
    public void nationalityTest() {
        // TODO: test nationality
    }

    /**
     * Test the property 'fatherName'
     */
    @Test
    public void fatherNameTest() {
        // TODO: test fatherName
    }

    /**
     * Test the property 'motherName'
     */
    @Test
    public void motherNameTest() {
        // TODO: test motherName
    }

    /**
     * Test the property 'spouseName'
     */
    @Test
    public void spouseNameTest() {
        // TODO: test spouseName
    }

    /**
     * Test the property 'educationQualification'
     */
    @Test
    public void educationQualificationTest() {
        // TODO: test educationQualification
    }

    /**
     * Test the property 'netMonthlyIncome'
     */
    @Test
    public void netMonthlyIncomeTest() {
        // TODO: test netMonthlyIncome
    }

    /**
     * Test the property 'annualIncome'
     */
    @Test
    public void annualIncomeTest() {
        // TODO: test annualIncome
    }

    /**
     * Test the property 'noOfDependants'
     */
    @Test
    public void noOfDependantsTest() {
        // TODO: test noOfDependants
    }

    /**
     * Test the property 'occupation'
     */
    @Test
    public void occupationTest() {
        // TODO: test occupation
    }

    /**
     * Test the property 'panNumber'
     */
    @Test
    public void panNumberTest() {
        // TODO: test panNumber
    }

    /**
     * Test the property 'panNumberLink'
     */
    @Test
    public void panNumberLinkTest() {
        // TODO: test panNumberLink
    }

    /**
     * Test the property 'form60Link'
     */
    @Test
    public void form60LinkTest() {
        // TODO: test form60Link
    }

    /**
     * Test the property 'aadharNumber'
     */
    @Test
    public void aadharNumberTest() {
        // TODO: test aadharNumber
    }

    /**
     * Test the property 'aadharLink'
     */
    @Test
    public void aadharLinkTest() {
        // TODO: test aadharLink
    }

    /**
     * Test the property 'voterIdNumber'
     */
    @Test
    public void voterIdNumberTest() {
        // TODO: test voterIdNumber
    }

    /**
     * Test the property 'votingIdLink'
     */
    @Test
    public void votingIdLinkTest() {
        // TODO: test votingIdLink
    }

    /**
     * Test the property 'drivingLicenseNumber'
     */
    @Test
    public void drivingLicenseNumberTest() {
        // TODO: test drivingLicenseNumber
    }

    /**
     * Test the property 'drivingLicenseLink'
     */
    @Test
    public void drivingLicenseLinkTest() {
        // TODO: test drivingLicenseLink
    }

    /**
     * Test the property 'passportNumber'
     */
    @Test
    public void passportNumberTest() {
        // TODO: test passportNumber
    }

    /**
     * Test the property 'passportLink'
     */
    @Test
    public void passportLinkTest() {
        // TODO: test passportLink
    }

    /**
     * Test the property 'videoImageLink'
     */
    @Test
    public void videoImageLinkTest() {
        // TODO: test videoImageLink
    }

    /**
     * Test the property 'videoKycDetail'
     */
    @Test
    public void videoKycDetailTest() {
        // TODO: test videoKycDetail
    }

    /**
     * Test the property 'otherKycNumber'
     */
    @Test
    public void otherKycNumberTest() {
        // TODO: test otherKycNumber
    }

    /**
     * Test the property 'otherKycLink'
     */
    @Test
    public void otherKycLinkTest() {
        // TODO: test otherKycLink
    }

    /**
     * Test the property 'rentAgreementLink'
     */
    @Test
    public void rentAgreementLinkTest() {
        // TODO: test rentAgreementLink
    }

    /**
     * Test the property 'utilityBillsLink'
     */
    @Test
    public void utilityBillsLinkTest() {
        // TODO: test utilityBillsLink
    }

    /**
     * Test the property 'photoLink'
     */
    @Test
    public void photoLinkTest() {
        // TODO: test photoLink
    }

    /**
     * Test the property 'employmentType'
     */
    @Test
    public void employmentTypeTest() {
        // TODO: test employmentType
    }

    /**
     * Test the property 'employmentDetailsName'
     */
    @Test
    public void employmentDetailsNameTest() {
        // TODO: test employmentDetailsName
    }

    /**
     * Test the property 'employmentDetailsAddress'
     */
    @Test
    public void employmentDetailsAddressTest() {
        // TODO: test employmentDetailsAddress
    }

    /**
     * Test the property 'employmentDetailsYearsOfExperience'
     */
    @Test
    public void employmentDetailsYearsOfExperienceTest() {
        // TODO: test employmentDetailsYearsOfExperience
    }

    /**
     * Test the property 'employmentDetailsDesignation'
     */
    @Test
    public void employmentDetailsDesignationTest() {
        // TODO: test employmentDetailsDesignation
    }

    /**
     * Test the property 'employementVintageCurrentOrganisation'
     */
    @Test
    public void employementVintageCurrentOrganisationTest() {
        // TODO: test employementVintageCurrentOrganisation
    }

    /**
     * Test the property 'payslipLink'
     */
    @Test
    public void payslipLinkTest() {
        // TODO: test payslipLink
    }

    /**
     * Test the property 'tdsCertificateLink'
     */
    @Test
    public void tdsCertificateLinkTest() {
        // TODO: test tdsCertificateLink
    }

    /**
     * Test the property 'nameOfBureau'
     */
    @Test
    public void nameOfBureauTest() {
        // TODO: test nameOfBureau
    }

    /**
     * Test the property 'bureauVintage'
     */
    @Test
    public void bureauVintageTest() {
        // TODO: test bureauVintage
    }

    /**
     * Test the property 'bureauScore'
     */
    @Test
    public void bureauScoreTest() {
        // TODO: test bureauScore
    }

    /**
     * Test the property 'bureauReportLink'
     */
    @Test
    public void bureauReportLinkTest() {
        // TODO: test bureauReportLink
    }

    /**
     * Test the property 'commercialBureauScore'
     */
    @Test
    public void commercialBureauScoreTest() {
        // TODO: test commercialBureauScore
    }

    /**
     * Test the property 'commercialBureauScoreLink'
     */
    @Test
    public void commercialBureauScoreLinkTest() {
        // TODO: test commercialBureauScoreLink
    }

    /**
     * Test the property 'partnerScoreOnTheCustomer'
     */
    @Test
    public void partnerScoreOnTheCustomerTest() {
        // TODO: test partnerScoreOnTheCustomer
    }

    /**
     * Test the property 'totalExistingObligations'
     */
    @Test
    public void totalExistingObligationsTest() {
        // TODO: test totalExistingObligations
    }

    /**
     * Test the property 'creditCardLimit'
     */
    @Test
    public void creditCardLimitTest() {
        // TODO: test creditCardLimit
    }

    /**
     * Test the property 'numberOfCreditCards'
     */
    @Test
    public void numberOfCreditCardsTest() {
        // TODO: test numberOfCreditCards
    }

    /**
     * Test the property 'numberOfUnsecuredLoans'
     */
    @Test
    public void numberOfUnsecuredLoansTest() {
        // TODO: test numberOfUnsecuredLoans
    }

    /**
     * Test the property 'valueOfTotalUnsecuredLoans'
     */
    @Test
    public void valueOfTotalUnsecuredLoansTest() {
        // TODO: test valueOfTotalUnsecuredLoans
    }

    /**
     * Test the property 'numberOfLoans'
     */
    @Test
    public void numberOfLoansTest() {
        // TODO: test numberOfLoans
    }

    /**
     * Test the property 'valueOfTotalLoans'
     */
    @Test
    public void valueOfTotalLoansTest() {
        // TODO: test valueOfTotalLoans
    }

    /**
     * Test the property 'numberOfEnquiries3months'
     */
    @Test
    public void numberOfEnquiries3monthsTest() {
        // TODO: test numberOfEnquiries3months
    }

    /**
     * Test the property 'numberOfEnquiries6months'
     */
    @Test
    public void numberOfEnquiries6monthsTest() {
        // TODO: test numberOfEnquiries6months
    }

    /**
     * Test the property 'numberOfEnquiries12months'
     */
    @Test
    public void numberOfEnquiries12monthsTest() {
        // TODO: test numberOfEnquiries12months
    }

    /**
     * Test the property 'numberOfWriteoffSuitfiledSettled12months'
     */
    @Test
    public void numberOfWriteoffSuitfiledSettled12monthsTest() {
        // TODO: test numberOfWriteoffSuitfiledSettled12months
    }

    /**
     * Test the property 'maxDpdTradeline12months'
     */
    @Test
    public void maxDpdTradeline12monthsTest() {
        // TODO: test maxDpdTradeline12months
    }

    /**
     * Test the property 'maxOverdueTradeline'
     */
    @Test
    public void maxOverdueTradelineTest() {
        // TODO: test maxOverdueTradeline
    }

    /**
     * Test the property 'totalOverdueAmount12months'
     */
    @Test
    public void totalOverdueAmount12monthsTest() {
        // TODO: test totalOverdueAmount12months
    }

    /**
     * Test the property 'loanAmountSettled12months'
     */
    @Test
    public void loanAmountSettled12monthsTest() {
        // TODO: test loanAmountSettled12months
    }

    /**
     * Test the property 'natureOfLoanSettled1'
     */
    @Test
    public void natureOfLoanSettled1Test() {
        // TODO: test natureOfLoanSettled1
    }

    /**
     * Test the property 'natureOfLoanSettled2'
     */
    @Test
    public void natureOfLoanSettled2Test() {
        // TODO: test natureOfLoanSettled2
    }

    /**
     * Test the property 'totalEmiBounces'
     */
    @Test
    public void totalEmiBouncesTest() {
        // TODO: test totalEmiBounces
    }

    /**
     * Test the property 'emiBounces6months'
     */
    @Test
    public void emiBounces6monthsTest() {
        // TODO: test emiBounces6months
    }

    /**
     * Test the property 'emiBounces12months'
     */
    @Test
    public void emiBounces12monthsTest() {
        // TODO: test emiBounces12months
    }

    /**
     * Test the property 'bankStatement'
     */
    @Test
    public void bankStatementTest() {
        // TODO: test bankStatement
    }

    /**
     * Test the property 'financialData'
     */
    @Test
    public void financialDataTest() {
        // TODO: test financialData
    }

    /**
     * Test the property 'coApplicants'
     */
    @Test
    public void coApplicantsTest() {
        // TODO: test coApplicants
    }

    /**
     * Test the property 'abbEmiRatio'
     */
    @Test
    public void abbEmiRatioTest() {
        // TODO: test abbEmiRatio
    }

    /**
     * Test the property 'dscr'
     */
    @Test
    public void dscrTest() {
        // TODO: test dscr
    }

    /**
     * Test the property 'foir'
     */
    @Test
    public void foirTest() {
        // TODO: test foir
    }

    /**
     * Test the property 'ltr'
     */
    @Test
    public void ltrTest() {
        // TODO: test ltr
    }

    /**
     * Test the property 'eligibilityLoanAmount'
     */
    @Test
    public void eligibilityLoanAmountTest() {
        // TODO: test eligibilityLoanAmount
    }

    /**
     * Test the property 'insuranceDetails'
     */
    @Test
    public void insuranceDetailsTest() {
        // TODO: test insuranceDetails
    }

    /**
     * Test the property 'references'
     */
    @Test
    public void referencesTest() {
        // TODO: test references
    }

    /**
     * Test the property 'pslFlag'
     */
    @Test
    public void pslFlagTest() {
        // TODO: test pslFlag
    }

    /**
     * Test the property 'pslDescription'
     */
    @Test
    public void pslDescriptionTest() {
        // TODO: test pslDescription
    }

    /**
     * Test the property 'pslCode'
     */
    @Test
    public void pslCodeTest() {
        // TODO: test pslCode
    }

    /**
     * Test the property 'pslProofLink'
     */
    @Test
    public void pslProofLinkTest() {
        // TODO: test pslProofLink
    }

    /**
     * Test the property 'loanAgreementLink'
     */
    @Test
    public void loanAgreementLinkTest() {
        // TODO: test loanAgreementLink
    }

    /**
     * Test the property 'sanctionLetterLink'
     */
    @Test
    public void sanctionLetterLinkTest() {
        // TODO: test sanctionLetterLink
    }

    /**
     * Test the property 'lafLink'
     */
    @Test
    public void lafLinkTest() {
        // TODO: test lafLink
    }

    /**
     * Test the property 'selfDeclarationLetterLink'
     */
    @Test
    public void selfDeclarationLetterLinkTest() {
        // TODO: test selfDeclarationLetterLink
    }

    /**
     * Test the property 'authorisationLetterLink'
     */
    @Test
    public void authorisationLetterLinkTest() {
        // TODO: test authorisationLetterLink
    }

    /**
     * Test the property 'enachPdcLink'
     */
    @Test
    public void enachPdcLinkTest() {
        // TODO: test enachPdcLink
    }

    /**
     * Test the property 'guarantorAgreementsLink'
     */
    @Test
    public void guarantorAgreementsLinkTest() {
        // TODO: test guarantorAgreementsLink
    }

}