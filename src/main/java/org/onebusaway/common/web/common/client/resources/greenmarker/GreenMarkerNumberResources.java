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
package org.onebusaway.common.web.common.client.resources.greenmarker;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.AbstractImagePrototype;
import com.google.gwt.user.client.ui.ImageBundle;

public interface GreenMarkerNumberResources extends ImageBundle {

  public static GreenMarkerNumberResources INSTANCE = GWT.create(GreenMarkerNumberResources.class);

  @Resource("GreenMarker0.png")
  public AbstractImagePrototype getMarker0();

  @Resource("GreenMarker1.png")
  public AbstractImagePrototype getMarker1();

  @Resource("GreenMarker2.png")
  public AbstractImagePrototype getMarker2();

  @Resource("GreenMarker3.png")
  public AbstractImagePrototype getMarker3();

  @Resource("GreenMarker4.png")
  public AbstractImagePrototype getMarker4();

  @Resource("GreenMarker5.png")
  public AbstractImagePrototype getMarker5();

  @Resource("GreenMarker6.png")
  public AbstractImagePrototype getMarker6();

  @Resource("GreenMarker7.png")
  public AbstractImagePrototype getMarker7();

  @Resource("GreenMarker8.png")
  public AbstractImagePrototype getMarker8();

  @Resource("GreenMarker9.png")
  public AbstractImagePrototype getMarker9();
}
