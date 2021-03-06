package org.bndly.common.util;

/*-
 * #%L
 * Reflection
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

import org.bndly.common.reflection.ReflectionUtil;
import java.lang.reflect.Field;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author cybercon &lt;bndly@cybercon.de&gt;
 */
public class SimpleClassTypeResolvingTest {

	private List<Object> genericField;
	private Long simpleField;
	
	@Test
	public void testClassTypeResolving() throws NoSuchFieldException {
		Field gf = getClass().getDeclaredField("genericField");
		Field sf = getClass().getDeclaredField("simpleField");
		Class gt = ReflectionUtil.getSimpleClassType(gf.getGenericType());
		Class st = ReflectionUtil.getSimpleClassType(sf.getGenericType());
		Assert.assertEquals(gt, List.class);
		Assert.assertEquals(st, Long.class);
		
	}
}
