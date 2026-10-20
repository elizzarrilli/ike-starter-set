/*
 * Copyright © 2026 IKE Network (support@ike.network)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package network.ike.foundation.ike.terms.dex;

import dev.ikm.tinkar.common.id.PublicIds;
import dev.ikm.tinkar.terms.EntityProxy;

import java.util.List;
import java.util.UUID;

/**
 * References for every Device Extension (DeX) component this set declares, and for the
 * established components its content cites that the kernel bindings do not name. The DeX
 * identities are the ones in the DeX starter data (2025-09-03), declared outright rather than
 * derived: downstream data already cites them.
 */
public final class DexTerm {

    private DexTerm() {
    }

    /** {@code Allowable Range Maximum Value} — a DeX concept. */
    public static final EntityProxy.Concept ALLOWABLE_RANGE_MAXIMUM_VALUE =
            EntityProxy.Concept.make("Allowable Range Maximum Value", PublicIds.of(UUID.fromString("ff70ecd3-4d49-4846-8d3b-7310064c375e")));

    /** {@code Allowable Range Minimum Value} — a DeX concept. */
    public static final EntityProxy.Concept ALLOWABLE_RANGE_MINIMUM_VALUE =
            EntityProxy.Concept.make("Allowable Range Minimum Value", PublicIds.of(UUID.fromString("1deaa2ff-0590-494e-b5ac-df68f4b9f03d")));

    /** {@code Allowed Results Pattern} — a DeX pattern. */
    public static final EntityProxy.Pattern ALLOWED_RESULTS_PATTERN =
            EntityProxy.Pattern.make("Allowed Results Pattern", PublicIds.of(UUID.fromString("87998b64-277f-4c79-baaa-b18d1557ef74")));

    /** {@code Allowed Results Set} — a DeX concept. */
    public static final EntityProxy.Concept ALLOWED_RESULTS_SET =
            EntityProxy.Concept.make("Allowed Results Set", PublicIds.of(UUID.fromString("b8c9b46e-3b5c-4ffd-8fdb-16ea5b790d58")));

    /** {@code Analyte} — a DeX concept. */
    public static final EntityProxy.Concept ANALYTE =
            EntityProxy.Concept.make("Analyte", PublicIds.of(UUID.fromString("4b0e6c51-a155-4254-96de-fd2c4beb33f9")));

    /** {@code Associated Devices} — a DeX concept. */
    public static final EntityProxy.Concept ASSOCIATED_DEVICES =
            EntityProxy.Concept.make("Associated Devices", PublicIds.of(UUID.fromString("9c575436-0ae3-4b0d-9cb5-c995367093b4")));

    /** {@code Associated Devices Pattern} — a DeX pattern. */
    public static final EntityProxy.Pattern ASSOCIATED_DEVICES_PATTERN =
            EntityProxy.Pattern.make("Associated Devices Pattern", PublicIds.of(UUID.fromString("8c7f5071-f8b3-4ed8-a958-f9d36bdfd752")));

    /** {@code Brand Name Membership Pattern} — a DeX pattern. */
    public static final EntityProxy.Pattern BRAND_NAME_MEMBERSHIP_PATTERN =
            EntityProxy.Pattern.make("Brand Name Membership Pattern", PublicIds.of(UUID.fromString("6281432a-3bcb-4940-93fc-521a060efd9e")));

    /** {@code Company} — a DeX concept. */
    public static final EntityProxy.Concept COMPANY =
            EntityProxy.Concept.make("Company", PublicIds.of(UUID.fromString("aa4d312a-637f-4f73-a4a6-7dede2f351f5")));

    /** {@code Detection Limit} — a DeX concept. */
    public static final EntityProxy.Concept DETECTION_LIMIT =
            EntityProxy.Concept.make("Detection Limit", PublicIds.of(UUID.fromString("b8004f41-5c65-40a8-9b39-55502195e7f0")));

    /** {@code Device Company Pattern} — a DeX pattern. */
    public static final EntityProxy.Pattern DEVICE_COMPANY_PATTERN =
            EntityProxy.Pattern.make("Device Company Pattern", PublicIds.of(UUID.fromString("3790becb-0b3d-4d46-afe2-18810f81028a")));

