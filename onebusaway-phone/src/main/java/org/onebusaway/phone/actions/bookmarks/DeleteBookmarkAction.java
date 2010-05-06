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
package org.onebusaway.phone.actions.bookmarks;

import org.onebusaway.phone.actions.AbstractAction;

import org.springframework.stereotype.Component;

@Component
public class DeleteBookmarkAction extends AbstractAction {

  private static final long serialVersionUID = 1L;

  private int _index = 0;

  public void setIndex(int index) {
    _index = index;
  }

  @Override
  public String execute() throws Exception {
    _currentUserService.deleteStopBookmarks(_index);
    return SUCCESS;
  }

}
