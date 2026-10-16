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
}