    /** {@code Device Extension Author} — a DeX concept. */
    public static final EntityProxy.Concept DEVICE_EXTENSION_AUTHOR =
            EntityProxy.Concept.make("Device Extension Author", PublicIds.of(UUID.fromString("94606bde-dffe-4ef8-a035-aa89368074c0")));

    /** {@code Device Extension Membership Pattern} — a DeX pattern. */
    public static final EntityProxy.Pattern DEVICE_EXTENSION_MEMBERSHIP_PATTERN =
            EntityProxy.Pattern.make("Device Extension Membership Pattern", PublicIds.of(UUID.fromString("158c9877-4ae1-4a54-84ac-dd0c0d87f874")));

    /** {@code Device Extension Model concept} — a DeX concept. */
    public static final EntityProxy.Concept DEVICE_EXTENSION_MODEL_CONCEPT =
            EntityProxy.Concept.make("Device Extension Model concept", PublicIds.of(UUID.fromString("5c0cc662-918f-4ecb-8817-42258ca7efeb")));

    /** {@code Device Extension Module} — a DeX concept. */
    public static final EntityProxy.Concept DEVICE_EXTENSION_MODULE =
            EntityProxy.Concept.make("Device Extension Module", PublicIds.of(UUID.fromString("f0a7714c-5dd1-4da6-ab89-38a8653f5fab")));

    /** {@code Device Extension Phenomenon} — a DeX concept. */
    public static final EntityProxy.Concept DEVICE_EXTENSION_PHENOMENON =
            EntityProxy.Concept.make("Device Extension Phenomenon", PublicIds.of(UUID.fromString("f2541ecd-bea3-4201-a2fc-bd20db8717d7")));

    /** {@code Device Extension Record} — a DeX concept. */
    public static final EntityProxy.Concept DEVICE_EXTENSION_RECORD =
            EntityProxy.Concept.make("Device Extension Record", PublicIds.of(UUID.fromString("29956ef1-ea2b-488a-bf97-e0d6a0335f8d")));

    /** {@code Indication for Use} — a DeX concept. */
    public static final EntityProxy.Concept INDICATION_FOR_USE =
            EntityProxy.Concept.make("Indication for Use", PublicIds.of(UUID.fromString("2722d529-8421-49b5-b2a4-cd5ce64216bb")));

    /** {@code Indication for Use Pattern} — a DeX pattern. */
    public static final EntityProxy.Pattern INDICATION_FOR_USE_PATTERN =
            EntityProxy.Pattern.make("Indication for Use Pattern", PublicIds.of(UUID.fromString("7d1d8a87-bb06-4293-9ba1-5cf3e8499185")));

    /** {@code Instrument} — a DeX concept. */
    public static final EntityProxy.Concept INSTRUMENT =
            EntityProxy.Concept.make("Instrument", PublicIds.of(UUID.fromString("13057af8-ea5a-460e-b195-02084ed46bae")));

    /** {@code LOINC Record} — a DeX concept. */
    public static final EntityProxy.Concept LOINC_RECORD =
            EntityProxy.Concept.make("LOINC Record", PublicIds.of(UUID.fromString("06069ac5-71b4-4803-97c3-e58699fda62c")));

    /** {@code Population Reference Range Pattern} — a DeX pattern. */
    public static final EntityProxy.Pattern POPULATION_REFERENCE_RANGE_PATTERN =
            EntityProxy.Pattern.make("Population Reference Range Pattern", PublicIds.of(UUID.fromString("e90e9d7a-0d75-40ea-b259-6b9b0d1b9b23")));

    /** {@code Quantitative Allowed Result Range Pattern} — a DeX pattern. */
    public static final EntityProxy.Pattern QUANTITATIVE_ALLOWED_RESULT_RANGE_PATTERN =
            EntityProxy.Pattern.make("Quantitative Allowed Result Range Pattern", PublicIds.of(UUID.fromString("475f0c5d-006e-46d3-80f7-6e5afe9b5e18")));

