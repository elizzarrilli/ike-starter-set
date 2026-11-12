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

/** The "Influenza B Matrix protein (M) gene (Target)" concept of the Device Extension (DeX) starter set (XpertXpress respiratory panel change set). */
final class InfluenzaBMatrixProteinMGeneTarget {

    private InfluenzaBMatrixProteinMGeneTarget() {
    }

    /**
     * Composes this section's declarations into the session.
     *
     * @param set the knowledge set (the session)
     */
    static void compose(KnowledgeSet set) {
        ActiveStamp inception = network.ike.foundation.ike.terms.Ike.DEX_INCEPTION;

        set.concept("Influenza B Matrix protein (M) gene (Target)", PublicIds.of(UUID.fromString("d07f59ab-156e-4c8c-9ddb-b7953769dee3"))).at(inception)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("a26948c8-f995-4134-93e6-f77bc632a865")), KernelConcept.ENGLISH_LANGUAGE, "Influenza B Matrix protein (M) gene (Target)", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.FULLY_QUALIFIED_NAME_DESCRIPTION_TYPE)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("4a2438d9-e853-4896-abbf-9f04894056d6")), KernelConcept.ENGLISH_LANGUAGE, "Influenza B Matrix protein (M) gene", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.REGULAR_NAME_DESCRIPTION_TYPE)
                .statedAxioms(PublicIds.of(UUID.fromString("785834dd-0500-4a8e-9d6c-640707d8366a")), leb -> leb.NecessarySet(leb.And(leb.ConceptAxiom(DexTerm.TARGET))))
                .semantic(DexTerm.DEVICE_EXTENSION_MEMBERSHIP_PATTERN, PublicIds.of(UUID.fromString("71d9a429-fe8e-4349-a290-7a42f3df7cdc")))
                .semanticOn(PublicIds.of(UUID.fromString("a26948c8-f995-4134-93e6-f77bc632a865")), KernelPattern.US_DIALECT_PATTERN, PublicIds.of(UUID.fromString("6f30d2b8-5dce-4424-ba37-0bb4af7335dc")), KernelConcept.PREFERRED)
                .semanticOn(PublicIds.of(UUID.fromString("4a2438d9-e853-4896-abbf-9f04894056d6")), KernelPattern.US_DIALECT_PATTERN, PublicIds.of(UUID.fromString("0f149784-8594-47f7-8a89-8466ba7d2c49")), KernelConcept.PREFERRED)
                ;
    }
}
