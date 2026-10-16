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

/** The "Brand Name Membership Pattern" pattern of the Device Extension (DeX) starter set. */
final class BrandNameMembershipPattern {

    private BrandNameMembershipPattern() {
    }

    /**
     * Composes this section's declarations into the session.
     *
     * @param set the knowledge set (the session)
     */
    static void compose(KnowledgeSet set) {
        ActiveStamp inception = network.ike.foundation.ike.terms.Ike.DEX_INCEPTION;

        set.pattern("Brand Name Membership Pattern", PublicIds.of(UUID.fromString("6281432a-3bcb-4940-93fc-521a060efd9e"))).at(inception)
                .meaning(DexTerm.MEMBERSHIP_SEMANTIC).purpose(DexTerm.DEVICE_EXTENSION_RECORD)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("1f623fd7-e1b5-4d83-8a08-41d54ccbdea9")), KernelConcept.ENGLISH_LANGUAGE, "Brand Name Membership Pattern", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.FULLY_QUALIFIED_NAME_DESCRIPTION_TYPE)
                .semantic(DexTerm.DEVICE_EXTENSION_MEMBERSHIP_PATTERN, PublicIds.of(UUID.fromString("290fd91b-272f-472b-882d-b4509a97c539")))
                .semanticOn(PublicIds.of(UUID.fromString("1f623fd7-e1b5-4d83-8a08-41d54ccbdea9")), KernelPattern.US_DIALECT_PATTERN, PublicIds.of(UUID.fromString("3936ab3c-7aab-4b87-a910-6179083ce2e4")), DexTerm.ACCEPTABLE)
                ;
    }
}
