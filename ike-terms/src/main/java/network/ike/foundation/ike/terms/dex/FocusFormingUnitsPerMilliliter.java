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

/** The "focus-forming units per milliliter (FFU/mL)" concept of the Device Extension (DeX) starter set (XpertXpress respiratory panel change set). */
final class FocusFormingUnitsPerMilliliter {

    private FocusFormingUnitsPerMilliliter() {
    }

    /**
     * Composes this section's declarations into the session.
     *
     * @param set the knowledge set (the session)
     */
    static void compose(KnowledgeSet set) {
        ActiveStamp inception = network.ike.foundation.ike.terms.Ike.DEX_INCEPTION;

        set.concept("focus-forming units per milliliter (FFU/mL)", PublicIds.of(UUID.fromString("0a5fdd75-5790-4b1c-93c4-e2a200b3defc"))).at(inception)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("2c4ee9b7-c39a-46b3-8545-4814981ec1ca")), KernelConcept.ENGLISH_LANGUAGE, "focus-forming units per milliliter (FFU/mL)", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.FULLY_QUALIFIED_NAME_DESCRIPTION_TYPE)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("5a2dc6c2-b1bc-4a68-a0b2-d4f5c28c13ba")), KernelConcept.ENGLISH_LANGUAGE, "FFU/mL", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.REGULAR_NAME_DESCRIPTION_TYPE)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("980561c3-2ae9-41e7-a1d0-ac84aabd7932")), KernelConcept.ENGLISH_LANGUAGE, "[FFU]/mL", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.REGULAR_NAME_DESCRIPTION_TYPE)
                .statedAxioms(PublicIds.of(UUID.fromString("ddb49451-fab8-478a-9b59-48ee30a08c3b")), leb -> leb.NecessarySet(leb.And(leb.ConceptAxiom(DexTerm.EXAMPLE_UCUM_UNITS))))
                // The change set carries no DeX membership semantic for this concept, so its identity is derived
                // from the set's namespace.
                .semantic(DexTerm.DEVICE_EXTENSION_MEMBERSHIP_PATTERN,
                        PublicIds.of(set.uuidFor("focus-forming units per milliliter (FFU/mL) DeX membership")))
                ;
    }
}
