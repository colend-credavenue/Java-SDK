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
import org.threeten.bp.LocalDate;

/**
 * BodyCreateAdvanceCollection
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-06T13:00:59.364702+05:30[Asia/Kolkata]")
public class BodyCreateAdvanceCollection {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Float amount;

  public static final String SERIALIZED_NAME_TRANSACTION_DATE = "transaction_date";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_DATE)
  private LocalDate transactionDate;

  public static final String SERIALIZED_NAME_INVESTOR_TRANSFER_DATE = "investor_transfer_date";
  @SerializedName(SERIALIZED_NAME_INVESTOR_TRANSFER_DATE)
  private LocalDate investorTransferDate;

  public static final String SERIALIZED_NAME_INSTRUMENT_NUMBER = "instrument_number";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT_NUMBER)
  private String instrumentNumber;

  public static final String SERIALIZED_NAME_INSTRUMENT_TYPE = "instrument_type";
  @SerializedName(SERIALIZED_NAME_INSTRUMENT_TYPE)
  private String instrumentType;

  public static final String SERIALIZED_NAME_ADVANCE_OUTSTANDING = "advance_outstanding";
  @SerializedName(SERIALIZED_NAME_ADVANCE_OUTSTANDING)
  private Float advanceOutstanding;

  public static final String SERIALIZED_NAME_TRANSACTION_TYPE = "transaction_type";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_TYPE)
  private String transactionType;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;


  public BodyCreateAdvanceCollection amount(Float amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Advance Amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Advance Amount")

  public Float getAmount() {
    return amount;
  }


  public void setAmount(Float amount) {
    this.amount = amount;
  }


  public BodyCreateAdvanceCollection transactionDate(LocalDate transactionDate) {
    
    this.transactionDate = transactionDate;
    return this;
  }

   /**
   * Date when customer paid the amount (YYYY-MM-DD)
   * @return transactionDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date when customer paid the amount (YYYY-MM-DD)")

  public LocalDate getTransactionDate() {
    return transactionDate;
  }


  public void setTransactionDate(LocalDate transactionDate) {
    this.transactionDate = transactionDate;
  }


  public BodyCreateAdvanceCollection investorTransferDate(LocalDate investorTransferDate) {
    
    this.investorTransferDate = investorTransferDate;
    return this;
  }

   /**
   * Date when originator transferred the amount to investor (YYYY-MM-DD)
   * @return investorTransferDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date when originator transferred the amount to investor (YYYY-MM-DD)")

  public LocalDate getInvestorTransferDate() {
    return investorTransferDate;
  }


  public void setInvestorTransferDate(LocalDate investorTransferDate) {
    this.investorTransferDate = investorTransferDate;
  }


  public BodyCreateAdvanceCollection instrumentNumber(String instrumentNumber) {
    
    this.instrumentNumber = instrumentNumber;
    return this;
  }

   /**
   * UTR / Cheque Number
   * @return instrumentNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "UTR / Cheque Number")

  public String getInstrumentNumber() {
    return instrumentNumber;
  }


  public void setInstrumentNumber(String instrumentNumber) {
    this.instrumentNumber = instrumentNumber;
  }


  public BodyCreateAdvanceCollection instrumentType(String instrumentType) {
    
    this.instrumentType = instrumentType;
    return this;
  }

   /**
   * RTGS / NEFT / UPI / Cheque
   * @return instrumentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "RTGS / NEFT / UPI / Cheque")

  public String getInstrumentType() {
    return instrumentType;
  }


  public void setInstrumentType(String instrumentType) {
    this.instrumentType = instrumentType;
  }


  public BodyCreateAdvanceCollection advanceOutstanding(Float advanceOutstanding) {
    
    this.advanceOutstanding = advanceOutstanding;
    return this;
  }

   /**
   * Before this collection record to mention advance outstanding for that loan
   * @return advanceOutstanding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Before this collection record to mention advance outstanding for that loan")

  public Float getAdvanceOutstanding() {
    return advanceOutstanding;
  }


  public void setAdvanceOutstanding(Float advanceOutstanding) {
    this.advanceOutstanding = advanceOutstanding;
  }


  public BodyCreateAdvanceCollection transactionType(String transactionType) {
    
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Credit / Refund
   * @return transactionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Credit / Refund")

  public String getTransactionType() {
    return transactionType;
  }


  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }


  public BodyCreateAdvanceCollection comment(String comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * comment
   * @return comment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "comment")

  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    this.comment = comment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BodyCreateAdvanceCollection bodyCreateAdvanceCollection = (BodyCreateAdvanceCollection) o;
    return Objects.equals(this.amount, bodyCreateAdvanceCollection.amount) &&
        Objects.equals(this.transactionDate, bodyCreateAdvanceCollection.transactionDate) &&
        Objects.equals(this.investorTransferDate, bodyCreateAdvanceCollection.investorTransferDate) &&
        Objects.equals(this.instrumentNumber, bodyCreateAdvanceCollection.instrumentNumber) &&
        Objects.equals(this.instrumentType, bodyCreateAdvanceCollection.instrumentType) &&
        Objects.equals(this.advanceOutstanding, bodyCreateAdvanceCollection.advanceOutstanding) &&
        Objects.equals(this.transactionType, bodyCreateAdvanceCollection.transactionType) &&
        Objects.equals(this.comment, bodyCreateAdvanceCollection.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, transactionDate, investorTransferDate, instrumentNumber, instrumentType, advanceOutstanding, transactionType, comment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BodyCreateAdvanceCollection {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    transactionDate: ").append(toIndentedString(transactionDate)).append("\n");
    sb.append("    investorTransferDate: ").append(toIndentedString(investorTransferDate)).append("\n");
    sb.append("    instrumentNumber: ").append(toIndentedString(instrumentNumber)).append("\n");
    sb.append("    instrumentType: ").append(toIndentedString(instrumentType)).append("\n");
    sb.append("    advanceOutstanding: ").append(toIndentedString(advanceOutstanding)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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

