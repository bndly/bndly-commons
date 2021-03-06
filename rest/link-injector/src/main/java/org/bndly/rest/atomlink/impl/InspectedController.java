package org.bndly.rest.atomlink.impl;

/*-
 * #%L
 * REST Link Injector
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

import org.bndly.rest.atomlink.api.annotation.CompiledAtomLinkDescription;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cybercon &lt;bndly@cybercon.de&gt;
 */
public class InspectedController {
	private final Class<?> controllerInterface;
	private final Object controller;
	private final List<CompiledAtomLinkDescription> runtimeBindings = new ArrayList<>();
	private final List<RegisteredAtomLinkDescription> registeredAtomLinkDescriptions = new ArrayList<>();

	public InspectedController(Class<?> controllerInterface, Object controller) {
		if (controllerInterface == null) {
			throw new IllegalStateException("controllerInterface is not allowed to be null");
		}
		if (controller == null) {
			throw new IllegalStateException("controller is not allowed to be null");
		}
		this.controllerInterface = controllerInterface;
		this.controller = controller;
	}

	public Object getController() {
		return controller;
	}

	public Class<?> getControllerInterface() {
		return controllerInterface;
	}

	public List<CompiledAtomLinkDescription> getRuntimeBindings() {
		return runtimeBindings;
	}

	public List<RegisteredAtomLinkDescription> getRegisteredAtomLinkDescriptions() {
		return registeredAtomLinkDescriptions;
	}
	
}
