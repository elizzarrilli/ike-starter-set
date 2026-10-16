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

/** The "Device Extension Module" concept of the Device Extension (DeX) starter set. */
final class DeviceExtensionModule {

    private DeviceExtensionModule() {
    }

    /**
     * Composes this section's declarations into the session.
     *
     * @param set the knowledge set (the session)
     */
    static void compose(KnowledgeSet set) {
        ActiveStamp inception = network.ike.foundation.ike.terms.Ike.DEX_INCEPTION;

        set.concept("Device Extension Module", PublicIds.of(UUID.fromString("f0a7714c-5dd1-4da6-ab89-38a8653f5fab"))).at(inception)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("f00f0755-f4a9-499e-8e0d-0fee23c4b664")), KernelConcept.ENGLISH_LANGUAGE, "Device Extension Module", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.FULLY_QUALIFIED_NAME_DESCRIPTION_TYPE)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("959080ea-49f5-4803-9abb-5a5a98aad284")), KernelConcept.ENGLISH_LANGUAGE, "Device Extension Module", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.REGULAR_NAME_DESCRIPTION_TYPE)
                .statedAxioms(PublicIds.of(UUID.fromString("6593da99-a2c7-45d3-8d3f-01565777bb29")), leb -> leb.NecessarySet(leb.And(leb.ConceptAxiom(DexTerm.MODULE))))
                .semantic(DexTerm.DEVICE_EXTENSION_MEMBERSHIP_PATTERN, PublicIds.of(UUID.fromString("40984ca9-ec71-4bb5-94d3-3a93bc71ed45")))
                ;
    }
}