    /** {@code Quantitative Allowed Results} — a DeX concept. */
    public static final EntityProxy.Concept QUANTITATIVE_ALLOWED_RESULTS =
            EntityProxy.Concept.make("Quantitative Allowed Results", PublicIds.of(UUID.fromString("5d1aa5a7-a817-4ba8-9e56-83351ba6e6b7")));

    /** {@code Reference Range Population} — a DeX concept. */
    public static final EntityProxy.Concept REFERENCE_RANGE_POPULATION =
            EntityProxy.Concept.make("Reference Range Population", PublicIds.of(UUID.fromString("b5ad02e2-017f-4d24-8354-6d00347eceb4")));

    /** {@code SNOMED Record} — a DeX concept. */
    public static final EntityProxy.Concept SNOMED_RECORD =
            EntityProxy.Concept.make("SNOMED Record", PublicIds.of(UUID.fromString("f4189f40-1846-43d2-a09c-caed9121195a")));

    /** {@code Specimen} — a DeX concept. */
    public static final EntityProxy.Concept SPECIMEN =
            EntityProxy.Concept.make("Specimen", PublicIds.of(UUID.fromString("2402e1ee-52d8-401c-894e-cdc75d7fc54a")));

    /** {@code Target} — a DeX concept. */
    public static final EntityProxy.Concept TARGET =
            EntityProxy.Concept.make("Target", PublicIds.of(UUID.fromString("17adaa48-0f59-4217-8140-b0bd7707af67")));

    /** {@code Test Performed} — a DeX concept. */
    public static final EntityProxy.Concept TEST_PERFORMED =
            EntityProxy.Concept.make("Test Performed", PublicIds.of(UUID.fromString("542ce1f0-68bf-4a9b-bd7b-9d585a69206b")));

    /** {@code Test Performed Pattern} — a DeX pattern. */
    public static final EntityProxy.Pattern TEST_PERFORMED_PATTERN =
            EntityProxy.Pattern.make("Test Performed Pattern", PublicIds.of(UUID.fromString("4289dbff-1557-4a1d-873a-7092b328615d")));

    /** {@code Acceptable (SOLOR)} — a description's acceptability in a dialect. */
    public static final EntityProxy.Concept ACCEPTABLE =
            EntityProxy.Concept.make("Acceptable (SOLOR)", PublicIds.of(UUID.fromString("12b9e103-060e-3256-9982-18c1191af60e")));

    /** {@code Example UCUM Units (SOLOR)} — an established component the DeX content cites. */
    public static final EntityProxy.Concept EXAMPLE_UCUM_UNITS =
            EntityProxy.Concept.make("Example UCUM Units (SOLOR)", PublicIds.of(UUID.fromString("80cd4978-314d-46e3-bc13-9980280ae955")));

    /** {@code Maximum Value Operator (SOLOR)} — an established component the DeX content cites. */
    public static final EntityProxy.Concept MAXIMUM_VALUE_OPERATOR =
            EntityProxy.Concept.make("Maximum Value Operator (SOLOR)", PublicIds.of(UUID.fromString("7b8916ab-fd50-41df-8fc2-0b2a7a78be6d")));

    /** {@code Membership semantic (SOLOR)} — an established component the DeX content cites. */
    public static final EntityProxy.Concept MEMBERSHIP_SEMANTIC =
            EntityProxy.Concept.make("Membership semantic (SOLOR)", PublicIds.of(UUID.fromString("4fa29287-a80e-5f83-abab-4b587973e7b7")));

    /** {@code Minimum Value Operator (SOLOR)} — an established component the DeX content cites. */
    public static final EntityProxy.Concept MINIMUM_VALUE_OPERATOR =
            EntityProxy.Concept.make("Minimum Value Operator (SOLOR)", PublicIds.of(UUID.fromString("ded98e42-f74a-4432-9ae7-01b94dc2fdea")));

    /** {@code Model concept (SOLOR)} — an established component the DeX content cites. */
    public static final EntityProxy.Concept MODEL_CONCEPT =
            EntityProxy.Concept.make("Model concept (SOLOR)", PublicIds.of(UUID.fromString("7bbd4210-381c-11e7-9598-0800200c9a66")));

