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

/** The "RSV B Nucleocapsid protein (N) gene (Target)" concept of the Device Extension (DeX) starter set (XpertXpress respiratory panel change set). */
final class RSVBNucleocapsidProteinNGeneTarget {

    private RSVBNucleocapsidProteinNGeneTarget() {
    }

    /**
     * Composes this section's declarations into the session.
     *
     * @param set the knowledge set (the session)
     */
    static void compose(KnowledgeSet set) {
        ActiveStamp inception = network.ike.foundation.ike.terms.Ike.DEX_INCEPTION;

        set.concept("RSV B Nucleocapsid protein (N) gene (Target)", PublicIds.of(UUID.fromString("79323126-50fc-4864-b566-7b3f4e2ded4a"))).at(inception)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("01de9f98-d186-4018-ab03-5a5af67ec559")), KernelConcept.ENGLISH_LANGUAGE, "RSV B Nucleocapsid protein (N) gene (Target)", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.FULLY_QUALIFIED_NAME_DESCRIPTION_TYPE)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("5b3862e5-52cd-48ae-af23-d1a48b8723a9")), KernelConcept.ENGLISH_LANGUAGE, "RSV B Nucleocapsid protein (N) gene", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.REGULAR_NAME_DESCRIPTION_TYPE)
                .statedAxioms(PublicIds.of(UUID.fromString("7f2b62e5-90f2-4da4-b9f3-5cfcb3103b11")), leb -> leb.NecessarySet(leb.And(leb.ConceptAxiom(DexTerm.TARGET))))
                .semantic(DexTerm.DEVICE_EXTENSION_MEMBERSHIP_PATTERN, PublicIds.of(UUID.fromString("8ca48607-fe7b-4b85-9026-914f7281caa2")))
                .semanticOn(PublicIds.of(UUID.fromString("01de9f98-d186-4018-ab03-5a5af67ec559")), KernelPattern.US_DIALECT_PATTERN, PublicIds.of(UUID.fromString("0a639845-62f6-4d32-91e5-112c345c10bd")), KernelConcept.PREFERRED)
                .semanticOn(PublicIds.of(UUID.fromString("5b3862e5-52cd-48ae-af23-d1a48b8723a9")), KernelPattern.US_DIALECT_PATTERN, PublicIds.of(UUID.fromString("d40f0f7e-e5fd-4070-bcb7-85b40b33463b")), KernelConcept.PREFERRED)
                ;
    }
}
