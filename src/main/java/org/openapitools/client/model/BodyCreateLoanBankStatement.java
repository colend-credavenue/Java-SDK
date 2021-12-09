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
 * Refer table BankStatement for attributes
 */
@ApiModel(description = "Refer table BankStatement for attributes")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-06T13:00:59.364702+05:30[Asia/Kolkata]")
public class BodyCreateLoanBankStatement {
  public static final String SERIALIZED_NAME_BANK_STATEMENT_SAVINGS_ACCOUNT12_MONTHS_LINK = "bank_statement_savings_account_12_months_link";
  @SerializedName(SERIALIZED_NAME_BANK_STATEMENT_SAVINGS_ACCOUNT12_MONTHS_LINK)
  private List<String> bankStatementSavingsAccount12MonthsLink = null;

  public static final String SERIALIZED_NAME_BANK_STATEMENT_SAVINGS_ACCOUNT12_MONTHS_LINK_PASSWORD = "bank_statement_savings_account_12_months_link_password";
  @SerializedName(SERIALIZED_NAME_BANK_STATEMENT_SAVINGS_ACCOUNT12_MONTHS_LINK_PASSWORD)
  private String bankStatementSavingsAccount12MonthsLinkPassword;

  public static final String SERIALIZED_NAME_BANK_STATEMENT_CURRENT_ACCOUNT12_MONTHS_LINK = "bank_statement_current_account_12_months_link";
  @SerializedName(SERIALIZED_NAME_BANK_STATEMENT_CURRENT_ACCOUNT12_MONTHS_LINK)
  private List<String> bankStatementCurrentAccount12MonthsLink = null;

  public static final String SERIALIZED_NAME_BANK_STATEMENT_CURRENT_ACCOUNT12_MONTHS_LINK_PASSWORD = "bank_statement_current_account_12_months_link_password";
  @SerializedName(SERIALIZED_NAME_BANK_STATEMENT_CURRENT_ACCOUNT12_MONTHS_LINK_PASSWORD)
  private String bankStatementCurrentAccount12MonthsLinkPassword;

  public static final String SERIALIZED_NAME_NO_OF_INWARD_CHQ_RETURNS_SAVINGS_ACCOUNT = "no_of_inward_chq_returns_savings_account";
  @SerializedName(SERIALIZED_NAME_NO_OF_INWARD_CHQ_RETURNS_SAVINGS_ACCOUNT)
  private Integer noOfInwardChqReturnsSavingsAccount;

  public static final String SERIALIZED_NAME_NO_OF_OUTWARD_CHQ_RETURNS_SAVINGS_ACCOUNT = "no_of_outward_chq_returns_savings_account";
  @SerializedName(SERIALIZED_NAME_NO_OF_OUTWARD_CHQ_RETURNS_SAVINGS_ACCOUNT)
  private Integer noOfOutwardChqReturnsSavingsAccount;

  public static final String SERIALIZED_NAME_NO_OF_INWARD_CHQ_RETURNS_CURRENT_ACCOUNT = "no_of_inward_chq_returns_current_account";
  @SerializedName(SERIALIZED_NAME_NO_OF_INWARD_CHQ_RETURNS_CURRENT_ACCOUNT)
  private Integer noOfInwardChqReturnsCurrentAccount;

  public static final String SERIALIZED_NAME_NO_OF_OUTWARD_CHQ_RETURNS_CURRENT_ACCOUNT = "no_of_outward_chq_returns_current_account";
  @SerializedName(SERIALIZED_NAME_NO_OF_OUTWARD_CHQ_RETURNS_CURRENT_ACCOUNT)
  private Integer noOfOutwardChqReturnsCurrentAccount;

  public static final String SERIALIZED_NAME_BANK_ACCOUNT_TYPE_FOR_ASSESSMENT = "bank_account_type_for_assessment";
  @SerializedName(SERIALIZED_NAME_BANK_ACCOUNT_TYPE_FOR_ASSESSMENT)
  private String bankAccountTypeForAssessment;

  public static final String SERIALIZED_NAME_PERFIOS_LINK = "perfios_link";
  @SerializedName(SERIALIZED_NAME_PERFIOS_LINK)
  private List<String> perfiosLink = null;