    /** {@code Module (SOLOR)} — an established component the DeX content cites. */
    public static final EntityProxy.Concept MODULE =
            EntityProxy.Concept.make("Module (SOLOR)", PublicIds.of(UUID.fromString("40d1c869-b509-32f8-b735-836eac577a67")));

    /** {@code Reference Range (SOLOR)} — an established component the DeX content cites. */
    public static final EntityProxy.Concept REFERENCE_RANGE =
            EntityProxy.Concept.make("Reference Range (SOLOR)", PublicIds.of(UUID.fromString("87ce975b-309b-47f4-a6c6-4ae6df6649a1")));

    /** {@code Reference Range Maximum (SOLOR)} — an established component the DeX content cites. */
    public static final EntityProxy.Concept REFERENCE_RANGE_MAXIMUM =
            EntityProxy.Concept.make("Reference Range Maximum (SOLOR)", PublicIds.of(UUID.fromString("72d58983-b1e1-4ca9-833f-0e40c1defd39")));

    /** {@code Reference Range Minimum (SOLOR)} — an established component the DeX content cites. */
    public static final EntityProxy.Concept REFERENCE_RANGE_MINIMUM =
            EntityProxy.Concept.make("Reference Range Minimum (SOLOR)", PublicIds.of(UUID.fromString("37c35a88-9e27-42ca-b626-186773c4b612")));

    // ── DeX v2 ─────────────────────────────────────────────────────────────────────────────────────

    /** {@code Class I} — a DeX v2 concept. */
    public static final EntityProxy.Concept CLASS_I =
            EntityProxy.Concept.make("Class I", PublicIds.of(UUID.fromString("3fc148fd-c1a1-4b41-b378-c3c2aa24909d")));

    /** {@code Class II} — a DeX v2 concept. */
    public static final EntityProxy.Concept CLASS_II =
            EntityProxy.Concept.make("Class II", PublicIds.of(UUID.fromString("c6565a03-1223-4f41-902a-837f307c1865")));

    /** {@code Class III} — a DeX v2 concept. */
    public static final EntityProxy.Concept CLASS_III =
            EntityProxy.Concept.make("Class III", PublicIds.of(UUID.fromString("b2edf870-95da-48a8-8ce4-622931d00243")));

    /** {@code Clinical Laboratory Improvement Amendments Complexity Level} — a DeX v2 concept. */
    public static final EntityProxy.Concept CLINICAL_LABORATORY_IMPROVEMENT_AMENDMENTS_COMPLEXITY_LEVEL =
            EntityProxy.Concept.make("Clinical Laboratory Improvement Amendments Complexity Level", PublicIds.of(UUID.fromString("223ff478-7227-4822-a78e-08fea77effd8")));

    /** {@code Confidence Level} — a DeX v2 concept. */
    public static final EntityProxy.Concept CONFIDENCE_LEVEL =
            EntityProxy.Concept.make("Confidence Level", PublicIds.of(UUID.fromString("981b96d6-3447-4fd6-8e9d-ec6fa51bb4f2")));

    /** {@code Device Class} — a DeX v2 concept. */
    public static final EntityProxy.Concept DEVICE_CLASS =
            EntityProxy.Concept.make("Device Class", PublicIds.of(UUID.fromString("083c4e17-1e71-40fe-a84e-a4e91eb7e24e")));

    /** {@code Device Performance} — a DeX v2 concept. */
    public static final EntityProxy.Concept DEVICE_PERFORMANCE =
            EntityProxy.Concept.make("Device Performance", PublicIds.of(UUID.fromString("fdbda4ad-9af9-42fd-aedd-2e57f6c00f61")));

    /** {@code Device Performance Pattern} — a DeX v2 pattern. */
    public static final EntityProxy.Pattern DEVICE_PERFORMANCE_PATTERN =
            EntityProxy.Pattern.make("Device Performance Pattern", PublicIds.of(UUID.fromString("b8962f4a-6ad0-4f08-a5c6-1f3b302cacd9")));

