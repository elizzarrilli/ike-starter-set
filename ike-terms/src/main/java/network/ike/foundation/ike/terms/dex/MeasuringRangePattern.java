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

/** The "Measuring Range Pattern" pattern of the Device Extension (DeX) starter set (v2). */
final class MeasuringRangePattern {

    private MeasuringRangePattern() {
    }

    /**
     * Composes this section's declarations into the session.
     *
     * @param set the knowledge set (the session)
     */
    static void compose(KnowledgeSet set) {
        ActiveStamp inception = network.ike.foundation.ike.terms.Ike.DEX_INCEPTION;

        set.pattern("Measuring Range Pattern", PublicIds.of(UUID.fromString("17e163b0-1cbc-4e35-b1a7-785bf7ffd81f"))).at(inception)
                .meaning(DexTerm.MEASURING_RANGE).purpose(DexTerm.DEVICE_EXTENSION_RECORD)
                .field(DexTerm.REFERENCE_RANGE_MINIMUM, KernelConcept.FLOAT_FIELD, KernelConcept.FLOAT_FIELD)
                .field(DexTerm.REFERENCE_RANGE_MAXIMUM, DexTerm.DEVICE_EXTENSION_RECORD, KernelConcept.FLOAT_FIELD)
                .field(DexTerm.MINIMUM_VALUE_OPERATOR, DexTerm.DEVICE_EXTENSION_RECORD, KernelConcept.COMPONENT_FIELD)
                .field(DexTerm.MAXIMUM_VALUE_OPERATOR, DexTerm.DEVICE_EXTENSION_RECORD, KernelConcept.COMPONENT_FIELD)
                .field(DexTerm.EXAMPLE_UCUM_UNITS, KernelConcept.COMPONENT_FIELD, KernelConcept.COMPONENT_FIELD)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("521f6605-e03e-4095-a3de-f75548bd03a4")), KernelConcept.ENGLISH_LANGUAGE, "Measuring Range Pattern", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.FULLY_QUALIFIED_NAME_DESCRIPTION_TYPE)
                .semantic(DexTerm.DEVICE_EXTENSION_MEMBERSHIP_PATTERN, PublicIds.of(UUID.fromString("697e0cce-f0f5-43fd-be06-262814783f91")))
                ;
    }
}
