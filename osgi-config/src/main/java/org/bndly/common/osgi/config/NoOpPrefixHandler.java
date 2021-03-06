package org.bndly.common.osgi.config;

/*-
 * #%L
 * OSGI Config
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

import org.bndly.common.osgi.config.spi.PrefixHandler;

/**
 *
 * @author cybercon &lt;bndly@cybercon.de&gt;
 */
public final class NoOpPrefixHandler implements PrefixHandler {

	public static final NoOpPrefixHandler INSTANCE = new NoOpPrefixHandler();

	private NoOpPrefixHandler() {
	}
	
	@Override
	public String getPrefix() {
		return "";
	}

	@Override
	public String set(String rawStringValue) {
		return rawStringValue;
	}

	@Override
	public String get(String rawStringValue) {
		return rawStringValue;
	}

}
