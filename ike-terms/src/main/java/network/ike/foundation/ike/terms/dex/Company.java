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

/** The "Company" concept of the Device Extension (DeX) starter set. */
final class Company {

    private Company() {
    }

    /**
     * Composes this section's declarations into the session.
     *
     * @param set the knowledge set (the session)
     */
    static void compose(KnowledgeSet set) {
        ActiveStamp inception = network.ike.foundation.ike.terms.Ike.DEX_INCEPTION;

        set.concept("Company", PublicIds.of(UUID.fromString("aa4d312a-637f-4f73-a4a6-7dede2f351f5"))).at(inception)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("e7a520d3-f891-486b-ab81-78a53f691d0e")), KernelConcept.ENGLISH_LANGUAGE, "Company", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.FULLY_QUALIFIED_NAME_DESCRIPTION_TYPE)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("ef0c0800-1e09-410e-b8a3-e1aab3f88355")), KernelConcept.ENGLISH_LANGUAGE, "Device Labeler", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.REGULAR_NAME_DESCRIPTION_TYPE)
                .statedAxioms(PublicIds.of(UUID.fromString("a39dc5a8-9e36-42cd-bb2b-2f548e8b3cc0")), leb -> leb.NecessarySet(leb.And(leb.ConceptAxiom(DexTerm.DEVICE_EXTENSION_PHENOMENON))))
                .semantic(DexTerm.DEVICE_EXTENSION_MEMBERSHIP_PATTERN, PublicIds.of(UUID.fromString("ff1afef1-cb65-4830-99f9-d55168baa91a")))
                ;
    }
}
