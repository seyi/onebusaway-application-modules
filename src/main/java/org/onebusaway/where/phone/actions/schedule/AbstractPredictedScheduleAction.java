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
package org.onebusaway.where.phone.actions.schedule;

import java.util.List;

import org.onebusaway.where.services.BookmarkService;
import org.onebusaway.where.web.common.client.model.DepartureBean;
import org.onebusaway.where.web.common.client.rpc.WhereService;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;


public class AbstractPredictedScheduleAction extends ActionSupport {

    private static final long serialVersionUID = 1L;

    protected WhereService _obaService;

    protected List<DepartureBean> _predictions;

    protected BookmarkService _bookmarkService;

    protected String _userId;

    @Autowired
    public void setOneBusAwayService(WhereService obaService) {
        _obaService = obaService;
    }

    @Autowired
    public void setBookmarkService(BookmarkService bookmarkService) {
        _bookmarkService = bookmarkService;
    }

    public void setUserId(String userId) {
        _userId = userId;
    }

    public List<DepartureBean> getArrivals() {
        return _predictions;
    }
}
