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

/** The "Allowable Range Maximum Value" concept of the Device Extension (DeX) starter set. */
final class AllowableRangeMaximumValue {

    private AllowableRangeMaximumValue() {
    }

    /**
     * Composes this section's declarations into the session.
     *
     * @param set the knowledge set (the session)
     */
    static void compose(KnowledgeSet set) {
        ActiveStamp inception = network.ike.foundation.ike.terms.Ike.DEX_INCEPTION;

        // The DeX starter data's last stated-axiom version of this concept has an empty
        // necessary set (no parent); its earlier version and its sibling Allowable Range
        // Minimum Value both file it under Device Extension Model concept, so it is filed
        // there here.
        set.concept("Allowable Range Maximum Value", PublicIds.of(UUID.fromString("ff70ecd3-4d49-4846-8d3b-7310064c375e"))).at(inception)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("a3452cbb-29d6-4cbd-9343-f241a7efb828")), KernelConcept.ENGLISH_LANGUAGE, "Allowable Range Maximum Value", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.FULLY_QUALIFIED_NAME_DESCRIPTION_TYPE)
                .statedAxioms(PublicIds.of(UUID.fromString("e20712b8-3e0c-49c7-8016-9fdebb1b81be")), leb -> leb.NecessarySet(leb.And(leb.ConceptAxiom(DexTerm.DEVICE_EXTENSION_MODEL_CONCEPT))))
                .semantic(DexTerm.DEVICE_EXTENSION_MEMBERSHIP_PATTERN, PublicIds.of(UUID.fromString("805b1c2d-9311-4f61-81a5-2cc2b56fb0ee")))
                ;
    }
}
