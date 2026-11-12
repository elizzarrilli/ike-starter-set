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

/** The "50% tissue culture infectious dose per milliliter {TCID_50}/mL" concept of the Device Extension (DeX) starter set (XpertXpress respiratory panel change set). */
final class TissueCultureInfectiousDosePerMilliliter {

    private TissueCultureInfectiousDosePerMilliliter() {
    }

    /**
     * Composes this section's declarations into the session.
     *
     * @param set the knowledge set (the session)
     */
    static void compose(KnowledgeSet set) {
        ActiveStamp inception = network.ike.foundation.ike.terms.Ike.DEX_INCEPTION;

        set.concept("50% tissue culture infectious dose per milliliter {TCID_50}/mL", PublicIds.of(UUID.fromString("5791683c-78de-477f-98c9-aacffe491fb0"))).at(inception)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("8f67fee8-21c4-414b-9459-957bd327b65d")), KernelConcept.ENGLISH_LANGUAGE, "50% tissue culture infectious dose per milliliter {TCID_50}/mL", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.FULLY_QUALIFIED_NAME_DESCRIPTION_TYPE)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("ced575ad-4a8f-437e-ba0d-495a383021f6")), KernelConcept.ENGLISH_LANGUAGE, "TCID50/mL", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.REGULAR_NAME_DESCRIPTION_TYPE)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("e43108a7-0a42-4f06-8399-9cff289c1144")), KernelConcept.ENGLISH_LANGUAGE, "{TCID_50}/mL", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.REGULAR_NAME_DESCRIPTION_TYPE)
                .statedAxioms(PublicIds.of(UUID.fromString("5c9c7171-eb68-41e1-aaa3-f7beaf712031")), leb -> leb.NecessarySet(leb.And(leb.ConceptAxiom(DexTerm.EXAMPLE_UCUM_UNITS))))
                // The change set carries no DeX membership semantic for this concept, so its identity is derived
                // from the set's namespace.
                .semantic(DexTerm.DEVICE_EXTENSION_MEMBERSHIP_PATTERN,
                        PublicIds.of(set.uuidFor("50% tissue culture infectious dose per milliliter {TCID_50}/mL DeX membership")))
                ;
    }
}
