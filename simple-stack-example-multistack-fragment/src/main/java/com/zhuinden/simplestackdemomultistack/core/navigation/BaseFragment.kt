package com.zhuinden.simplestackdemomultistack.core.navigation

import android.support.v4.app.Fragment

/**
 * Created by Zhuinden on 2018.09.17.
 */

open class BaseFragment : Fragment() {
    fun <T : MultistackFragmentKey> getKey(): T = arguments!!.getParcelable<T>("KEY")!!
}
