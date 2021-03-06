/*
 * (C) Copyright 2020 Radix DLT Ltd
 *
 * Radix DLT Ltd licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License.  You may obtain a copy of the
 * License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied.  See the License for the specific
 * language governing permissions and limitations under the License.
 */

package com.radixdlt.store;

import com.radixdlt.constraintmachine.Particle;
import com.radixdlt.constraintmachine.Spin;
import com.radixdlt.common.EUID;
import java.util.Set;

/**
 * Read only store interface for Constraint Machine validation
 */
public interface CMStore {

	/**
	 * Returns whether this state store supports any of the given destinations
	 * @param destinations the destinations to check
	 * @return true, if this state supports this address, false otherwise
	 */
	boolean supports(Set<EUID> destinations);

	/**
	 * Get the current spin of a particle. Must call supports() to see if this
	 * store supports the given particle. If not, the return value of getSpin() is
	 * undefined.
	 *
	 * @param particle the particle to get the spin of
	 * @return the current spin of a particle
	 */
	Spin getSpin(Particle particle);
}
