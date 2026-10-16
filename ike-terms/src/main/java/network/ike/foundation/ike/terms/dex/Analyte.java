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

/** The "Analyte" concept of the Device Extension (DeX) starter set. */
final class Analyte {

    private Analyte() {
    }

    /**
     * Composes this section's declarations into the session.
     *
     * @param set the knowledge set (the session)
     */
    static void compose(KnowledgeSet set) {
        ActiveStamp inception = network.ike.foundation.ike.terms.Ike.DEX_INCEPTION;

        set.concept("Analyte", PublicIds.of(UUID.fromString("4b0e6c51-a155-4254-96de-fd2c4beb33f9"))).at(inception)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("85e96459-0f7d-42ad-83b1-a98985d96d59")), KernelConcept.ENGLISH_LANGUAGE, "Analyte", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.FULLY_QUALIFIED_NAME_DESCRIPTION_TYPE)
                .statedAxioms(PublicIds.of(UUID.fromString("8fadd11b-8631-461e-9aeb-d54d8b81657e")), leb -> leb.NecessarySet(leb.And(leb.ConceptAxiom(DexTerm.DEVICE_EXTENSION_PHENOMENON))))
                .semantic(DexTerm.DEVICE_EXTENSION_MEMBERSHIP_PATTERN, PublicIds.of(UUID.fromString("7355feb1-affb-498a-9064-ca9bbfa3ab5e")))
                ;
    }
}
