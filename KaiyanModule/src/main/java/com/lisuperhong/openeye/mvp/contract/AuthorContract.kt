package com.lisuperhong.openeye.mvp.contract

import com.company.commonbusiness.base.mvp.IMvpPresenter
import com.company.commonbusiness.base.mvp.IMvpView
import com.lisuperhong.openeye.mvp.model.bean.BaseBean

/**
 * Author: lizhaohong
 * Time: Create on 2018/10/22 17:37
 * Desc: 全部作者
 */
interface AuthorContract {

    interface View : IMvpView {
        /**
         * 设置列表数据
         */
        fun showContent(baseBean: BaseBean)
    }

    interface Presenter : IMvpPresenter {

        /**
         * 获取全部作者
         */
        fun allAuthors()

        /**
         * 加载更多数据
         */
        fun followLoadMore(url: String)
    }
}