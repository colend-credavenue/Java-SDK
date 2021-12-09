

# BodyCreateCollectionEntry


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**installmentNo** | **Integer** | Installment Number |  [optional]
**dueDate** | **LocalDate** | Due Date for the Installment (YYYY-MM-DD) |  [optional]
**principal** | **Float** | Total principal amount paid for this installment |  [optional]
**interest** | **Float** | Total interest amount paid for this installement |  [optional]
**otherCharges** | **Float** | Other Charges |  [optional]
**overdueCharges** | **Float** | Total overdue interest paid |  [optional]
**penaltyCharges** | **Float** | Penalty Charges Paid |  [optional]
**feeCharges** | **Float** | Fee Charges Paid |  [optional]
**bounceCharges** | **Float** | Bounce charges paid |  [optional]
**amount** | **Float** | Total Collection Amount |  [optional]
**paidDate** | **LocalDate** | Date when customer paid the amount (YYYY-MM-DD) |  [optional]
**investorTransferDate** | **LocalDate** | Date when originator transferred the amount to investor (YYYY-MM-DD) |  [optional]
**referenceNo** | **String** | Instrument Number of the collection received |  [optional]
**instrumentType** | **String** | Instrument Type of the collection received |  [optional]
**emiClosed** | **String** | Y / N. Input Y if the installment is closed. |  [optional]
**foreclosure** | **String** | Y / N. Input Y if the loan is foreclosed. |  [optional]
**paymentType** | **String** | Normal / Part / Advance |  [optional]
**pos** | **Float** | Before the collection record to mention pos for that loan |  [optional]
**updatedRs** | [**List&lt;BodyCreateCollectionEntryUpdatedRs&gt;**](BodyCreateCollectionEntryUpdatedRs.md) | Refer table UpdatedRs for attributes |  [optional]