    /** {@code High Complexity} — a DeX v2 concept. */
    public static final EntityProxy.Concept HIGH_COMPLEXITY =
            EntityProxy.Concept.make("High Complexity", PublicIds.of(UUID.fromString("6e7e8657-28e4-4b2d-a66a-b29cbdb85668")));

    /** {@code Interpretation} — a DeX v2 concept. */
    public static final EntityProxy.Concept INTERPRETATION =
            EntityProxy.Concept.make("Interpretation", PublicIds.of(UUID.fromString("cff8c7c7-6115-485f-9925-a87bf0199d2d")));

    /** {@code Limit Metric Type} — a DeX v2 concept. */
    public static final EntityProxy.Concept LIMIT_METRIC_TYPE =
            EntityProxy.Concept.make("Limit Metric Type", PublicIds.of(UUID.fromString("81563eee-3128-450d-85dc-853e77b924eb")));

    /** {@code Limit Metrics} — a DeX v2 concept. */
    public static final EntityProxy.Concept LIMIT_METRICS =
            EntityProxy.Concept.make("Limit Metrics", PublicIds.of(UUID.fromString("c28f4201-0867-446a-baeb-95a15fb5d343")));

    /** {@code Limit Metrics Pattern} — a DeX v2 pattern. */
    public static final EntityProxy.Pattern LIMIT_METRICS_PATTERN =
            EntityProxy.Pattern.make("Limit Metrics Pattern", PublicIds.of(UUID.fromString("34fbab84-87e9-4d22-89dc-fb1b5a2524c3")));

    /** {@code Limit Value} — a DeX v2 concept. */
    public static final EntityProxy.Concept LIMIT_VALUE =
            EntityProxy.Concept.make("Limit Value", PublicIds.of(UUID.fromString("2f68311c-6398-464f-83c0-e9c5f6523967")));

    /** {@code Limit of Blank} — a DeX v2 concept. */
    public static final EntityProxy.Concept LIMIT_OF_BLANK =
            EntityProxy.Concept.make("Limit of Blank", PublicIds.of(UUID.fromString("43cb7e60-5f9b-4b46-beee-3f38fc45f762")));

    /** {@code Limit of Detection} — a DeX v2 concept. */
    public static final EntityProxy.Concept LIMIT_OF_DETECTION =
            EntityProxy.Concept.make("Limit of Detection", PublicIds.of(UUID.fromString("651b040d-0155-4089-9589-e31a831f82c7")));

    /** {@code Limit of Quantitation} — a DeX v2 concept. */
    public static final EntityProxy.Concept LIMIT_OF_QUANTITATION =
            EntityProxy.Concept.make("Limit of Quantitation", PublicIds.of(UUID.fromString("d0ef707f-79a4-4eaa-a449-5277a46e99be")));

    /** {@code Lower Reference Limit} — a DeX v2 concept. */
    public static final EntityProxy.Concept LOWER_REFERENCE_LIMIT =
            EntityProxy.Concept.make("Lower Reference Limit", PublicIds.of(UUID.fromString("f946d936-c885-45f1-821c-bc69b9e73d5a")));

    /** {@code Measuring Range} — a DeX v2 concept. */
    public static final EntityProxy.Concept MEASURING_RANGE =
            EntityProxy.Concept.make("Measuring Range", PublicIds.of(UUID.fromString("e1c0ff10-d1fa-4c5e-b726-132e304a869b")));

    /** {@code Measuring Range Pattern} — a DeX v2 pattern. */
    public static final EntityProxy.Pattern MEASURING_RANGE_PATTERN =
            EntityProxy.Pattern.make("Measuring Range Pattern", PublicIds.of(UUID.fromString("17e163b0-1cbc-4e35-b1a7-785bf7ffd81f")));

    /** {@code Moderate Complexity Level} — a DeX v2 concept. */
    public static final EntityProxy.Concept MODERATE_COMPLEXITY_LEVEL =
            EntityProxy.Concept.make("Moderate Complexity Level", PublicIds.of(UUID.fromString("1f0c761c-ce62-49d2-92d3-36c7ba4d80d2")));

