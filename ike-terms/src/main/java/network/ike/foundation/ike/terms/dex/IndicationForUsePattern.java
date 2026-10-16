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

/** The "Indication for Use Pattern" pattern of the Device Extension (DeX) starter set. */
final class IndicationForUsePattern {

    private IndicationForUsePattern() {
    }

    /**
     * Composes this section's declarations into the session.
     *
     * @param set the knowledge set (the session)
     */
    static void compose(KnowledgeSet set) {
        ActiveStamp inception = network.ike.foundation.ike.terms.Ike.DEX_INCEPTION;

        set.pattern("Indication for Use Pattern", PublicIds.of(UUID.fromString("7d1d8a87-bb06-4293-9ba1-5cf3e8499185"))).at(inception)
                .meaning(DexTerm.INDICATION_FOR_USE).purpose(DexTerm.DEVICE_EXTENSION_RECORD)
                .field(DexTerm.INDICATION_FOR_USE, DexTerm.DEVICE_EXTENSION_RECORD, KernelConcept.STRING)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("bb34b46c-61e7-4a33-8d47-33d4fe5220b6")), KernelConcept.ENGLISH_LANGUAGE, "Indication for Use Pattern", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.FULLY_QUALIFIED_NAME_DESCRIPTION_TYPE)
                .semantic(DexTerm.DEVICE_EXTENSION_MEMBERSHIP_PATTERN, PublicIds.of(UUID.fromString("193e390c-a91e-42d4-91e7-d32e1a6a7a46")))
                .semanticOn(PublicIds.of(UUID.fromString("bb34b46c-61e7-4a33-8d47-33d4fe5220b6")), KernelPattern.US_DIALECT_PATTERN, PublicIds.of(UUID.fromString("520f9729-62cb-4cd9-9247-e22544e11b40")), DexTerm.ACCEPTABLE)
                ;
    }
}
