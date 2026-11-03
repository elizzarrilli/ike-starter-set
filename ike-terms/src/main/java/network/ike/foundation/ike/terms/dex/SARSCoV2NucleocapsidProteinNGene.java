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

/** The "SARS-CoV-2 Nucleocapsid protein (N) gene" concept of the Device Extension (DeX) starter set (XpertXpress SARS-CoV-2 Plus change set). */
final class SARSCoV2NucleocapsidProteinNGene {

    private SARSCoV2NucleocapsidProteinNGene() {
    }

    /**
     * Composes this section's declarations into the session.
     *
     * @param set the knowledge set (the session)
     */
    static void compose(KnowledgeSet set) {
        ActiveStamp inception = network.ike.foundation.ike.terms.Ike.DEX_INCEPTION;

        set.concept("SARS-CoV-2 Nucleocapsid protein (N) gene", PublicIds.of(UUID.fromString("fd4bd781-e0d1-4e25-823a-72e52d57ddae"))).at(inception)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("024054d6-d0c3-49ff-a306-aa6cc3545537")), KernelConcept.ENGLISH_LANGUAGE, "SARS-CoV-2 Nucleocapsid protein (N) gene", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.FULLY_QUALIFIED_NAME_DESCRIPTION_TYPE)
                .statedAxioms(PublicIds.of(UUID.fromString("0587d757-d919-41f7-9737-89e350a8aafb")), leb -> leb.NecessarySet(leb.And(leb.ConceptAxiom(DexTerm.TARGET))))
                // The change set carries no DeX membership semantic for this concept, so its identity is derived
                // from the set's namespace.
                .semantic(DexTerm.DEVICE_EXTENSION_MEMBERSHIP_PATTERN,
                        PublicIds.of(set.uuidFor("SARS-CoV-2 Nucleocapsid protein (N) gene DeX membership")))
                ;
    }
}
