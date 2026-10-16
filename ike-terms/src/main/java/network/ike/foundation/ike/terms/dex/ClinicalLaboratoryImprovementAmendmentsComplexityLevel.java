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

/** The "Clinical Laboratory Improvement Amendments Complexity Level" concept of the Device Extension (DeX) starter set (v2). */
final class ClinicalLaboratoryImprovementAmendmentsComplexityLevel {

    private ClinicalLaboratoryImprovementAmendmentsComplexityLevel() {
    }

    /**
     * Composes this section's declarations into the session.
     *
     * @param set the knowledge set (the session)
     */
    static void compose(KnowledgeSet set) {
        ActiveStamp inception = network.ike.foundation.ike.terms.Ike.DEX_INCEPTION;

        set.concept("Clinical Laboratory Improvement Amendments Complexity Level", PublicIds.of(UUID.fromString("223ff478-7227-4822-a78e-08fea77effd8"))).at(inception)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("c186640d-42b4-4c73-a527-c454c39b5cfd")), KernelConcept.ENGLISH_LANGUAGE, "Clinical Laboratory Improvement Amendments Complexity Level", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.FULLY_QUALIFIED_NAME_DESCRIPTION_TYPE)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("96b88ef6-7037-40a4-9404-e51460e853ac")), KernelConcept.ENGLISH_LANGUAGE, "CLIA Complexity Level", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.REGULAR_NAME_DESCRIPTION_TYPE)
                .statedAxioms(PublicIds.of(UUID.fromString("58715ca9-706e-4693-bf62-a41883395758")), leb -> leb.NecessarySet(leb.And(leb.ConceptAxiom(DexTerm.DEVICE_EXTENSION_MODEL_CONCEPT))))
                .semantic(DexTerm.DEVICE_EXTENSION_MEMBERSHIP_PATTERN, PublicIds.of(UUID.fromString("5e320cc2-d295-44b9-841a-6ad2d3b14385")))
                ;
    }
}
