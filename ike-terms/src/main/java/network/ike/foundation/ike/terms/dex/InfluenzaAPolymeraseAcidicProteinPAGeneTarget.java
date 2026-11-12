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

/** The "Influenza A polymerase acidic protein (PA) gene (Target)" concept of the Device Extension (DeX) starter set (XpertXpress respiratory panel change set). */
final class InfluenzaAPolymeraseAcidicProteinPAGeneTarget {

    private InfluenzaAPolymeraseAcidicProteinPAGeneTarget() {
    }

    /**
     * Composes this section's declarations into the session.
     *
     * @param set the knowledge set (the session)
     */
    static void compose(KnowledgeSet set) {
        ActiveStamp inception = network.ike.foundation.ike.terms.Ike.DEX_INCEPTION;

        set.concept("Influenza A polymerase acidic protein (PA) gene (Target)", PublicIds.of(UUID.fromString("6cbec6e5-37e3-4366-9e1c-f960ba9a3df0"))).at(inception)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("06748d93-66f4-4a39-a509-1857011a0096")), KernelConcept.ENGLISH_LANGUAGE, "Influenza A polymerase acidic protein (PA) gene (Target)", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.FULLY_QUALIFIED_NAME_DESCRIPTION_TYPE)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("62737a69-4e3a-42e4-9a0b-1af1bc28b923")), KernelConcept.ENGLISH_LANGUAGE, "Influenza A polymerase acidic protein (PA) gene", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.REGULAR_NAME_DESCRIPTION_TYPE)
                .statedAxioms(PublicIds.of(UUID.fromString("400b1175-652d-493b-9db6-457f54a5922a")), leb -> leb.NecessarySet(leb.And(leb.ConceptAxiom(DexTerm.TARGET))))
                .semantic(DexTerm.DEVICE_EXTENSION_MEMBERSHIP_PATTERN, PublicIds.of(UUID.fromString("fe34cb33-971c-460a-b57c-08feda998210")))
                .semanticOn(PublicIds.of(UUID.fromString("06748d93-66f4-4a39-a509-1857011a0096")), KernelPattern.US_DIALECT_PATTERN, PublicIds.of(UUID.fromString("dab232a7-ac2d-4906-8a92-98ba903a8416")), KernelConcept.PREFERRED)
                .semanticOn(PublicIds.of(UUID.fromString("62737a69-4e3a-42e4-9a0b-1af1bc28b923")), KernelPattern.US_DIALECT_PATTERN, PublicIds.of(UUID.fromString("63607de9-43d0-4061-85fc-71f604b50877")), KernelConcept.PREFERRED)
                ;
    }
}
