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

/** The "Allowed Results Pattern" pattern of the Device Extension (DeX) starter set. */
final class AllowedResultsPattern {

    private AllowedResultsPattern() {
    }

    /**
     * Composes this section's declarations into the session.
     *
     * @param set the knowledge set (the session)
     */
    static void compose(KnowledgeSet set) {
        ActiveStamp inception = network.ike.foundation.ike.terms.Ike.DEX_INCEPTION;

        set.pattern("Allowed Results Pattern", PublicIds.of(UUID.fromString("87998b64-277f-4c79-baaa-b18d1557ef74"))).at(inception)
                .meaning(DexTerm.ALLOWED_RESULTS_SET).purpose(DexTerm.DEVICE_EXTENSION_RECORD)
                .field(DexTerm.ALLOWED_RESULTS_SET, DexTerm.DEVICE_EXTENSION_RECORD, KernelConcept.COMPONENT_ID_SET_FIELD)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("d47de94d-3f16-461d-9394-cd0f408b1270")), KernelConcept.ENGLISH_LANGUAGE, "Allowed Results Pattern", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.FULLY_QUALIFIED_NAME_DESCRIPTION_TYPE)
                .semantic(DexTerm.DEVICE_EXTENSION_MEMBERSHIP_PATTERN, PublicIds.of(UUID.fromString("cffb8cdf-0691-48d7-a6dd-64413be450b3")))
                .semanticOn(PublicIds.of(UUID.fromString("d47de94d-3f16-461d-9394-cd0f408b1270")), KernelPattern.US_DIALECT_PATTERN, PublicIds.of(UUID.fromString("8bbaed21-e308-4373-920a-abdb09d06082")), DexTerm.ACCEPTABLE)
                ;
    }
}
