package org.bndly.css;

/*-
 * #%L
 * PDF CSS Model
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

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cybercon &lt;bndly@cybercon.de&gt;
 */
public class CSSMediaQueryList extends CSSItem {
	private final List<CSSMediaQuery> queries = new ArrayList<>();
	private List<CSSStyle> styles;

	public List<CSSMediaQuery> getQueries() {
		return queries;
	}
	
	public void addStyle(CSSStyle style) {
		if (style != null) {
			if (styles == null) {
				styles = new ArrayList<>();
			}
			styles.add(style);
		}
	}
	public List<CSSStyle> getStyles() {
		return styles;
	}
}
