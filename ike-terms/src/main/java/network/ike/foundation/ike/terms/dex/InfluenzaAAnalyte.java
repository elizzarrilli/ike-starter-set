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

/** The "Influenza A (Analyte)" concept of the Device Extension (DeX) starter set (XpertXpress respiratory panel change set). */
final class InfluenzaAAnalyte {

    private InfluenzaAAnalyte() {
    }

    /**
     * Composes this section's declarations into the session.
     *
     * @param set the knowledge set (the session)
     */
    static void compose(KnowledgeSet set) {
        ActiveStamp inception = network.ike.foundation.ike.terms.Ike.DEX_INCEPTION;

        set.concept("Influenza A (Analyte)", PublicIds.of(UUID.fromString("15b096b6-df9a-4570-b0cd-a73ab4a17e62"))).at(inception)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("a3c96b7d-5ce8-422c-b284-280795012fe4")), KernelConcept.ENGLISH_LANGUAGE, "Influenza A (Analyte)", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.FULLY_QUALIFIED_NAME_DESCRIPTION_TYPE)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("2e628bdb-48e7-453b-9368-a0e89cebf76a")), KernelConcept.ENGLISH_LANGUAGE, "Influenza A", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.REGULAR_NAME_DESCRIPTION_TYPE)
                .statedAxioms(PublicIds.of(UUID.fromString("d804d4ee-a4f7-4ff3-b705-dacf4c647e1f")), leb -> leb.NecessarySet(leb.And(leb.ConceptAxiom(DexTerm.ANALYTE))))
                .semantic(DexTerm.DEVICE_EXTENSION_MEMBERSHIP_PATTERN, PublicIds.of(UUID.fromString("7be07163-62ad-4ef5-ae41-df93daaaec95")))
                .semanticOn(PublicIds.of(UUID.fromString("a3c96b7d-5ce8-422c-b284-280795012fe4")), KernelPattern.US_DIALECT_PATTERN, PublicIds.of(UUID.fromString("487401a8-2e15-43f0-8075-7181949eda26")), KernelConcept.PREFERRED)
                .semanticOn(PublicIds.of(UUID.fromString("2e628bdb-48e7-453b-9368-a0e89cebf76a")), KernelPattern.US_DIALECT_PATTERN, PublicIds.of(UUID.fromString("e59cb812-8dac-4bf3-9f1b-696dda0a0ed8")), KernelConcept.PREFERRED)
                ;
    }
}
