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

import java.util.Objects;
import java.util.Arrays;
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

/**
 * BodyAgreementSigned
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-06T13:00:59.364702+05:30[Asia/Kolkata]")
public class BodyAgreementSigned {
  public static final String SERIALIZED_NAME_SANCTION_LETTER_LINK = "sanction_letter_link";
  @SerializedName(SERIALIZED_NAME_SANCTION_LETTER_LINK)
  private List<String> sanctionLetterLink = null;

  public static final String SERIALIZED_NAME_SANCTION_LETTER_LINK_PASSWORD = "sanction_letter_link_password";
  @SerializedName(SERIALIZED_NAME_SANCTION_LETTER_LINK_PASSWORD)
  private String sanctionLetterLinkPassword;

  public static final String SERIALIZED_NAME_SELF_DECLARATION_FORM_LINK = "self_declaration_form_link";
  @SerializedName(SERIALIZED_NAME_SELF_DECLARATION_FORM_LINK)
  private List<String> selfDeclarationFormLink = null;

  public static final String SERIALIZED_NAME_SELF_DECLARATION_FORM_LINK_PASSWORD = "self_declaration_form_link_password";
  @SerializedName(SERIALIZED_NAME_SELF_DECLARATION_FORM_LINK_PASSWORD)
  private String selfDeclarationFormLinkPassword;

  public static final String SERIALIZED_NAME_FATCA_DECLARATION_LINK = "fatca_declaration_link";
  @SerializedName(SERIALIZED_NAME_FATCA_DECLARATION_LINK)
  private List<String> fatcaDeclarationLink = null;

  public static final String SERIALIZED_NAME_FATCA_DECLARATION_LINK_PASSWORD = "fatca_declaration_link_password";
  @SerializedName(SERIALIZED_NAME_FATCA_DECLARATION_LINK_PASSWORD)
  private String fatcaDeclarationLinkPassword;

  public static final String SERIALIZED_NAME_ENTIRE_SET_OF_LOAN_AGREEMENTS_LINK = "entire_set_of_loan_agreements_link";
  @SerializedName(SERIALIZED_NAME_ENTIRE_SET_OF_LOAN_AGREEMENTS_LINK)
  private List<String> entireSetOfLoanAgreementsLink = null;

  public static final String SERIALIZED_NAME_ENTIRE_SET_OF_LOAN_AGREEMENTS_LINK_PASSWORD = "entire_set_of_loan_agreements_link_password";
  @SerializedName(SERIALIZED_NAME_ENTIRE_SET_OF_LOAN_AGREEMENTS_LINK_PASSWORD)
  private String entireSetOfLoanAgreementsLinkPassword;

  public static final String SERIALIZED_NAME_DPN_LINK = "dpn_link";
  @SerializedName(SERIALIZED_NAME_DPN_LINK)
  private List<String> dpnLink = null;

  public static final String SERIALIZED_NAME_DPN_LINK_PASSWORD = "dpn_link_password";
  @SerializedName(SERIALIZED_NAME_DPN_LINK_PASSWORD)
  private String dpnLinkPassword;

  public static final String SERIALIZED_NAME_DRF_LINK = "drf_link";
  @SerializedName(SERIALIZED_NAME_DRF_LINK)
  private List<String> drfLink = null;

  public static final String SERIALIZED_NAME_DRF_LINK_PASSWORD = "drf_link_password";
  @SerializedName(SERIALIZED_NAME_DRF_LINK_PASSWORD)
  private String drfLinkPassword;

  public static final String SERIALIZED_NAME_NACH_ENACH_MANDATE_LINK = "nach_enach_mandate_link";
  @SerializedName(SERIALIZED_NAME_NACH_ENACH_MANDATE_LINK)
  private List<String> nachEnachMandateLink = null;

  public static final String SERIALIZED_NAME_NACH_ENACH_MANDATE_LINK_PASSWORD = "nach_enach_mandate_link_password";
  @SerializedName(SERIALIZED_NAME_NACH_ENACH_MANDATE_LINK_PASSWORD)
  private String nachEnachMandateLinkPassword;

  public static final String SERIALIZED_NAME_CREDIT_DISCUSSION_MAIL_LINK = "credit_discussion_mail_link";
  @SerializedName(SERIALIZED_NAME_CREDIT_DISCUSSION_MAIL_LINK)
  private List<String> creditDiscussionMailLink = null;

  public static final String SERIALIZED_NAME_CREDIT_DISCUSSION_MAIL_LINK_PASSWORD = "credit_discussion_mail_link_password";
  @SerializedName(SERIALIZED_NAME_CREDIT_DISCUSSION_MAIL_LINK_PASSWORD)
  private String creditDiscussionMailLinkPassword;

  public static final String SERIALIZED_NAME_FIELD_VERIFICATION_REPORT_LINK = "field_verification_report_link";
  @SerializedName(SERIALIZED_NAME_FIELD_VERIFICATION_REPORT_LINK)
  private List<String> fieldVerificationReportLink = null;

  public static final String SERIALIZED_NAME_FIELD_VERIFICATION_REPORT_LINK_PASSWORD = "field_verification_report_link_password";
  @SerializedName(SERIALIZED_NAME_FIELD_VERIFICATION_REPORT_LINK_PASSWORD)
  private String fieldVerificationReportLinkPassword;

  public static final String SERIALIZED_NAME_TELE_VERIFICATION_REPORT_LINK = "tele_verification_report_link";
  @SerializedName(SERIALIZED_NAME_TELE_VERIFICATION_REPORT_LINK)
  private List<String> teleVerificationReportLink = null;

  public static final String SERIALIZED_NAME_TELE_VERIFICATION_REPORT_LINK_PASSWORD = "tele_verification_report_link_password";
  @SerializedName(SERIALIZED_NAME_TELE_VERIFICATION_REPORT_LINK_PASSWORD)
  private String teleVerificationReportLinkPassword;

  public static final String SERIALIZED_NAME_VEHICLE_INSPECTION_REPORT_LINK = "vehicle_inspection_report_link";
  @SerializedName(SERIALIZED_NAME_VEHICLE_INSPECTION_REPORT_LINK)
  private List<String> vehicleInspectionReportLink = null;

  public static final String SERIALIZED_NAME_VEHICLE_INSPECTION_REPORT_LINK_PASSWORD = "vehicle_inspection_report_link_password";
  @SerializedName(SERIALIZED_NAME_VEHICLE_INSPECTION_REPORT_LINK_PASSWORD)
  private String vehicleInspectionReportLinkPassword;

  public static final String SERIALIZED_NAME_INSURANCE_APPLICATION_FORM_LINK = "insurance_application_form_link";
  @SerializedName(SERIALIZED_NAME_INSURANCE_APPLICATION_FORM_LINK)
  private List<String> insuranceApplicationFormLink = null;

  public static final String SERIALIZED_NAME_INSURANCE_APPLICATION_FORM_LINK_PASSWORD = "insurance_application_form_link_password";
  @SerializedName(SERIALIZED_NAME_INSURANCE_APPLICATION_FORM_LINK_PASSWORD)
  private String insuranceApplicationFormLinkPassword;


  public BodyAgreementSigned sanctionLetterLink(List<String> sanctionLetterLink) {
    
    this.sanctionLetterLink = sanctionLetterLink;
    return this;
  }

  public BodyAgreementSigned addSanctionLetterLinkItem(String sanctionLetterLinkItem) {
    if (this.sanctionLetterLink == null) {
      this.sanctionLetterLink = new ArrayList<String>();
    }
    this.sanctionLetterLink.add(sanctionLetterLinkItem);
    return this;
  }

   /**
   * Sanction letter issued to the customer in joint/lenders letter head
   * @return sanctionLetterLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sanction letter issued to the customer in joint/lenders letter head")

  public List<String> getSanctionLetterLink() {
    return sanctionLetterLink;
  }


  public void setSanctionLetterLink(List<String> sanctionLetterLink) {
    this.sanctionLetterLink = sanctionLetterLink;
  }


  public BodyAgreementSigned sanctionLetterLinkPassword(String sanctionLetterLinkPassword) {
    
    this.sanctionLetterLinkPassword = sanctionLetterLinkPassword;
    return this;
  }

   /**
   * Sanction letter issued to the customer in joint/lenders letter head - Password
   * @return sanctionLetterLinkPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sanction letter issued to the customer in joint/lenders letter head - Password")

  public String getSanctionLetterLinkPassword() {
    return sanctionLetterLinkPassword;
  }


  public void setSanctionLetterLinkPassword(String sanctionLetterLinkPassword) {
    this.sanctionLetterLinkPassword = sanctionLetterLinkPassword;
  }


  public BodyAgreementSigned selfDeclarationFormLink(List<String> selfDeclarationFormLink) {
    
    this.selfDeclarationFormLink = selfDeclarationFormLink;
    return this;
  }

  public BodyAgreementSigned addSelfDeclarationFormLinkItem(String selfDeclarationFormLinkItem) {
    if (this.selfDeclarationFormLink == null) {
      this.selfDeclarationFormLink = new ArrayList<String>();
    }
    this.selfDeclarationFormLink.add(selfDeclarationFormLinkItem);
    return this;
  }

   /**
   * Self declaration form link
   * @return selfDeclarationFormLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Self declaration form link")

  public List<String> getSelfDeclarationFormLink() {
    return selfDeclarationFormLink;
  }


  public void setSelfDeclarationFormLink(List<String> selfDeclarationFormLink) {
    this.selfDeclarationFormLink = selfDeclarationFormLink;
  }


  public BodyAgreementSigned selfDeclarationFormLinkPassword(String selfDeclarationFormLinkPassword) {
    
    this.selfDeclarationFormLinkPassword = selfDeclarationFormLinkPassword;
    return this;
  }

   /**
   * Self declaration form link password
   * @return selfDeclarationFormLinkPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Self declaration form link password")

  public String getSelfDeclarationFormLinkPassword() {
    return selfDeclarationFormLinkPassword;
  }


  public void setSelfDeclarationFormLinkPassword(String selfDeclarationFormLinkPassword) {
    this.selfDeclarationFormLinkPassword = selfDeclarationFormLinkPassword;
  }


  public BodyAgreementSigned fatcaDeclarationLink(List<String> fatcaDeclarationLink) {
    
    this.fatcaDeclarationLink = fatcaDeclarationLink;
    return this;
  }

  public BodyAgreementSigned addFatcaDeclarationLinkItem(String fatcaDeclarationLinkItem) {
    if (this.fatcaDeclarationLink == null) {
      this.fatcaDeclarationLink = new ArrayList<String>();
    }
    this.fatcaDeclarationLink.add(fatcaDeclarationLinkItem);
    return this;
  }

   /**
   * FATCA declaration
   * @return fatcaDeclarationLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "FATCA declaration")

  public List<String> getFatcaDeclarationLink() {
    return fatcaDeclarationLink;
  }


  public void setFatcaDeclarationLink(List<String> fatcaDeclarationLink) {
    this.fatcaDeclarationLink = fatcaDeclarationLink;
  }


  public BodyAgreementSigned fatcaDeclarationLinkPassword(String fatcaDeclarationLinkPassword) {
    
    this.fatcaDeclarationLinkPassword = fatcaDeclarationLinkPassword;
    return this;
  }

   /**
   * FATCA declaration link password
   * @return fatcaDeclarationLinkPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "FATCA declaration link password")

  public String getFatcaDeclarationLinkPassword() {
    return fatcaDeclarationLinkPassword;
  }


  public void setFatcaDeclarationLinkPassword(String fatcaDeclarationLinkPassword) {
    this.fatcaDeclarationLinkPassword = fatcaDeclarationLinkPassword;
  }


  public BodyAgreementSigned entireSetOfLoanAgreementsLink(List<String> entireSetOfLoanAgreementsLink) {
    
    this.entireSetOfLoanAgreementsLink = entireSetOfLoanAgreementsLink;
    return this;
  }

  public BodyAgreementSigned addEntireSetOfLoanAgreementsLinkItem(String entireSetOfLoanAgreementsLinkItem) {
    if (this.entireSetOfLoanAgreementsLink == null) {
      this.entireSetOfLoanAgreementsLink = new ArrayList<String>();
    }
    this.entireSetOfLoanAgreementsLink.add(entireSetOfLoanAgreementsLinkItem);
    return this;
  }

   /**
   * Entire loan agreement kit
   * @return entireSetOfLoanAgreementsLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Entire loan agreement kit")

  public List<String> getEntireSetOfLoanAgreementsLink() {
    return entireSetOfLoanAgreementsLink;
  }


  public void setEntireSetOfLoanAgreementsLink(List<String> entireSetOfLoanAgreementsLink) {
    this.entireSetOfLoanAgreementsLink = entireSetOfLoanAgreementsLink;
  }


  public BodyAgreementSigned entireSetOfLoanAgreementsLinkPassword(String entireSetOfLoanAgreementsLinkPassword) {
    
    this.entireSetOfLoanAgreementsLinkPassword = entireSetOfLoanAgreementsLinkPassword;
    return this;
  }

   /**
   * Entire loan agreement kit password
   * @return entireSetOfLoanAgreementsLinkPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Entire loan agreement kit password")

  public String getEntireSetOfLoanAgreementsLinkPassword() {
    return entireSetOfLoanAgreementsLinkPassword;
  }


  public void setEntireSetOfLoanAgreementsLinkPassword(String entireSetOfLoanAgreementsLinkPassword) {
    this.entireSetOfLoanAgreementsLinkPassword = entireSetOfLoanAgreementsLinkPassword;
  }


  public BodyAgreementSigned dpnLink(List<String> dpnLink) {
    
    this.dpnLink = dpnLink;
    return this;
  }

  public BodyAgreementSigned addDpnLinkItem(String dpnLinkItem) {
    if (this.dpnLink == null) {
      this.dpnLink = new ArrayList<String>();
    }
    this.dpnLink.add(dpnLinkItem);
    return this;
  }

   /**
   * DPN Image
   * @return dpnLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DPN Image")

  public List<String> getDpnLink() {
    return dpnLink;
  }


  public void setDpnLink(List<String> dpnLink) {
    this.dpnLink = dpnLink;
  }


  public BodyAgreementSigned dpnLinkPassword(String dpnLinkPassword) {
    
    this.dpnLinkPassword = dpnLinkPassword;
    return this;
  }

   /**
   * DPN Image password
   * @return dpnLinkPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DPN Image password")

  public String getDpnLinkPassword() {
    return dpnLinkPassword;
  }


  public void setDpnLinkPassword(String dpnLinkPassword) {
    this.dpnLinkPassword = dpnLinkPassword;
  }


  public BodyAgreementSigned drfLink(List<String> drfLink) {
    
    this.drfLink = drfLink;
    return this;
  }

  public BodyAgreementSigned addDrfLinkItem(String drfLinkItem) {
    if (this.drfLink == null) {
      this.drfLink = new ArrayList<String>();
    }
    this.drfLink.add(drfLinkItem);
    return this;
  }

   /**
   * DRF Image
   * @return drfLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DRF Image")

  public List<String> getDrfLink() {
    return drfLink;
  }


  public void setDrfLink(List<String> drfLink) {
    this.drfLink = drfLink;
  }


  public BodyAgreementSigned drfLinkPassword(String drfLinkPassword) {
    
    this.drfLinkPassword = drfLinkPassword;
    return this;
  }

   /**
   * DRF Image password
   * @return drfLinkPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DRF Image password")

  public String getDrfLinkPassword() {
    return drfLinkPassword;
  }


  public void setDrfLinkPassword(String drfLinkPassword) {
    this.drfLinkPassword = drfLinkPassword;
  }


  public BodyAgreementSigned nachEnachMandateLink(List<String> nachEnachMandateLink) {
    
    this.nachEnachMandateLink = nachEnachMandateLink;
    return this;
  }

  public BodyAgreementSigned addNachEnachMandateLinkItem(String nachEnachMandateLinkItem) {
    if (this.nachEnachMandateLink == null) {
      this.nachEnachMandateLink = new ArrayList<String>();
    }
    this.nachEnachMandateLink.add(nachEnachMandateLinkItem);
    return this;
  }

   /**
   * Nach Enach Mandate Link
   * @return nachEnachMandateLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Nach Enach Mandate Link")

  public List<String> getNachEnachMandateLink() {
    return nachEnachMandateLink;
  }


  public void setNachEnachMandateLink(List<String> nachEnachMandateLink) {
    this.nachEnachMandateLink = nachEnachMandateLink;
  }


  public BodyAgreementSigned nachEnachMandateLinkPassword(String nachEnachMandateLinkPassword) {
    
    this.nachEnachMandateLinkPassword = nachEnachMandateLinkPassword;
    return this;
  }

   /**
   * Nach Enach Mandate Link Password
   * @return nachEnachMandateLinkPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Nach Enach Mandate Link Password")

  public String getNachEnachMandateLinkPassword() {
    return nachEnachMandateLinkPassword;
  }


  public void setNachEnachMandateLinkPassword(String nachEnachMandateLinkPassword) {
    this.nachEnachMandateLinkPassword = nachEnachMandateLinkPassword;
  }


  public BodyAgreementSigned creditDiscussionMailLink(List<String> creditDiscussionMailLink) {
    
    this.creditDiscussionMailLink = creditDiscussionMailLink;
    return this;
  }

  public BodyAgreementSigned addCreditDiscussionMailLinkItem(String creditDiscussionMailLinkItem) {
    if (this.creditDiscussionMailLink == null) {
      this.creditDiscussionMailLink = new ArrayList<String>();
    }
    this.creditDiscussionMailLink.add(creditDiscussionMailLinkItem);
    return this;
  }

   /**
   * Credit Discussion Mail Link
   * @return creditDiscussionMailLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Credit Discussion Mail Link")

  public List<String> getCreditDiscussionMailLink() {
    return creditDiscussionMailLink;
  }


  public void setCreditDiscussionMailLink(List<String> creditDiscussionMailLink) {
    this.creditDiscussionMailLink = creditDiscussionMailLink;
  }


  public BodyAgreementSigned creditDiscussionMailLinkPassword(String creditDiscussionMailLinkPassword) {
    
    this.creditDiscussionMailLinkPassword = creditDiscussionMailLinkPassword;
    return this;
  }

   /**
   * Credit Discussion Mail Link Password
   * @return creditDiscussionMailLinkPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Credit Discussion Mail Link Password")

  public String getCreditDiscussionMailLinkPassword() {
    return creditDiscussionMailLinkPassword;
  }


  public void setCreditDiscussionMailLinkPassword(String creditDiscussionMailLinkPassword) {
    this.creditDiscussionMailLinkPassword = creditDiscussionMailLinkPassword;
  }


  public BodyAgreementSigned fieldVerificationReportLink(List<String> fieldVerificationReportLink) {
    
    this.fieldVerificationReportLink = fieldVerificationReportLink;
    return this;
  }

  public BodyAgreementSigned addFieldVerificationReportLinkItem(String fieldVerificationReportLinkItem) {
    if (this.fieldVerificationReportLink == null) {
      this.fieldVerificationReportLink = new ArrayList<String>();
    }
    this.fieldVerificationReportLink.add(fieldVerificationReportLinkItem);
    return this;
  }

   /**
   * Field Verification Report Link
   * @return fieldVerificationReportLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Field Verification Report Link")

  public List<String> getFieldVerificationReportLink() {
    return fieldVerificationReportLink;
  }


  public void setFieldVerificationReportLink(List<String> fieldVerificationReportLink) {
    this.fieldVerificationReportLink = fieldVerificationReportLink;
  }


  public BodyAgreementSigned fieldVerificationReportLinkPassword(String fieldVerificationReportLinkPassword) {
    
    this.fieldVerificationReportLinkPassword = fieldVerificationReportLinkPassword;
    return this;
  }

   /**
   * Field Verification Report Link Password
   * @return fieldVerificationReportLinkPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Field Verification Report Link Password")

  public String getFieldVerificationReportLinkPassword() {
    return fieldVerificationReportLinkPassword;
  }


  public void setFieldVerificationReportLinkPassword(String fieldVerificationReportLinkPassword) {
    this.fieldVerificationReportLinkPassword = fieldVerificationReportLinkPassword;
  }


  public BodyAgreementSigned teleVerificationReportLink(List<String> teleVerificationReportLink) {
    
    this.teleVerificationReportLink = teleVerificationReportLink;
    return this;
  }

  public BodyAgreementSigned addTeleVerificationReportLinkItem(String teleVerificationReportLinkItem) {
    if (this.teleVerificationReportLink == null) {
      this.teleVerificationReportLink = new ArrayList<String>();
    }
    this.teleVerificationReportLink.add(teleVerificationReportLinkItem);
    return this;
  }

   /**
   * Tele Verification Report Link
   * @return teleVerificationReportLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tele Verification Report Link")

  public List<String> getTeleVerificationReportLink() {
    return teleVerificationReportLink;
  }


  public void setTeleVerificationReportLink(List<String> teleVerificationReportLink) {
    this.teleVerificationReportLink = teleVerificationReportLink;
  }


  public BodyAgreementSigned teleVerificationReportLinkPassword(String teleVerificationReportLinkPassword) {
    
    this.teleVerificationReportLinkPassword = teleVerificationReportLinkPassword;
    return this;
  }

   /**
   * Tele Verification Report Link Password
   * @return teleVerificationReportLinkPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tele Verification Report Link Password")

  public String getTeleVerificationReportLinkPassword() {
    return teleVerificationReportLinkPassword;
  }


  public void setTeleVerificationReportLinkPassword(String teleVerificationReportLinkPassword) {
    this.teleVerificationReportLinkPassword = teleVerificationReportLinkPassword;
  }


  public BodyAgreementSigned vehicleInspectionReportLink(List<String> vehicleInspectionReportLink) {
    
    this.vehicleInspectionReportLink = vehicleInspectionReportLink;
    return this;
  }

  public BodyAgreementSigned addVehicleInspectionReportLinkItem(String vehicleInspectionReportLinkItem) {
    if (this.vehicleInspectionReportLink == null) {
      this.vehicleInspectionReportLink = new ArrayList<String>();
    }
    this.vehicleInspectionReportLink.add(vehicleInspectionReportLinkItem);
    return this;
  }

   /**
   * Vehicle Inspection Report Link
   * @return vehicleInspectionReportLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Vehicle Inspection Report Link")

  public List<String> getVehicleInspectionReportLink() {
    return vehicleInspectionReportLink;
  }


  public void setVehicleInspectionReportLink(List<String> vehicleInspectionReportLink) {
    this.vehicleInspectionReportLink = vehicleInspectionReportLink;
  }


  public BodyAgreementSigned vehicleInspectionReportLinkPassword(String vehicleInspectionReportLinkPassword) {
    
    this.vehicleInspectionReportLinkPassword = vehicleInspectionReportLinkPassword;
    return this;
  }

   /**
   * Vehicle Inspection Report Link Password
   * @return vehicleInspectionReportLinkPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Vehicle Inspection Report Link Password")

  public String getVehicleInspectionReportLinkPassword() {
    return vehicleInspectionReportLinkPassword;
  }


  public void setVehicleInspectionReportLinkPassword(String vehicleInspectionReportLinkPassword) {
    this.vehicleInspectionReportLinkPassword = vehicleInspectionReportLinkPassword;
  }


  public BodyAgreementSigned insuranceApplicationFormLink(List<String> insuranceApplicationFormLink) {
    
    this.insuranceApplicationFormLink = insuranceApplicationFormLink;
    return this;
  }

  public BodyAgreementSigned addInsuranceApplicationFormLinkItem(String insuranceApplicationFormLinkItem) {
    if (this.insuranceApplicationFormLink == null) {
      this.insuranceApplicationFormLink = new ArrayList<String>();
    }
    this.insuranceApplicationFormLink.add(insuranceApplicationFormLinkItem);
    return this;
  }

   /**
   * Insurance Application Form Link
   * @return insuranceApplicationFormLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Insurance Application Form Link")

  public List<String> getInsuranceApplicationFormLink() {
    return insuranceApplicationFormLink;
  }


  public void setInsuranceApplicationFormLink(List<String> insuranceApplicationFormLink) {
    this.insuranceApplicationFormLink = insuranceApplicationFormLink;
  }


  public BodyAgreementSigned insuranceApplicationFormLinkPassword(String insuranceApplicationFormLinkPassword) {
    
    this.insuranceApplicationFormLinkPassword = insuranceApplicationFormLinkPassword;
    return this;
  }

   /**
   * Insurance Application Form Link Password
   * @return insuranceApplicationFormLinkPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Insurance Application Form Link Password")

  public String getInsuranceApplicationFormLinkPassword() {
    return insuranceApplicationFormLinkPassword;
  }


  public void setInsuranceApplicationFormLinkPassword(String insuranceApplicationFormLinkPassword) {
    this.insuranceApplicationFormLinkPassword = insuranceApplicationFormLinkPassword;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BodyAgreementSigned bodyAgreementSigned = (BodyAgreementSigned) o;
    return Objects.equals(this.sanctionLetterLink, bodyAgreementSigned.sanctionLetterLink) &&
        Objects.equals(this.sanctionLetterLinkPassword, bodyAgreementSigned.sanctionLetterLinkPassword) &&
        Objects.equals(this.selfDeclarationFormLink, bodyAgreementSigned.selfDeclarationFormLink) &&
        Objects.equals(this.selfDeclarationFormLinkPassword, bodyAgreementSigned.selfDeclarationFormLinkPassword) &&
        Objects.equals(this.fatcaDeclarationLink, bodyAgreementSigned.fatcaDeclarationLink) &&
        Objects.equals(this.fatcaDeclarationLinkPassword, bodyAgreementSigned.fatcaDeclarationLinkPassword) &&
        Objects.equals(this.entireSetOfLoanAgreementsLink, bodyAgreementSigned.entireSetOfLoanAgreementsLink) &&
        Objects.equals(this.entireSetOfLoanAgreementsLinkPassword, bodyAgreementSigned.entireSetOfLoanAgreementsLinkPassword) &&
        Objects.equals(this.dpnLink, bodyAgreementSigned.dpnLink) &&
        Objects.equals(this.dpnLinkPassword, bodyAgreementSigned.dpnLinkPassword) &&
        Objects.equals(this.drfLink, bodyAgreementSigned.drfLink) &&
        Objects.equals(this.drfLinkPassword, bodyAgreementSigned.drfLinkPassword) &&
        Objects.equals(this.nachEnachMandateLink, bodyAgreementSigned.nachEnachMandateLink) &&
        Objects.equals(this.nachEnachMandateLinkPassword, bodyAgreementSigned.nachEnachMandateLinkPassword) &&
        Objects.equals(this.creditDiscussionMailLink, bodyAgreementSigned.creditDiscussionMailLink) &&
        Objects.equals(this.creditDiscussionMailLinkPassword, bodyAgreementSigned.creditDiscussionMailLinkPassword) &&
        Objects.equals(this.fieldVerificationReportLink, bodyAgreementSigned.fieldVerificationReportLink) &&
        Objects.equals(this.fieldVerificationReportLinkPassword, bodyAgreementSigned.fieldVerificationReportLinkPassword) &&
        Objects.equals(this.teleVerificationReportLink, bodyAgreementSigned.teleVerificationReportLink) &&
        Objects.equals(this.teleVerificationReportLinkPassword, bodyAgreementSigned.teleVerificationReportLinkPassword) &&
        Objects.equals(this.vehicleInspectionReportLink, bodyAgreementSigned.vehicleInspectionReportLink) &&
        Objects.equals(this.vehicleInspectionReportLinkPassword, bodyAgreementSigned.vehicleInspectionReportLinkPassword) &&
        Objects.equals(this.insuranceApplicationFormLink, bodyAgreementSigned.insuranceApplicationFormLink) &&
        Objects.equals(this.insuranceApplicationFormLinkPassword, bodyAgreementSigned.insuranceApplicationFormLinkPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sanctionLetterLink, sanctionLetterLinkPassword, selfDeclarationFormLink, selfDeclarationFormLinkPassword, fatcaDeclarationLink, fatcaDeclarationLinkPassword, entireSetOfLoanAgreementsLink, entireSetOfLoanAgreementsLinkPassword, dpnLink, dpnLinkPassword, drfLink, drfLinkPassword, nachEnachMandateLink, nachEnachMandateLinkPassword, creditDiscussionMailLink, creditDiscussionMailLinkPassword, fieldVerificationReportLink, fieldVerificationReportLinkPassword, teleVerificationReportLink, teleVerificationReportLinkPassword, vehicleInspectionReportLink, vehicleInspectionReportLinkPassword, insuranceApplicationFormLink, insuranceApplicationFormLinkPassword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BodyAgreementSigned {\n");
    sb.append("    sanctionLetterLink: ").append(toIndentedString(sanctionLetterLink)).append("\n");
    sb.append("    sanctionLetterLinkPassword: ").append(toIndentedString(sanctionLetterLinkPassword)).append("\n");
    sb.append("    selfDeclarationFormLink: ").append(toIndentedString(selfDeclarationFormLink)).append("\n");
    sb.append("    selfDeclarationFormLinkPassword: ").append(toIndentedString(selfDeclarationFormLinkPassword)).append("\n");
    sb.append("    fatcaDeclarationLink: ").append(toIndentedString(fatcaDeclarationLink)).append("\n");
    sb.append("    fatcaDeclarationLinkPassword: ").append(toIndentedString(fatcaDeclarationLinkPassword)).append("\n");
    sb.append("    entireSetOfLoanAgreementsLink: ").append(toIndentedString(entireSetOfLoanAgreementsLink)).append("\n");
    sb.append("    entireSetOfLoanAgreementsLinkPassword: ").append(toIndentedString(entireSetOfLoanAgreementsLinkPassword)).append("\n");
    sb.append("    dpnLink: ").append(toIndentedString(dpnLink)).append("\n");
    sb.append("    dpnLinkPassword: ").append(toIndentedString(dpnLinkPassword)).append("\n");
    sb.append("    drfLink: ").append(toIndentedString(drfLink)).append("\n");
    sb.append("    drfLinkPassword: ").append(toIndentedString(drfLinkPassword)).append("\n");
    sb.append("    nachEnachMandateLink: ").append(toIndentedString(nachEnachMandateLink)).append("\n");
    sb.append("    nachEnachMandateLinkPassword: ").append(toIndentedString(nachEnachMandateLinkPassword)).append("\n");
    sb.append("    creditDiscussionMailLink: ").append(toIndentedString(creditDiscussionMailLink)).append("\n");
    sb.append("    creditDiscussionMailLinkPassword: ").append(toIndentedString(creditDiscussionMailLinkPassword)).append("\n");
    sb.append("    fieldVerificationReportLink: ").append(toIndentedString(fieldVerificationReportLink)).append("\n");
    sb.append("    fieldVerificationReportLinkPassword: ").append(toIndentedString(fieldVerificationReportLinkPassword)).append("\n");
    sb.append("    teleVerificationReportLink: ").append(toIndentedString(teleVerificationReportLink)).append("\n");
    sb.append("    teleVerificationReportLinkPassword: ").append(toIndentedString(teleVerificationReportLinkPassword)).append("\n");
    sb.append("    vehicleInspectionReportLink: ").append(toIndentedString(vehicleInspectionReportLink)).append("\n");
    sb.append("    vehicleInspectionReportLinkPassword: ").append(toIndentedString(vehicleInspectionReportLinkPassword)).append("\n");
    sb.append("    insuranceApplicationFormLink: ").append(toIndentedString(insuranceApplicationFormLink)).append("\n");
    sb.append("    insuranceApplicationFormLinkPassword: ").append(toIndentedString(insuranceApplicationFormLinkPassword)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

