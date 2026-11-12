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

/** The "Influenza B (Analyte)" concept of the Device Extension (DeX) starter set (XpertXpress respiratory panel change set). */
final class InfluenzaBAnalyte {

    private InfluenzaBAnalyte() {
    }

    /**
     * Composes this section's declarations into the session.
     *
     * @param set the knowledge set (the session)
     */
    static void compose(KnowledgeSet set) {
        ActiveStamp inception = network.ike.foundation.ike.terms.Ike.DEX_INCEPTION;

        set.concept("Influenza B (Analyte)", PublicIds.of(UUID.fromString("73472010-f7b2-4f4b-a01c-3f047ba50643"))).at(inception)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("13650076-9e15-4426-add6-1f5739920c45")), KernelConcept.ENGLISH_LANGUAGE, "Influenza B (Analyte)", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.FULLY_QUALIFIED_NAME_DESCRIPTION_TYPE)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("97115b63-7c65-46e1-b31f-fdf3d495d6e7")), KernelConcept.ENGLISH_LANGUAGE, "Influenza B", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.REGULAR_NAME_DESCRIPTION_TYPE)
                .statedAxioms(PublicIds.of(UUID.fromString("f3125c10-df4b-48c6-8f52-295c4342d6c2")), leb -> leb.NecessarySet(leb.And(leb.ConceptAxiom(DexTerm.ANALYTE))))
                .semantic(DexTerm.DEVICE_EXTENSION_MEMBERSHIP_PATTERN, PublicIds.of(UUID.fromString("ef02443b-b1b5-4227-a654-2d63d9737106")))
                .semanticOn(PublicIds.of(UUID.fromString("13650076-9e15-4426-add6-1f5739920c45")), KernelPattern.US_DIALECT_PATTERN, PublicIds.of(UUID.fromString("3e30a1fa-abf5-4dcc-b692-a7d8c5e9afc0")), KernelConcept.PREFERRED)
                .semanticOn(PublicIds.of(UUID.fromString("97115b63-7c65-46e1-b31f-fdf3d495d6e7")), KernelPattern.US_DIALECT_PATTERN, PublicIds.of(UUID.fromString("d3980991-3860-44f3-b137-3c95925f25e5")), KernelConcept.PREFERRED)
                ;
    }
}
