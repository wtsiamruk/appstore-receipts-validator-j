package by.dev.madhead.utils.appstore_receipts_validator.mapper;

import by.dev.madhead.utils.appstore_receipts_validator.model.PendingRenewal;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.util.Objects;
import java.util.StringJoiner;

public class PendingRenewalPriceConsentStatusDeserializerTest {
    private ObjectMapper objectMapper;

    @BeforeEach
    private void beforeEach() {
        this.objectMapper = ObjectMapperFactory.defaultObjectMapper();
    }

    @ParameterizedTest
    @EnumSource(PendingRenewal.PriceConsentStatus.class)
    public void testDeserialization(final PendingRenewal.PriceConsentStatus value) throws Exception {
        Assertions.assertEquals(
            new PriceConsentStatusHolder(
                value
            ),
            objectMapper.readValue(
                getClass().getResource("PendingRenewalPriceConsentStatusDeserializerTest/testDeserialization_" + value.name() + ".json"),
                PriceConsentStatusHolder.class
            )
        );
    }

    @Test
    public void testDeserializationUnknownValue() {
        Assertions.assertThrows(
            JsonMappingException.class,
            () -> objectMapper.readValue(
                getClass().getResource("PendingRenewalPriceConsentStatusDeserializerTest/testDeserializationUnknownValue.json"),
                PriceConsentStatusHolder.class
            )
        );
    }

    @Test
    public void testDeserializationInvalidValue() {
        Assertions.assertThrows(
            JsonMappingException.class,
            () -> objectMapper.readValue(
                getClass().getResource("PendingRenewalPriceConsentStatusDeserializerTest/testDeserializationInvalidValue.json"),
                PriceConsentStatusHolder.class
            )
        );
    }

    private static class PriceConsentStatusHolder {
        @JsonProperty("price_consent_status")
        private PendingRenewal.PriceConsentStatus priceConsentStatus;

        public PriceConsentStatusHolder() {
        }

        public PriceConsentStatusHolder(final PendingRenewal.PriceConsentStatus priceConsentStatus) {
            this.priceConsentStatus = priceConsentStatus;
        }

        public PendingRenewal.PriceConsentStatus getPriceConsentStatus() {
            return priceConsentStatus;
        }

        public void setPriceConsentStatus(final PendingRenewal.PriceConsentStatus priceConsentStatus) {
            this.priceConsentStatus = priceConsentStatus;
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            final PriceConsentStatusHolder that = (PriceConsentStatusHolder) o;

            return priceConsentStatus == that.priceConsentStatus;
        }

        @Override
        public int hashCode() {
            return Objects.hash(priceConsentStatus);
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", PriceConsentStatusHolder.class.getSimpleName() + "[", "]")
                .add("priceConsentStatus=" + priceConsentStatus)
                .toString();
        }
    }
}
