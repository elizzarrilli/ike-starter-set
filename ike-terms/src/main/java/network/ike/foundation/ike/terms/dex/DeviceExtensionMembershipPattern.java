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

/** The "Device Extension Membership Pattern" pattern of the Device Extension (DeX) starter set. */
final class DeviceExtensionMembershipPattern {

    private DeviceExtensionMembershipPattern() {
    }

    /**
     * Composes this section's declarations into the session.
     *
     * @param set the knowledge set (the session)
     */
    static void compose(KnowledgeSet set) {
        ActiveStamp inception = network.ike.foundation.ike.terms.Ike.DEX_INCEPTION;

        set.pattern("Device Extension Membership Pattern", PublicIds.of(UUID.fromString("158c9877-4ae1-4a54-84ac-dd0c0d87f874"))).at(inception)
                .meaning(DexTerm.MEMBERSHIP_SEMANTIC).purpose(DexTerm.DEVICE_EXTENSION_RECORD)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("bf82866e-6d78-44e2-b5ac-d9205e91267d")), KernelConcept.ENGLISH_LANGUAGE, "Device Extension Membership Pattern", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.FULLY_QUALIFIED_NAME_DESCRIPTION_TYPE)
                .semantic(DexTerm.DEVICE_EXTENSION_MEMBERSHIP_PATTERN, PublicIds.of(UUID.fromString("d799b3e3-3d6d-4665-a3d6-128ee4163105")))
                .semanticOn(PublicIds.of(UUID.fromString("bf82866e-6d78-44e2-b5ac-d9205e91267d")), KernelPattern.US_DIALECT_PATTERN, PublicIds.of(UUID.fromString("80244648-c2b2-4263-ba9a-ab2ada1171f2")), DexTerm.ACCEPTABLE)
                ;
    }
}
