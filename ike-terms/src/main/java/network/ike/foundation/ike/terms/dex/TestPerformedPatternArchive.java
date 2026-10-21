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

/** The "Test Performed Pattern Archive" pattern of the Device Extension (DeX) starter set. */
final class TestPerformedPatternArchive {

    private TestPerformedPatternArchive() {
    }

    /**
     * Composes this section's declarations into the session.
     *
     * @param set the knowledge set (the session)
     */
    static void compose(KnowledgeSet set) {
        ActiveStamp inception = network.ike.foundation.ike.terms.Ike.DEX_INCEPTION;

                // Archived: the DeX v2 data revises this pattern under a new identity and the same name, so this
        // v1 pattern is named with an archive marker to keep the two distinct. Identities are unchanged.
        set.pattern("Test Performed Pattern Archive", PublicIds.of(UUID.fromString("4289dbff-1557-4a1d-873a-7092b328615d"))).at(inception)
                .meaning(DexTerm.TEST_PERFORMED).purpose(DexTerm.DEVICE_EXTENSION_RECORD)
                .field(DexTerm.ANALYTE, DexTerm.DEVICE_EXTENSION_RECORD, KernelConcept.COMPONENT_ID_SET_FIELD)
                .field(DexTerm.TARGET, DexTerm.DEVICE_EXTENSION_RECORD, KernelConcept.COMPONENT_ID_SET_FIELD)
                .field(DexTerm.TEST_PERFORMED, DexTerm.LOINC_RECORD, KernelConcept.COMPONENT_ID_SET_FIELD)
                .field(DexTerm.INSTRUMENT, DexTerm.DEVICE_EXTENSION_RECORD, KernelConcept.COMPONENT_ID_SET_FIELD)
                .field(DexTerm.SPECIMEN, DexTerm.SNOMED_RECORD, KernelConcept.COMPONENT_ID_SET_FIELD)
                .field(DexTerm.DETECTION_LIMIT, DexTerm.DEVICE_EXTENSION_RECORD, KernelConcept.FLOAT_FIELD)
                .field(DexTerm.EXAMPLE_UCUM_UNITS, DexTerm.DEVICE_EXTENSION_RECORD, KernelConcept.STRING)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("aa81821c-5063-4511-8866-73f00a0bf6b0")), KernelConcept.ENGLISH_LANGUAGE, "Test Performed Pattern Archive", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.FULLY_QUALIFIED_NAME_DESCRIPTION_TYPE)
                .semantic(DexTerm.DEVICE_EXTENSION_MEMBERSHIP_PATTERN, PublicIds.of(UUID.fromString("4bdfeef0-c73d-48c2-ba60-2ab6d5e708fb")))
                .semanticOn(PublicIds.of(UUID.fromString("aa81821c-5063-4511-8866-73f00a0bf6b0")), KernelPattern.US_DIALECT_PATTERN, PublicIds.of(UUID.fromString("9b942b9f-edd7-4fd4-b8c1-a07d914b3871")), DexTerm.ACCEPTABLE)
                ;
    }
}
