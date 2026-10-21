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

/** The "Population Reference Range Pattern Archive" pattern of the Device Extension (DeX) starter set. */
final class PopulationReferenceRangePatternArchive {

    private PopulationReferenceRangePatternArchive() {
    }

    /**
     * Composes this section's declarations into the session.
     *
     * @param set the knowledge set (the session)
     */
    static void compose(KnowledgeSet set) {
        ActiveStamp inception = network.ike.foundation.ike.terms.Ike.DEX_INCEPTION;

                // Archived: the DeX v2 data revises this pattern under a new identity and the same name, so this
        // v1 pattern is named with an archive marker to keep the two distinct. Identities are unchanged.
        set.pattern("Population Reference Range Pattern Archive", PublicIds.of(UUID.fromString("e90e9d7a-0d75-40ea-b259-6b9b0d1b9b23"))).at(inception)
                .meaning(DexTerm.REFERENCE_RANGE).purpose(DexTerm.DEVICE_EXTENSION_RECORD)
                .field(DexTerm.REFERENCE_RANGE_POPULATION, DexTerm.DEVICE_EXTENSION_RECORD, KernelConcept.STRING)
                .field(DexTerm.MAXIMUM_VALUE_OPERATOR, KernelConcept.CONCRETE_DOMAIN_OPERATOR, KernelConcept.COMPONENT_FIELD)
                .field(DexTerm.MINIMUM_VALUE_OPERATOR, KernelConcept.CONCRETE_DOMAIN_OPERATOR, KernelConcept.COMPONENT_FIELD)
                .field(DexTerm.REFERENCE_RANGE_MAXIMUM, DexTerm.DEVICE_EXTENSION_RECORD, KernelConcept.FLOAT_FIELD)
                .field(DexTerm.REFERENCE_RANGE_MINIMUM, DexTerm.DEVICE_EXTENSION_RECORD, KernelConcept.FLOAT_FIELD)
                .field(DexTerm.EXAMPLE_UCUM_UNITS, DexTerm.DEVICE_EXTENSION_RECORD, KernelConcept.STRING)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("33d8d20a-d16e-4e3f-9873-9e5913361518")), KernelConcept.ENGLISH_LANGUAGE, "Population Reference Range Pattern Archive", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.FULLY_QUALIFIED_NAME_DESCRIPTION_TYPE)
                .semantic(DexTerm.DEVICE_EXTENSION_MEMBERSHIP_PATTERN, PublicIds.of(UUID.fromString("fe8aa63e-4594-40b5-806f-4e430dec64b1")))
                .semanticOn(PublicIds.of(UUID.fromString("33d8d20a-d16e-4e3f-9873-9e5913361518")), KernelPattern.US_DIALECT_PATTERN, PublicIds.of(UUID.fromString("16732333-1612-40f8-aced-53f29633e192")), DexTerm.ACCEPTABLE)
                ;
    }
}
