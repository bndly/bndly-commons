package org.bndly.rest.repository.resources.html;

/*-
 * #%L
 * REST Repository Resource
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

import org.bndly.schema.api.repository.beans.BeanDefinition;
import java.io.IOException;
import java.io.Writer;
import java.util.Map;
import org.apache.velocity.context.Context;
import org.apache.velocity.context.InternalContextAdapter;
import org.apache.velocity.exception.MethodInvocationException;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.apache.velocity.runtime.directive.Directive;
import org.apache.velocity.runtime.parser.node.Node;
import org.apache.velocity.runtime.parser.node.SimpleNode;

/**
 *
 * @author cybercon &lt;bndly@cybercon.de&gt;
 */
public class BeanDefinitionDirective extends Directive {

	public static final String NAME = "beandef";
	
	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public int getType() {
		return LINE;
	}

	@Override
	public boolean render(InternalContextAdapter ica, Writer writer, Node node) throws IOException, ResourceNotFoundException, ParseErrorException, MethodInvocationException {
		Context internalUserContext = ica.getInternalUserContext();
		Map<String, BeanDefinition> definitions = (Map<String, BeanDefinition>) internalUserContext.get("beanDefinitions");
		if (definitions == null) {
			return false;
		}
		SimpleNode defintionNameNode = (SimpleNode) node.jjtGetChild(0);
		Object definitionName = defintionNameNode.value(ica);
		if (!String.class.isInstance(definitionName)) {
			return false;
		}
		SimpleNode targetVariableNameNode = (SimpleNode) node.jjtGetChild(1);
		Object targetVariableName = targetVariableNameNode.value(ica);
		if (!String.class.isInstance(targetVariableName)) {
			return false;
		}
		BeanDefinition def = definitions.get(definitionName);
		if (def == null) {
			return false;
		}
		ica.put((String) targetVariableName, def);
		return true;
	}
	
}
