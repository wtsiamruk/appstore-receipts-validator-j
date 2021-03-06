package by.dev.madhead.utils.appstore_receipts_validator.model;

import by.dev.madhead.utils.appstore_receipts_validator.mapper.InAppCancellationReasonDeserializer;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.time.ZonedDateTime;
import java.util.Objects;
import java.util.StringJoiner;

public final class InApp {
    @JsonProperty("cancellation_date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss VV")
    private ZonedDateTime cancellationDate;

    @JsonProperty("cancellation_date_ms")
    private Long cancellationDateMs;

    @JsonProperty("cancellation_date_pst")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss VV")
    private ZonedDateTime cancellationDatePst;

    @JsonProperty("cancellation_reason")
    private CancellationReason cancellationReason;

    @JsonProperty("expires_date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss VV")
    private ZonedDateTime expiresDate;

    @JsonProperty("expires_date_ms")
    private Long expiresDateMs;

    @JsonProperty("expires_date_pst")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss VV")
    private ZonedDateTime expiresDatePst;

    @JsonProperty("is_in_intro_offer_period")
    private Boolean inIntroOfferPeriod;

    @JsonProperty("is_trial_period")
    private Boolean trialPeriod;

    @JsonProperty("is_upgraded")
    private Boolean upgraded;

    @JsonProperty("original_purchase_date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss VV")
    private ZonedDateTime originalPurchaseDate;

    @JsonProperty("original_purchase_date_ms")
    private Long originalPurchaseDateMs;

    @JsonProperty("original_purchase_date_pst")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss VV")
    private ZonedDateTime originalPurchaseDatePst;

    @JsonProperty("original_transaction_id")
    private String originalTransactionId;

    @JsonProperty("product_id")
    private String productId;

    @JsonProperty("promotional_offer_id")
    private String promotionalOfferId;

    @JsonProperty("purchase_date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss VV")
    private ZonedDateTime purchaseDate;

    @JsonProperty("purchase_date_ms")
    private Long purchaseDateMs;

    @JsonProperty("purchase_date_pst")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss VV")
    private ZonedDateTime purchaseDatePst;

    @JsonProperty("quantity")
    private Integer quantity;

    @JsonProperty("transaction_id")
    private String transactionId;

    @JsonProperty("web_order_line_item_id")
    private String webOrderLineItemId;

    public ZonedDateTime getCancellationDate() {
        return cancellationDate;
    }

    public void setCancellationDate(ZonedDateTime cancellationDate) {
        this.cancellationDate = cancellationDate;
    }

    public Long getCancellationDateMs() {
        return cancellationDateMs;
    }

    public void setCancellationDateMs(Long cancellationDateMs) {
        this.cancellationDateMs = cancellationDateMs;
    }

    public ZonedDateTime getCancellationDatePst() {
        return cancellationDatePst;
    }

    public void setCancellationDatePst(ZonedDateTime cancellationDatePst) {
        this.cancellationDatePst = cancellationDatePst;
    }

    public CancellationReason getCancellationReason() {
        return cancellationReason;
    }

    public void setCancellationReason(CancellationReason cancellationReason) {
        this.cancellationReason = cancellationReason;
    }

    public ZonedDateTime getExpiresDate() {
        return expiresDate;
    }

    public void setExpiresDate(ZonedDateTime expiresDate) {
        this.expiresDate = expiresDate;
    }

    public Long getExpiresDateMs() {
        return expiresDateMs;
    }

    public void setExpiresDateMs(Long expiresDateMs) {
        this.expiresDateMs = expiresDateMs;
    }

    public ZonedDateTime getExpiresDatePst() {
        return expiresDatePst;
    }

    public void setExpiresDatePst(ZonedDateTime expiresDatePst) {
        this.expiresDatePst = expiresDatePst;
    }

    public Boolean getInIntroOfferPeriod() {
        return inIntroOfferPeriod;
    }

    public void setInIntroOfferPeriod(Boolean inIntroOfferPeriod) {
        this.inIntroOfferPeriod = inIntroOfferPeriod;
    }

    public Boolean getTrialPeriod() {
        return trialPeriod;
    }

    public void setTrialPeriod(Boolean trialPeriod) {
        this.trialPeriod = trialPeriod;
    }

    public Boolean getUpgraded() {
        return upgraded;
    }

    public void setUpgraded(Boolean upgraded) {
        this.upgraded = upgraded;
    }

    public ZonedDateTime getOriginalPurchaseDate() {
        return originalPurchaseDate;
    }

    public void setOriginalPurchaseDate(ZonedDateTime originalPurchaseDate) {
        this.originalPurchaseDate = originalPurchaseDate;
    }

    public Long getOriginalPurchaseDateMs() {
        return originalPurchaseDateMs;
    }

    public void setOriginalPurchaseDateMs(Long originalPurchaseDateMs) {
        this.originalPurchaseDateMs = originalPurchaseDateMs;
    }

    public ZonedDateTime getOriginalPurchaseDatePst() {
        return originalPurchaseDatePst;
    }

