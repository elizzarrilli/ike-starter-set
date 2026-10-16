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

/** The "Regulatory Classification Pattern" pattern of the Device Extension (DeX) starter set (v2). */
final class RegulatoryClassificationPattern {

    private RegulatoryClassificationPattern() {
    }

    /**
     * Composes this section's declarations into the session.
     *
     * @param set the knowledge set (the session)
     */
    static void compose(KnowledgeSet set) {
        ActiveStamp inception = network.ike.foundation.ike.terms.Ike.DEX_INCEPTION;

        set.pattern("Regulatory Classification Pattern", PublicIds.of(UUID.fromString("9809c747-3aca-4e40-9a46-3a9bca0f6225"))).at(inception)
                .meaning(DexTerm.REGULATORY_CLASSIFICATION).purpose(DexTerm.DEVICE_EXTENSION_RECORD)
                .field(DexTerm.CLINICAL_LABORATORY_IMPROVEMENT_AMENDMENTS_COMPLEXITY_LEVEL, DexTerm.DEVICE_EXTENSION_RECORD, KernelConcept.COMPONENT_FIELD)
                .field(DexTerm.PRESCRIPTION_STATUS, DexTerm.DEVICE_EXTENSION_RECORD, KernelConcept.COMPONENT_FIELD)
                .field(DexTerm.DEVICE_CLASS, DexTerm.DEVICE_EXTENSION_RECORD, KernelConcept.COMPONENT_FIELD)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("abb01cdb-8fdb-44a1-9bd1-8427c64bb131")), KernelConcept.ENGLISH_LANGUAGE, "Regulatory Classification Pattern", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.FULLY_QUALIFIED_NAME_DESCRIPTION_TYPE)
                .semantic(DexTerm.DEVICE_EXTENSION_MEMBERSHIP_PATTERN, PublicIds.of(UUID.fromString("4d3fbb56-91f2-4d90-9e45-e33e7b808853")))
                ;
    }
}
