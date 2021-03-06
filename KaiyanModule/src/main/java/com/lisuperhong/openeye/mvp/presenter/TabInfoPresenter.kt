package com.lisuperhong.openeye.mvp.presenter

import com.company.commonbusiness.base.mvp.BasePresenter
import com.company.commonbusiness.http.rx.BaseObserver
import com.lisuperhong.openeye.mvp.contract.TabInfoContract
import com.lisuperhong.openeye.mvp.model.DataRepository
import com.lisuperhong.openeye.mvp.model.bean.TabInfoBean

/**
 * Author: lisuperhong
 * Time: Create on 2018/9/14 23:04
 * Github: https://github.com/lisuperhong
 * Desc: Tab信息
 */
class TabInfoPresenter(rootView: TabInfoContract.View) :
    BasePresenter<TabInfoContract.View>(rootView), TabInfoContract.Presenter {

    override fun getRankTabInfo() {
        checkViewAttached()
        val observer = object : BaseObserver<TabInfoBean>() {
            override fun onSuccess(data: TabInfoBean) {
                rootView?.showTabInfo(data)
            }

            override fun onFailure(errorMsg: String) {
                rootView?.showMessage(errorMsg)
            }
        }
        addDispose(observer)
        DataRepository.instance.getRankList(observer)
    }

    override fun getPopularTabInfo(url: String) {
        checkViewAttached()
        val observer = object : BaseObserver<TabInfoBean>() {
            override fun onSuccess(data: TabInfoBean) {
                rootView?.showTabInfo(data)
            }

            override fun onFailure(errorMsg: String) {
                rootView?.showMessage(errorMsg)
            }
        }
        addDispose(observer)
        DataRepository.instance.getPopularTabInfo(url, observer)
    }
}