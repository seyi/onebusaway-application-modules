/*
 * Copyright 2008 Brian Ferris
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
/**
 * 
 */
package org.onebusaway.where.web.common.client.view.constraints;

import org.onebusaway.common.web.common.client.context.Context;
import org.onebusaway.common.web.common.client.widgets.DivWidget;
import org.onebusaway.where.web.common.client.view.EWhereStopFinderSearchType;

public class NoConstraint extends AbstractConstraint {

  public void update(Context context) {
    
    DivWidget welcome = new DivWidget(_msgs.standardIndexPageWelcome());
    welcome.addStyleName("StopFinder-Welcome");
    
    _resultsPanel.add(welcome);
    _stopFinder.setSearchText(EWhereStopFinderSearchType.ADDRESS, "");
  }
}