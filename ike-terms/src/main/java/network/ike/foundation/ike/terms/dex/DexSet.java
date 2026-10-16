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

import dev.ikm.tinkar.entity.builder.KnowledgeSet;

/**
 * Composes the Device Extension (DeX) starter data as a section of the Ike ledger: the DeX module,
 * author, model concept, phenomenon and record families, the concepts filed under them, and the
 * patterns that record device extension data.
 * <p>
 * The hierarchy, as the DeX starter data states it:
 * <pre>
 * Model concept (SOLOR)
 *   Device Extension Model concept
 *     Device Extension Record
 *     Test Performed, Specimen, Instrument, LOINC Record, SNOMED Record, Detection Limit,
 *     Quantitative Allowed Results, Allowable Range Minimum / Maximum Value, Associated Devices,
 *     Indication for Use, Allowed Results Set, Reference Range Population
 * Phenomenon
 *   Device Extension Phenomenon
 *     Company (Device Labeler), Analyte, Target
 * Module (SOLOR) -> Device Extension Module;  User (SOLOR) -> Device Extension Author
 * </pre>
 * <p>
 * DeX v2 (2026-10-13) adds, under the same Device Extension Model concept: Device Class (Class I, II,
 * III); Clinical Laboratory Improvement Amendments Complexity Level (Waived Test, Moderate Complexity
 * Level, High Complexity); Prescription Status (Over the Counter, Prescription Required); Regulatory
 * Classification; the limit, reference-limit and performance-metric families; Interpretation, Measuring
 * Range, Device Performance and Predicate Device; and eight patterns. Where a v2 pattern shares a name
 * with a v1 pattern (Test Performed, Population Reference Range) both are kept, under their own
 * identities, and the v2 classes carry a {@code V2} suffix.
 * <p>
 * Every identity is the one in the DeX starter data (v1 2025-09-03, v2 2026-10-13), declared outright.
 * Each component is authored at the one {@code Ike.DEX_INCEPTION} stamp (Device Extension Author, Device
 * Extension Module), so each carries a single version, and each is a member of the Device Extension
 * Membership Pattern. Concepts compose before patterns; the module, author and families come first.
 */
public final class DexSet {

    private DexSet() {
    }

    /**
     * Composes this set's declarations into the session.
     *
     * @param set the knowledge set (the session)
     */
    public static void compose(KnowledgeSet set) {
        DeviceExtensionModule.compose(set); // Device Extension Module
        DeviceExtensionAuthor.compose(set); // Device Extension Author
        DeviceExtensionModelConcept.compose(set); // Device Extension Model concept
        DeviceExtensionPhenomenon.compose(set); // Device Extension Phenomenon
        DeviceExtensionRecord.compose(set); // Device Extension Record
        AllowableRangeMaximumValue.compose(set); // Allowable Range Maximum Value
        AllowableRangeMinimumValue.compose(set); // Allowable Range Minimum Value
        AllowedResultsSet.compose(set); // Allowed Results Set
        Analyte.compose(set); // Analyte
        AssociatedDevices.compose(set); // Associated Devices
        Company.compose(set); // Company
        DetectionLimit.compose(set); // Detection Limit
        IndicationForUse.compose(set); // Indication for Use
        Instrument.compose(set); // Instrument
        LOINCRecord.compose(set); // LOINC Record
        QuantitativeAllowedResults.compose(set); // Quantitative Allowed Results
        ReferenceRangePopulation.compose(set); // Reference Range Population
        SNOMEDRecord.compose(set); // SNOMED Record
        Specimen.compose(set); // Specimen
        Target.compose(set); // Target
        TestPerformed.compose(set); // Test Performed

        AllowedResultsPattern.compose(set); // Allowed Results Pattern
        AssociatedDevicesPattern.compose(set); // Associated Devices Pattern
        BrandNameMembershipPattern.compose(set); // Brand Name Membership Pattern
        DeviceCompanyPattern.compose(set); // Device Company Pattern
        DeviceExtensionMembershipPattern.compose(set); // Device Extension Membership Pattern
        IndicationForUsePattern.compose(set); // Indication for Use Pattern
        PopulationReferenceRangePattern.compose(set); // Population Reference Range Pattern
        QuantitativeAllowedResultRangePattern.compose(set); // Quantitative Allowed Result Range Pattern
        TestPerformedPattern.compose(set); // Test Performed Pattern

        // DeX v2: concepts parents-first, then patterns.
        ClinicalLaboratoryImprovementAmendmentsComplexityLevel.compose(set); // Clinical Laboratory Improvement Amendments Complexity Level
        ConfidenceLevel.compose(set); // Confidence Level
        DeviceClass.compose(set); // Device Class
        DevicePerformance.compose(set); // Device Performance
        Interpretation.compose(set); // Interpretation
        LimitMetricType.compose(set); // Limit Metric Type
        LimitMetrics.compose(set); // Limit Metrics
        LimitValue.compose(set); // Limit Value
        LimitOfBlank.compose(set); // Limit of Blank
        LimitOfDetection.compose(set); // Limit of Detection
        LimitOfQuantitation.compose(set); // Limit of Quantitation
        LowerReferenceLimit.compose(set); // Lower Reference Limit
        MeasuringRange.compose(set); // Measuring Range
        PercentileValue.compose(set); // Percentile Value
        PerformanceMetric.compose(set); // Performance Metric
        PerformanceMetricValue.compose(set); // Performance Metric Value
        PredicateDevice.compose(set); // Predicate Device
        PrescriptionStatus.compose(set); // Prescription Status
        ReferenceLimit.compose(set); // Reference Limit
        ReferenceLimitPopulation.compose(set); // Reference Limit Population
        ReferenceLimitType.compose(set); // Reference Limit Type
        ReferenceLimitValue.compose(set); // Reference Limit Value
        ReferenceLimitValueOperator.compose(set); // Reference Limit Value Operator
        RegulatoryClassification.compose(set); // Regulatory Classification
        Sensitivity.compose(set); // Sensitivity
        SensitivityMetric.compose(set); // Sensitivity (metric)
        SensitivityMetricValue.compose(set); // Sensitivity Metric Value
        Specificity.compose(set); // Specificity
        UpperReferenceLimit.compose(set); // Upper Reference Limit
        ClassI.compose(set); // Class I
        ClassII.compose(set); // Class II
        ClassIII.compose(set); // Class III
        HighComplexity.compose(set); // High Complexity
        ModerateComplexityLevel.compose(set); // Moderate Complexity Level
        OverTheCounterOTC.compose(set); // Over the Counter (OTC)
        PrescriptionRequired.compose(set); // Prescription Required
        WaivedTest.compose(set); // Waived Test

        DevicePerformancePattern.compose(set); // Device Performance Pattern
        LimitMetricsPattern.compose(set); // Limit Metrics Pattern
        MeasuringRangePattern.compose(set); // Measuring Range Pattern
        PopulationReferenceRangePatternV2.compose(set); // Population Reference Range Pattern
        PredicateDevicePattern.compose(set); // Predicate Device Pattern
        ReferenceLimitPattern.compose(set); // Reference Limit Pattern
        RegulatoryClassificationPattern.compose(set); // Regulatory Classification Pattern
        TestPerformedPatternV2.compose(set); // Test Performed Pattern
    }
}
