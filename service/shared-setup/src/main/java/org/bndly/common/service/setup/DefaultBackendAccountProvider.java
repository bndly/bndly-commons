package org.bndly.common.service.setup;

/*-
 * #%L
 * Service Shared Client Setup
 * %%
 * Copyright (C) 2013 - 2020 Cybercon GmbH
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import org.bndly.rest.client.api.BackendAccountProvider;

/**
 *
 * @author cybercon &lt;bndly@cybercon.de&gt;
 */
public class DefaultBackendAccountProvider implements BackendAccountProvider {
	private String backendAccountName;
	private String backendAccountSecret;

	@Override
	public String getBackendAccountName() {
		return backendAccountName;
	}

	@Override
	public String getBackendAccountSecret() {
		return backendAccountSecret;
	}

	public void setBackendAccountName(String backendAccountName) {
		this.backendAccountName = backendAccountName;
	}

	public void setBackendAccountSecret(String backendAccountSecret) {
		this.backendAccountSecret = backendAccountSecret;
	}
	
}
