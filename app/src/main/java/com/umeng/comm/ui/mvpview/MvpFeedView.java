/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014-2015 Umeng, Inc
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.umeng.comm.ui.mvpview;

import com.umeng.comm.core.beans.FeedItem;
import com.umeng.comm.core.nets.responses.AbsResponse;

import java.util.List;

/**
 * Feed View接口
 */
public interface MvpFeedView {
    /**
     * 处理请求结果,集中处理一些错误信息
     * 
     * @param response 请求的response
     * @return 如果该response已经处理则返回true,否则返回false
     */
    public boolean handleResponse(AbsResponse<?> response);

    /**
     * 获取Feed的数据集
     * 
     * @return
     */
    public List<FeedItem> getAdapterDataSet();

    /**
     * 更新Feed Adapter中的数据
     */
    public void notifyDataSetChanged();

    /**
     * 清空Feed列表
     */
    public void clearListView();

    public void onRefreshStart();

    public void onRefreshEnd();

}
