package org.bndly.pdf.layout;

/*-
 * #%L
 * PDF Document Printer
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

import org.bndly.pdf.PrintingContext;
import org.bndly.pdf.PrintingObject;
import org.bndly.pdf.PrintingObjectImpl;
import org.bndly.pdf.visualobject.Container;
import org.bndly.pdf.visualobject.Table;
import org.bndly.pdf.visualobject.VisualObject;

public class TableOverflowStrategy extends PrintingObjectImpl implements VerticalOverflowStrategy {

	private Table table;
	
	public TableOverflowStrategy(PrintingContext context, PrintingObject owner) {
		super(context, owner);
	}
	
	@Override
	public void handleVerticalOverflowIn(Container container, VisualObject overflownObject, Double maxHeight, Double overflownObjectMaxHeight) {
//		System.out.println("overflow of "+overflownObject.getItemId()+" in "+container.getItemId());
//		System.out.println("destoying "+overflownObject.getItemId());
//		overflownObject.destroy();
	}
	
	public void setTable(Table table) {
		this.table = table;
	}

}
