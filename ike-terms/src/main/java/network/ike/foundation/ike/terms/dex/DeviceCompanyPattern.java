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

/** The "Device Company Pattern" pattern of the Device Extension (DeX) starter set. */
final class DeviceCompanyPattern {

    private DeviceCompanyPattern() {
    }

    /**
     * Composes this section's declarations into the session.
     *
     * @param set the knowledge set (the session)
     */
    static void compose(KnowledgeSet set) {
        ActiveStamp inception = network.ike.foundation.ike.terms.Ike.DEX_INCEPTION;

        set.pattern("Device Company Pattern", PublicIds.of(UUID.fromString("3790becb-0b3d-4d46-afe2-18810f81028a"))).at(inception)
                .meaning(DexTerm.COMPANY).purpose(DexTerm.DEVICE_EXTENSION_RECORD)
                .field(DexTerm.COMPANY, DexTerm.DEVICE_EXTENSION_RECORD, KernelConcept.COMPONENT_FIELD)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("d5c9ebc2-5094-4a2a-8136-d70488f7e51e")), KernelConcept.ENGLISH_LANGUAGE, "Device Company Pattern", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.FULLY_QUALIFIED_NAME_DESCRIPTION_TYPE)
                .semantic(DexTerm.DEVICE_EXTENSION_MEMBERSHIP_PATTERN, PublicIds.of(UUID.fromString("02922b59-ced4-408c-b4d3-0153112ed8de")))
                .semanticOn(PublicIds.of(UUID.fromString("d5c9ebc2-5094-4a2a-8136-d70488f7e51e")), KernelPattern.US_DIALECT_PATTERN, PublicIds.of(UUID.fromString("92f3fdf1-a82f-42dc-9e17-6d6ae7f3e899")), DexTerm.ACCEPTABLE)
                ;
    }
}
