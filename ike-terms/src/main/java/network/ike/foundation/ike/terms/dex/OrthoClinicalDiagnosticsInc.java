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

/** The "ORTHO-CLINICAL DIAGNOSTICS, INC." concept of the Device Extension (DeX) starter set (VITROS CREA change set). */
final class OrthoClinicalDiagnosticsInc {

    private OrthoClinicalDiagnosticsInc() {
    }

    /**
     * Composes this section's declarations into the session.
     *
     * @param set the knowledge set (the session)
     */
    static void compose(KnowledgeSet set) {
        ActiveStamp inception = network.ike.foundation.ike.terms.Ike.DEX_INCEPTION;

        set.concept("ORTHO-CLINICAL DIAGNOSTICS, INC.", PublicIds.of(UUID.fromString("725ba917-e9a2-4bdd-920a-ab95ebd3d411"))).at(inception)
                .semantic(KernelPattern.DESCRIPTION_PATTERN, PublicIds.of(UUID.fromString("f2df284d-3fab-4fd3-90f0-0e1b4436b131")), KernelConcept.ENGLISH_LANGUAGE, "ORTHO-CLINICAL DIAGNOSTICS, INC.", KernelConcept.DESCRIPTION_NOT_CASE_SENSITIVE, KernelConcept.FULLY_QUALIFIED_NAME_DESCRIPTION_TYPE)
                .statedAxioms(PublicIds.of(UUID.fromString("5a2e6803-ce5d-4032-a893-4552a6369824")), leb -> leb.NecessarySet(leb.And(leb.ConceptAxiom(DexTerm.COMPANY))))
                // The change set carries no DeX membership semantic for this concept, so its identity is derived
                // from the set's namespace.
                .semantic(DexTerm.DEVICE_EXTENSION_MEMBERSHIP_PATTERN,
                        PublicIds.of(set.uuidFor("ORTHO-CLINICAL DIAGNOSTICS, INC. DeX membership")))
                ;
    }
}
