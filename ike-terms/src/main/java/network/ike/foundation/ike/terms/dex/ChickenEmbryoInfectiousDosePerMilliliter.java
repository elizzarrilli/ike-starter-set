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

/** The "50% chicken embryo infectious dose per milliliter {CEID50}/mL" concept of the Device Extension (DeX) starter set (XpertXpress respiratory panel change set). */
final class ChickenEmbryoInfectiousDosePerMilliliter {

    private ChickenEmbryoInfectiousDosePerMilliliter() {
    }

    /**
     * Composes this section's declarations into the session.
     *
     * @param set the knowledge set (the session)
     */
    static void compose(KnowledgeSet set) {
        ActiveStamp inception = network.ike.foundation.ike.terms.Ike.DEX_INCEPTION;

        set.concept("50% chicken embryo infectious dose per milliliter {CEID50}/mL", PublicIds.of(UUID.fromString("e28bb3c2-daa9-4143-992b-3a595d5981b9"))).at(inception)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("a5e1ec30-1b41-4357-9106-bba7365b3b20")), KernelConcept.ENGLISH_LANGUAGE, "50% chicken embryo infectious dose per milliliter {CEID50}/mL", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.FULLY_QUALIFIED_NAME_DESCRIPTION_TYPE)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("e940a335-96c2-424d-b915-b80ce9e6c963")), KernelConcept.ENGLISH_LANGUAGE, "CEID50/mL", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.REGULAR_NAME_DESCRIPTION_TYPE)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("ff367bdc-3915-4c65-9537-24930268f0a6")), KernelConcept.ENGLISH_LANGUAGE, "{CEID50}/mL", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.REGULAR_NAME_DESCRIPTION_TYPE)
                .statedAxioms(PublicIds.of(UUID.fromString("cc6f81ea-7df9-428d-a6fc-6273b5c035a8")), leb -> leb.NecessarySet(leb.And(leb.ConceptAxiom(DexTerm.EXAMPLE_UCUM_UNITS))))
                // The change set carries no DeX membership semantic for this concept, so its identity is derived
                // from the set's namespace.
                .semantic(DexTerm.DEVICE_EXTENSION_MEMBERSHIP_PATTERN,
                        PublicIds.of(set.uuidFor("50% chicken embryo infectious dose per milliliter {CEID50}/mL DeX membership")))
                ;
    }
}
