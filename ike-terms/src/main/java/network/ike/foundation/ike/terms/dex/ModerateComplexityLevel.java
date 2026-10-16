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

/** The "Moderate Complexity Level" concept of the Device Extension (DeX) starter set (v2). */
final class ModerateComplexityLevel {

    private ModerateComplexityLevel() {
    }

    /**
     * Composes this section's declarations into the session.
     *
     * @param set the knowledge set (the session)
     */
    static void compose(KnowledgeSet set) {
        ActiveStamp inception = network.ike.foundation.ike.terms.Ike.DEX_INCEPTION;

        set.concept("Moderate Complexity Level", PublicIds.of(UUID.fromString("1f0c761c-ce62-49d2-92d3-36c7ba4d80d2"))).at(inception)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("a6a4803e-ff24-4f5f-8aca-d39497a8e428")), KernelConcept.ENGLISH_LANGUAGE, "Moderate Complexity Level", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.FULLY_QUALIFIED_NAME_DESCRIPTION_TYPE)
                .statedAxioms(PublicIds.of(UUID.fromString("5ace6843-86a0-477e-a05d-77ad5697cd6f")), leb -> leb.NecessarySet(leb.And(leb.ConceptAxiom(DexTerm.CLINICAL_LABORATORY_IMPROVEMENT_AMENDMENTS_COMPLEXITY_LEVEL))))
                .semantic(DexTerm.DEVICE_EXTENSION_MEMBERSHIP_PATTERN, PublicIds.of(UUID.fromString("53775d10-3672-4731-9a21-974081cffc85")))
                ;
    }
}
