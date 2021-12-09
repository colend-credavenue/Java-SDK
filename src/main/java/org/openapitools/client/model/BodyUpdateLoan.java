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
import org.openapitools.client.model.BodyUpdateLoanDisbursementAccounts;

/**
 * BodyUpdateLoan
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-06T13:00:59.364702+05:30[Asia/Kolkata]")
public class BodyUpdateLoan {
  public static final String SERIALIZED_NAME_PRINCIPAL_AMOUNT = "principal_amount";
  @SerializedName(SERIALIZED_NAME_PRINCIPAL_AMOUNT)
  private Float principalAmount;

  public static final String SERIALIZED_NAME_LOAN_AMOUNT = "loan_amount";
  @SerializedName(SERIALIZED_NAME_LOAN_AMOUNT)
  private Float loanAmount;

  public static final String SERIALIZED_NAME_INTEREST_RATE = "interest_rate";
  @SerializedName(SERIALIZED_NAME_INTEREST_RATE)
  private Float interestRate;

  public static final String SERIALIZED_NAME_TENURE = "tenure";
  @SerializedName(SERIALIZED_NAME_TENURE)
  private Integer tenure;

  public static final String SERIALIZED_NAME_TENURE_FREQUENCY = "tenure_frequency";
  @SerializedName(SERIALIZED_NAME_TENURE_FREQUENCY)
  private String tenureFrequency;

  public static final String SERIALIZED_NAME_REPAYMENT_FREQUENCY = "repayment_frequency";
  @SerializedName(SERIALIZED_NAME_REPAYMENT_FREQUENCY)
  private String repaymentFrequency;

  public static final String SERIALIZED_NAME_NUMBER_OF_REPAYMENTS = "number_of_repayments";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_REPAYMENTS)
  private Integer numberOfRepayments;

  public static final String SERIALIZED_NAME_DISBURSEMENT_ACCOUNTS = "disbursement_accounts";
  @SerializedName(SERIALIZED_NAME_DISBURSEMENT_ACCOUNTS)
  private List<BodyUpdateLoanDisbursementAccounts> disbursementAccounts = null;


  public BodyUpdateLoan principalAmount(Float principalAmount) {
    
    this.principalAmount = principalAmount;
    return this;
  }

   /**
   * Total Loan Amount to the Borrower (in Rupees)
   * @return principalAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total Loan Amount to the Borrower (in Rupees)")

  public Float getPrincipalAmount() {
    return principalAmount;
  }


  public void setPrincipalAmount(Float principalAmount) {
    this.principalAmount = principalAmount;
  }


  public BodyUpdateLoan loanAmount(Float loanAmount) {
    
    this.loanAmount = loanAmount;
    return this;
  }

   /**
   * Total Loan Amount
   * @return loanAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total Loan Amount")

  public Float getLoanAmount() {
    return loanAmount;
  }


  public void setLoanAmount(Float loanAmount) {
    this.loanAmount = loanAmount;
  }


  public BodyUpdateLoan interestRate(Float interestRate) {
    
    this.interestRate = interestRate;
    return this;
  }

   /**
   * Reducing balance interest rate of the customer in %. This is the interest rate to be mentioned in the sanction letter as well
   * @return interestRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reducing balance interest rate of the customer in %. This is the interest rate to be mentioned in the sanction letter as well")

  public Float getInterestRate() {
    return interestRate;
  }


  public void setInterestRate(Float interestRate) {
    this.interestRate = interestRate;
  }


  public BodyUpdateLoan tenure(Integer tenure) {
    
    this.tenure = tenure;
    return this;
  }

   /**
   * Tenure of the loan
   * @return tenure
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tenure of the loan")

  public Integer getTenure() {
    return tenure;
  }


  public void setTenure(Integer tenure) {
    this.tenure = tenure;
  }


  public BodyUpdateLoan tenureFrequency(String tenureFrequency) {
    
    this.tenureFrequency = tenureFrequency;
    return this;
  }

   /**
   * Daily / Weekly / Monthly
   * @return tenureFrequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Daily / Weekly / Monthly")

  public String getTenureFrequency() {
    return tenureFrequency;
  }


  public void setTenureFrequency(String tenureFrequency) {
    this.tenureFrequency = tenureFrequency;
  }


  public BodyUpdateLoan repaymentFrequency(String repaymentFrequency) {
    
    this.repaymentFrequency = repaymentFrequency;
    return this;
  }

   /**
   * Daily / Weekly / Monthly / Bullet
   * @return repaymentFrequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Daily / Weekly / Monthly / Bullet")

  public String getRepaymentFrequency() {
    return repaymentFrequency;
  }


  public void setRepaymentFrequency(String repaymentFrequency) {
    this.repaymentFrequency = repaymentFrequency;
  }


  public BodyUpdateLoan numberOfRepayments(Integer numberOfRepayments) {
    
    this.numberOfRepayments = numberOfRepayments;
    return this;
  }

   /**
   * Number of repayments as per the repayment schedule
   * @return numberOfRepayments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of repayments as per the repayment schedule")

  public Integer getNumberOfRepayments() {
    return numberOfRepayments;
  }


  public void setNumberOfRepayments(Integer numberOfRepayments) {
    this.numberOfRepayments = numberOfRepayments;
  }


  public BodyUpdateLoan disbursementAccounts(List<BodyUpdateLoanDisbursementAccounts> disbursementAccounts) {
    
    this.disbursementAccounts = disbursementAccounts;
    return this;
  }

  public BodyUpdateLoan addDisbursementAccountsItem(BodyUpdateLoanDisbursementAccounts disbursementAccountsItem) {
    if (this.disbursementAccounts == null) {
      this.disbursementAccounts = new ArrayList<BodyUpdateLoanDisbursementAccounts>();
    }
    this.disbursementAccounts.add(disbursementAccountsItem);
    return this;
  }

   /**
   * Refer table DisbursementAccounts for attributes
   * @return disbursementAccounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Refer table DisbursementAccounts for attributes")

  public List<BodyUpdateLoanDisbursementAccounts> getDisbursementAccounts() {
    return disbursementAccounts;
  }


  public void setDisbursementAccounts(List<BodyUpdateLoanDisbursementAccounts> disbursementAccounts) {
    this.disbursementAccounts = disbursementAccounts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BodyUpdateLoan bodyUpdateLoan = (BodyUpdateLoan) o;
    return Objects.equals(this.principalAmount, bodyUpdateLoan.principalAmount) &&
        Objects.equals(this.loanAmount, bodyUpdateLoan.loanAmount) &&
        Objects.equals(this.interestRate, bodyUpdateLoan.interestRate) &&
        Objects.equals(this.tenure, bodyUpdateLoan.tenure) &&
        Objects.equals(this.tenureFrequency, bodyUpdateLoan.tenureFrequency) &&
        Objects.equals(this.repaymentFrequency, bodyUpdateLoan.repaymentFrequency) &&
        Objects.equals(this.numberOfRepayments, bodyUpdateLoan.numberOfRepayments) &&
        Objects.equals(this.disbursementAccounts, bodyUpdateLoan.disbursementAccounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(principalAmount, loanAmount, interestRate, tenure, tenureFrequency, repaymentFrequency, numberOfRepayments, disbursementAccounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BodyUpdateLoan {\n");
    sb.append("    principalAmount: ").append(toIndentedString(principalAmount)).append("\n");
    sb.append("    loanAmount: ").append(toIndentedString(loanAmount)).append("\n");
    sb.append("    interestRate: ").append(toIndentedString(interestRate)).append("\n");
    sb.append("    tenure: ").append(toIndentedString(tenure)).append("\n");
    sb.append("    tenureFrequency: ").append(toIndentedString(tenureFrequency)).append("\n");
    sb.append("    repaymentFrequency: ").append(toIndentedString(repaymentFrequency)).append("\n");
    sb.append("    numberOfRepayments: ").append(toIndentedString(numberOfRepayments)).append("\n");
    sb.append("    disbursementAccounts: ").append(toIndentedString(disbursementAccounts)).append("\n");
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
