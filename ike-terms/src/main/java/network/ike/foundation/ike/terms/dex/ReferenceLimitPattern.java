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

/** The "Reference Limit Pattern" pattern of the Device Extension (DeX) starter set (v2). */
final class ReferenceLimitPattern {

    private ReferenceLimitPattern() {
    }

    /**
     * Composes this section's declarations into the session.
     *
     * @param set the knowledge set (the session)
     */
    static void compose(KnowledgeSet set) {
        ActiveStamp inception = network.ike.foundation.ike.terms.Ike.DEX_INCEPTION;

        set.pattern("Reference Limit Pattern", PublicIds.of(UUID.fromString("dd7ad60d-05fb-485d-8114-424bbf17e149"))).at(inception)
                .meaning(DexTerm.REFERENCE_LIMIT).purpose(DexTerm.DEVICE_EXTENSION_RECORD)
                .field(DexTerm.REFERENCE_LIMIT_POPULATION, DexTerm.DEVICE_EXTENSION_RECORD, KernelConcept.STRING)
                .field(DexTerm.REFERENCE_LIMIT_VALUE, DexTerm.DEVICE_EXTENSION_RECORD, KernelConcept.FLOAT_FIELD)
                .field(DexTerm.REFERENCE_LIMIT_VALUE_OPERATOR, DexTerm.DEVICE_EXTENSION_RECORD, KernelConcept.COMPONENT_FIELD)
                .field(DexTerm.EXAMPLE_UCUM_UNITS, DexTerm.DEVICE_EXTENSION_RECORD, KernelConcept.COMPONENT_FIELD)
                .field(DexTerm.PERCENTILE_VALUE, DexTerm.DEVICE_EXTENSION_RECORD, KernelConcept.FLOAT_FIELD)
                .field(DexTerm.REFERENCE_LIMIT_TYPE, DexTerm.DEVICE_EXTENSION_RECORD, KernelConcept.COMPONENT_FIELD)
                .field(DexTerm.INTERPRETATION, DexTerm.DEVICE_EXTENSION_RECORD, KernelConcept.COMPONENT_ID_SET_FIELD)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("86268538-e246-402e-90d2-69557ab4b6cb")), KernelConcept.ENGLISH_LANGUAGE, "Reference Limit Pattern", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.FULLY_QUALIFIED_NAME_DESCRIPTION_TYPE)
                .semantic(DexTerm.DEVICE_EXTENSION_MEMBERSHIP_PATTERN, PublicIds.of(UUID.fromString("470c89ce-b92c-4ffb-be7f-e9ced873f681")))
                ;
    }
}