  public static final String SERIALIZED_NAME_PERFIOS_LINK_PASSWORD = "perfios_link_password";
  @SerializedName(SERIALIZED_NAME_PERFIOS_LINK_PASSWORD)
  private String perfiosLinkPassword;

  public static final String SERIALIZED_NAME_PERFIOS_JSON_LINK = "perfios_json_link";
  @SerializedName(SERIALIZED_NAME_PERFIOS_JSON_LINK)
  private List<String> perfiosJsonLink = null;

  public static final String SERIALIZED_NAME_PERFIOS_JSON_LINK_PASSWORD = "perfios_json_link_password";
  @SerializedName(SERIALIZED_NAME_PERFIOS_JSON_LINK_PASSWORD)
  private String perfiosJsonLinkPassword;

  public static final String SERIALIZED_NAME_PERFIOS_JSON = "perfios_json";
  @SerializedName(SERIALIZED_NAME_PERFIOS_JSON)
  private List<String> perfiosJson = null;

  public static final String SERIALIZED_NAME_FINBIT_LINK = "finbit_link";
  @SerializedName(SERIALIZED_NAME_FINBIT_LINK)
  private List<String> finbitLink = null;

  public static final String SERIALIZED_NAME_FINBIT_LINK_PASSWORD = "finbit_link_password";
  @SerializedName(SERIALIZED_NAME_FINBIT_LINK_PASSWORD)
  private String finbitLinkPassword;

  public static final String SERIALIZED_NAME_FINBIT_JSON_LINK = "finbit_json_link";
  @SerializedName(SERIALIZED_NAME_FINBIT_JSON_LINK)
  private List<String> finbitJsonLink = null;

  public static final String SERIALIZED_NAME_FINBIT_JSON_LINK_PASSWORD = "finbit_json_link_password";
  @SerializedName(SERIALIZED_NAME_FINBIT_JSON_LINK_PASSWORD)
  private String finbitJsonLinkPassword;

  public static final String SERIALIZED_NAME_FINBIT_JSON = "finbit_json";
  @SerializedName(SERIALIZED_NAME_FINBIT_JSON)
  private List<String> finbitJson = null;

  public static final String SERIALIZED_NAME_ABB = "abb";
  @SerializedName(SERIALIZED_NAME_ABB)
  private Float abb;

  public static final String SERIALIZED_NAME_ABD = "abd";
  @SerializedName(SERIALIZED_NAME_ABD)
  private Float abd;

  public static final String SERIALIZED_NAME_CREDIT_SUMMATION = "credit_summation";
  @SerializedName(SERIALIZED_NAME_CREDIT_SUMMATION)
  private String creditSummation;


  public BodyCreateLoanBankStatement bankStatementSavingsAccount12MonthsLink(List<String> bankStatementSavingsAccount12MonthsLink) {
    
    this.bankStatementSavingsAccount12MonthsLink = bankStatementSavingsAccount12MonthsLink;
    return this;
  }

  public BodyCreateLoanBankStatement addBankStatementSavingsAccount12MonthsLinkItem(String bankStatementSavingsAccount12MonthsLinkItem) {
    if (this.bankStatementSavingsAccount12MonthsLink == null) {
      this.bankStatementSavingsAccount12MonthsLink = new ArrayList<String>();
    }
    this.bankStatementSavingsAccount12MonthsLink.add(bankStatementSavingsAccount12MonthsLinkItem);
    return this;
  }

