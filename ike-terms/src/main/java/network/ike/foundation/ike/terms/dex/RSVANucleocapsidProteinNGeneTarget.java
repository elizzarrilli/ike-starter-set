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

/** The "RSV A Nucleocapsid protein (N) gene (Target)" concept of the Device Extension (DeX) starter set (XpertXpress respiratory panel change set). */
final class RSVANucleocapsidProteinNGeneTarget {

    private RSVANucleocapsidProteinNGeneTarget() {
    }

    /**
     * Composes this section's declarations into the session.
     *
     * @param set the knowledge set (the session)
     */
    static void compose(KnowledgeSet set) {
        ActiveStamp inception = network.ike.foundation.ike.terms.Ike.DEX_INCEPTION;

        set.concept("RSV A Nucleocapsid protein (N) gene (Target)", PublicIds.of(UUID.fromString("96e1b1c4-2272-4242-b870-740cb76c5ec8"))).at(inception)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("01d992ed-4496-4ce3-b656-83451f05d1ae")), KernelConcept.ENGLISH_LANGUAGE, "RSV A Nucleocapsid protein (N) gene (Target)", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.FULLY_QUALIFIED_NAME_DESCRIPTION_TYPE)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("3151e163-7996-4e1e-9951-901c6c6b2ce8")), KernelConcept.ENGLISH_LANGUAGE, "RSV A Nucleocapsid protein (N) gene", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.REGULAR_NAME_DESCRIPTION_TYPE)
                .statedAxioms(PublicIds.of(UUID.fromString("2b85ac02-f378-4cd5-96ab-d79193f38624")), leb -> leb.NecessarySet(leb.And(leb.ConceptAxiom(DexTerm.TARGET))))
                .semantic(DexTerm.DEVICE_EXTENSION_MEMBERSHIP_PATTERN, PublicIds.of(UUID.fromString("c34c221f-288e-4807-9b57-db18dd0d2e2c")))
                .semanticOn(PublicIds.of(UUID.fromString("01d992ed-4496-4ce3-b656-83451f05d1ae")), KernelPattern.US_DIALECT_PATTERN, PublicIds.of(UUID.fromString("3249ddcb-355b-4e8f-a3a4-a60246cbd22b")), KernelConcept.PREFERRED)
                .semanticOn(PublicIds.of(UUID.fromString("3151e163-7996-4e1e-9951-901c6c6b2ce8")), KernelPattern.US_DIALECT_PATTERN, PublicIds.of(UUID.fromString("e193a97b-5b0b-47c7-884f-02a874dec53f")), KernelConcept.PREFERRED)
                ;
    }
}
