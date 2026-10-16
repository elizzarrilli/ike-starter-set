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

/** The "Associated Devices Pattern" pattern of the Device Extension (DeX) starter set. */
final class AssociatedDevicesPattern {

    private AssociatedDevicesPattern() {
    }

    /**
     * Composes this section's declarations into the session.
     *
     * @param set the knowledge set (the session)
     */
    static void compose(KnowledgeSet set) {
        ActiveStamp inception = network.ike.foundation.ike.terms.Ike.DEX_INCEPTION;

        set.pattern("Associated Devices Pattern", PublicIds.of(UUID.fromString("8c7f5071-f8b3-4ed8-a958-f9d36bdfd752"))).at(inception)
                .meaning(DexTerm.ASSOCIATED_DEVICES).purpose(DexTerm.DEVICE_EXTENSION_RECORD)
                .field(DexTerm.ASSOCIATED_DEVICES, DexTerm.DEVICE_EXTENSION_RECORD, KernelConcept.COMPONENT_ID_SET_FIELD)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("58b09ac6-dfde-44b4-898f-c4114046d091")), KernelConcept.ENGLISH_LANGUAGE, "Associated Devices Pattern", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.FULLY_QUALIFIED_NAME_DESCRIPTION_TYPE)
                .semantic(DexTerm.DEVICE_EXTENSION_MEMBERSHIP_PATTERN, PublicIds.of(UUID.fromString("ee7b8ae5-69df-4316-979d-bd1115a1cd49")))
                .semanticOn(PublicIds.of(UUID.fromString("58b09ac6-dfde-44b4-898f-c4114046d091")), KernelPattern.US_DIALECT_PATTERN, PublicIds.of(UUID.fromString("a2a646a7-1224-41f5-b533-4bdb586026bb")), DexTerm.ACCEPTABLE)
                ;
    }
}
