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
package org.onebusaway.where.web.common.client.model;

import org.onebusaway.common.web.common.client.model.ApplicationBean;
import org.onebusaway.common.web.common.client.model.RouteBean;
import org.onebusaway.common.web.common.client.model.StopBean;

import java.util.List;

public class StopWithRoutesBean extends ApplicationBean {

  private static final long serialVersionUID = 1L;

  private StopBean _stop;

  public StopBean getStop() {
    return _stop;
  }

  public void setStop(StopBean stop) {
    _stop = stop;
  }

  private List<RouteBean> _routes;

  public List<RouteBean> getRoutes() {
    return _routes;
  }

  public void setRoutes(List<RouteBean> routes) {
    _routes = routes;
  }
}
