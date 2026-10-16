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

/** The "Device Extension Model concept" concept of the Device Extension (DeX) starter set. */
final class DeviceExtensionModelConcept {

    private DeviceExtensionModelConcept() {
    }

    /**
     * Composes this section's declarations into the session.
     *
     * @param set the knowledge set (the session)
     */
    static void compose(KnowledgeSet set) {
        ActiveStamp inception = network.ike.foundation.ike.terms.Ike.DEX_INCEPTION;

        set.concept("Device Extension Model concept", PublicIds.of(UUID.fromString("5c0cc662-918f-4ecb-8817-42258ca7efeb"))).at(inception)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("f74c8bf5-97b2-4a4c-9fb3-baf52b83bcf3")), KernelConcept.ENGLISH_LANGUAGE, "Device Extension Model concept", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.FULLY_QUALIFIED_NAME_DESCRIPTION_TYPE)
                .statedAxioms(PublicIds.of(UUID.fromString("2ce4f013-888e-4e89-a7bf-e5a9c8c30950")), leb -> leb.NecessarySet(leb.And(leb.ConceptAxiom(DexTerm.MODEL_CONCEPT))))
                .semantic(DexTerm.DEVICE_EXTENSION_MEMBERSHIP_PATTERN, PublicIds.of(UUID.fromString("557cea16-9284-4b60-bcb1-e9057d247f8f")))
                ;
    }
}