    public void setOriginalPurchaseDatePst(ZonedDateTime originalPurchaseDatePst) {
        this.originalPurchaseDatePst = originalPurchaseDatePst;
    }

    public String getOriginalTransactionId() {
        return originalTransactionId;
    }

    public void setOriginalTransactionId(String originalTransactionId) {
        this.originalTransactionId = originalTransactionId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getPromotionalOfferId() {
        return promotionalOfferId;
    }

    public void setPromotionalOfferId(String promotionalOfferId) {
        this.promotionalOfferId = promotionalOfferId;
    }

    public ZonedDateTime getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(ZonedDateTime purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Long getPurchaseDateMs() {
        return purchaseDateMs;
    }

    public void setPurchaseDateMs(Long purchaseDateMs) {
        this.purchaseDateMs = purchaseDateMs;
    }

    public ZonedDateTime getPurchaseDatePst() {
        return purchaseDatePst;
    }

    public void setPurchaseDatePst(ZonedDateTime purchaseDatePst) {
        this.purchaseDatePst = purchaseDatePst;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getWebOrderLineItemId() {
        return webOrderLineItemId;
    }

    public void setWebOrderLineItemId(String webOrderLineItemId) {
        this.webOrderLineItemId = webOrderLineItemId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InApp inApp = (InApp) o;
        return Objects.equals(cancellationDate, inApp.cancellationDate) &&
            Objects.equals(cancellationDateMs, inApp.cancellationDateMs) &&
            Objects.equals(cancellationDatePst, inApp.cancellationDatePst) &&
            cancellationReason == inApp.cancellationReason &&
            Objects.equals(expiresDate, inApp.expiresDate) &&
            Objects.equals(expiresDateMs, inApp.expiresDateMs) &&
            Objects.equals(expiresDatePst, inApp.expiresDatePst) &&
            Objects.equals(inIntroOfferPeriod, inApp.inIntroOfferPeriod) &&
            Objects.equals(trialPeriod, inApp.trialPeriod) &&
            Objects.equals(upgraded, inApp.upgraded) &&
            Objects.equals(originalPurchaseDate, inApp.originalPurchaseDate) &&
            Objects.equals(originalPurchaseDateMs, inApp.originalPurchaseDateMs) &&
            Objects.equals(originalPurchaseDatePst, inApp.originalPurchaseDatePst) &&
            Objects.equals(originalTransactionId, inApp.originalTransactionId) &&
            Objects.equals(productId, inApp.productId) &&
            Objects.equals(promotionalOfferId, inApp.promotionalOfferId) &&
            Objects.equals(purchaseDate, inApp.purchaseDate) &&
            Objects.equals(purchaseDateMs, inApp.purchaseDateMs) &&
            Objects.equals(purchaseDatePst, inApp.purchaseDatePst) &&
            Objects.equals(quantity, inApp.quantity) &&
            Objects.equals(transactionId, inApp.transactionId) &&
            Objects.equals(webOrderLineItemId, inApp.webOrderLineItemId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            cancellationDate,
            cancellationDateMs,
            cancellationDatePst,
            cancellationReason,
            expiresDate,
            expiresDateMs,
            expiresDatePst,
            inIntroOfferPeriod,
            trialPeriod,
            upgraded,
            originalPurchaseDate,
            originalPurchaseDateMs,
            originalPurchaseDatePst,
            originalTransactionId,
            productId,
            promotionalOfferId,
            purchaseDate,
            purchaseDateMs,
            purchaseDatePst,
            quantity,
            transactionId,
            webOrderLineItemId
        );
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", InApp.class.getSimpleName() + "[", "]")
            .add("cancellationDate=" + cancellationDate)
            .add("cancellationDateMs=" + cancellationDateMs)
            .add("cancellationDatePst=" + cancellationDatePst)
            .add("cancellationReason=" + cancellationReason)
            .add("expiresDate=" + expiresDate)
            .add("expiresDateMs=" + expiresDateMs)
            .add("expiresDatePst=" + expiresDatePst)
            .add("inIntroOfferPeriod=" + inIntroOfferPeriod)
            .add("trialPeriod=" + trialPeriod)
            .add("upgraded=" + upgraded)
            .add("originalPurchaseDate=" + originalPurchaseDate)
            .add("originalPurchaseDateMs=" + originalPurchaseDateMs)
            .add("originalPurchaseDatePst=" + originalPurchaseDatePst)
            .add("originalTransactionId='" + originalTransactionId + "'")
            .add("productId='" + productId + "'")
            .add("promotionalOfferId='" + promotionalOfferId + "'")
            .add("purchaseDate=" + purchaseDate)
            .add("purchaseDateMs=" + purchaseDateMs)
            .add("purchaseDatePst=" + purchaseDatePst)
            .add("quantity=" + quantity)
            .add("transactionId='" + transactionId + "'")
            .add("webOrderLineItemId='" + webOrderLineItemId + "'")
            .toString();
    }

    @JsonDeserialize(using = InAppCancellationReasonDeserializer.class)
    public enum CancellationReason {
        ISSUE,          // 1
        ANOTHER_REASON  // 0
    }
}
