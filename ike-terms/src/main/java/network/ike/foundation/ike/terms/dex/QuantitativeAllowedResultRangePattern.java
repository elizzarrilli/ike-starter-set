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
import dev.ikm.tinkar.entity.builder.ActiveStamp;
import dev.ikm.tinkar.entity.builder.KnowledgeSet;
import dev.ikm.tinkar.terms.KernelConcept;
import dev.ikm.tinkar.terms.KernelPattern;

import java.util.UUID;

/** The "Quantitative Allowed Result Range Pattern" pattern of the Device Extension (DeX) starter set. */
final class QuantitativeAllowedResultRangePattern {

    private QuantitativeAllowedResultRangePattern() {
    }

    /**
     * Composes this section's declarations into the session.
     *
     * @param set the knowledge set (the session)
     */
    static void compose(KnowledgeSet set) {
        ActiveStamp inception = network.ike.foundation.ike.terms.Ike.DEX_INCEPTION;

        set.pattern("Quantitative Allowed Result Range Pattern", PublicIds.of(UUID.fromString("475f0c5d-006e-46d3-80f7-6e5afe9b5e18"))).at(inception)
                .meaning(DexTerm.QUANTITATIVE_ALLOWED_RESULTS).purpose(DexTerm.DEVICE_EXTENSION_RECORD)
                .field(DexTerm.MAXIMUM_VALUE_OPERATOR, KernelConcept.CONCRETE_DOMAIN_OPERATOR, KernelConcept.COMPONENT_FIELD)
                .field(DexTerm.MINIMUM_VALUE_OPERATOR, KernelConcept.CONCRETE_DOMAIN_OPERATOR, KernelConcept.COMPONENT_FIELD)
                .field(DexTerm.ALLOWABLE_RANGE_MAXIMUM_VALUE, DexTerm.DEVICE_EXTENSION_RECORD, KernelConcept.FLOAT_FIELD)
                .field(DexTerm.ALLOWABLE_RANGE_MINIMUM_VALUE, DexTerm.DEVICE_EXTENSION_RECORD, KernelConcept.FLOAT_FIELD)
                .field(DexTerm.EXAMPLE_UCUM_UNITS, DexTerm.DEVICE_EXTENSION_RECORD, KernelConcept.STRING)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("e887fc50-fa01-423b-841f-be48bbd64660")), KernelConcept.ENGLISH_LANGUAGE, "Quantitative Allowed Result Range Pattern", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.FULLY_QUALIFIED_NAME_DESCRIPTION_TYPE)
                .semantic(DexTerm.DEVICE_EXTENSION_MEMBERSHIP_PATTERN, PublicIds.of(UUID.fromString("46ef7bbf-ecf5-4bb3-9f87-46794637b668")))
                .semanticOn(PublicIds.of(UUID.fromString("e887fc50-fa01-423b-841f-be48bbd64660")), KernelPattern.US_DIALECT_PATTERN, PublicIds.of(UUID.fromString("c3f3d276-a592-4c8a-9502-fc899f9c6546")), DexTerm.ACCEPTABLE)
                ;
    }
}
