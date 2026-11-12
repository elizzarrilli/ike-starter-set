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

/** The "Influenza A basic polymerase protein 2 (PB2) gene (Target)" concept of the Device Extension (DeX) starter set (XpertXpress respiratory panel change set). */
final class InfluenzaABasicPolymeraseProtein2PB2GeneTarget {

    private InfluenzaABasicPolymeraseProtein2PB2GeneTarget() {
    }

    /**
     * Composes this section's declarations into the session.
     *
     * @param set the knowledge set (the session)
     */
    static void compose(KnowledgeSet set) {
        ActiveStamp inception = network.ike.foundation.ike.terms.Ike.DEX_INCEPTION;

        set.concept("Influenza A basic polymerase protein 2 (PB2) gene (Target)", PublicIds.of(UUID.fromString("833ee639-cc97-4bc6-adaf-ecbbba72627a"))).at(inception)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("840e1e09-af82-4767-afdf-e16f3a632146")), KernelConcept.ENGLISH_LANGUAGE, "Influenza A basic polymerase protein 2 (PB2) gene (Target)", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.FULLY_QUALIFIED_NAME_DESCRIPTION_TYPE)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("4f56a87a-d378-4428-a378-0bba6dc24ae9")), KernelConcept.ENGLISH_LANGUAGE, "Influenza A basic polymerase protein 2 (PB2) gene", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.REGULAR_NAME_DESCRIPTION_TYPE)
                .statedAxioms(PublicIds.of(UUID.fromString("5e85e328-def5-4432-8cdd-b471a34a2b34")), leb -> leb.NecessarySet(leb.And(leb.ConceptAxiom(DexTerm.TARGET))))
                .semantic(DexTerm.DEVICE_EXTENSION_MEMBERSHIP_PATTERN, PublicIds.of(UUID.fromString("ee34587d-8090-4b1e-a863-a3954d392180")))
                .semanticOn(PublicIds.of(UUID.fromString("840e1e09-af82-4767-afdf-e16f3a632146")), KernelPattern.US_DIALECT_PATTERN, PublicIds.of(UUID.fromString("d068199b-4ebb-45a0-9fdb-ab83754ea893")), KernelConcept.PREFERRED)
                .semanticOn(PublicIds.of(UUID.fromString("4f56a87a-d378-4428-a378-0bba6dc24ae9")), KernelPattern.US_DIALECT_PATTERN, PublicIds.of(UUID.fromString("a44a8160-c4ad-4c2c-b572-49b259fb4f59")), KernelConcept.PREFERRED)
                ;
    }
}
