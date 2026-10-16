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

/** The "Device Performance Pattern" pattern of the Device Extension (DeX) starter set (v2). */
final class DevicePerformancePattern {

    private DevicePerformancePattern() {
    }

    /**
     * Composes this section's declarations into the session.
     *
     * @param set the knowledge set (the session)
     */
    static void compose(KnowledgeSet set) {
        ActiveStamp inception = network.ike.foundation.ike.terms.Ike.DEX_INCEPTION;

        set.pattern("Device Performance Pattern", PublicIds.of(UUID.fromString("b8962f4a-6ad0-4f08-a5c6-1f3b302cacd9"))).at(inception)
                .meaning(DexTerm.DEVICE_PERFORMANCE).purpose(DexTerm.DEVICE_EXTENSION_RECORD)
                .field(DexTerm.PERFORMANCE_METRIC, DexTerm.DEVICE_EXTENSION_RECORD, KernelConcept.COMPONENT_FIELD)
                .field(DexTerm.PERFORMANCE_METRIC_VALUE, DexTerm.DEVICE_EXTENSION_RECORD, KernelConcept.FLOAT_FIELD)
                .field(DexTerm.EXAMPLE_UCUM_UNITS, DexTerm.DEVICE_EXTENSION_RECORD, KernelConcept.COMPONENT_FIELD)
                .field(DexTerm.CONFIDENCE_LEVEL, DexTerm.DEVICE_EXTENSION_RECORD, KernelConcept.FLOAT_FIELD)
                .field(KernelConcept.INTERVAL_LOWER_BOUND, DexTerm.DEVICE_EXTENSION_RECORD, KernelConcept.FLOAT_FIELD)
                .field(KernelConcept.INTERVAL_UPPER_BOUND, DexTerm.DEVICE_EXTENSION_RECORD, KernelConcept.FLOAT_FIELD)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("92be1e6b-750b-4008-b57c-1c115073d71d")), KernelConcept.ENGLISH_LANGUAGE, "Device Performance Pattern", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.FULLY_QUALIFIED_NAME_DESCRIPTION_TYPE)
                .semantic(DexTerm.DEVICE_EXTENSION_MEMBERSHIP_PATTERN, PublicIds.of(UUID.fromString("d5f63dda-7ab2-4188-bb03-7a2b602ae4ad")))
                ;
    }
}
