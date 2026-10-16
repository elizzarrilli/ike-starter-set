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

/** The "Predicate Device Pattern" pattern of the Device Extension (DeX) starter set (v2). */
final class PredicateDevicePattern {

    private PredicateDevicePattern() {
    }

    /**
     * Composes this section's declarations into the session.
     *
     * @param set the knowledge set (the session)
     */
    static void compose(KnowledgeSet set) {
        ActiveStamp inception = network.ike.foundation.ike.terms.Ike.DEX_INCEPTION;

        set.pattern("Predicate Device Pattern", PublicIds.of(UUID.fromString("ee60349d-1ffd-42de-a760-35f45452bff0"))).at(inception)
                .meaning(DexTerm.PREDICATE_DEVICE).purpose(DexTerm.DEVICE_EXTENSION_RECORD)
                .field(DexTerm.PREDICATE_DEVICE, DexTerm.DEVICE_EXTENSION_RECORD, KernelConcept.COMPONENT_ID_SET_FIELD)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("352fb6c8-ec1d-4b67-812b-624b37b7286d")), KernelConcept.ENGLISH_LANGUAGE, "Predicate Device Pattern", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.FULLY_QUALIFIED_NAME_DESCRIPTION_TYPE)
                .semantic(DexTerm.DEVICE_EXTENSION_MEMBERSHIP_PATTERN, PublicIds.of(UUID.fromString("fae63635-0f8a-451e-a9cb-5058029e9113")))
                ;
    }
}
