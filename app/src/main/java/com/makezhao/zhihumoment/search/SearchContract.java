/*
 * Copyright 2017 lizhaotailang
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.makezhao.zhihumoment.search;

import com.makezhao.zhihumoment.BasePresenter;
import com.makezhao.zhihumoment.BaseView;
import com.makezhao.zhihumoment.bean.BeanType;
import com.makezhao.zhihumoment.bean.DoubanMomentNews;
import com.makezhao.zhihumoment.bean.GuokrHandpickNews;
import com.makezhao.zhihumoment.bean.ZhihuDailyNews;

import java.util.ArrayList;

/**
 * Created by lizhaotailang on 2016/12/25.
 */

public interface SearchContract {

    interface View extends BaseView<Presenter> {

        void showResults(ArrayList<ZhihuDailyNews.Question> zhihuList,
                         ArrayList<GuokrHandpickNews.result> guokrList,
                         ArrayList<DoubanMomentNews.posts> doubanList,
                         ArrayList<Integer> types);

        void showLoading();

        void stopLoading();

    }

    interface Presenter extends BasePresenter {

        void loadResults(String queryWords);

        void startReading(BeanType type, int position);

    }

}
