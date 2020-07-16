package org.bndly.schema.impl.query;

/*-
 * #%L
 * Schema Impl
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

import org.bndly.schema.api.query.Expression;
import org.bndly.schema.api.query.QueryFragmentRenderer;
import org.bndly.schema.api.query.QueryRenderContext;
import org.bndly.schema.api.query.WrapperExpression;
import org.bndly.schema.impl.QueryContextImpl;
import org.bndly.schema.vendor.VendorConfiguration;

/**
 *
 * @author cybercon &lt;bndly@cybercon.de&gt;
 */
public class WrapperExpressionImpl extends ExpressionImpl implements WrapperExpression {
	private Expression wrapped;

	public WrapperExpressionImpl(QueryContextImpl queryContext, VendorConfiguration vendorConfiguration) {
		super(queryContext, vendorConfiguration);
	}

	@Override
	public Expression wrapped() {
		if (wrapped == null) {
			wrapped = new ExpressionImpl(getQueryContext(), getVendorConfiguration());
		}
		return wrapped;
	}

	@Override
	public void renderQueryFragment(QueryRenderContext ctx) {
		if (wrapped != null) {
			ctx.getSql().append("(");
			wrapped.renderQueryFragment(ctx);
			ctx.getSql().append(")");
		}
		if (thingsToRender != null) {
			for (QueryFragmentRenderer renderMe : thingsToRender) {
				renderMe.renderQueryFragment(ctx);
			}
		}
	}

}
