package org.bndly.rest.cache.websocket.impl;

/*-
 * #%L
 * REST Cache Websocket
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

/**
 *
 * @author cybercon &lt;bndly@cybercon.de&gt;
 */
public class LinkEventData {

	private final String entryPath;
	private final String linkTargetPath;

	public LinkEventData(String entryPath, String linkTargetPath) {
		this.entryPath = entryPath;
		this.linkTargetPath = linkTargetPath;
	}

	public String getEntryPath() {
		return entryPath;
	}

	public String getLinkTargetPath() {
		return linkTargetPath;
	}
	
}
