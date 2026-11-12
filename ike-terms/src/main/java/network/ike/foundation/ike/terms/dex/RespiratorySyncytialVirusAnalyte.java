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

/** The "Respiratory Syncytial Virus (Analyte)" concept of the Device Extension (DeX) starter set (XpertXpress respiratory panel change set). */
final class RespiratorySyncytialVirusAnalyte {

    private RespiratorySyncytialVirusAnalyte() {
    }

    /**
     * Composes this section's declarations into the session.
     *
     * @param set the knowledge set (the session)
     */
    static void compose(KnowledgeSet set) {
        ActiveStamp inception = network.ike.foundation.ike.terms.Ike.DEX_INCEPTION;

        set.concept("Respiratory Syncytial Virus (Analyte)", PublicIds.of(UUID.fromString("425012c4-1cf7-46b9-b110-52cc95add98b"))).at(inception)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("0a433a02-30b7-41b9-b08e-aa246cdecf06")), KernelConcept.ENGLISH_LANGUAGE, "Respiratory Syncytial Virus (Analyte)", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.FULLY_QUALIFIED_NAME_DESCRIPTION_TYPE)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("586741ac-3199-4545-8610-286a51669aab")), KernelConcept.ENGLISH_LANGUAGE, "Respiratory Syncytial Virus", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.REGULAR_NAME_DESCRIPTION_TYPE)
                .statedAxioms(PublicIds.of(UUID.fromString("a1100e27-8c42-4172-a87c-3b14e7369418")), leb -> leb.NecessarySet(leb.And(leb.ConceptAxiom(DexTerm.ANALYTE))))
                .semantic(DexTerm.DEVICE_EXTENSION_MEMBERSHIP_PATTERN, PublicIds.of(UUID.fromString("17df683c-24dc-413a-b999-5e5222639315")))
                .semanticOn(PublicIds.of(UUID.fromString("0a433a02-30b7-41b9-b08e-aa246cdecf06")), KernelPattern.US_DIALECT_PATTERN, PublicIds.of(UUID.fromString("b6c825e5-5745-4e8e-a28b-61259bc6b09b")), KernelConcept.PREFERRED)
                .semanticOn(PublicIds.of(UUID.fromString("586741ac-3199-4545-8610-286a51669aab")), KernelPattern.US_DIALECT_PATTERN, PublicIds.of(UUID.fromString("49bfb71a-a112-4575-92b7-0f5940557346")), KernelConcept.PREFERRED)
                ;
    }
}
