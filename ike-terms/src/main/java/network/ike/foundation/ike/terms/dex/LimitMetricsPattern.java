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

/** The "Limit Metrics Pattern" pattern of the Device Extension (DeX) starter set (v2). */
final class LimitMetricsPattern {

    private LimitMetricsPattern() {
    }

    /**
     * Composes this section's declarations into the session.
     *
     * @param set the knowledge set (the session)
     */
    static void compose(KnowledgeSet set) {
        ActiveStamp inception = network.ike.foundation.ike.terms.Ike.DEX_INCEPTION;

        set.pattern("Limit Metrics Pattern", PublicIds.of(UUID.fromString("34fbab84-87e9-4d22-89dc-fb1b5a2524c3"))).at(inception)
                .meaning(DexTerm.LIMIT_METRICS).purpose(DexTerm.DEVICE_EXTENSION_RECORD)
                .field(DexTerm.LIMIT_METRIC_TYPE, DexTerm.DEVICE_EXTENSION_RECORD, KernelConcept.COMPONENT_FIELD)
                .field(DexTerm.LIMIT_VALUE, DexTerm.DEVICE_EXTENSION_RECORD, KernelConcept.FLOAT_FIELD)
                .field(DexTerm.EXAMPLE_UCUM_UNITS, DexTerm.DEVICE_EXTENSION_RECORD, KernelConcept.COMPONENT_FIELD)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("4386f956-a543-4e8e-94c9-74e58b7f6cc2")), KernelConcept.ENGLISH_LANGUAGE, "Limit Metrics Pattern", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.FULLY_QUALIFIED_NAME_DESCRIPTION_TYPE)
                .semantic(DexTerm.DEVICE_EXTENSION_MEMBERSHIP_PATTERN, PublicIds.of(UUID.fromString("c6c59223-9a40-4bee-8d09-1b4f00b65763")))
                ;
    }
}
