

# BodyCreateTranche


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**trancheNumber** | **Integer** | Tranche Number |  [optional]
**principalAmount** | **Integer** | Principal amount to be disbursed in the tranche |  [optional]
**differentialInterest** | **Integer** | Broken period interest amount |  [optional]
**interestStartDate** | **LocalDate** | Pre Emi interest due date |  [optional]
**processingFee** | **Integer** | Processing fee amount (Inckusive of GST) |  [optional]
**stampDuty** | **Integer** | Stamp duty amount |  [optional]
**insuranceCharges** | **Integer** | Insurance premium inclusive of GST |  [optional]
**documentationCharges** | **Integer** | Total documentation charges inclusive of GST |  [optional]
**otherCharges** | **Integer** | Any other charges inclusive of GST |  [optional]
**closingLoanPrincipal** | **Integer** | Balance principal amount after this tranche |  [optional]
**trancheDocLink** | **String** | Link to the corresponding document |  [optional]
**trancheDocLinkPassword** | **String** | Link to the corresponding document |  [optional]
**disbursementAccounts** | [**List&lt;ResponseCreateTrancheDisbursementAccounts&gt;**](ResponseCreateTrancheDisbursementAccounts.md) | Refer table DisbursementAccounts for attributes |  [optional]
**loanData** | [**List&lt;ResponseCreateTrancheLoanData&gt;**](ResponseCreateTrancheLoanData.md) | Refer table LoanData for attributes |  [optional]
**bureauReportData** | [**ResponseCreateTrancheBureauReportData**](ResponseCreateTrancheBureauReportData.md) |  |  [optional]
**clientLoanId** | **String** | Loan ID as per Partner&amp;#39;s LMS |  [optional]
**businessData** | [**ResponseCreateTrancheBusinessData**](ResponseCreateTrancheBusinessData.md) |  |  [optional]



