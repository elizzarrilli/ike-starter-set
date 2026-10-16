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

/** The "Device Extension Phenomenon" concept of the Device Extension (DeX) starter set. */
final class DeviceExtensionPhenomenon {

    private DeviceExtensionPhenomenon() {
    }

    /**
     * Composes this section's declarations into the session.
     *
     * @param set the knowledge set (the session)
     */
    static void compose(KnowledgeSet set) {
        ActiveStamp inception = network.ike.foundation.ike.terms.Ike.DEX_INCEPTION;

        set.concept("Device Extension Phenomenon", PublicIds.of(UUID.fromString("f2541ecd-bea3-4201-a2fc-bd20db8717d7"))).at(inception)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("60d360b6-bdf1-4f5f-a858-af50b8a2dc0a")), KernelConcept.ENGLISH_LANGUAGE, "Device Extension Phenomenon", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.FULLY_QUALIFIED_NAME_DESCRIPTION_TYPE)
                .statedAxioms(PublicIds.of(UUID.fromString("eb58b32a-1688-4e35-bdcf-713d53ac4f31")), leb -> leb.NecessarySet(leb.And(leb.ConceptAxiom(KernelConcept.PHENOMENON))))
                .semantic(DexTerm.DEVICE_EXTENSION_MEMBERSHIP_PATTERN, PublicIds.of(UUID.fromString("ef122863-bcec-4c71-8525-ff79e358a65d")))
                ;
    }
}
