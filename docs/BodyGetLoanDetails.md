

# BodyGetLoanDetails


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**business** | [**BodyCreateLoanBusiness**](BodyCreateLoanBusiness.md) |  |  [optional]
**guarantors** | [**List&lt;BodyCreateLoanGuarantors&gt;**](BodyCreateLoanGuarantors.md) | Refer table Guarantors for attributes |  [optional]
**coApplicants** | [**List&lt;BodyCreateLoanCoApplicants&gt;**](BodyCreateLoanCoApplicants.md) | Refer table CoApplicants for attributes |  [optional]
**bankStatement** | [**BodyCreateLoanBankStatement**](BodyCreateLoanBankStatement.md) |  |  [optional]
**financialData** | [**BodyCreateLoanFinancialData**](BodyCreateLoanFinancialData.md) |  |  [optional]
**productId** | **String** | Product ID created in CA |  [optional]
**clientLoanId** | **String** | Loan ID as per Partner&amp;#39;s LMS |  [optional]
**purpose** | **String** | Free flowing text |  [optional]
**principalAmount** | **Float** | Total loan amount in Rs (Overall amount to the borrower) |  [optional]
**interestRate** | **Float** | Reducing balance interest rate of the customer in %. This is the interest rate to be mentioned in the sanction letter as well |  [optional]
**tenure** | **Integer** | Tenure of the loan |  [optional]
**tenureFrequency** | **String** | Whether the tenure is monthly/yearly/weekly |  [optional]
**repaymentFrequency** | **String** | Daily/Weekly/Once in 2 weeks/Monthly/Quarterly/Bullet |  [optional]
**numberOfRepayments** | **Integer** | Number of repayments as per the repayment schedule |  [optional]
**disbursementAccounts** | [**List&lt;BodyCreateLoanDisbursementAccounts&gt;**](BodyCreateLoanDisbursementAccounts.md) | Refer table DisbursementAccounts for attributes |  [optional]
**assets** | [**List&lt;BodyCreateLoanAssets&gt;**](BodyCreateLoanAssets.md) | Refer table Assets for attributes |  [optional]
**references** | [**List&lt;BodyCreateLoanReferences&gt;**](BodyCreateLoanReferences.md) | Refer table References for attributes |  [optional]
**insuranceDetails** | [**List&lt;BodyCreateLoanInsuranceDetails&gt;**](BodyCreateLoanInsuranceDetails.md) | Refer table InsuranceDetails for attributes |  [optional]
**tranches** | [**List&lt;BodyCreateLoanTranches&gt;**](BodyCreateLoanTranches.md) | Refer table Tranches for attributes |  [optional]



