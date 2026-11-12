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

/** The "Influenza B non-structural protein (NS) gene (Target)" concept of the Device Extension (DeX) starter set (XpertXpress respiratory panel change set). */
final class InfluenzaBNonStructuralProteinNSGeneTarget {

    private InfluenzaBNonStructuralProteinNSGeneTarget() {
    }

    /**
     * Composes this section's declarations into the session.
     *
     * @param set the knowledge set (the session)
     */
    static void compose(KnowledgeSet set) {
        ActiveStamp inception = network.ike.foundation.ike.terms.Ike.DEX_INCEPTION;

        set.concept("Influenza B non-structural protein (NS) gene (Target)", PublicIds.of(UUID.fromString("8b56dddf-4de1-4b9e-a271-daaf3780fc35"))).at(inception)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("beb8b074-9280-4309-a53e-632e8286b781")), KernelConcept.ENGLISH_LANGUAGE, "Influenza B non-structural protein (NS) gene (Target)", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.FULLY_QUALIFIED_NAME_DESCRIPTION_TYPE)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("5d6c9100-b77f-437d-b6e3-d901b73d1236")), KernelConcept.ENGLISH_LANGUAGE, "Influenza B non-structural protein (NS) gene", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.REGULAR_NAME_DESCRIPTION_TYPE)
                .statedAxioms(PublicIds.of(UUID.fromString("92fd7617-2028-4501-8373-132284bb8f42")), leb -> leb.NecessarySet(leb.And(leb.ConceptAxiom(DexTerm.TARGET))))
                .semantic(DexTerm.DEVICE_EXTENSION_MEMBERSHIP_PATTERN, PublicIds.of(UUID.fromString("0e2c16e3-ac12-4a3f-9528-04dda1a27596")))
                .semanticOn(PublicIds.of(UUID.fromString("beb8b074-9280-4309-a53e-632e8286b781")), KernelPattern.US_DIALECT_PATTERN, PublicIds.of(UUID.fromString("80b57882-d593-4c2f-b325-68ee0a8239b6")), KernelConcept.PREFERRED)
                .semanticOn(PublicIds.of(UUID.fromString("5d6c9100-b77f-437d-b6e3-d901b73d1236")), KernelPattern.US_DIALECT_PATTERN, PublicIds.of(UUID.fromString("712da6c0-d26b-4c85-879e-8fe004e14cf4")), KernelConcept.PREFERRED)
                ;
    }
}