   /**
   * Savings bank account statement for last 12 months
   * @return bankStatementSavingsAccount12MonthsLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Savings bank account statement for last 12 months")

  public List<String> getBankStatementSavingsAccount12MonthsLink() {
    return bankStatementSavingsAccount12MonthsLink;
  }


  public void setBankStatementSavingsAccount12MonthsLink(List<String> bankStatementSavingsAccount12MonthsLink) {
    this.bankStatementSavingsAccount12MonthsLink = bankStatementSavingsAccount12MonthsLink;
  }


  public BodyCreateLoanBankStatement bankStatementSavingsAccount12MonthsLinkPassword(String bankStatementSavingsAccount12MonthsLinkPassword) {
    
    this.bankStatementSavingsAccount12MonthsLinkPassword = bankStatementSavingsAccount12MonthsLinkPassword;
    return this;
  }

   /**
   * Savings bank account statement for last 12 months Document Password
   * @return bankStatementSavingsAccount12MonthsLinkPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Savings bank account statement for last 12 months Document Password")

  public String getBankStatementSavingsAccount12MonthsLinkPassword() {
    return bankStatementSavingsAccount12MonthsLinkPassword;
  }


  public void setBankStatementSavingsAccount12MonthsLinkPassword(String bankStatementSavingsAccount12MonthsLinkPassword) {
    this.bankStatementSavingsAccount12MonthsLinkPassword = bankStatementSavingsAccount12MonthsLinkPassword;
  }


  public BodyCreateLoanBankStatement bankStatementCurrentAccount12MonthsLink(List<String> bankStatementCurrentAccount12MonthsLink) {
    
    this.bankStatementCurrentAccount12MonthsLink = bankStatementCurrentAccount12MonthsLink;
    return this;
  }

  public BodyCreateLoanBankStatement addBankStatementCurrentAccount12MonthsLinkItem(String bankStatementCurrentAccount12MonthsLinkItem) {
    if (this.bankStatementCurrentAccount12MonthsLink == null) {
      this.bankStatementCurrentAccount12MonthsLink = new ArrayList<String>();
    }
    this.bankStatementCurrentAccount12MonthsLink.add(bankStatementCurrentAccount12MonthsLinkItem);
    return this;
  }

   /**
   * Current account bank details for last 12 months
   * @return bankStatementCurrentAccount12MonthsLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Current account bank details for last 12 months")

  public List<String> getBankStatementCurrentAccount12MonthsLink() {
    return bankStatementCurrentAccount12MonthsLink;
  }


  public void setBankStatementCurrentAccount12MonthsLink(List<String> bankStatementCurrentAccount12MonthsLink) {
    this.bankStatementCurrentAccount12MonthsLink = bankStatementCurrentAccount12MonthsLink;
  }


  public BodyCreateLoanBankStatement bankStatementCurrentAccount12MonthsLinkPassword(String bankStatementCurrentAccount12MonthsLinkPassword) {
    
    this.bankStatementCurrentAccount12MonthsLinkPassword = bankStatementCurrentAccount12MonthsLinkPassword;
    return this;
  }

   /**
   * Current account bank details for last 12 months Document Password
   * @return bankStatementCurrentAccount12MonthsLinkPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Current account bank details for last 12 months Document Password")

  public String getBankStatementCurrentAccount12MonthsLinkPassword() {
    return bankStatementCurrentAccount12MonthsLinkPassword;
  }


  public void setBankStatementCurrentAccount12MonthsLinkPassword(String bankStatementCurrentAccount12MonthsLinkPassword) {
    this.bankStatementCurrentAccount12MonthsLinkPassword = bankStatementCurrentAccount12MonthsLinkPassword;
  }


  public BodyCreateLoanBankStatement noOfInwardChqReturnsSavingsAccount(Integer noOfInwardChqReturnsSavingsAccount) {
    
    this.noOfInwardChqReturnsSavingsAccount = noOfInwardChqReturnsSavingsAccount;
    return this;
  }

   /**
   * Number of inward cheque returns in savings account
   * @return noOfInwardChqReturnsSavingsAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of inward cheque returns in savings account")

  public Integer getNoOfInwardChqReturnsSavingsAccount() {
    return noOfInwardChqReturnsSavingsAccount;
  }


  public void setNoOfInwardChqReturnsSavingsAccount(Integer noOfInwardChqReturnsSavingsAccount) {
    this.noOfInwardChqReturnsSavingsAccount = noOfInwardChqReturnsSavingsAccount;
  }


  public BodyCreateLoanBankStatement noOfOutwardChqReturnsSavingsAccount(Integer noOfOutwardChqReturnsSavingsAccount) {
    
    this.noOfOutwardChqReturnsSavingsAccount = noOfOutwardChqReturnsSavingsAccount;
    return this;
  }

   /**
   * Number of outward cheque returns in savings account
   * @return noOfOutwardChqReturnsSavingsAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of outward cheque returns in savings account")

  public Integer getNoOfOutwardChqReturnsSavingsAccount() {
    return noOfOutwardChqReturnsSavingsAccount;
  }


  public void setNoOfOutwardChqReturnsSavingsAccount(Integer noOfOutwardChqReturnsSavingsAccount) {
    this.noOfOutwardChqReturnsSavingsAccount = noOfOutwardChqReturnsSavingsAccount;
  }


  public BodyCreateLoanBankStatement noOfInwardChqReturnsCurrentAccount(Integer noOfInwardChqReturnsCurrentAccount) {
    
    this.noOfInwardChqReturnsCurrentAccount = noOfInwardChqReturnsCurrentAccount;
    return this;
  }

   /**
   * Number of inward cheque returns in current account
   * @return noOfInwardChqReturnsCurrentAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of inward cheque returns in current account")

  public Integer getNoOfInwardChqReturnsCurrentAccount() {
    return noOfInwardChqReturnsCurrentAccount;
  }


  public void setNoOfInwardChqReturnsCurrentAccount(Integer noOfInwardChqReturnsCurrentAccount) {
    this.noOfInwardChqReturnsCurrentAccount = noOfInwardChqReturnsCurrentAccount;
  }


  public BodyCreateLoanBankStatement noOfOutwardChqReturnsCurrentAccount(Integer noOfOutwardChqReturnsCurrentAccount) {
    
    this.noOfOutwardChqReturnsCurrentAccount = noOfOutwardChqReturnsCurrentAccount;
    return this;
  }

   /**
   * Number of outward cheque returns in current account
   * @return noOfOutwardChqReturnsCurrentAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of outward cheque returns in current account")

  public Integer getNoOfOutwardChqReturnsCurrentAccount() {
    return noOfOutwardChqReturnsCurrentAccount;
  }


  public void setNoOfOutwardChqReturnsCurrentAccount(Integer noOfOutwardChqReturnsCurrentAccount) {
    this.noOfOutwardChqReturnsCurrentAccount = noOfOutwardChqReturnsCurrentAccount;
  }


  public BodyCreateLoanBankStatement bankAccountTypeForAssessment(String bankAccountTypeForAssessment) {
    
    this.bankAccountTypeForAssessment = bankAccountTypeForAssessment;
    return this;
  }

   /**
   * Savings / Current / Overdraft / CC
   * @return bankAccountTypeForAssessment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Savings / Current / Overdraft / CC")

  public String getBankAccountTypeForAssessment() {
    return bankAccountTypeForAssessment;
  }


  public void setBankAccountTypeForAssessment(String bankAccountTypeForAssessment) {
    this.bankAccountTypeForAssessment = bankAccountTypeForAssessment;
  }


  public BodyCreateLoanBankStatement perfiosLink(List<String> perfiosLink) {
    
    this.perfiosLink = perfiosLink;
    return this;
  }

  public BodyCreateLoanBankStatement addPerfiosLinkItem(String perfiosLinkItem) {
    if (this.perfiosLink == null) {
      this.perfiosLink = new ArrayList<String>();
    }
    this.perfiosLink.add(perfiosLinkItem);
    return this;
  }

   /**
   * Perfios report in form of document
   * @return perfiosLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Perfios report in form of document")

  public List<String> getPerfiosLink() {
    return perfiosLink;
  }


  public void setPerfiosLink(List<String> perfiosLink) {
    this.perfiosLink = perfiosLink;
  }


  public BodyCreateLoanBankStatement perfiosLinkPassword(String perfiosLinkPassword) {
    
    this.perfiosLinkPassword = perfiosLinkPassword;
    return this;
  }

   /**
   * Perfios report in form of document - password
   * @return perfiosLinkPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Perfios report in form of document - password")

  public String getPerfiosLinkPassword() {
    return perfiosLinkPassword;
  }


  public void setPerfiosLinkPassword(String perfiosLinkPassword) {
    this.perfiosLinkPassword = perfiosLinkPassword;
  }


  public BodyCreateLoanBankStatement perfiosJsonLink(List<String> perfiosJsonLink) {
    
    this.perfiosJsonLink = perfiosJsonLink;
    return this;
  }

  public BodyCreateLoanBankStatement addPerfiosJsonLinkItem(String perfiosJsonLinkItem) {
    if (this.perfiosJsonLink == null) {
      this.perfiosJsonLink = new ArrayList<String>();
    }
    this.perfiosJsonLink.add(perfiosJsonLinkItem);
    return this;
  }

   /**
   * Perfios Json placed in a link
   * @return perfiosJsonLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Perfios Json placed in a link")

  public List<String> getPerfiosJsonLink() {
    return perfiosJsonLink;
  }


  public void setPerfiosJsonLink(List<String> perfiosJsonLink) {
    this.perfiosJsonLink = perfiosJsonLink;
  }


  public BodyCreateLoanBankStatement perfiosJsonLinkPassword(String perfiosJsonLinkPassword) {
    
    this.perfiosJsonLinkPassword = perfiosJsonLinkPassword;
    return this;
  }

   /**
   * Perfios Json placed in a link - password
   * @return perfiosJsonLinkPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Perfios Json placed in a link - password")

  public String getPerfiosJsonLinkPassword() {
    return perfiosJsonLinkPassword;
  }


  public void setPerfiosJsonLinkPassword(String perfiosJsonLinkPassword) {
    this.perfiosJsonLinkPassword = perfiosJsonLinkPassword;
  }


  public BodyCreateLoanBankStatement perfiosJson(List<String> perfiosJson) {
    
    this.perfiosJson = perfiosJson;
    return this;
  }

  public BodyCreateLoanBankStatement addPerfiosJsonItem(String perfiosJsonItem) {
    if (this.perfiosJson == null) {
      this.perfiosJson = new ArrayList<String>();
    }
    this.perfiosJson.add(perfiosJsonItem);
    return this;
  }

   /**
   * Perfios Json response
   * @return perfiosJson
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Perfios Json response")

  public List<String> getPerfiosJson() {
    return perfiosJson;
  }


  public void setPerfiosJson(List<String> perfiosJson) {
    this.perfiosJson = perfiosJson;
  }


  public BodyCreateLoanBankStatement finbitLink(List<String> finbitLink) {
    
    this.finbitLink = finbitLink;
    return this;
  }

  public BodyCreateLoanBankStatement addFinbitLinkItem(String finbitLinkItem) {
    if (this.finbitLink == null) {
      this.finbitLink = new ArrayList<String>();
    }
    this.finbitLink.add(finbitLinkItem);
    return this;
  }

   /**
   * Finbit report in form of document
   * @return finbitLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Finbit report in form of document")

  public List<String> getFinbitLink() {
    return finbitLink;
  }


  public void setFinbitLink(List<String> finbitLink) {
    this.finbitLink = finbitLink;
  }


  public BodyCreateLoanBankStatement finbitLinkPassword(String finbitLinkPassword) {
    
    this.finbitLinkPassword = finbitLinkPassword;
    return this;
  }

   /**
   * Finbit report in form of document - Password
   * @return finbitLinkPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Finbit report in form of document - Password")

  public String getFinbitLinkPassword() {
    return finbitLinkPassword;
  }


  public void setFinbitLinkPassword(String finbitLinkPassword) {
    this.finbitLinkPassword = finbitLinkPassword;
  }


  public BodyCreateLoanBankStatement finbitJsonLink(List<String> finbitJsonLink) {
    
    this.finbitJsonLink = finbitJsonLink;
    return this;
  }

  public BodyCreateLoanBankStatement addFinbitJsonLinkItem(String finbitJsonLinkItem) {
    if (this.finbitJsonLink == null) {
      this.finbitJsonLink = new ArrayList<String>();
    }
    this.finbitJsonLink.add(finbitJsonLinkItem);
    return this;
  }

   /**
   * Finbit Json placed in a link
   * @return finbitJsonLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Finbit Json placed in a link")

  public List<String> getFinbitJsonLink() {
    return finbitJsonLink;
  }


  public void setFinbitJsonLink(List<String> finbitJsonLink) {
    this.finbitJsonLink = finbitJsonLink;
  }


  public BodyCreateLoanBankStatement finbitJsonLinkPassword(String finbitJsonLinkPassword) {
    
    this.finbitJsonLinkPassword = finbitJsonLinkPassword;
    return this;
  }

   /**
   * FINBIT Json placed in a link - Password
   * @return finbitJsonLinkPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "FINBIT Json placed in a link - Password")

  public String getFinbitJsonLinkPassword() {
    return finbitJsonLinkPassword;
  }


  public void setFinbitJsonLinkPassword(String finbitJsonLinkPassword) {
    this.finbitJsonLinkPassword = finbitJsonLinkPassword;
  }


  public BodyCreateLoanBankStatement finbitJson(List<String> finbitJson) {
    
    this.finbitJson = finbitJson;
    return this;
  }

  public BodyCreateLoanBankStatement addFinbitJsonItem(String finbitJsonItem) {
    if (this.finbitJson == null) {
      this.finbitJson = new ArrayList<String>();
    }
    this.finbitJson.add(finbitJsonItem);
    return this;
  }

   /**
   * FINBIT Json response
   * @return finbitJson
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "FINBIT Json response")

  public List<String> getFinbitJson() {
    return finbitJson;
  }


  public void setFinbitJson(List<String> finbitJson) {
    this.finbitJson = finbitJson;
  }


  public BodyCreateLoanBankStatement abb(Float abb) {
    
    this.abb = abb;
    return this;
  }

   /**
   * Average Bank Balance maintaiend on the EMI dates (Calculated by the Originator for the Last 12 Months)
   * @return abb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Average Bank Balance maintaiend on the EMI dates (Calculated by the Originator for the Last 12 Months)")

  public Float getAbb() {
    return abb;
  }


  public void setAbb(Float abb) {
    this.abb = abb;
  }


  public BodyCreateLoanBankStatement abd(Float abd) {
    
    this.abd = abd;
    return this;
  }

   /**
   * Average Monthly Bank Deposits for the Last 12 Months
   * @return abd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Average Monthly Bank Deposits for the Last 12 Months")

  public Float getAbd() {
    return abd;
  }


  public void setAbd(Float abd) {
    this.abd = abd;
  }


  public BodyCreateLoanBankStatement creditSummation(String creditSummation) {
    
    this.creditSummation = creditSummation;
    return this;
  }

   /**
   * Sum of all the credits in the bank statement
   * @return creditSummation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sum of all the credits in the bank statement")

  public String getCreditSummation() {
    return creditSummation;
  }


  public void setCreditSummation(String creditSummation) {
    this.creditSummation = creditSummation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BodyCreateLoanBankStatement bodyCreateLoanBankStatement = (BodyCreateLoanBankStatement) o;
    return Objects.equals(this.bankStatementSavingsAccount12MonthsLink, bodyCreateLoanBankStatement.bankStatementSavingsAccount12MonthsLink) &&
        Objects.equals(this.bankStatementSavingsAccount12MonthsLinkPassword, bodyCreateLoanBankStatement.bankStatementSavingsAccount12MonthsLinkPassword) &&
        Objects.equals(this.bankStatementCurrentAccount12MonthsLink, bodyCreateLoanBankStatement.bankStatementCurrentAccount12MonthsLink) &&
        Objects.equals(this.bankStatementCurrentAccount12MonthsLinkPassword, bodyCreateLoanBankStatement.bankStatementCurrentAccount12MonthsLinkPassword) &&
        Objects.equals(this.noOfInwardChqReturnsSavingsAccount, bodyCreateLoanBankStatement.noOfInwardChqReturnsSavingsAccount) &&
        Objects.equals(this.noOfOutwardChqReturnsSavingsAccount, bodyCreateLoanBankStatement.noOfOutwardChqReturnsSavingsAccount) &&
        Objects.equals(this.noOfInwardChqReturnsCurrentAccount, bodyCreateLoanBankStatement.noOfInwardChqReturnsCurrentAccount) &&
        Objects.equals(this.noOfOutwardChqReturnsCurrentAccount, bodyCreateLoanBankStatement.noOfOutwardChqReturnsCurrentAccount) &&
        Objects.equals(this.bankAccountTypeForAssessment, bodyCreateLoanBankStatement.bankAccountTypeForAssessment) &&
        Objects.equals(this.perfiosLink, bodyCreateLoanBankStatement.perfiosLink) &&
        Objects.equals(this.perfiosLinkPassword, bodyCreateLoanBankStatement.perfiosLinkPassword) &&
        Objects.equals(this.perfiosJsonLink, bodyCreateLoanBankStatement.perfiosJsonLink) &&
        Objects.equals(this.perfiosJsonLinkPassword, bodyCreateLoanBankStatement.perfiosJsonLinkPassword) &&
        Objects.equals(this.perfiosJson, bodyCreateLoanBankStatement.perfiosJson) &&
        Objects.equals(this.finbitLink, bodyCreateLoanBankStatement.finbitLink) &&
        Objects.equals(this.finbitLinkPassword, bodyCreateLoanBankStatement.finbitLinkPassword) &&
        Objects.equals(this.finbitJsonLink, bodyCreateLoanBankStatement.finbitJsonLink) &&
        Objects.equals(this.finbitJsonLinkPassword, bodyCreateLoanBankStatement.finbitJsonLinkPassword) &&
        Objects.equals(this.finbitJson, bodyCreateLoanBankStatement.finbitJson) &&
        Objects.equals(this.abb, bodyCreateLoanBankStatement.abb) &&
        Objects.equals(this.abd, bodyCreateLoanBankStatement.abd) &&
        Objects.equals(this.creditSummation, bodyCreateLoanBankStatement.creditSummation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankStatementSavingsAccount12MonthsLink, bankStatementSavingsAccount12MonthsLinkPassword, bankStatementCurrentAccount12MonthsLink, bankStatementCurrentAccount12MonthsLinkPassword, noOfInwardChqReturnsSavingsAccount, noOfOutwardChqReturnsSavingsAccount, noOfInwardChqReturnsCurrentAccount, noOfOutwardChqReturnsCurrentAccount, bankAccountTypeForAssessment, perfiosLink, perfiosLinkPassword, perfiosJsonLink, perfiosJsonLinkPassword, perfiosJson, finbitLink, finbitLinkPassword, finbitJsonLink, finbitJsonLinkPassword, finbitJson, abb, abd, creditSummation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BodyCreateLoanBankStatement {\n");
    sb.append("    bankStatementSavingsAccount12MonthsLink: ").append(toIndentedString(bankStatementSavingsAccount12MonthsLink)).append("\n");
    sb.append("    bankStatementSavingsAccount12MonthsLinkPassword: ").append(toIndentedString(bankStatementSavingsAccount12MonthsLinkPassword)).append("\n");
    sb.append("    bankStatementCurrentAccount12MonthsLink: ").append(toIndentedString(bankStatementCurrentAccount12MonthsLink)).append("\n");
    sb.append("    bankStatementCurrentAccount12MonthsLinkPassword: ").append(toIndentedString(bankStatementCurrentAccount12MonthsLinkPassword)).append("\n");
    sb.append("    noOfInwardChqReturnsSavingsAccount: ").append(toIndentedString(noOfInwardChqReturnsSavingsAccount)).append("\n");
    sb.append("    noOfOutwardChqReturnsSavingsAccount: ").append(toIndentedString(noOfOutwardChqReturnsSavingsAccount)).append("\n");
    sb.append("    noOfInwardChqReturnsCurrentAccount: ").append(toIndentedString(noOfInwardChqReturnsCurrentAccount)).append("\n");
    sb.append("    noOfOutwardChqReturnsCurrentAccount: ").append(toIndentedString(noOfOutwardChqReturnsCurrentAccount)).append("\n");
    sb.append("    bankAccountTypeForAssessment: ").append(toIndentedString(bankAccountTypeForAssessment)).append("\n");
    sb.append("    perfiosLink: ").append(toIndentedString(perfiosLink)).append("\n");
    sb.append("    perfiosLinkPassword: ").append(toIndentedString(perfiosLinkPassword)).append("\n");
    sb.append("    perfiosJsonLink: ").append(toIndentedString(perfiosJsonLink)).append("\n");
    sb.append("    perfiosJsonLinkPassword: ").append(toIndentedString(perfiosJsonLinkPassword)).append("\n");
    sb.append("    perfiosJson: ").append(toIndentedString(perfiosJson)).append("\n");
    sb.append("    finbitLink: ").append(toIndentedString(finbitLink)).append("\n");
    sb.append("    finbitLinkPassword: ").append(toIndentedString(finbitLinkPassword)).append("\n");
    sb.append("    finbitJsonLink: ").append(toIndentedString(finbitJsonLink)).append("\n");
    sb.append("    finbitJsonLinkPassword: ").append(toIndentedString(finbitJsonLinkPassword)).append("\n");
    sb.append("    finbitJson: ").append(toIndentedString(finbitJson)).append("\n");
    sb.append("    abb: ").append(toIndentedString(abb)).append("\n");
    sb.append("    abd: ").append(toIndentedString(abd)).append("\n");
    sb.append("    creditSummation: ").append(toIndentedString(creditSummation)).append("\n");
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
