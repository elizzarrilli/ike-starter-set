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

/** The "Influenza A Matrix protein (M) gene (Target)" concept of the Device Extension (DeX) starter set (XpertXpress respiratory panel change set). */
final class InfluenzaAMatrixProteinMGeneTarget {

    private InfluenzaAMatrixProteinMGeneTarget() {
    }

    /**
     * Composes this section's declarations into the session.
     *
     * @param set the knowledge set (the session)
     */
    static void compose(KnowledgeSet set) {
        ActiveStamp inception = network.ike.foundation.ike.terms.Ike.DEX_INCEPTION;

        set.concept("Influenza A Matrix protein (M) gene (Target)", PublicIds.of(UUID.fromString("9e382794-2e39-415b-84e8-2eafe71c112a"))).at(inception)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("bb1a3b25-b0ea-4778-9116-0fe265298370")), KernelConcept.ENGLISH_LANGUAGE, "Influenza A Matrix protein (M) gene (Target)", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.FULLY_QUALIFIED_NAME_DESCRIPTION_TYPE)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("654f6cf1-14b4-4ff3-817a-2fdded167f8b")), KernelConcept.ENGLISH_LANGUAGE, "Influenza A Matrix protein (M) gene", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.REGULAR_NAME_DESCRIPTION_TYPE)
                .statedAxioms(PublicIds.of(UUID.fromString("14f7097c-7d5a-41be-a838-c65ec0bb48a2")), leb -> leb.NecessarySet(leb.And(leb.ConceptAxiom(DexTerm.TARGET))))
                .semantic(DexTerm.DEVICE_EXTENSION_MEMBERSHIP_PATTERN, PublicIds.of(UUID.fromString("6ef07bdb-7905-41ed-8b55-7b37c782fcbe")))
                .semanticOn(PublicIds.of(UUID.fromString("bb1a3b25-b0ea-4778-9116-0fe265298370")), KernelPattern.US_DIALECT_PATTERN, PublicIds.of(UUID.fromString("a6924068-db75-4245-9e34-95e250d3a5f5")), KernelConcept.PREFERRED)
                .semanticOn(PublicIds.of(UUID.fromString("654f6cf1-14b4-4ff3-817a-2fdded167f8b")), KernelPattern.US_DIALECT_PATTERN, PublicIds.of(UUID.fromString("6985cae8-199e-4fd8-92f3-2c26605968d6")), KernelConcept.PREFERRED)
                ;
    }
}
