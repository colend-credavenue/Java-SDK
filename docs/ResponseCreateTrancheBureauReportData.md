

# ResponseCreateTrancheBureauReportData

Refer table BureauReportData for attributes

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nameOfBureau** | **String** | Cibil / Experian / Himark |  [optional]
**bureauVintage** | **Integer** | Vintage in the bureau. Number of years from the first trade line |  [optional]
**bureauScore** | **Integer** | Bureau Score |  [optional]
**bureauReportLink** | **List&lt;String&gt;** | Document of the bureau |  [optional]
**bureauReportLinkPassword** | **String** | Document of the bureau - Password |  [optional]
**bureauJsonLink** | **List&lt;String&gt;** | Bureau Json placed in a link |  [optional]
**bureauJsonLinkPassword** | **String** | Bureau Json placed in a link - Password |  [optional]
**bureauJson** | **List&lt;Object&gt;** | Refer table BureauJson for attributes |  [optional]
**commercialBureauScore** | **Integer** | CRIF score |  [optional]
**commercialBureauScoreLink** | **List&lt;String&gt;** | Commercial Bureau Document |  [optional]
**commercialBureauScoreLinkPassword** | **String** | Commercial Bureau Document Password |  [optional]
**partnerScoreOnTheCustomer** | **Integer** | Score Captured by the Partner |  [optional]
**totalExistingObligations** | **Integer** | Total Existing Obligations basis the Bureau Report |  [optional]
**creditCardLimit** | **Integer** | Total Credit Card Limit basis the Bureau Report |  [optional]
**numberOfCreditCards** | **Integer** | Total Number of Credit Cards per Bureau Report |  [optional]
**numberOfUnsecuredLoans** | **Integer** | Total Number of Unsecured Loans per Bureau Report |  [optional]
**valueOfTotalUnsecuredLoans** | **Float** | Total value of unsecured loans |  [optional]
**numberOfLoans** | **Integer** | Total Number of Loans per Bureau Report |  [optional]
**valueOfTotalLoans** | **Float** | Total value of loans |  [optional]
**numberOfEnquiries3months** | **Integer** | Number of Enquiries in the Last 3 Months per Bureau Report |  [optional]
**numberOfEnquiries6months** | **Integer** | Number of Enquiries in the Last 6 Months per Bureau Report |  [optional]
**numberOfEnquiries12months** | **Integer** | Number of Enquiries in the Last 12 Months per Bureau Report |  [optional]
**numberOfWriteoffSuitfiledSettled12months** | **Integer** | Number of Writeoff Suitfiled Settled in the Last 12 Months |  [optional]
**maxDpdTradeline12months** | **Integer** | Maximum DPD Tradeline in the Last 12 Months |  [optional]
**maxOverdueTradeline** | **Integer** | Maximum Overdue Tradeline |  [optional]
**totalOverdueAmount12months** | **Float** | Total Overdue Amount in the Last 12 Months |  [optional]
**loanAmountSettled12months** | **Float** | Loan Amount Settled in the Last 12 Months |  [optional]
**natureOfLoanSettled1** | **String** | The nature of past loan settlement if any (Loan 1) - Settled/ Closed/ Written-off |  [optional]
**natureOfLoanSettled2** | **String** | The nature of past loan settlement if any (Loan 2) - Settled/ Closed/ Written-off |  [optional]
**totalEmiBounces** | **Integer** | Total EMI Bounces |  [optional]
**emiBounces6months** | **Integer** | EMI Bounces in the Last 6 Months |  [optional]
**emiBounces12months** | **Integer** | EMI Bounces in the Last 12 Months |  [optional]