    /** {@code Over the Counter (OTC)} — a DeX v2 concept. */
    public static final EntityProxy.Concept OVER_THE_COUNTER_OTC =
            EntityProxy.Concept.make("Over the Counter (OTC)", PublicIds.of(UUID.fromString("7de25bc3-ef80-4c48-b5bb-4c4b4b874652")));

    /** {@code Percentile Value} — a DeX v2 concept. */
    public static final EntityProxy.Concept PERCENTILE_VALUE =
            EntityProxy.Concept.make("Percentile Value", PublicIds.of(UUID.fromString("184c70c7-75f1-4c50-8cbb-24f4fac878f2")));

    /** {@code Performance Metric} — a DeX v2 concept. */
    public static final EntityProxy.Concept PERFORMANCE_METRIC =
            EntityProxy.Concept.make("Performance Metric", PublicIds.of(UUID.fromString("5ec20eb4-344c-49e8-aa7a-ea09485c5709")));

    /** {@code Performance Metric Value} — a DeX v2 concept. */
    public static final EntityProxy.Concept PERFORMANCE_METRIC_VALUE =
            EntityProxy.Concept.make("Performance Metric Value", PublicIds.of(UUID.fromString("88bb710a-672a-4f02-ba7a-bbfb98e0a209")));

    /** {@code Population Reference Range Pattern} — a DeX v2 pattern. */
    public static final EntityProxy.Pattern POPULATION_REFERENCE_RANGE_PATTERN_V2 =
            EntityProxy.Pattern.make("Population Reference Range Pattern DeX v2", PublicIds.of(UUID.fromString("45860900-cd72-421c-80d8-7fafeeaf98b2")));

    /** {@code Predicate Device} — a DeX v2 concept. */
    public static final EntityProxy.Concept PREDICATE_DEVICE =
            EntityProxy.Concept.make("Predicate Device", PublicIds.of(UUID.fromString("d43e4002-1dda-4205-b72c-986f181dd995")));

    /** {@code Predicate Device Pattern} — a DeX v2 pattern. */
    public static final EntityProxy.Pattern PREDICATE_DEVICE_PATTERN =
            EntityProxy.Pattern.make("Predicate Device Pattern", PublicIds.of(UUID.fromString("ee60349d-1ffd-42de-a760-35f45452bff0")));

    /** {@code Prescription Required} — a DeX v2 concept. */
    public static final EntityProxy.Concept PRESCRIPTION_REQUIRED =
            EntityProxy.Concept.make("Prescription Required", PublicIds.of(UUID.fromString("b424f8ba-81b2-49a4-8907-ddc376d44f29")));

    /** {@code Prescription Status} — a DeX v2 concept. */
    public static final EntityProxy.Concept PRESCRIPTION_STATUS =
            EntityProxy.Concept.make("Prescription Status", PublicIds.of(UUID.fromString("187b44a5-5f35-4e5b-89d2-42fe69960ee9")));

    /** {@code Reference Limit} — a DeX v2 concept. */
    public static final EntityProxy.Concept REFERENCE_LIMIT =
            EntityProxy.Concept.make("Reference Limit", PublicIds.of(UUID.fromString("192c9004-095f-4673-8142-01b354f250e1")));

    /** {@code Reference Limit Pattern} — a DeX v2 pattern. */
    public static final EntityProxy.Pattern REFERENCE_LIMIT_PATTERN =
            EntityProxy.Pattern.make("Reference Limit Pattern", PublicIds.of(UUID.fromString("dd7ad60d-05fb-485d-8114-424bbf17e149")));

    /** {@code Reference Limit Population} — a DeX v2 concept. */
    public static final EntityProxy.Concept REFERENCE_LIMIT_POPULATION =
            EntityProxy.Concept.make("Reference Limit Population", PublicIds.of(UUID.fromString("f2042a9c-f9bb-4a0c-b7a1-032f0fb763be")));

    /** {@code Reference Limit Type} — a DeX v2 concept. */
    public static final EntityProxy.Concept REFERENCE_LIMIT_TYPE =
            EntityProxy.Concept.make("Reference Limit Type", PublicIds.of(UUID.fromString("b56d276c-b910-47a8-8090-d3f314b17c85")));

    /** {@code Reference Limit Value} — a DeX v2 concept. */
    public static final EntityProxy.Concept REFERENCE_LIMIT_VALUE =
            EntityProxy.Concept.make("Reference Limit Value", PublicIds.of(UUID.fromString("5d5291e5-9ec8-4bf5-b1c4-3bef6dc8a2f3")));

    /** {@code Reference Limit Value Operator} — a DeX v2 concept. */
    public static final EntityProxy.Concept REFERENCE_LIMIT_VALUE_OPERATOR =
            EntityProxy.Concept.make("Reference Limit Value Operator", PublicIds.of(UUID.fromString("d19b5ce0-f5df-4e23-a569-2854e6dab99f")));

    /** {@code Regulatory Classification} — a DeX v2 concept. */
    public static final EntityProxy.Concept REGULATORY_CLASSIFICATION =
            EntityProxy.Concept.make("Regulatory Classification", PublicIds.of(UUID.fromString("b56e3cf2-3ad0-44d1-9404-d01454122bb6")));

    /** {@code Regulatory Classification Pattern} — a DeX v2 pattern. */
    public static final EntityProxy.Pattern REGULATORY_CLASSIFICATION_PATTERN =
            EntityProxy.Pattern.make("Regulatory Classification Pattern", PublicIds.of(UUID.fromString("9809c747-3aca-4e40-9a46-3a9bca0f6225")));

    /** {@code Sensitivity} — a DeX v2 concept. */
    public static final EntityProxy.Concept SENSITIVITY =
            EntityProxy.Concept.make("Sensitivity", PublicIds.of(UUID.fromString("b4567d03-228f-4508-aaf1-0401d245b6a1")));

    /** {@code Sensitivity metric} — a DeX v2 concept (named {@code Sensitivity (metric)} in the data). */
    public static final EntityProxy.Concept SENSITIVITY_METRIC =
            EntityProxy.Concept.make("Sensitivity metric", PublicIds.of(UUID.fromString("f25b1716-fa3b-464a-9c88-8dea8f3110c9")));

    /** {@code Sensitivity Metric Value} — a DeX v2 concept. */
    public static final EntityProxy.Concept SENSITIVITY_METRIC_VALUE =
            EntityProxy.Concept.make("Sensitivity Metric Value", PublicIds.of(UUID.fromString("e850e28d-d0e5-446e-b3ff-3472ef003c3c")));

    /** {@code Specificity} — a DeX v2 concept. */
    public static final EntityProxy.Concept SPECIFICITY =
            EntityProxy.Concept.make("Specificity", PublicIds.of(UUID.fromString("8990ee0d-14db-4b86-94fd-67f94478353b")));

    /** {@code Test Performed Pattern} — a DeX v2 pattern. */
    public static final EntityProxy.Pattern TEST_PERFORMED_PATTERN_V2 =
            EntityProxy.Pattern.make("Test Performed Pattern DeX v2", PublicIds.of(UUID.fromString("91d3829e-5a01-47f1-8178-9e224843d751")));

    /** {@code Upper Reference Limit} — a DeX v2 concept. */
    public static final EntityProxy.Concept UPPER_REFERENCE_LIMIT =
            EntityProxy.Concept.make("Upper Reference Limit", PublicIds.of(UUID.fromString("b18c4c85-74bf-4332-aece-249c407fccd3")));

    /** {@code Waived Test} — a DeX v2 concept. */
    public static final EntityProxy.Concept WAIVED_TEST =
            EntityProxy.Concept.make("Waived Test", PublicIds.of(UUID.fromString("b10b443c-1848-4c4b-9016-60e9bbc7a1c4")));

    /**
     * The concepts this set declares, the DeX concepts of v1 and v2, as opposed to the established
     * components it only cites. The fidelity test uses it to exempt them from the meaning-and-purpose
     * definition rule until their definitions are authored.
     *
     * @return the declared DeX concepts
     */
    public static List<EntityProxy.Concept> declaredConcepts() {
        return List.of(
                ALLOWABLE_RANGE_MAXIMUM_VALUE,
                ALLOWABLE_RANGE_MINIMUM_VALUE,
                ALLOWED_RESULTS_SET,
                ANALYTE,
                ASSOCIATED_DEVICES,
                COMPANY,
                DETECTION_LIMIT,
                DEVICE_EXTENSION_AUTHOR,
                DEVICE_EXTENSION_MODEL_CONCEPT,
                DEVICE_EXTENSION_MODULE,
                DEVICE_EXTENSION_PHENOMENON,
                DEVICE_EXTENSION_RECORD,
                INDICATION_FOR_USE,
                INSTRUMENT,
                LOINC_RECORD,
                QUANTITATIVE_ALLOWED_RESULTS,
                REFERENCE_RANGE_POPULATION,
                SNOMED_RECORD,
                SPECIMEN,
                TARGET,
                TEST_PERFORMED,
                CLASS_I,
                CLASS_II,
                CLASS_III,
                CLINICAL_LABORATORY_IMPROVEMENT_AMENDMENTS_COMPLEXITY_LEVEL,
                CONFIDENCE_LEVEL,
                DEVICE_CLASS,
                DEVICE_PERFORMANCE,
                HIGH_COMPLEXITY,
                INTERPRETATION,
                LIMIT_METRIC_TYPE,
                LIMIT_METRICS,
                LIMIT_VALUE,
                LIMIT_OF_BLANK,
                LIMIT_OF_DETECTION,
                LIMIT_OF_QUANTITATION,
                LOWER_REFERENCE_LIMIT,
                MEASURING_RANGE,
                MODERATE_COMPLEXITY_LEVEL,
                OVER_THE_COUNTER_OTC,
                PERCENTILE_VALUE,
                PERFORMANCE_METRIC,
                PERFORMANCE_METRIC_VALUE,
                PREDICATE_DEVICE,
                PRESCRIPTION_REQUIRED,
                PRESCRIPTION_STATUS,
                REFERENCE_LIMIT,
                REFERENCE_LIMIT_POPULATION,
                REFERENCE_LIMIT_TYPE,
                REFERENCE_LIMIT_VALUE,
                REFERENCE_LIMIT_VALUE_OPERATOR,
                REGULATORY_CLASSIFICATION,
                SENSITIVITY,
                SENSITIVITY_METRIC,
                SENSITIVITY_METRIC_VALUE,
                SPECIFICITY,
                UPPER_REFERENCE_LIMIT,
                WAIVED_TEST);
    }

    /**
     * The patterns this set declares, v1's and v2's, as opposed to the established patterns it only cites.
     * The fidelity test uses it to exempt the concepts they cite from the meaning-and-purpose definition
     * rule until the DeX definitions are authored.
     *
     * @return the declared DeX patterns
     */
    public static List<EntityProxy.Pattern> declaredPatterns() {
        return List.of(
                ALLOWED_RESULTS_PATTERN,
                ASSOCIATED_DEVICES_PATTERN,
                BRAND_NAME_MEMBERSHIP_PATTERN,
                DEVICE_COMPANY_PATTERN,
                DEVICE_EXTENSION_MEMBERSHIP_PATTERN,
                INDICATION_FOR_USE_PATTERN,
                POPULATION_REFERENCE_RANGE_PATTERN,
                QUANTITATIVE_ALLOWED_RESULT_RANGE_PATTERN,
                TEST_PERFORMED_PATTERN,
                DEVICE_PERFORMANCE_PATTERN,
                LIMIT_METRICS_PATTERN,
                MEASURING_RANGE_PATTERN,
                POPULATION_REFERENCE_RANGE_PATTERN_V2,
                PREDICATE_DEVICE_PATTERN,
                REFERENCE_LIMIT_PATTERN,
                REGULATORY_CLASSIFICATION_PATTERN,
                TEST_PERFORMED_PATTERN_V2);
    }
}
